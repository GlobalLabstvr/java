package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StatementsandblocksApplication {

	public static void main(String[] args) {
		SpringApplication.run(StatementsandblocksApplication.class, args);
     char a='a';
     //Block1: 'a' is accessible but 'b' 'c' not here
     System.out.println("Block 1:" + 'a');
     {//Block 2: 'a' 'b' is accessible but 'c' not here
     char b='b';
     System.out.println("Block 2:" + a + b);
     {//Block 3: 'a' 'b' 'c' is accessible here
     char c ='c';
     System.out.println("Block 3:" + a + b + c);
     }
     }
	}

}
