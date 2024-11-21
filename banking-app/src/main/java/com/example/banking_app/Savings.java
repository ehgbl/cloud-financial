package com.example.banking_app;

public class Savings extends Account {
    int depositID;
    int safetyKey;
//Specific poperties to savings account
    public Savings(String name){
    System.out.println("New Savings Account");
    System.out.println("Name:"+name);
        }

}
