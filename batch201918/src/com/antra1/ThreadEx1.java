package com.antra1;

public class ThreadEx1{

	public static void main(String[] args) {
		Calculator ca=new Calculator();
		
		Thread1 t1=new Thread1(ca);
		t1.setName("manas");
		//t1.setPriority(Thread.NORM_PRIORITY);//5
		//t1.setPriority(Thread.MIN_PRIORITY);//1
		//t1.setPriority(Thread.MAX_PRIORITY);//10
		t1.start();//-->t1
		
		Thread2 t2=new Thread2(ca);
		t2.setName("Qihao");
		t2.start();
		/*Thread2 th2=new Thread2();
		Thread t2=new Thread(th2);
		t2.start();//-->t2
*/	}
}
