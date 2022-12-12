package com.xworkz.ipl.boot;

import java.time.LocalDateTime;

import com.xworkz.ipl.dto.IplDTO;
import com.xworkz.ipl.repository.IplRepository;
import com.xworkz.ipl.repository.IplRepositoryImpl;

public class IplRunner {

	public static void main(String[] args) {

		
		IplRepository repo=new IplRepositoryImpl();
		
		IplDTO ipl=new IplDTO();
		ipl.setTeamName("rcb");
		ipl.setCaptain("kohli");
		ipl.setOwner("xyz");
		ipl.setCost(90.0);
		ipl.setWins(110);
		ipl.setDefeats(130);
		ipl.setCreatedBy("System");
		ipl.setCreatedDate(LocalDateTime.now());
		
		repo.create(ipl);
		
      System.out.println("2======================================== ");		
		IplDTO ipl1=new IplDTO();
		ipl.setTeamName("csk");
		ipl.setCaptain("dhoni");
		ipl.setOwner("1xyz");
		ipl.setCost(190.0);
		ipl.setWins(110);
		ipl.setDefeats(130);
		ipl.setCreatedBy("System");
		ipl.setCreatedDate(LocalDateTime.now());
		
		repo.create(ipl);
		
		 System.out.println("3======================================== ");		
			IplDTO ipl2=new IplDTO();
			ipl.setTeamName("mumbai indians");
			ipl.setCaptain("rohith");
			ipl.setOwner("2xyz");
			ipl.setCost(190.0);
			ipl.setWins(110);
			ipl.setDefeats(130);
			ipl.setCreatedBy("System");
			ipl.setCreatedDate(LocalDateTime.now());
			
			repo.create(ipl);
			
			 System.out.println("4======================================== ");		
				IplDTO ipl3=new IplDTO();
				ipl.setTeamName("delhi dare devils");
				ipl.setCaptain("raina");
				ipl.setOwner("3xyz");
				ipl.setCost(20.0);
				ipl.setWins(110);
				ipl.setDefeats(130);
				ipl.setCreatedBy("System");
				ipl.setCreatedDate(LocalDateTime.now());
				
				repo.create(ipl);
				
				 System.out.println("5======================================== ");		
					IplDTO ipl4=new IplDTO();
					ipl.setTeamName("kolkata knight riders");
					ipl.setCaptain("ghambir");
					ipl.setOwner("4xyz");
					ipl.setCost(190.0);
					ipl.setWins(110);
					ipl.setDefeats(130);
					ipl.setCreatedBy("System");
					ipl.setCreatedDate(LocalDateTime.now());
					
					repo.create(ipl);
					
					 System.out.println("6======================================== ");		
						IplDTO ipl5=new IplDTO();
						ipl.setTeamName("kochi tuskers");
						ipl.setCaptain("jsdeja");
						ipl.setOwner("5xyz");
						ipl.setCost(190.0);
						ipl.setWins(110);
						ipl.setDefeats(130);
						ipl.setCreatedBy("System");
						ipl.setCreatedDate(LocalDateTime.now());
						
						repo.create(ipl);
						
						 System.out.println("7======================================== ");		
							IplDTO ipl6=new IplDTO();
							ipl.setTeamName("royals");
							ipl.setCaptain("rahul");
							ipl.setOwner("6xyz");
							ipl.setCost(190.0);
							ipl.setWins(110);
							ipl.setDefeats(130);
							ipl.setCreatedBy("System");
							ipl.setCreatedDate(LocalDateTime.now());
							
							repo.create(ipl);
							
							 System.out.println("8======================================== ");		
								IplDTO ipl8=new IplDTO();
								ipl.setTeamName("rajkot");
								ipl.setCaptain("iyer");
								ipl.setOwner("8xyz");
								ipl.setCost(190.0);
								ipl.setWins(110);
								ipl.setDefeats(130);
								ipl.setCreatedBy("System");
								ipl.setCreatedDate(LocalDateTime.now());
								
								repo.create(ipl);
								
								 System.out.println("9======================================== ");		
									IplDTO ipl9=new IplDTO();
									ipl.setTeamName("punjab kings");
									ipl.setCaptain("mayank");
									ipl.setOwner("9xyz");
									ipl.setCost(190.0);
									ipl.setWins(110);
									ipl.setDefeats(130);
									ipl.setCreatedBy("System");
									ipl.setCreatedDate(LocalDateTime.now());
									
									repo.create(ipl);
									
									 System.out.println("10======================================== ");		
										IplDTO ipl10=new IplDTO();
										ipl.setTeamName("sunrisers hyderabad");
										ipl.setCaptain("kane");
										ipl.setOwner("10xyz");
										ipl.setCost(190.0);
										ipl.setWins(110);
										ipl.setDefeats(130);
										ipl.setCreatedBy("System");
										ipl.setCreatedDate(LocalDateTime.now());
										
										repo.create(ipl);
										
									
				
	}
	

}
