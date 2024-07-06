package com.core;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionProgram1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> al=new ArrayList<String>();
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
