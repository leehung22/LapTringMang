import java.util.Scanner;

public class chuongTrinhChinh {

	public static void main(String[] args) {
//		// Khai boá và toạ mới đói tượng
//		SanPham sp1 = new SanPham("TV",1000000,100);
//		SanPham sp2 = new SanPham("Iphone", 120000);
//		
//		//Nhập dữ liệu
//		sp1.nhap();
//		sp2.nhap();
//		
//		//Xuất dữ liệu
//		sp1.xuat();
//		sp2.xuat();
		
		//Tạo cứng 2 hàng hoá
//		HangHoa hh1 = new HangHoa("Búi bi",2000);
//		HangHoa hh2 = new HangHoa("Bút mực", 12000,0.1);
		
		//Nhập dữ liệu từ bàn phím
		HangHoa hh1 = new HangHoa();
		HangHoa hh2 = new HangHoa();
		//Nhập dữ liệu cho các thuộc tính
		Scanner bp = new Scanner(System.in);
		System.out.print("------------------------------------");
		System.out.print("SP1: Tên: ");
		String tenHang = bp.nextLine();
		hh1.setTenHH(tenHang);
		System.out.print("SP1: Giá: ");
		hh1.setDonGia(bp.nextDouble());
		System.out.print("SP1: giảm Giá: ");
		hh1.setGiamGia(bp.nextDouble());
		
		System.out.print("------------------------------------");
		System.out.print("SP2: Tên: ");
		String tenHang1 = bp.nextLine();
		hh2.setTenHH(tenHang1);
		System.out.print("SP2: Giá: ");
		hh2.setDonGia(bp.nextDouble());
		System.out.print("SP2: giảm Giá: ");
		hh2.setGiamGia(bp.nextDouble());
		
		// Xuất thông tin
		System.out.println("========================================");
		System.out.println("Tên hàng hoá: "+ hh1.getTenHH());
		System.out.println("Giá sản phẩm: "+ hh1.getDonGia());
		System.out.println("Giảm giá: "+ hh1.getGiamGia());
		System.out.println("Thuế nhập khẩu: "+ hh1.getDonGia()*0.1);
		System.out.println("========================================");
		System.out.println("Tên hàng hoá: "+ hh2.getTenHH());
		System.out.println("Giá sản phẩm: "+ hh2.getDonGia());
		System.out.println("Giảm giá: "+ hh2.getGiamGia());
		System.out.println("Thuế nhập khẩu: "+ hh2.getDonGia()*0.1);
		System.out.println("========================================");
	}

}
