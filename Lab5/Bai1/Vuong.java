
public class Vuong extends ChuNhat{
	double canh;

	public Vuong(double canh) {
		super(canh, canh);
		// TODO Auto-generated constructor stub
		this.canh = canh;
	}
	
	@Override
	public void xuat() {
		// TODO Auto-generated method stub
		System.out.println("-----------------------------------");
		System.out.println("Cạnh: " + String.valueOf(canh));
		System.out.println("Chu vi: " + super.getChuVi());
		System.out.println("Diện tích: " + super.getDienTich());
	}
	
}
