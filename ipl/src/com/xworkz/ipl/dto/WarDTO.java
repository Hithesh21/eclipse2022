package com.xworkz.ipl.dto;

public class WarDTO extends AbstractAuditDTO {
	
	private String name;
	private String startDate;
	private String endDate;
	private String startedBy;
	private String startedWith;
	private String wonBy;
	
	public WarDTO() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "WarDTO [name=" + name + ", startDate=" + startDate + ", endDate=" + endDate + ", startedBy=" + startedBy
				+ ", startedWith=" + startedWith + ", wonBy=" + wonBy + ", getCreatedBy()=" + getCreatedBy()
				+ ", getCreatedDate()=" + getCreatedDate() + ", getUploadedBy()=" + getUploadedBy()
				+ ", getUploadedDate()=" + getUploadedDate() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

	public WarDTO(String name, String startDate, String endDate, String startedBy, String startedWith, String wonBy) {
		super();
		this.name = name;
		this.startDate = startDate;
		this.endDate = endDate;
		this.startedBy = startedBy;
		this.startedWith = startedWith;
		this.wonBy = wonBy;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getStartedBy() {
		return startedBy;
	}

	public void setStartedBy(String startedBy) {
		this.startedBy = startedBy;
	}

	public String getStartedWith() {
		return startedWith;
	}

	public void setStartedWith(String startedWith) {
		this.startedWith = startedWith;
	}

	public String getWonBy() {
		return wonBy;
	}

	public void setWonBy(String wonBy) {
		this.wonBy = wonBy;
	}
	
	
	
	
	

}
