package com.anudip.session6;

public class TestGeneric {
	
	public static void main(String[] args) {
		MyDataType obj = new MyDataType();
		obj.m1(100);
		obj.m1(12.5F);
		obj.m1("Shivansh");
	}
	
}

class MyDataType<T>{
	
	public void m1(T a) {
		System.out.println("a = "+a+ " is generic value");
	}
	
//	public void m1(float b) {
//		System.out.println("b = "+b+" is float value");
//	}
//	
//	public void m1(String name) {
//		System.out.println("name ="+name+" is String value");
//	}
}