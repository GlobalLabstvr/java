package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IfandelseifstatementsApplication {

	public static void main(String[] args) {
		SpringApplication.run(IfandelseifstatementsApplication.class, args);
		int n1=100;
		int n2=200;
		System.out.println("enter the value of n1 & n2:" + n1 + n2);
		if(n1==n2)
		{System.out.println("n1 is equal to n2:" +(n1=n2));
		}
		else if(n1>n2)
		{System.out.println("ni is greater than n2:" +( n1>n2));
		}
		else if(n1<n2)
		{System.out.println("n1 is less than n2:" + (n1>n2));
		}
		else 
		{System.out.println("n1 is not equal to n2:" +(n1!=n2));
		
		}
			
		}

}
