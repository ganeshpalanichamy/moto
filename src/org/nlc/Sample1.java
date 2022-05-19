package org.nlc;

public class Sample1 extends Note {
	public Sample1() {
		this(100);
		System.out.println("default");
		
		
	}
	public Sample1(int id) {
		this("ganesh",986776779l);
		System.out.println("int parameter");
		System.out.println(id);
		
		
		
	}
	public Sample1(String name,long phone) {
		super();
		System.out.println("string,long parameter");
		System.out.println(name);
		System.out.println(phone);
	}
	public static void main(String[] args) {
		Sample1 s = new Sample1();
		Sample1 s2= new Sample1();
		
		
	}

}
