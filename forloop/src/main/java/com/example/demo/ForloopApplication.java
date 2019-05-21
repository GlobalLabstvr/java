package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ForloopApplication {

	public static void main(String[] args) {
		SpringApplication.run(ForloopApplication.class, args);
		int ary[]= {10,20,30,40,50};
		int sum=0;
		for(int i=0; 1<ary.length;i++)
		{
			sum+=ary[i];//sum=sum + ary[i];
		}
		System.out.print("sum is:" +sum);
			
	}

}
