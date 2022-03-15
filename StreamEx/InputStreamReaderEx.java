import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderEx {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		InputStreamReader isRdr;
		//Gắn nó với 1 luồng nhập chuẩn
		isRdr = new InputStreamReader(System.in);
		System.out.print("Mời nhập 1 ký tự: ");
		int kt= isRdr.read();
		//Nới thực hiện các lện có khả năng sinh ra lỗi
		//in ra
		System.out.print("Ký tự bạn vừa nhập: "+(char)kt);
	}

}
