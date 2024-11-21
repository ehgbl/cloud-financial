package com.example.banking_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BankingAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankingAppApplication.class, args);
		Checking chacc1 = new Checking("Bob Terry");
		Savings savacc1= new Savings("Titus Wolfe");

		//Read a csv file then create

	}
}