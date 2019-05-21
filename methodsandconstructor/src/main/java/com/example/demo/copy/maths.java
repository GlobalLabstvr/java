package com.example.demo.copy;

public class maths {
	int x;
	int y;
	
	maths(int x , int y) {
		this.x=x;
		this.y=y;
	}
	
	void setvalues(int x, int y) {
		this.x=x;
		this.y=y;	
		
	}
	int addition() {
		return(x+y);
	}
	void product() {
		System.out.println(x+y);
	}

}
