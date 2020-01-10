package com.antra1;

import java.io.IOException;

public class StudentNotFoundException extends Exception{

	public StudentNotFoundException(String msg) throws IOException{
		super(msg);
	}
}
