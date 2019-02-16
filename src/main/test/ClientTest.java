//import com.company.Client;
import com.company.Server;
import com.company.User;
import com.google.gson.Gson;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class ClientTest {


    @BeforeClass
    public static void startServer() {
        Server server = new Server();
        server.start();
    }

    @Test
    public void сlient1() {
        Gson gson = new Gson();


        try {
            Socket clientSocket = new Socket("localhost", 8080);
            Scanner scanner = new Scanner(System.in);

            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream()));
            BufferedReader reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            User user = new User();


            String signInRequest = "/signin/";
            user.login = "ainur";
            user.password = "123";
            signInRequest += gson.toJson(user, User.class);
            signInRequest += "\n";
            System.out.println(signInRequest);
            writer.write(signInRequest);
            writer.flush();


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}