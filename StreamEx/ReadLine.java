import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadLine {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//Tạo 1 đối tượng của lớp InputStreamReader
		InputStreamReader isRdr;
		//Gắn nó với 1 luồng chuẩn
		isRdr = new InputStreamReader(System.in);
		BufferedReader buffReader = new BufferedReader(isRdr);
		//Đọc dữ liệu từ bàn phím
		System.out.print("Mời nhập chuỗi ký tự: ");
		String strLine = buffReader.readLine();
		//Xuất ra màn hình
		System.out.print("Chuỗi của bạn là: "+ strLine);
	}

}
