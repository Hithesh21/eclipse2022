package com.xworkz.access.boot;

import com.xworkz.access.office.MyPen;
import com.xworkz.access.office.Pen;

public class PenRunner {

	public static void main(String[] args) {
		Pen pen=new Pen("blue","ball",'b', 10, 40, 5, false, false, false, false);
 String ref=pen.getBrand();
 System.out.println(ref);
MyPen pen1=new MyPen();
pen1.use(pen);
	}

}
