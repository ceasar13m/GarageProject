package com.company;

import com.google.gson.Gson;

public class Worker {

    final int commandNumbForParsing = 1;
    final int jsonNumbForParsing = 2;
    Gson gson;

    public Worker(String url) {
        sorter(url);
        gson = new Gson();
    }

    private void sorter(String url) {
        if (!url.equals(null))
            switch (parseCommand(url, commandNumbForParsing)) {
                case "signup": {
                    System.out.println("SIGNUP");
                    processSignUp(url);
                    break;
                }
                case "signin": {
                    System.out.println("SIGNIN");
                    processSignIn(url);
                    break;
                }
                case "add": {
                    System.out.println("ADD");
                    processAdd(url);
                    break;
                }
                case "buy": {
                    System.out.println("BUY");
                    processBuy(url);
                    break;
                }
                case "getall": {
                    System.out.println("GETALL");
                    processGetAll(url);
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
        String jsonString = parseCommand(url, jsonNumbForParsing);
        System.out.println(jsonString);
        //User user = gson.fromJson(jsonString, User.class);
    }

    private void processSignUp(String url) {
        String jsonString = parseCommand(url, jsonNumbForParsing);
        System.out.println(jsonString);
    }

    private void processAdd(String url) {
        String jsonString = parseCommand(url, jsonNumbForParsing);
        System.out.println(jsonString);
    }

    private void processBuy(String url) {
        String jsonString = parseCommand(url, jsonNumbForParsing);
        System.out.println(jsonString);
    }

    private void processGetAll(String url) {
        String jsonString = parseCommand(url, jsonNumbForParsing);
        System.out.println(jsonString);
    }

    private void processSignOut(String url) {
        String jsonString = parseCommand(url, jsonNumbForParsing);
        System.out.println(jsonString);
    }


}
