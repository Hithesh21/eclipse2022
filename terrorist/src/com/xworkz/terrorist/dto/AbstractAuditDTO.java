package com.xworkz.terrorist.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

import lombok.Setter;

public abstract class AbstractAuditDTO implements  Serializable{
	
	private String createdBy;
	private LocalDateTime createdAt;
	private String updatedBy;
	private LocalDateTime updatedAt;

}
