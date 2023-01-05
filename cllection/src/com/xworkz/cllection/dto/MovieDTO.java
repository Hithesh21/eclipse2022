package com.xworkz.cllection.dto;

import java.io.Serializable;
import java.time.LocalDate;

public class MovieDTO implements Serializable,Comparable<MovieDTO> {
	
	private String name;
	private String language;
	private double budget ;
	private LocalDate releseDate;
	
	public MovieDTO() {
		// TODO Auto-generated constructor stub
	}
	
	public MovieDTO(String name, String language, double budget, LocalDate releseDate) {
		super();
		this.name = name;
		this.language = language;
		this.budget = budget;
		this.releseDate = releseDate;
	}

    @Override
	public int compareTo(MovieDTO o) {
	
		return 0;
	}

	@Override
	public String toString() {
		return "MovieDTO [name=" + name + ", language=" + language + ", budget=" + budget + ", releseDate=" + releseDate
				+ "]";
	}
    
    @Override
    public int hashCode() {
    	// TODO Auto-generated method stub
    	return 40;
    }
    
    @Override
    public boolean equals(Object obj) {
    	if(obj!=null)
    	{
    		if(obj instanceof MovieDTO) 
    		{
    			MovieDTO cast=(MovieDTO)obj;
    			if(cast.name.equals(this.name)) 
    			{
    				return true;
    			}
    		}
    		
    			
    	}
    	
    	return false;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public double getBudget() {
		return budget;
	}

	public void setBudget(double budget) {
		this.budget = budget;
	}

	public LocalDate getReleseDate() {
		return releseDate;
	}

	public void setReleseDate(LocalDate releseDate) {
		this.releseDate = releseDate;
	}
    
    

}
