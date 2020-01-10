package com.antra1;

public interface I2 {

	public void m2();
	public void m4();
	
	public default void m1() {
		System.out.println("in m1 interface");
	}
	
	public static void m3() {
		System.out.println("in the static m3");
		
	}
	
}
