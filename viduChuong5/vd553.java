package viduChuong5;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class vd553 {

	public static void main(String[] args)  throws IOException {
		// TODO Auto-generated method stub
		String str; 
		FileWriter fw;
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in)); 
		 try 
		{ 
		fw = new FileWriter("D:\\LapTrinhMang\\viduChuong5\\testUnicode.txt"); 
		} 
		catch(IOException exc) 
		{ 
		System.out.println("Không thể mở file."); return ; 
		} 
		 System.out.println("Nhập 'stop' để kết thúc chương trình."); 
		 do 
		{ 
		System.out.print(": "); 
		str = br.readLine(); 
		if(str.compareTo("stop") == 0) break; 
		str = str + "\r\n"; 
		fw.write(str); 
		} while(str.compareTo("stop") != 0); 
		 fw.close();
	}

}
