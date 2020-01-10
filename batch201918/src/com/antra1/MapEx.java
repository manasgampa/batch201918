package com.antra1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class MapEx {

	public static void main(String[] args) {
	//	Map map=new HashMap();//HashTable DS//it is un orderd
		
	//	Map map=new LinkedHashMap();//HashTable and LinkedList DS// it is orderd
	ConcurrentHashMap map=new ConcurrentHashMap();
		map.put(1, "manas");
		map.put(2, 98);
		map.put("Andrew", "45");
		map.put("Qihao", "89");
		map.put(5, "Chen Liang");
		
		Set set=map.keySet();
		Iterator it=set.iterator();
		while(it.hasNext()) {
			System.out.println(map.get(it.next()));
			map.put(98, "lio");
		}
		
		
		
	}
}
