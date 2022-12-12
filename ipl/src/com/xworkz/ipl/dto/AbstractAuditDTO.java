package com.xworkz.ipl.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

public abstract class AbstractAuditDTO implements Serializable{

	private String createdBy;
	private LocalDateTime createdDate;
	private String uploadedBy;
	private LocalDateTime uploadedDate;
	
	public AbstractAuditDTO() {
            System.out.println("calling no arg of abstractauditDTO ");	
            }

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public LocalDateTime getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}

	public String getUploadedBy() {
		return uploadedBy;
	}

	public void setUploadedBy(String uploadedBy) {
		this.uploadedBy = uploadedBy;
	}

	public LocalDateTime getUploadedDate() {
		return uploadedDate;
	}

	public void setUploadedDate(LocalDateTime uploadedDate) {
		this.uploadedDate = uploadedDate;
	}
	
	
}
