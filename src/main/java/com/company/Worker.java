package com.company;

public class Worker {

    public Worker(String message) {
        sorter(message);
    }

    private void sorter(String message) {
        switch (message) {
            case "signup": {
                System.out.println("SIGNUP");
                break;
            }
            case "signin": {
                System.out.println("SIGNIN");
                break;
            }
            case "add": {
                System.out.println("ADD");
                break;
            }
            case "buy": {
                System.out.println("BUY");
                break;
            }
            case "getall": {
                System.out.println("GETALL");
                break;
            }
            default: {
                break;
            }
        }
    }

}
