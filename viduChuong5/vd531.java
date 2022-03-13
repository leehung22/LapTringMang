package viduChuong5;

import java.io.IOException;

public class vd531 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		byte data[] = new byte[100]; //tạo mảng byte
		System.out.print("Enter some characters: ");
		System.in.read(data); //gắn dữ liệu từ console vào mảng byte
		System.out.print("You entered: ");
		for(int i=0; i < data.length; i++) //in mảng ra
		System.out.print((char) data[i]);
	}

}
