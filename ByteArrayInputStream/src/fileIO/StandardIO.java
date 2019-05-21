package fileIO;

import java.io.IOException;
import java.util.Scanner;

public class StandardIO {

	public static void main(String[] args) throws IOException {
		
    Scanner scanner=new Scanner(System.in);
    
    System.out.println("enter firstname:..");
    String firstname=scanner.nextLine();
    
    System.out.println("enter lastname:..");
    String lastname=scanner.nextLine();
    
    System.out.println("you fullname is:" +firstname+ " " +lastname);
    System.err.println("you fullname is:" +firstname+ " " +lastname);
    
	}
	

}
