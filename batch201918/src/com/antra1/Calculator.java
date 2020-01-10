package com.antra1;

import java.util.Scanner;

public class Calculator {

	
	
	public synchronized void mul(int k) {
		for(int i=1;i<=500;i++) {
			
			System.out.println(Thread.currentThread()+""+k*i);
		}
	}
	public void div(int k, int j) {
		for(int i=0;i<100;i++) {
			
			System.out.println("in div method:"+k/j);
		}
	}
	
	public static void main(String[] args) {
		m2();
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter a value");
		int a=sc.nextInt();
		System.out.println("please enter b value");
		int b=sc.nextInt();
		//try {
		System.out.println(a/b+":div");
		/*}catch(Exception e) {
			//e.printStackTrace();
		}*/
		System.out.println(a+b+":add");
	}
	
	public static void m2() {
		
			System.out.println("in try before");
		System.out.println(1/0);
		System.out.println("in try after exception");
		
	}
	
}
