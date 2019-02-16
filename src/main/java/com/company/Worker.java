package com.company;

import java.io.IOException;

public class Worker {

    final int commandNumbForParsing = 1;
    final  int jsonNumbForParsing = 2;

    public Worker(String message) {
        sorter(parseCommand(message, commandNumbForParsing));
    }

    private void sorter(String message) {
        if(message != null)
        switch (message) {
            case "signup": {
                System.out.println("SIGNUP");
                processSignUp();
                break;
            }
            case "signin": {
                System.out.println("SIGNIN");
                processSignIn();
                break;
            }
            case "add": {
                System.out.println("ADD");
                processAdd();
                break;
            }
            case "buy": {
                System.out.println("BUY");
                processBuy();
                break;
            }
            case "getall": {
                System.out.println("GETALL");
                processGetAll();
                break;
            }
            default: {
                break;
            }
        }
    }

    private String parseCommand(String url, int i) {
        String[] split = url.split("/");

        if (split.length < i + 1) return null;
        return split[i];

    }

    private void processSignIn(String url) {

    }

    private void processSignUp(String url) {

    }

    private void processAdd() throws IOException {

    }

    private void processBuy(String url) {

    }

    private void processGetAll(String url) {

    }

    private void processSignOut(String url) {

    }



}
