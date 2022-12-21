package com.xworkz.cllection.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ShoeSizeRunner {

	public static void main(String[] args) {
		
		
		Collection<Integer> collect=new ArrayList<Integer>();
		
		collect.add(1);
		collect.add(2);
		collect.add(3);
		collect.add(4);
		collect.add(5);
		collect.add(6);
		collect.add(8);
		collect.add(9);
		collect.add(10);
		collect.add(16);
		collect.add(11);
		collect.add(22);
		collect.add(13);
		collect.add(14);
		collect.add(15);
		

        System.out.println(collect);
        
        for (int any : collect) {
        	
        	System.out.println(any);
			
		}
        System.out.println("=====================================");
        
        Iterator<Integer> it=collect.iterator();
        while(it.hasNext()) {
        	int any=it.next();
        	System.out.println(any);
        }
       
			

}}
