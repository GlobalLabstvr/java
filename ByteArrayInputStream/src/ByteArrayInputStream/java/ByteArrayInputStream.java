package ByteArrayInputStream.java;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class ByteArrayInputStream {

	public ByteArrayInputStream(byte[] byteArySource) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws IOException {
    byte[] byteArysource = {65,66,85,37};
	byte[] byteArydestintion= {};
	
	String s="Apple";
	byte[] byteArySource=s.getBytes();
	
	ByteArrayInputStream bais= new ByteArrayInputStream(byteArySource);
	ByteArrayOutputStream out=new ByteArrayOutputStream();
	
	int i=0;
	while((i= bais.read()) != -1)
{
	System.out.println((char) i);
	out.write(i);
	}

	 byteArydestination = out.toByteAry();
	for(int j=0;j< byteArydestination.length;j++)
	{
		System.out.println((char))byteArydestination[j]); 
	}

}
