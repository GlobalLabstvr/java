package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WhileloopstatementsApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(WhileloopstatementsApplication.class, args);
		scanner reader= new scanner(system.in);
        
          System.out.println("in how many attempts does the car start");
          int attempts= readernext.in()
		
		int count = 1;
		int MaxAttempts =10;
		
		while(count<=MaxAttempts) {
			System.out.println("Roboat to attempts to starting car...");
		
				if(count==attempts) {
			System.out.println("roboat is successfully started the car in" + count +"attempts.");
			break;
		}
				if(count==MaxAttempts) {
					System.out.println("roboat start the car is failed..");
				}
				count++;
				}

	}
}
