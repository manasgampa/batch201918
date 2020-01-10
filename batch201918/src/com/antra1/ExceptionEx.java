package com.antra1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.antra1.StudentNotFoundException;

//import net.antra.Employee;

public class ExceptionEx {
	
	
	public static void main(String[] args) {
		
		/*StudentNotFoundException st= new StudentNotFoundException("in student exception");
	
		FileInputStream fis=new FileInputStream("abc.txt");*/

		//	throw new Exce("in exce");
		
		/*try {
			FileInputStream fis=new FileInputStream("abc.txt");
			ObjectInputStream obji=new ObjectInputStream(fis);
			System.out.println(1/1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			System.out.println("finally");
		}
		System.out.println("outside");*/
		/*ObjectInputStream obji=new ObjectInputStream(fis);
		Employee e=(Employee)obji.readObject();*/
		//System.out.println(fis);
		
		/*Employee emp=new Employee();
		FileOutputStream fos=new FileOutputStream("abc.txt");
		ObjectOutputStream obj=new ObjectOutputStream(fos);
		
		 obj.writeObject(emp);*/
	}

}
