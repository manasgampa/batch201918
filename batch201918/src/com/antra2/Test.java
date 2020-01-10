package com.antra2;

import java.util.function.Function;
import java.util.function.Predicate;

import com.antra1.FootballGame;

//import com.antra1.Employee;

public class Test {

	public static void main(String[] args) {
		
		Function<String,Integer> f=(s)->s.length();
		System.out.println(f.apply("manas"));
		/*Function<Integer, Integer> f=(i)->{return i*i;};
		System.out.println(f.apply(3));*/
		
		
		/*Predicate<Integer> p=(i)->i==0;
		
		System.out.println(p.test(9));*/
		
		/*FootballGame fbg=new FootballGame();
		System.out.println(fbg.i);*/
		//Employee emp=new Employee();
		//System.out.println(emp.i);
		
	}
}
