package com.xworkz.ipl.dto;

public class IplDTO extends AbstractAuditDTO {

	private String teamName;
	private String captain;
	private String owner;
	private double cost;
	private int wins;
	private int defeats;
	
	public IplDTO() {
        System.out.println("calling no arg of IplDTO");	

	}

	@Override
	public String toString() {
		return "IplDTO [teamName=" + teamName + ", captain=" + captain + ", owner=" + owner + ", cost=" + cost
				+ ", wins=" + wins + ", defeats=" + defeats + "]";
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getCaptain() {
		return captain;
	}

	public void setCaptain(String captain) {
		this.captain = captain;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public int getWins() {
		return wins;
	}

	public void setWins(int wins) {
		this.wins = wins;
	}

	public int getDefeats() {
		return defeats;
	}

	public void setDefeats(int defeats) {
		this.defeats = defeats;
	}
	
    
}
