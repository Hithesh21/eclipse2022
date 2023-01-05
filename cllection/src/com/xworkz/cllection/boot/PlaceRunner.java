package com.xworkz.cllection.boot;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.cllection.dto.PlaceDTO;

public class PlaceRunner {

	public static void main(String[] args) {

		
		PlaceDTO place=new PlaceDTO("blr","karnataka", 560001);
		PlaceDTO place1=new PlaceDTO("tumkur","karnataka", 590001);
		PlaceDTO place2=new PlaceDTO("blr",null, 560001);
		
		System.out.println(place.getName().equals(place2.getName()));
		
		Collection<PlaceDTO> col=new ArrayList<PlaceDTO>();
		col.add(place2);
		col.add(place);
		
		boolean equal=col.contains(place1);
		System.out.println("contains : " +equal);
	}

}
