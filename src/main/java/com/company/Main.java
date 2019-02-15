package com.company;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Server server = new Server();
        Client client = new Client();

        server.start();
        client.start();

        server.join();
        server.join();
    }
}
