package viduChuong5;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class vd534 {

	public static void main(String[] args)  throws IOException {
		// TODO Auto-generated method stub
		DataOutputStream dataOut; 
		DataInputStream dataIn; 
		int i = 10; 
		double d = 1023.56; 
		boolean b = true; 
		try 
		{ 
			dataOut = new DataOutputStream( new FileOutputStream("D:\\LapTrinhMang\\viduChuong5\\testdataW.txt")); //tạo 1 file để chuyển dữ liệu vào
		} 
		catch(IOException exc) 
		{ 
			System.out.println("Cannot open file."); return; 
		} 
		try 
		{ 
			System.out.println("Writing " + i); 
			dataOut.writeInt(i); 
			System.out.println("Writing " + d); 
			dataOut.writeDouble(d); 
			System.out.println("Writing " + b); 
			dataOut.writeBoolean(b); 
			System.out.println("Writing " + 12.2 * 7.4); 
			dataOut.writeDouble(12.2 * 7.4); 
		} 
		catch(IOException exc) { 
			System.out.println("Write error."); 
		} 
		dataOut.close(); 
		System.out.println(); 
		// Now, read them back. 
		try 
		{ 
			dataIn = new DataInputStream( new FileInputStream("D:\\LapTrinhMang\\viduChuong5\\testdataW.txt")); 
		} 
		catch(IOException exc) { 
			System.out.println("Cannot open file."); return; 
		} 
		try 
		{ 
			i = dataIn.readInt(); 
			System.out.println("Reading " + i); 
			d = dataIn.readDouble(); 
			System.out.println("Reading " + d); 
			b = dataIn.readBoolean(); 
			System.out.println("Reading " + b); 
			d = dataIn.readDouble(); 
			System.out.println("Reading " + d); 
		} 
			catch(IOException exc) { 
				System.out.println("Read error."); 
		} 
		dataIn.close(); 
	}

}
