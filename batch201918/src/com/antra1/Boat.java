package com.antra1;

public class Boat {
	
	private int boteId;
	/*Boat(){
		System.out.println("in boat constructor1");
	}*/
	{
		System.out.println("in instace bolck");
	}
	Boat(int boteId){
		this.boteId=boteId;
	}
	
	public int getboteId() {
		return boteId;
	}
	/*public void m1() {
		System.out.println("in m1 of boat:"+boteId);
	}*/
	
}
