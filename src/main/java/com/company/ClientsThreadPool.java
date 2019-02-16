package com.company;

import java.io.*;
import java.net.Socket;

public class ClientsThreadPool extends Thread {
    Socket socket;
    BufferedReader reader;
    BufferedWriter writer;

    ClientsThreadPool(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        System.out.println("Новый поток для клиента");
        String message;
        try {
            reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            System.out.println("all1");
            message = reader.readLine();
            System.out.println("all2");
            while (true) {
                System.out.println("Сервер получил сообщение: " + message);
                if (message.equals("exit"))
                    break;

                if (message != null) {
                    Worker worker = new Worker(message);
                }

                message = reader.readLine();
            }

            System.out.println("Поток клиента закрыт");
        } catch (IOException e) {
            System.out.println("all...");
            e.printStackTrace();
        }


    }
}
