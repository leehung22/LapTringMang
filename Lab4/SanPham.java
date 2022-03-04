import java.util.Scanner;

public class SanPham {
	private String tenSP;
	private double donGia;
	private double giamGia;
	
	//hàm tạo đủ 3 tham số
	public SanPham(String _tenSP, double _donGia, double _giamGia) {
		tenSP = _tenSP;
		donGia = _donGia;
		giamGia = _giamGia;
	}
	
	//hàm toạ đủ 3 tham số
		public SanPham(String _tenSP, double _donGia) {
			tenSP = _tenSP;
			donGia = _donGia;
			giamGia = 0;
		}
	
	//10% giá sản phẩm
	private double getThueNhapKhau () {
		return donGia*0.1;
	}
	//Nhập dữ liệu cho các thuộc tính
	public void nhap() {
		Scanner bp = new Scanner(System.in);
		System.out.print("Tên sản phẩm: ");
		tenSP = bp.nextLine();
		System.out.print("Đơn giá của sản phẩm: ");
		donGia = bp.nextDouble();
		System.out.print("Nhập giảm giá của sản phẩm: ");
		giamGia = bp.nextDouble();
	}
	
	public void xuat() {
		System.out.println("Tên sản phẩm: "+tenSP);
		System.out.println("Giá sản phẩm: "+ String.valueOf(donGia));
		System.out.println("Giảm giá: "+ String.valueOf(giamGia));
		System.out.println("Thuế nhập khẩu: "+ String.valueOf(getThueNhapKhau()));
	}
}

