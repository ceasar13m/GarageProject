/*package com.company;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client extends Thread {
    Socket socket;
    BufferedWriter writer;

    @Override
    public void run() {
        try {
            try {
                socket = new Socket("localhost", 8080);
                writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
                Scanner scanner = new Scanner(System.in);
                String message = scanner.nextLine();

                while(true) {
                    writer.write();
                    writer.flush();
                    if(message.equals("exit"))
                        break;
                    message = scanner.nextLine();
                }
                System.out.println("Клиент завершил работу");
            } finally {
                writer.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
*/