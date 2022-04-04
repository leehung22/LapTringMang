package dichSo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class Thread {
	Socket socketClient;
	int id=-1;

	
	public Thread(Socket socketClient, int id) {
		this.socketClient = socketClient;
		this.id = id;
	}
	
	@Override
	public void run() {
		try {
				InputStream in = socketClient.getInputStream();
				InputStreamReader inRead = new InputStreamReader(in);
				BufferedReader buffRead = new BufferedReader(inRead);
				
				OutputStream osToClient = socketClient.getOutputStream();
				OutputStreamWriter write2Client = new OutputStreamWriter(osToClient);
				BufferedWriter buffW = new BufferedWriter(write2Client);
				
				//========Giao tiếp theo giao thức thiết kế=====
				while(true) {
					//Gửi yêu cầu cho server
					String chuoiGui;
					buffW.write("Nhập số (0-9) cần dịch: ");
					buffW.flush();

					//Nhận dữ liệu
					String chuoiNhan= buffRead.readLine();
					
					//Gửi trả
					if(chuoiNhan.equals("0"))
					{
						buffW.write("Zero"+"\n");
						buffW.flush();
					}
					else if(chuoiNhan.equals("1"))
					{
						buffW.write("One"+"\n");
						buffW.flush();
					}
					else if(chuoiNhan.equals("2"))
					{
						buffW.write("Two"+"\n");
						buffW.flush();
					}
					else if(chuoiNhan.equals("3"))
					{
						buffW.write("Three"+"\n");
						buffW.flush();
					}
					else if(chuoiNhan.equals("4"))
					{
						buffW.write("Four"+"\n");
						buffW.flush();
					}
					else if(chuoiNhan.equals("5"))
					{
						buffW.write("Five"+"\n");
						buffW.flush();
					}
					else if(chuoiNhan.equals("6"))
					{
						buffW.write("Six"+"\n");
						buffW.flush();
					}
					else if(chuoiNhan.equals("7"))
					{
						buffW.write("Seven"+"\n");
						buffW.flush();
					}
					else if(chuoiNhan.equals("8"))
					{
						buffW.write("Eight"+"\n");
						buffW.flush();
					}
					else if(chuoiNhan.equals("9"))
					{
						buffW.write("Nine"+"\n");
						buffW.flush();
					}
					else if (chuoiNhan.equals("10")) 
						{
							buffW.write("ten"+"\n");
							buffW.flush();
							break;
						}
				}
				//Đóng
				socketClient.close();		 
		}catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			 }
	}
}
