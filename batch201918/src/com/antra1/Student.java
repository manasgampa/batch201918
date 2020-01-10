package com.antra1;

public class Student {
	
	int studentId;
	
	public Student(int studentId) {
		this.studentId=studentId;
	}
	public boolean equals(Object obj) {
		
		Student st=(Student)obj;
		if(this.studentId==st.studentId) {
			return true;
		}
		return false;
	}
	
	/*public String toString() {
		
		return ""+studentId;
	}*/
	
}









/*public int hashCode() {

return 298;
}


public String toString() {

Class cl=getClass();
String name=cl.getName();
String name1=getClass().getName();
return getClass().getName()+"@"+Integer.toHexString(hashCode());
}
*/


/*int studentId;//fields
String name;
static int n=90;
//constructor

//method
public void m1(int i, int j) {
	
	System.out.println(studentId);
	//return i+j;
}

public static void m2() {
	System.out.println("in static method");
}*/
