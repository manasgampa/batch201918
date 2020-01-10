package com.antra1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListEx {
	
	public static void main(String[] args) {
		
		//ArrayList al=new ArrayList(4);//Object Array DS //	Object obj[]=new Object[];
		LinkedList al=new LinkedList();//Double linked list DS // 
		al.add("manas");
		al.add(34);
		al.add(87);
		al.add(9);
		al.add("kumar");
		
		Iterator it=al.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		List li=Collections.unmodifiableList(al);
		
		li.add(97);
		
		/*for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}*/
		
		/*System.out.println(al);
		al.remove(1);
		al.add(new Student(34));
		System.out.println(al.get(3));
		System.out.println(al);*/
	
	}

}
