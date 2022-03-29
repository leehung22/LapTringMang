package h60135684;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class BMI_Server {

	public static void main(String[] args) {
		try {
			// Mở cổng và bắt đầu nghe
			ServerSocket server = new ServerSocket(8989);
			System.out.println("I'm waiting on 8989 port...");
			// Luôn luôn lắng nghe
			while (true){
				//Khi có 1 yêu cầu thì accept
				//Mở 1 Socket để làm việc với Client
				Socket socSer = server.accept();
				
				//Lấy về luồng xuất, nhập
				InputStream in = socSer.getInputStream();
				InputStreamReader inRead = new InputStreamReader(in);
				BufferedReader buffRead = new BufferedReader(inRead);
				
				OutputStream osToClient = socSer.getOutputStream();
				OutputStreamWriter write2Client = new OutputStreamWriter(osToClient);
				BufferedWriter buffW = new BufferedWriter(write2Client);
				
				//========Giao tiếp theo giao thức thiết kế=====
				
					String chuoiHello = "Hello";
					buffW.write(chuoiHello+"\n");
					buffW.flush();
					
					String chuoiXinChao = buffRead.readLine();
					System.out.println("CLient: "+chuoiXinChao);
					
					//Gửi và nhận tên
					String name = "Gửi tên cho tôi (nhập tên của bạn)";
					buffW.write(name+"\n");
					buffW.flush();
					
					String ClientName = buffRead.readLine();
					
					
					//Gửi và nhận cân nặng
					String weight = "Cân nặng của bạn là (nhập cân nặng của bạn [kg]):";
					buffW.write(weight+"\n");
					buffW.flush();
					
					String ClientWeight = buffRead.readLine();
					
					
					//Gửi và nhận chiều cao
					String height = "Chiều cao của bạn là (nhập chiều cao của bạn [m]):";
					buffW.write(height+"\n");
					buffW.flush();
					
					String ClientHeight = buffRead.readLine();
					
					//
					String chuoiDangTinh = "Tôi đang tính toán...";
					buffW.write(chuoiDangTinh+"\n");
					buffW.flush();
					
					//Tính BMI
					double BMI;
					String chuoiKQ;
					BMI = Double.parseDouble(ClientWeight)/(Double.parseDouble(ClientHeight)*Double.parseDouble(ClientHeight));
						//Các lệnh ở đây
						//Đổi tham số từ chuỗi sang số
					if(BMI < 18) {
						chuoiKQ = "Bạn là người gầy";
					}
					else if(BMI <= 24.9){
						chuoiKQ = "Bạn là người bình thường";
					}
					else if(BMI <= 29.9){
						chuoiKQ = "Bạn bị béo phì độ I";
					}
					else if(BMI <= 34.9) {
						chuoiKQ = "Bạn bị béo phì độ II";
					}
					else{
						chuoiKQ = "Bạn bị béo phì độ III";
					}
					
					//
					buffW.write(chuoiKQ+"\n");
					buffW.flush();
				//Đóng
				socSer.close();	
			}
			//server.close();		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}
	}

}
