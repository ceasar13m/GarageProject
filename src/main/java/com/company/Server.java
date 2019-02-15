package com.company;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server extends  Thread{
    ServerSocket serverSocket ;
    Socket clientSocket;

    @Override
    public void run () {
        try {
            serverSocket = new ServerSocket(8080);
            System.out.println("Сервер запущен...");
            while (true) {
                clientSocket = serverSocket.accept();
                ClientsThreadPool clientsThreadPool = new ClientsThreadPool(clientSocket);
                clientsThreadPool.start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
