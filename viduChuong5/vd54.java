package viduChuong5;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class vd54 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		double data[] = {19.4, 10.1, 123.54, 33.0, 87.9, 74.25}; double d; 
		RandomAccessFile raf; 
		try 
		{ 
			raf = new RandomAccessFile("D:\\LapTrinhMang\\viduChuong5\\random.dat","rw"); 
		} 
		catch(FileNotFoundException exc) 
		{ 
			System.out.println("Cannot open file."); return ; 
		} 
		// Write values to the file. 
		for(int i=0; i < data.length; i++) 
		{ 
			try 
			{ 
				raf.writeDouble(data[i]); 
			} 
			catch(IOException exc) 
			{ 
					System.out.println("Error writing to file."); 
					return ; 
			} 
		} 
		try 
		{
			// Now, read back specific values 
			raf.seek(0); // seek to first double 
			d = raf.readDouble(); 
			System.out.println("Giá trị đầu tiên: " + d); 
			raf.seek(8); // seek to second double 
			d = raf.readDouble(); 
			System.out.println("Giá trị thứ 2: " + d); 
			raf.seek(8 * 3); // seek to fourth double 
			d = raf.readDouble(); 
			System.out.println("Giá trị thứ 4: " + d); 
			System.out.println(); 
			// Now, read every other value. 
			System.out.println("Các giá trị còn lại: "); 
			for(int i=0; i < data.length; i+=2) 
			{ 
			raf.seek(8 * i); // seek to ith double 
			d = raf.readDouble(); 
			System.out.print(d + " "); 
			} 
			System.out.println("\n"); 
		} 
		catch (IOException exc)
		{
			System.out.println("Error seeking or reading."); 
		}
		raf.close(); 
	}

}
