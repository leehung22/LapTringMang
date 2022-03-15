import java.io.IOException;
import java.io.InputStream;

public class CharInputStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Tạo 1 đối tượng của lớp InputStream
		InputStream is;
		//Gắn nó với luồng nhập chuẩn (bàn phím)
		is= System.in;
		//Đọc 1 ký tự
		try {
			System.out.print("Mời nhập 1 ký tự: ");
			int kt= is.read();
			//Nới thực hiện các lện có khả năng sinh ra lỗi
			//in ra
			System.out.print("Ký tự bạn vừa nhập: "+(char)kt);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			//nới xủa lý nếu có ngoại lệ xảy ra
		}
		
	}

}
