package viduChuong5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class vd5332 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int i; 
		FileInputStream fin; 
		FileOutputStream fout; 
		try { 
			// open input file 
			try { 
					fin = new FileInputStream("D:\\LapTrinhMang\\viduChuong5\\text.txt"); 
				} catch(FileNotFoundException exc) 
				{ 
					System.out.println("Input File Not Found"); 
					return; 
				}
				
			// open output file 
			try { 
				fout = new FileOutputStream("D:\\LapTrinhMang\\viduChuong5\\dich.txt"); 
			} 
			catch(FileNotFoundException exc) {
				System.out.println("Error Opening Output File"); return;
			} 
		} 
		catch(ArrayIndexOutOfBoundsException exc) { 
			System.out.println("Usage: CopyFile From To"); return; 
		}
		// Copy File 
		try { 
		do {
				i = fin.read(); 
				if(i != -1) {
					fout.write(i);
					System.out.println("File đã được copy");
			} 
		} 
		while(i != -1); 
		} 
		catch(IOException exc) { 
				System.out.println("File Error"); 
		} 
		fin.close(); 
		fout.close(); 
	}

}
