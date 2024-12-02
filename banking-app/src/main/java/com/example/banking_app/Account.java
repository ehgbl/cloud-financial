package com.example.banking_app;

public abstract class Account extends InterestRateStatic {
    String name;
    double balance;

    String ssn;
    String acctnum;
    double rate;


    //List properties
    public Account(String name,String ssn,double initDeposit) {
        this.name = name;
        this.balance = balance;
        this.acctnum = acctnum;
        this.ssn = ssn;
        balance=initDeposit + 100;

        System.out.println("Name:"+name+"SSN:"+ssn+"Balance: $"+balance);
        // Fetch the current interest rate from FRED API
        this.rate = InterestRateStatic.getRate();

        System.out.println("New Account Created:");
        System.out.println("Name: " + this.name);
        System.out.println("Initial Balance: $" + this.balance);
        System.out.println("Interest Rate: " + this.rate + "%");
    }

    public Account(String name) {
        super();
    }


/*
    // Method to fetch interest rate dynamically
    private double fetchInterestRate() {
        try {
            // Replace with actual API call code
            double fetchedRate = InterestRateFetcher.getRate(); // Simulated call to your InterestRateFetcher class
            return fetchedRate;
        } catch (Exception e) {
            System.out.println("Failed to fetch interest rate. Using default rate.");
            return 1.0; // Default rate in case of failure
        }
    }*/
}

