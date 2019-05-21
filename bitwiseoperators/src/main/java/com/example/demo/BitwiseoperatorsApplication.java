package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BitwiseoperatorsApplication {

	public static void main(String[] args) {
		SpringApplication.run(BitwiseoperatorsApplication.class, args);
		byte a=65; //000000000 00000000 00000000 01000001
		byte b=-30; //11111111 11111111 11111111 11100010
		//unary bitwise Compliment
		System.out.println("~a:" + ~a);// 11111111 11111111 11111111 10111110= -66
		//unary bitwise AND operator
		System.out.println("a&b:" +(a&b));//00000000 00000000 00000000 01000000= 64
		//bitwise OR
		System.out.println("a|b:" +(a|b));//11111111 11111111 11111111 11100011= -29
		//bitwise XOR
		System.out.println("a^b:" +(a^b));//11111111 11111111 11111111 10100011= -93
		//signed left shift
		System.out.println("b<<3:" +(b<<4));//11111111 11111111 11111110 00100000= -480
		//signed right shift
		System.out.println("b>>2:" +(b>>2));//11111111 11111111 11111111 11111000=-8
		//unsigned right shift
		System.out.println("b>>>2:" +(b>>>2));//00111111 11111111 11111111 11111000= 1073741816
	
		
	}

}
