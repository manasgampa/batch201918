package com.antra1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetEx {
	
	public static void main(String[] args) {
		//Set set=new HashSet();//HashTable DS //Insertion order is not preserved 
		//Set set=new LinkedHashSet();//LinkedList and HashTable DS//insertion order is preserved
		TreeSet set=new TreeSet(new TreesetComperatorEx());
		set.add(56);
		set.add(98);
		set.add(843);
		set.add(12);
		set.add(82);
		set.add(24);
		set.add(27);
		set.add(9);
		set.add(34);
		set.add(78);
		set.add(184);
		//set.add("manas");
		//set.add(new Student(2));
		
		
		System.out.println(set);
		
		Iterator it=set.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		/*for(int i=0;i<set.size();i++) {
			
			System.out.println(set.get(i));
		}*/
		
	}

}
