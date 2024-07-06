package com.core;


import java.util.HashSet;
import java.util.Iterator;

public class CollectionProgram2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> al=new HashSet<String>();
		al.add("rama");
		al.add("krishna");
		al.add("hari");
		al.add("gopi");
		al.add("murali");
		al.add("venue");
		System.out.println(al);
		al.add("Jawid");
		al.add("gopi");
		al.add("rupa");
		al.add("krishna");
		System.out.println(al);
		 Iterator<String> it = al.iterator();
		while(it.hasNext())
		{
		System.out.println(it.next());
		} 
		
	}

}
