package com.company;


public class User {


    public String login;

    public String password;


    @Override
    public String toString() {
        return login + " " + password;
    }

}