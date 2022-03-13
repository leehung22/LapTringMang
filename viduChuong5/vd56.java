package viduChuong5;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.io.File;
import java.util.List;


public class vd56 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame fr = new Frame ("File Demo"); 
		 fr.setBounds(10, 10, 300, 200); 
		fr.setLayout(new BorderLayout()); 
		 
		Panel p = new Panel(new GridLayout(1,2));
		List list_C = new List("C:\\") ;
		File driver_C = new File ("C:\\");
		String[] dirs_C = driver_C.list(); 
		for (int i=0;i<dirs_C.length;i++) 
		{ 
			File f = new File ("D:\\" + dirs_C[i]); 
			if (f.isDirectory()) 
				list_C.add("<DIR>" + dirs_C[i]); 
			else list_C.add(" " + dirs_C[i]); 
		} 
		List list_D = new List();
		list_D.add("D:\\"); 
		File driver_D = new File ("D:\\"); 
		String[] dirs_D = driver_D.list(); 
		for (int i=0;i<dirs_D.length;i++) 
		{ 
			File f = new File ("D:\\" + dirs_D[i]); 
			if (f.isDirectory()) 
				list_D.add("<DIR>" + dirs_D[i]); 
			else list_D.add(" " + dirs_D[i]); 
		} 
		p.add((Component) list_C); 
		p.add((Component) list_D); fr.add(p, BorderLayout.CENTER); fr.setVisible(true); 

	}

}
