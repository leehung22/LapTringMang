import java.util.Scanner;

public class bai2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Cạnh 1 của HCN: ");
		int canh1 = scanner.nextInt();
		System.out.print("Cạnh 2 của HCN: ");
		int canh2 = scanner.nextInt();
		int ChuVi = 2*(canh1+canh2);
		int DienTich = canh1*canh2;
		System.out.println("HCN có cạnh 1 là: "+canh1);
		System.out.println("HCN có cạnh 2 là: "+canh2);
		System.out.println("Chu vi: "+ChuVi+"; "+"Diện tích: "+DienTich);
	}

}
