package h60135684;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class BMI_CLient {

	public static void main(String[] args) {
		try {
			Socket soc = new Socket("Localhost",8989);
			System.out.print("Connected!!\n");
			//Lấy luồng nhập
			InputStream in = soc.getInputStream();
			InputStreamReader inReader = new InputStreamReader(in);
			BufferedReader buffRead = new BufferedReader(inReader);
			
			OutputStream osToClient = soc.getOutputStream();
			OutputStreamWriter write2Client = new OutputStreamWriter(osToClient);
			BufferedWriter buffW = new BufferedWriter(write2Client);
			
			//Lấy chuỗi từ bàn phím
			Scanner banPhim = new Scanner(System.in);
			//Giao tiếp theo giao thức thiết kế
			String chuoiHello = buffRead.readLine();
			//In ra màn hình
			System.out.println("BMI Server: "+chuoiHello);
			
			String chuoiXinChao = "Xin chào";
			buffW.write(chuoiXinChao+"\n");
			buffW.flush();
			
			//Nhận và gửi tên
			String name = buffRead.readLine();
			System.out.println("Server: "+name);
			
			String ClientName = banPhim.nextLine();
			buffW.write(ClientName+"\n");
			buffW.flush();
			System.out.println("Client: Tên tôi là "+ClientName);
			
			//Nhận và gửi cân nặng
			String weight = buffRead.readLine();
			System.out.println("Server: "+weight);
			
			String ClientWeight = banPhim.nextLine();
			buffW.write(ClientWeight+"\n");
			buffW.flush();
			System.out.println("Client: Tôi nặng "+ClientWeight+" "+"kg");
			
			//Nhận và gửi chiều cao
			String height = buffRead.readLine();
			System.out.println("Server: "+height);
			
			String ClientHeight = banPhim.nextLine();
			buffW.write(ClientHeight+"\n");
			buffW.flush();
			System.out.println("Client: Tôi cao "+ClientHeight+" "+"cm");
			
			//
			String chuoiDangTinh = buffRead.readLine();
			System.out.println("Server: "+chuoiDangTinh);
			
			//
			String chuoiKQ = buffRead.readLine();
			System.out.println("Server: "+chuoiKQ);
			soc.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
