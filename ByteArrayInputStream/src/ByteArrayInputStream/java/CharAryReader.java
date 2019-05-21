package ByteArrayInputStream.java;

import javax.imageio.IIOException;

public class CharAryReader {
	public void min(String[] args)  throws IIOException {
		char[] charAry = {'a','p','p','l','e'};
		CharAryReader car=new CharAryReader();
		int i=0;
		while((i= car.read()) != -1) {
	System.out.println((char) i);
}
		
		
	}



	

}
