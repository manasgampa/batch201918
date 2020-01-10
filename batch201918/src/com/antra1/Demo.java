package com.antra1;//identifier

public class Demo{//identifier
	
	static int i=45;
	
	public static void main(String[] args) {//identifier
		
		//I1 i2=new I2();
		
		ImplInter im=new ImplInter();
		im.m1();
		I2.m3();
		
		/*Integer i1=23;
		Integer i2=new Integer(45);
		
		int i3=67;
		Integer i4=i3;
		
		int i5=i4;
		System.out.println(i1+i2);*/
		
		/*String str=new String("");
		
		Student st=new Student(1);*/
		/*String a="this is manas";
		String b="this is manas";
		
		System.out.println(a==b);*/
		
		/*StringBuffer sb1=new StringBuffer("manas");
		StringBuffer sb2=new StringBuffer("manas");
		String str3=sb1.toString();
		String str4=sb2.toString();
		//StringBuilder sbt=new StringBuilder("");
		
		System.out.println(str3.equals(str4));
		
		String str1=new String("manas");
		String str2=new String("manas");
		
		System.out.println(str1.equals(str2));*/
		
		/*sb.append("kumar");
		System.out.println(sb);*/
		/*String str=new String("manas");
		String str1="kumar";*/
		/*ImmutableEx it=new ImmutableEx(67);
		System.out.println(it.getNo());*/
		/*Student st=new Student(12);
		System.out.println(st);*/
		
		/*String str=new String("manas");//immutable class
		String str1=str.concat("kumar");
		System.out.println(str1);*/
		
		/*Student st1=new Student(34);
		Object obj=new Student(37);
		
		System.out.println(st1);
		System.out.println(obj);
		if(st1.equals(obj)) {//==
			System.out.println("true");
			
		}else {
			System.out.println("false");
		}*/
		
		/*Student st=new Student();
		System.out.println(st.hashCode());
		System.out.println(st);*/
		//System.out.println(st);
		
		/*Vechile v1=new Car();
		Vechile v2=new Bike();
		
		Test t=new Test();
		t.getDetails(v2);*/
		
		/*System.out.println(v1.typeOfVechicle());
		System.out.println(v2.typeOfVechicle());*/
		
		
		/*Parent p=new Child();
		System.out.println(p.parent_i);
		//System.out.println(p.child_j); //cant access child
		//p.parent_m1();
		p.m2();*/
		
		/*Parent p=new Parent();
		System.out.println(p.parent_i);
		p.parent_m1();
		p.m2();*/
		
		/*Child ch=new Child();
		System.out.println(ch.child_j);
		ch.m2();
		ch.child_m1();*/
		
		
		
		
		/*Employee emp= new Employee();
		emp.setEmpId(13);
		int id=emp.getEmpId();
		System.out.println(id);*/
		
		/*String str=new String("manas");
		str=str.concat(" kumar");
		System.out.println(str);*/
		
		/*Employee emp=new Employee();
		String str=emp.m1();
		System.out.println(str);*/
		
		//Employee emp=new Employee();
		//System.out.println(emp.empId);
		
		
		/*FootballGame fbg=new FootballGame();
		System.out.println(fbg.gameName);
		fbg.m2();*/
		
		/*FootballGame fbg=new FootballGame();
		System.out.println(fbg.gameName);
		
		System.out.println(fbg.i);
		fbg.i=78;
		System.out.println(fbg.i);*/
		
		
		
		/*
		Parent p=new Parent();
		p.parent_i=67;
		p.parent_m1();*/
		/*Parent p=new Parent();
		p.parent_m1();
		//p.child_m1();
		System.out.println(p.parent_i);
		//System.out.println(p.child_j);
		
		Child ch=new Child();
		System.out.println(ch.parent_i);
		System.out.println(ch.child_j);
		ch.child_m1();
		ch.parent_m1();
		ch.m2();
		*/
		
		/*Employee emp=new Employee();
		System.out.println(emp.i);*/
		
		/*int j=10;
		int k=2;
		String str="manas";
		System.out.println(j+k+str+j+k);*/
		
		
		/*int x=4;
		int y=x--;
		
		System.out.println("x:"+x);
		System.out.println("y:"+y);
		*/
		/*Student st=new Student();
		System.out.println(st.studentId);
		st.n=84;
		System.out.println(st.n);
		
		
		Student st1=new Student();
		System.out.println(st1.n);*/
		
		//System.out.println(i);
		
		/*Demo d=new Demo();
		System.out.println(d.i);*/
		
		/*Student st=new Student();
		System.out.println(st.studentId);
		st.studentId=67;
		System.out.println(st.studentId);
		st.m1(1,2);
		//System.out.println("add:"+j);
		Student st1=new Student();
		System.out.println(st1.studentId);*/
		
		
		/*int i[]=new int[3];
		i[0]=45;
		i[1]=65;
		i[2]=34;
		
		System.out.println(i.length);
		
		for(int j=0;j<i.length;j++) {
			System.out.println(i[j]);
		}
		
		for(int k:i) {
			
			System.out.println(k);
		}*/
		
		
		/*int i[]= {10,20,30};
		
	System.out.println(i[2]);
				*/
		
		
		//boolean b=true;//no size //no range
		
		//char ch='r';//2 bytes //no range
		
		//double d=54.234;//8 bytes //14 to 15 decimal points 
		//float f=45.45f;//4 bytes //5 to 6 decimal points
		
		//long l=456;//8 bytes // -2^63 to (2^63)-1
		//int i=53;//4 bytes // -2^31 to (2^31) -1
		
		//short s=123;//2 bytes //-32768 to 32767
		
		/*byte b=127;//size 1 byte// 127 to -128
		
		System.out.println(b);*/
		
		/*int i=45;//identifier
		int k=45;//a to z, A to Z, 0 to 9, _, $
		int _=54;
		System.out.println(_);*/
		
	}

}
