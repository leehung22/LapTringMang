package viduChuong5;

import java.io.PrintWriter;

public class vd552 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintWriter pw = new PrintWriter(System.out, true); 
		int i = 10;
		double d = 123.67; 
		double r = i+d; 
		pw.println("Using a PrintWriter."); 
		pw.println(i); 
		pw.println(d); 
		pw.println(i + " + " + d + " = " + r); 
	}

}
