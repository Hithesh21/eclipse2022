package com.xworkz.cllection.boot;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


import com.xworkz.cllection.WeaponDTO;

public class WeaponRunner {

	public static void main(String[] args) {

		
		
		WeaponDTO dto=new WeaponDTO("chakra", "brass", "abc", "small", 200);
		WeaponDTO dto1=new WeaponDTO("sword", "steel", "www", "small", 300);
		WeaponDTO dto2=new WeaponDTO("bow and arrow", "wood", "bbb", "big", 900);
		WeaponDTO dto3=new WeaponDTO("shield", "iron", "ccc", "small", 500);
		WeaponDTO dto4=new WeaponDTO("spears", "BRASS", "eee", "small", 1000);
		WeaponDTO dto5=new WeaponDTO("javelins", "iron", "fff", "small", 1100);
		WeaponDTO dto6=new WeaponDTO("lances", "steel", "jjj", "small", 280);
		WeaponDTO dto10=new WeaponDTO("axes", "Brass", "lll", "small", 90);
		WeaponDTO dto8=new WeaponDTO("pikes", "iron", "nnn", "small", 220);
		WeaponDTO dto9=new WeaponDTO("clubs", "iron", "zzz", "small", 190);
		
Collection<WeaponDTO> col=Stream.of(dto,dto1,dto2,dto3,dto4,dto5,dto6,dto8,dto9,dto10).collect(Collectors.toSet());
 
		col.forEach(e -> System.out.println(e));
		
		System.out.println("==========================================================");
		
		col.stream().sorted((b1,b2)->b1.getName().compareTo(b2.getName())).forEach(e-> System.out.println(e));
	    
		System.out.println(System.lineSeparator());

		col.stream().sorted((b1,b2)->b2.getName().compareTo(b1.getName())).forEach(e-> System.out.println(e));

	    System.out.println(System.lineSeparator());
	    
	    col.stream().sorted((a,b)->a.getMadeBy().compareTo(b.getMadeBy())).forEach(e-> System.out.println(e));
	   
	    System.out.println(System.lineSeparator());
	    col.stream().sorted((a,b)->b.getMadeBy().compareTo(a.getMadeBy())).forEach(e-> System.out.println(e));

	    System.out.println(System.lineSeparator());
	    col.stream().forEach(e-> System.out.println("made by: "+e.getMadeBy()+"  " + " made on : "  +e.getMadeOn()));
	    
	    System.out.println(System.lineSeparator());
	    col.stream().sorted((a,b) -> Integer.compare(a.getPrice(), b.getPrice()))
	    .forEach(e-> System.out.println(e.getPrice()));
	    
	    System.out.println(System.lineSeparator());
	    col.stream().sorted((a,b) -> Integer.compare(b.getPrice(), a.getPrice()))
	    .forEach(e-> System.out.println(e.getPrice()));
	    
	    System.out.println(System.lineSeparator());
	    col.stream().forEach(e-> System.out.println("made by: "+e.getMadeBy()));
	    
	    
	    System.out.println(System.lineSeparator());
	    col.stream().forEach(e-> System.out.println("made by: "+e.getMadeBy()));
	    
	    System.out.println(System.lineSeparator());
	   // col.stream().sorted((a,b) -> a.getName().compareTo(b.getName()))
	   // .forEach(e-> System.out.println(e.getName()));
	    col.stream().sorted((a,b) -> a.getMadeOn().compareTo(b.getName()))
	    .forEach(e-> System.out.println(e.getName()+"  " +e.getMadeOn()));
	    
	    System.out.println(System.lineSeparator());
		col.stream().sorted((a1,a2)->a2.getType().compareTo(a1.getType())).forEach(e->System.out.println(e.getType()));
		col.stream().sorted((a1,a2)->a2.getMadeBy().compareTo(a1.getMadeBy())).forEach(e->System.out.println(e.getMadeBy()));
	    
	    
	    
	    

	}

}
