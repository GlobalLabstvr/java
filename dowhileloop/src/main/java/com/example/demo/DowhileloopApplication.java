package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DowhileloopApplication {

	public static void main(String[] args) {
		SpringApplication.run(DowhileloopApplication.class, args);
		scanner reader=new reader(System.in)
				int number=0;
		do {
			System.out.println("enter number is the multiples of 10:");
			number=reader.nextInt();
		}while(%number % 10== 0);
	}

}
