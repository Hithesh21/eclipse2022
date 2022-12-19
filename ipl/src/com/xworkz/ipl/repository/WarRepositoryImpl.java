package com.xworkz.ipl.repository;

import java.time.LocalDateTime;

import com.xworkz.ipl.dto.WarDTO;
import com.xworkz.ipl.exception.WarSizeExceedException;

public class WarRepositoryImpl implements WarRepository {
	
	WarDTO[] dtos=new WarDTO[5];
	int count=0;

	@Override
	public boolean create(WarDTO dto) {
		System.out.println("running create of warDTO REPO impl");
		
		if(this.count >= this.dtos.length) {
			throw new WarSizeExceedException();
		}
		this.dtos[this.count]=dto;
		count++;
		System.out.println("saved " +dto + "at index :" +count);
		return false;
	}

	//@Override
	//public boolean create(WarDTO[] dtos) {
		// TODO Auto-generated method stub
	//	return false;
	//}

	@Override
	public int total() {
		// TODO Auto-generated method stub
		return this.count;
	}

	@Override
	public WarDTO findStartedBy(String startedBy) {
		System.out.println(" running findStartedBy of repo impl :  " +startedBy);
		for(WarDTO any: dtos ) {
			if(any!=null && any.getStartedBy().equalsIgnoreCase(startedBy)) {
				System.out.println("war dto is present  " + startedBy);
				return null;
			}
		
		}
		System.out.println(" war DTO is not present or null");
		
		return null;
	}

	@Override
	public WarDTO findStartedByAndStartedWith(String startedBy, String startedWith) {
		System.out.println("running findStartedByAndStartedWith : " +startedBy + " and " +startedWith);
		for(WarDTO any: dtos) {
			if(any!=null && any.getStartedBy().equalsIgnoreCase(startedBy)
					&& any.getStartedWith().equalsIgnoreCase(startedWith)) {
				System.out.println(" war DTO is present : " +startedBy + " and "  +startedWith);
				return null;
			}
		}
		System.out.println("war dto is not present");
		
		
		return null;
	}

	@Override
	public WarDTO findStartDateGreaterThanOrEqualTO(LocalDateTime date) {
		
		System.out.println("runnig findStartDateGreaterThanOrEqualTO" +date);
		
		
		
		
		return null;
	}

}
