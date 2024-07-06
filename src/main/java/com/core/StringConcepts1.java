package com.core;

import java.util.jar.Attributes.Name;

public class StringConcepts1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name1="rama";
		String name2="krishna";
		String name3="hnuma";
		String name4="ravi";
		String name5="murali";
		String name6="Venu";
		String name7="gopi";
		String name8="Ravi";
		System.out.println(name1.length());
		System.out.println(name2.toUpperCase());
		System.out.println(name6.toLowerCase());
		System.out.println(name4.equalsIgnoreCase(name8));
		System.out.println(name4.equals(name8));
		System.out.println(name5.isEmpty());
        System.out.println(name3.contains("n"));  
        System.out.println(name1.toCharArray());    //r a m a
        System.out.println(name5.replaceAll("ra ", "ja"));
       System.out.println();
	}

}
