package com.example.demo;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SwitchcasestatementApplication {

	public static void main(String[] args) {
		SpringApplication.run(SwitchcasestatementApplication.class, args);
		
		int a=60;
		 int b=40;
		 Scanner reader=new Scanner(System.in);
		
		System.out.println("enter an operators:");
		System.out.println("enter 1 for a+b ");
		System.out.println("enter 2 for a-b ");
		System.out.println("enter 3 for a*b ");
		System.out.println("");
		System.out.print("enter:");
		int option=reader.nextInt();
		
		switch(option)
		{
		case 1:
			System.out.println("a+b");
			break;
		case 2:
			System.out.println("a-b");
			break;
		case 3:
			System.out.println("a*b");
			break;
			default:
				System.out.println("invalid value:");
			}
		
		
	}

}
