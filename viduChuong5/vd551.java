package viduChuong5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class vd551 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// create a BufferedReader using System.in 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		String str; 
		System.out.println("Nhập chuỗi.");
		System.out.println("Nhập 'stop' để kết thúc chương trình.");
		do 
		{ 
		str = br.readLine(); 
		System.out.println("Chuỗi của bạn đã nhập: "+str); 
		} while(!str.equals("stop")); 
	}

}
