package com.xworkz.terrorist.dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;
import lombok.ToString;
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Setter
@Getter
public class TerroristDTO {
	
	
	@NonNull
	@NotNull(message="name cannot be null")
	@Size(min=1, max=20,message="name is invalid")
	private String name;
	@NonNull
	@NotNull(message="country cannot be null")
	@Size(min=1, max=20,message="country is invalid")
	private String country;
	@NonNull
	@Min(value=1,message="age should be greater than one")
	@Max(value=150,message="age should be less than 150")
	private int age;
	private String organisation;


}
