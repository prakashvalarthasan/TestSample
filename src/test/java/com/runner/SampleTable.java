package com.runner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class SampleTable {
	public static void main(String[] args) {
		
		
		//2D with Header		
		List<LinkedHashMap<String, String>> list = new ArrayList<LinkedHashMap<String,String>>();
		
		//inner
		LinkedHashMap<String, String> lm= new LinkedHashMap<String, String>();
		lm.put("name", "grittier");
		lm.put("email", "grittier@gmail.com");
		lm.put("course", "java");
		
		LinkedHashMap<String, String> l1= new LinkedHashMap<String, String>();
		l1.put("name", "gritty");
		l1.put("email", "gritty@gmail.com");
		l1.put("course", "junit");
		
		LinkedHashMap<String, String> l2= new LinkedHashMap<String, String>();
		l2.put("name", "benny");
		l2.put("email", "bennyy@gmail.com");
		l2.put("course", "testng");
		
		LinkedHashMap<String, String> l3= new LinkedHashMap<String, String>();
		l3.put("name", "bob");
		l3.put("email", "bob@gmail.com");
		l3.put("course", "api");
		
		//outer
		list.add(lm);
		list.add(l1);
		list.add(l2);
		list.add(l3);
		
		LinkedHashMap<String, String> e = list.get(3);
		System.out.println( e.get("course"));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*//1D with header
		
		Map<String, String> mp = new HashMap<String, String>();
		mp.put("name", "grittier");
		mp.put("place", "chennai");
		mp.put("state", "Tamilnadu");
		
		String s = mp.get("place");
		System.out.println(s);
		
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*//2D without header
		
		List<ArrayList<String>> list = new ArrayList<ArrayList<String>>();
		
		//inner list
		ArrayList<String> e1= new ArrayList<String>();
		e1.add("grittier");
		e1.add("grittier@gmail.com");
		e1.add("java");
		
		ArrayList<String> e2= new ArrayList<String>();
		e2.add("gritty");
		e2.add("gritty@gmail.com");
		e2.add("selenium");
		
		ArrayList<String> e3= new ArrayList<String>();
		e3.add("bob");
		e3.add("bob@gmail.com");
		e3.add("API");
		
		//outer list
		list.add(e1);
		list.add(e2);
		list.add(e3);
		
		//retrive
		ArrayList<String> a = list.get(1);
		String x = a.get(0);
		System.out.println(x);*/
		
		
		
	}

}
