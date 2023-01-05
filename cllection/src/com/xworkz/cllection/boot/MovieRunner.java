package com.xworkz.cllection.boot;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

import com.xworkz.cllection.dto.MovieDTO;

public class MovieRunner {
	public static void main(String[] args) {
		
		
		
		MovieDTO dto=new MovieDTO("kgf", "kannada",100,LocalDate.of(2022,02, 26));
		MovieDTO dto1=new MovieDTO("Freinds", "kannada",10,LocalDate.of(2022,03, 28));
		MovieDTO dto2=new MovieDTO("RRR", "telagu",200,LocalDate.of(2022,10, 24));
		MovieDTO dto3=new MovieDTO("PUSHPA", "HINDI",100,LocalDate.of(2022,11, 22));
		
		Collection<MovieDTO> col=new ArrayList();
		col.add(dto3);
		col.add(dto2);
		col.add(dto1);
		col.add(dto);
		
		/*for (MovieDTO movieDTO : col) {
			System.out.println(movieDTO);
			}
		*/	
		col.forEach(e-> System.out.println(e));
		
		System.out.println("====================================");
		
		col.stream().sorted((b,c) -> b.getName().compareToIgnoreCase(c.getName()))
		.forEach( e-> System.out.println(e));
		System.out.println("====================================");

		col.stream().sorted((b,c)-> c.getLanguage().compareTo(b.getLanguage())).
		forEach( e-> System.out.println(e));
		
		System.out.println("========================================");
		Stream<Integer> list= Stream.of(2,15,45,89,3,1);
		list.forEach(e -> System.out.println(e));
	}

}
