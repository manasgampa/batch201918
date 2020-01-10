package com.antra1;

public class Child extends Parent{
	
	public int child_j=84;
	public int parent_i=78;
	
	public void child_m1() {
		System.out.println(this.parent_i);
		System.out.println("in child m1");
	}
	
	public void m2() {
		System.out.println("in child m2");
	}

}
