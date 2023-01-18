package com.xworkz.soldier.dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class SoldierDTO extends AbstractAuditDTO {
	
	@Max(value=10000,message="id must not be above 10000")
	@Min(value=0,message="id must be above zero")
	private int id;
	
	@NotNull(message="name should not be null")
	@Size(min=3,max=20,message="name should be in the range 3 to 20")
    private String name;
	
	@Size(min=4,max=20,message="rank should be in the range 4 to 20")
	@NotNull(message="rank should not be null")
    private String rank;
	
	@Size(min=5,max=30,message="battalion should be in the range 5 to 30")
    @NotNull(message="battalion should not be null")
    private String battalion;
	
	@NotNull(message="country should not be null")
	@Size(min=3,max=20,message="name should be in the range 3 to 20")
    private String country;



}
