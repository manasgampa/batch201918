package com.antra1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import com.antra1.Person;

public class Java8Ex{
	
	public static void main(String[] args) {
		
		/*Calc1 cl=new Calc1();
		//cl.add();
		I4 i=cl::add;*/
		/*I4 i=Calc1::add;
		i.a1();*/
		/*I4 i4=()->System.out.println("in additing");
		i4.a1();
		Calc1.add();
		*/
		/*I4 i4= Person :: new;
		Person p=i4.a1();
		Person p2=i4.a1();
		*/
		/*Person p=new Person();
		I4 i4=p::getAge;*/
		//StaticControlFlowEx.m1();
		/*I4 i4=StaticControlFlowEx::m1;
		i4.a1();
		*/
		
		/*List<Person> list=Arrays.asList(new Person("Sara","F",20),
				new Person("Sara","F",27),
				new Person("Bob","M",20),
				new Person("Paula","F",32),
				new Person("Paul","M",32),
				new Person("Jack","M",2),
				new Person("Jack","M",72),
				new Person("Jill","F",12)
				);
		
		List<Person> li=list.stream().filter(p->p.getAge()>20).
		map(p->{int age=p.getAge();
			p.setAge(age+1);
			return p;
		}).collect(Collectors.toList());
		li.stream().forEach(p->System.out.println(p.getAge()));*/
		
		/*List<Person> li=list.stream().filter(p->p.getAge()>20).collect(Collectors.toList());
		li.stream().forEach(p->System.out.println(p.getName()));*/
		
		/*List<Person> li=new ArrayList();
		for(int i=0;i<list.size();i++) {
			Person p=list.get(i);
			if(p.getAge()>20) {
				li.add(p);
			}
			
		}
		
		for(Person p:li) {
			System.out.println(p.getName());
		}*/
		
		//list.stream().forEach(i->System.out.println(i));
		
		
		
		/*Iterator it=list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}*/
		/*for(Person p:list) {
			System.out.println(p);
		}*/
		/*for(int i=0;i<list.size();i++) {
			
			System.out.println(list.get(i));
		}*/
		
		
		/*BiConsumer<Integer, Integer> bi=(i,j)->System.out.println(i+j);
		bi.accept(4, 4);*/
		/*BiFunction<Integer, Integer, Integer> bi=(i,j)->i+j;
		System.out.println(bi.apply(4, 5));*/
		
		/*BiPredicate<Integer, Integer> bi=(i,j)->i+j==10;
		System.out.println(bi.test(5, 5));*/
		
		/*Supplier<Integer> s=()->{ return 56;};
		System.out.println(s.get());*/
		
	/*	Consumer<Date> c=(Date d)->System.out.println(d);
		
		c.accept(new Date());*/
		
		/*String str=new String("manas");
		Function<String,Integer> f=(s)->s.length();
		System.out.println(f.apply(str));*/
		
		/*Function<Integer,Integer> f=(i)->i*i;
		
		int result=f.apply(8);	
		System.out.println(result);*/
		/*List<Person> list=Arrays.asList(new Person("Sara","F",20),
				new Person("Sara","F",27),
				new Person("Bob","M",20),
				new Person("Paula","F",32),
				new Person("Paul","M",32),
				new Person("Jack","M",2),
				new Person("Jack","M",72),
				new Person("Jill","F",12)
				);
		*/
		
		/*Person p1=new Person("Sara","F",27);
		Predicate<Person> p=(p2)->p2.getAge()>20;
		System.out.println(p.test(p1));*/
				
		/*Predicate<Integer> p=t->t/2==1; 
		System.out.println(p.test(2));*/
		
		/*Runnable r=()->{
				for(int i=0;i<10;i++) {
					System.out.println("in thread");
				}
		};
		
		Thread th=new Thread(r);
		th.start();*/
		/*I3 i3=(i,j)->{return i+j;};
		int i=i3.add(1,2);
	System.out.println(i);*/
		
		
	}

}
