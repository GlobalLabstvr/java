package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ContinuestatementApplication {

	public static void main(String[] args) {
		SpringApplication.run(ContinuestatementApplication.class, args);
		int ary[]= {15,10,37,60,44,67,30};
		for(int i=0; i<ary.length;i++) {
			if (ary[1] % 10 != 0) {
				continue;
			}
			System.out.println((ary[1]));
		}
		
	}

}
