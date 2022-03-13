package viduChuong5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class vd533 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int i;
		FileInputStream fin;
		try
		{
		fin = new FileInputStream("D:\\LapTrinhMang\\viduChuong5\\text.txt");
		}
		catch(FileNotFoundException exc)
		{
		System.out.println("File Not Found"); return;
		}
		catch(ArrayIndexOutOfBoundsException exc)
		{
		System.out.println("Usage: ShowFile File"); return;
		}
		// read bytes until EOF is encountered
		do {
		i = fin.read();
		if(i != -1) System.out.print((char) i);
		} while(i != -1);
		fin.close(); 
	}

}
