package com.xworkz.boot;

import com.xworkz.repo.PanCardRepo;
import com.xworkz.repo.PanCardRepoImpi;

public class PanCardRunner {

	public static void main(String[] args) {

		PanCardRepo pan=new PanCardRepoImpi();
		pan.create("plre1234l");
		pan.create("slre1234l");
		pan.create("qlre1234l");
		pan.create("wlre1234l");
		pan.create("elre1234l");
		pan.create("rlre1234l");
		pan.create("tlre1234l");
		pan.create("ylre1234l");
		pan.create("ulre1234l");
		pan.create("ilre1234l");
		//pan.create("plre1234l");
		
		System.out.println(pan.totalPanCard());
	}

}
