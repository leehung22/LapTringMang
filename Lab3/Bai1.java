import java.util.Scanner;

public class Bai1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập số n: ");
		int n = scanner.nextInt();
		boolean ok = true;
		for (int i = 2; i < n-1; i++) {
			if (n%i==0) {
				ok=false;
				break;
			}
			i++;
		}
		if (ok) {
			System.out.println(n+" là số nguyên tố");
		} else {
			System.out.println(n+" không phải là số nguyên tố");
		}
	}

}
