import java.util.Scanner;

public class ChuNhat {
	private double rong;
	private double dai;
	
	public ChuNhat(double rong, double dai) {
		this.dai = dai;
		this.rong = rong;
	}
	
	public double getChuVi (){
		return (dai+rong)*2;
	}
	
	public double getDienTich() {
		return dai*rong;
	}
	
	public void nhap() {
		Scanner bp = new Scanner(System.in);
		System.out.print("Nhập chiều dài: ");
		dai = bp.nextDouble();
		System.out.print("Nhập chiều rộng: ");
		rong = bp.nextDouble();
	}
	
	public void xuat() {
		System.out.println("-----------------------------------");
		System.out.println("Chiều dài: "+ String.valueOf(dai));
		System.out.println("Chiều rộng: "+ String.valueOf(rong));
		System.out.println("Chu vi: "+ String.valueOf(getChuVi()));
		System.out.println("Diện tích: "+ String.valueOf(getDienTich()));
	}
}
