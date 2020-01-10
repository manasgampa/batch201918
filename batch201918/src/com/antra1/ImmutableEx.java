package com.antra1;

public final class ImmutableEx {
	
	private final int no; 
	
	public ImmutableEx(int no) {
		this.no=no;
	}
	
	/*public void setNo(int no) {
		this.no=no;
	}*/
	
	public int getNo() {
		return this.no;
	}
	
	public int modify(int no) {
		
		return this.no+no;
	}
}
