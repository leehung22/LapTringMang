import java.util.Scanner;

public class bai4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Hệ số a của pt bậc 2: ");
		int a = scanner.nextInt();
		System.out.print("Hệ số b của pt bậc 2: ");
		int b = scanner.nextInt();
		System.out.print("Hệ số c của pt bậc 2: ");
		int c = scanner.nextInt();
		double delta = Math.pow(b, 2)-4*a*c;
		
		System.out.println("Delta của pt bạc 2: "+delta);
		System.out.println("Căn delta của pt bạc 2: "+ Math.sqrt(delta));
	}

}
