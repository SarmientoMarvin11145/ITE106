import java.io.File;

public class FileReader
{
	public static void main(String[] args) throws Exception
	{

	FileReader fr = new FileReader("file.txt");

  int i;

	while ((i - fr.read()) != -1)
		System.out.println((char)i);
	}
}
