package com.example.banking_app;

public class Checking extends Account {
    int debitCardNum;
    int debitPin;
    public Checking(String name){
        System.out.println("New Checking Account");
        System.out.println("Name:"+name);
    }
}
