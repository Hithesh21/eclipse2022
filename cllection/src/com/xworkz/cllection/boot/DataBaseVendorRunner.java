package com.xworkz.cllection.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

import com.xworkz.cllection.dto.DataBaseVendorDTO;

public class DataBaseVendorRunner {

	public static void main(String[] args) {
		
		
		Collection<DataBaseVendorDTO> col=new ArrayList();
		col.add(new DataBaseVendorDTO("Rdbms", "Oracle", 200));
		col.add(new DataBaseVendorDTO("object db", "sun microsystem", 300));
		col.add(new DataBaseVendorDTO("Sql", "MySql", 90));
		
		
		col.stream().map(dto -> dto.getDevolopedBy().toUpperCase()).
		collect(Collectors.toList()).forEach(dto -> System.out.println(dto)); 
		System.out.println("====================================================");
		
		col.stream().filter((dtos) -> {return dtos.getLicenseCost()<=100 && dtos.getType().equals("sql");}).
        collect(Collectors.toList()).forEach(dtos -> System.out.println(dtos)); 
		
		System.out.println("====================================");
	
		
	}

}
