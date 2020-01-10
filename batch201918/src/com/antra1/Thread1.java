package com.antra1;

public class Thread1 extends Thread{
	
	Calculator c;
	
	Thread1(Calculator c){
		this.c=c;
	}
	
	@Override
	public void run() {
		c.mul(5);
		
	}
	

}
