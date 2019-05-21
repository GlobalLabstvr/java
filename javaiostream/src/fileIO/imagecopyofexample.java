package fileIO;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class imagecopyofexample {

	public static void main(String[] args) throws IOException {
	FileInputStream in=new FileInputStream("C:\\Users\\User\\Desktop\\mypic.jpj");
	
	FileOutputStream out=new FileOutputStream("C:\\Users\\User\\Desktop\\mypic_copy.jpj");

      int i=0;
	while((i=in.read()) != -1)
	{
	
		out.write(i);
	}
	}

}