package com.xworkz.cllection.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class AllDamRunner {
	
	public static void main(String[] args) {
		
		
		Collection<String> kar=new ArrayList<String>();
		kar.add("bharachukki");
		kar.add("thunga bhadra");
		kar.add("kabini");
		kar.add("manchanabele");
		kar.add("krishna");
		
		Collection<String> tn=new ArrayList<String>();
		tn.add("mettur");
		tn.add("hoganekal");
		tn.add("barur");
		tn.add("chinnar");
		tn.add("lower bhavani");
		
		Collection<String> kl=new ArrayList<String>();
		kl.add("waliyar");
		kl.add("mangalammeenkara");
		kl.add("sholayar");
		kl.add("peechi");
		kl.add("neyyar");
		
		Collection<String> ap=new ArrayList<String>();
		ap.add("srisailam");
		ap.add("nagarjuna");
		ap.add("tatipudi");
		ap.add("prakasam");
		ap.add("thotapalli");
		
		
		
		Collection<String> tl=new ArrayList<String>();
		tl.add("pakhala");
		tl.add("nelwai");
		tl.add("rajoli");
		tl.add("wyra");
		tl.add("jurala");
		
		Collection<String> or=new ArrayList<String>();
		or.add("baghua");
		or.add("baura");
		or.add("banksal");
		or.add("baura");
		or.add("bautia");
		
		
		Collection<String> mp=new ArrayList<String>();
		mp.add("atari");
		mp.add("auria");
		mp.add("badera");
		mp.add("bah");
		mp.add("balia");
		
		
		Collection<String> up=new ArrayList<String>();
		up.add("parichha");
		up.add("balui");
		up.add("banjari");
		up.add("barwa");
		up.add("newari");
		
		
		Collection<String> uk=new ArrayList<String>();
		uk.add("tehri");
		uk.add("bhalu");
		uk.add("nanak");
		uk.add("tehri");
		uk.add("pili");
		
		Collection<String> hp=new ArrayList<String>();
		hp.add("bassi");
		hp.add("bhakra");
		hp.add("sawra");
		hp.add("kol");
		hp.add("baira");
		
		Collection<String> pb=new ArrayList<String>();
		pb.add("jainti");
		pb.add("cholal");
		pb.add("patiari");
		pb.add("perch");
		pb.add("shahpur");
		
		Collection<String> hr=new ArrayList<String>();
		hr.add("Tajewala Barrage");
		hr.add("Hathnikund Barrage");
		hr.add("Ottu Barrage");
		hr.add("Palla");
		hr.add("Pathrala");
		
		
		Collection<String> gj=new ArrayList<String>();
		hr.add("Sardar Sarovar");
		hr.add("Ukai");
		hr.add("Kadana");
		hr.add("Karai");
		hr.add("Kamaleshwar");
		
		Collection<String> jar=new ArrayList<String>();
		hr.add("Panchet");
		hr.add("Tilaiya");
		hr.add("Konar");
		hr.add("Khandoli");
		hr.add("Maithon");
		
		Collection<String> cg=new ArrayList<String>();
		hr.add("Badra");
		hr.add("Ballar");
		hr.add("Barat Sagar");
		hr.add("Bhopali");
		hr.add("Chaker");
		
		Collection<String> wb=new ArrayList<String>();
		wb.add("BaraBhum");
		wb.add("Lipania ");
		wb.add("Beko");
		wb.add("Kanjan");
		wb.add("Karrior");
		
		Collection<String> mh=new ArrayList<String>();
		mh.add("Shetfall");
		mh.add("Bor");
		mh.add("WalWan");
		mh.add("Yeldari");
		mh.add("Sirpur");
		
		Collection<String> aru=new ArrayList<String>();
		aru.add("Ranganadi");
		aru.add("Subansiri");
		
		Collection<String> jk=new ArrayList<String>();
		jk.add("Sewa");
		jk.add("Pakal");
		jk.add("Nimoo");
		jk.add("KishenGanga");
		jk.add("Salal");
		
		Collection<String> assam=new ArrayList<String>();
		assam.add("Karbi Langpi");
		assam.add("Umrong");
		
		Collection<String> mani=new ArrayList<String>();
		mani.add("Khopuram");
		mani.add("Khuga");
		mani.add("Singda");
		mani.add("Thoubal");
		
		
		Collection<String> india=new ArrayList<String>();
		india.addAll(cg);
		india.addAll(mani);
		india.addAll(assam);
		india.addAll(jk);
		india.addAll(aru);
		india.addAll(mh);
		india.addAll(wb);
		india.addAll(jar);
		india.addAll(gj);
		india.addAll(hr);
		india.addAll(pb);
		india.addAll(hp);
		india.addAll(uk);
		india.addAll(up);
		india.addAll(mp);
		india.addAll(or);
		india.addAll(tl);
		india.addAll(ap);
		india.addAll(kl);
		india.addAll(tn);
		india.addAll(kar);
		
		System.out.println(india.size());
		
		System.out.println(india);
		
	    for (String string : india) {
	    	System.out.println(string);
			
		}
	    System.out.println("========================================");
	    
	    Iterator<String> dams=india.iterator();
	    while(dams.hasNext()) {
	    	String ele=dams.next();
	    	System.out.println(ele);
	    	String lower= ele.toLowerCase();
	    	System.out.println("To Lower: " +lower);
	    	System.out.println("====================================");
	    	System.out.println("to Upper: " +ele.toUpperCase());
	    	System.out.println("starting with T : "+ele.startsWith("T"));
	    	System.out.println("ends with ra : "+ele.endsWith("ra"));
	    	System.out.println("============================================");
	    	
	    	Iterator<String> dams1 = india.iterator();
			while (dams1.hasNext()) {
				String element = (String) dams1.next();
				if (element.startsWith("T")) {
					System.out.println("Dams name starts with T:- " + element);
				}
	    	
				Iterator<String> dams2 = india.iterator();
				while (dams2.hasNext()) {
					String element1 = (String) dams2.next();
					if (element.endsWith("ra")) {
						System.out.println("Dams name ends with ra :- " + element1);
					}
					
					System.out.println(System.lineSeparator());
					Iterator<String> reference = india.iterator();
				System.out.println("Character of a String over 10");
					while (reference.hasNext()) {
						String ref = reference.next();
						if (ref.length() >= 10) {
							System.out.println(ref);
						} 
						
						System.out.println(System.lineSeparator());
						System.out.println("Before removing p-" + india.size());
						Iterator<String> rem = india.iterator();
						while (rem.hasNext()) {
							String get = (String) rem.next();
							if (get.contains("p")) {
								
								rem.remove();
							}
					}
				
				
				
	    	
	    	
			}}}}
		
}
}		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	


