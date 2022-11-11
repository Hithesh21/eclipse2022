package com.xworkz.access.boot;

import com.xworkz.access.office.Box;
import com.xworkz.access.office.Boxes;

public class BoxRunner {

	public static void main(String[] args) {
		Box box=new Box("packit","brown",2,300,"square", "packing","plastic", true) ;
		box.getColor();
		Boxes boxes=new Boxes();
		boxes.use(box);
	}

}
