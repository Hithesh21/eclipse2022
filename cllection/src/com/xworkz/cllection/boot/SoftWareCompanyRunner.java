package com.xworkz.cllection.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class SoftWareCompanyRunner {

	public static void main(String[] args) {
		
		
		Collection<String> collect=new ArrayList();
		collect.add("infosys");
		collect.add("wipro");
		collect.add("tcs");
		collect.add("abb");
		collect.add("google");
		collect.add("amazon");
		collect.add("oracle");
		collect.add("honeywell");
		collect.add("accenture");
		collect.add("accuvate");
		collect.add("dell");
		collect.add("sigma");
		collect.add("logicoy");
		collect.add("mahindra tech");
		collect.add("star tech");

        System.out.println(collect);
        
        for (String any : collect) {
        	
        	System.out.println(any);
			
		}
        System.out.println("=====================================");
       
        	
        	Iterator<String> any=collect.iterator();
        	while(any.hasNext()) {
        		
        	String value=any.next();
        	System.out.println(value);
        	
        }

	


	

	
	}

}
