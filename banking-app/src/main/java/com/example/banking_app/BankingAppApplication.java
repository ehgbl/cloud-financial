package com.example.banking_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


public class BankingAppApplication {

	public static void main(String[] args) {
		//SpringApplication.run(BankingAppApplication.class, args);
		Savings savacc1= new Savings("Titus Wolfe","312478906",1500);
		Checking chkacc1 = new Checking("Bob Terry","412478906",2500);


		//Read a csv file then create

	}
}