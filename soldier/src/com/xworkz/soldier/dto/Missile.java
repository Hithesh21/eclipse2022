package com.xworkz.soldier.dto;

import lombok.Data;

@Data
public class Missile extends AbstractAuditDTO {
	
	public Missile() {
		// TODO Auto-generated constructor stub
		System.out.println("running no-args const in dto");
	}

}
