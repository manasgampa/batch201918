package com.antra1;

public class Thread2 extends Thread{

	Calculator c;
	Thread2(Calculator c){
		this.c=c;
	}
	
	@Override
	public void run() {
		
		c.mul(100);
		//c.div(4, 5);
		/*for(int i=0;i<100;i++) {
			System.out.println("in thread2:"+i);
		}*/
		
	}

}
