package com.xworkz.equality;

public class Institution {
	private String name;
	private String adress;
	private String founder;
	private String course;
	private String trainerName;
	private String hrName;
	private int fee;
	private int NoOfStaff;
	private boolean placement;
	private boolean events;
	
	
	public Institution() {
		
	}


	public Institution(String name, String adress, String founder, String course, String trainerName, String hrName,
			int fee, int noOfStaff, boolean placement, boolean events) {
		super();
		this.name = name;
		this.adress = adress;
		this.founder = founder;
		this.course = course;
		this.trainerName = trainerName;
		this.hrName = hrName;
		this.fee = fee;
		NoOfStaff = noOfStaff;
		this.placement = placement;
		this.events = events;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAdress() {
		return adress;
	}


	public void setAdress(String adress) {
		this.adress = adress;
	}


	public String getFounder() {
		return founder;
	}


	public void setFounder(String founder) {
		this.founder = founder;
	}


	public String getCourse() {
		return course;
	}


	public void setCourse(String course) {
		this.course = course;
	}


	public String getTrainerName() {
		return trainerName;
	}


	public void setTrainerName(String trainerName) {
		this.trainerName = trainerName;
	}


	public String getHrName() {
		return hrName;
	}


	public void setHrName(String hrName) {
		this.hrName = hrName;
	}


	public int getFee() {
		return fee;
	}


	public void setFee(int fee) {
		this.fee = fee;
	}


	public int getNoOfStaff() {
		return NoOfStaff;
	}


	public void setNoOfStaff(int noOfStaff) {
		NoOfStaff = noOfStaff;
	}


	public boolean isPlacement() {
		return placement;
	}


	public void setPlacement(boolean placement) {
		this.placement = placement;
	}


	public boolean isEvents() {
		return events;
	}


	public void setEvents(boolean events) {
		this.events = events;
	}


	@Override
	public String toString() {
		return "Institution [name=" + name + ", adress=" + adress + ", founder=" + founder + ", course=" + course
				+ ", trainerName=" + trainerName + ", hrName=" + hrName + ", fee=" + fee + ", NoOfStaff=" + NoOfStaff
				+ ", placement=" + placement + ", events=" + events + "]";
	}
	public boolean equals(Object other) {
		System.out.println("entered equal method");
		if(other instanceof Institution) {
			System.out.println("other is type of institution");
			Institution casted=(Institution)other;
			if(this.name.equals(casted.name) && this.adress.equals(casted.adress) && this.founder.equals(casted.founder)
					&& this.trainerName.equals(casted.trainerName) && this.course.equals(casted.course)) {
				System.out.println("same in name,adress,founder,course,trainername");
			}
			else {
				System.err.println("other is not same, cant check properties");
			}
		}
		
	return false;
	}
}
