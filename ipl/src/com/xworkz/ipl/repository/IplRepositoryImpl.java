package com.xworkz.ipl.repository;

import com.xworkz.ipl.dto.IplDTO;
import com.xworkz.ipl.exception.IplSizeExceedException;

public class IplRepositoryImpl implements IplRepository {
	
	private IplDTO[] iplDto=new IplDTO[10];
	private int count=0;
	
	
	@Override
	public boolean create(IplDTO dto) {
		System.out.println("running create in iplrepoimpl");
		if(this.count>=this.iplDto.length) {
			throw new IplSizeExceedException();
		
		}
		
		
		
		this.iplDto[count]=dto;
		System.out.println("saved" +dto + "in index " +this.count);
		count++;
		
		return true;
		
	}
	
	

}
