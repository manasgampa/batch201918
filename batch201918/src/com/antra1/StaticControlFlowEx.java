package com.antra1;

public class StaticControlFlowEx {
	
	public static int i=45;
	/*
	static {
		System.out.println("in static block 1:"+i);
	}
	static {
		System.out.println("in static block 2");
	}*/
	public static void main(String[] args) {
		
		m1();
		System.out.println("in main method");
	}
	
	public static void m1() {
		System.out.println("in m1 reference");
		System.out.println(i+"in m1 static method");
	}

}
