package com.example.banking_app;

public class Checking extends Account {
    int debitCardNum;
    int debitCardPin;
//Constructor
    public Checking(String name, String ssn, double initDeposit) {
        super(name,ssn,initDeposit);
        System.out.println("New Checking");
        System.out.println("Name:"+name);

    }




}
