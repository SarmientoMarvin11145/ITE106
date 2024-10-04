import java.io.*;

public class FileReader
{
	public static void main(String [] args) throws Exception{
		
		File file = new File("file.txt");
		
		int i;
		while((i = fr.read()) != -1)
			System.out.print((char) i);
	}
}
