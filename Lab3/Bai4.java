import java.util.Arrays;
import java.util.Scanner;

public class Bai4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sv[] = new String[4];
        float diemSV[] = new float[4];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
        	System.out.println("Có 4 sinh viên.");
            System.out.printf("Nhập tên sinh viên thứ [%d]: ", i + 1);
            sv[i] = scanner.nextLine();
            System.out.printf("Nhập điểm cho sinh viên thứ [%d]: ", i + 1);
            diemSV[i] = scanner.nextFloat();
            scanner.nextLine();
        }
        System.out.println("Danh sách sinh viên: " + Arrays.toString(sv));
        System.out.println("Bảng điểm sinh viên: " + Arrays.toString(diemSV));
        sortSV(sv, diemSV);
        for (int i = 0; i < 4; i++) {
            System.out.println("Họ tên: " + sv[i]);
            System.out.println("Điểm: " + diemSV[i]);
            if (diemSV[i] >= 9) {
                System.out.println("Học lực: XUẤT SẮC!");
            } else if (diemSV[i] >= 7.5) {
                System.out.println("Học lực: Giỏi!");
            } else if (diemSV[i] >= 6.5) {
                System.out.println("Học lực: Khá!");
            } else if (diemSV[i] >= 5) {
                System.out.println("Học lực: Trung bình!");
            } else {
                System.out.println("Học lực: Yếu(Thi lại)");
            }
            System.out.println();
        }
	}

	public static void sortSV(String[] sv, float[] diemSV) {
		// TODO Auto-generated method stub
		for (int i = 0; i < sv.length - 1; i++) {
            for (int j = i + 1; j < sv.length; j++) {
                if (diemSV[i] > diemSV[j]) {
                    float temp = diemSV[i];
                    diemSV[i] = diemSV[j];
                    diemSV[j] = temp;
                    String svTemp = sv[i];
                    sv[i] = sv[j];
                    sv[j] = svTemp;
                }
            }
        }
	}

}
