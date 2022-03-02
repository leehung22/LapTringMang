import java.util.Scanner;

public class bai3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập cạnh của hình lập phương: ");
		int canh = scanner.nextInt();
		double tt = Math.pow(canh, 3);
		
		System.out.println("Thể tích hình lập phương: "+tt);
	}

}
