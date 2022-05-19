package org.nlc;

public class Sample {
	public Sample() {
		System.out.println("default");
	}
	public Sample(int id) {
		System.out.println("int paramatrized");
		System.out.println(id);
	}
	public Sample(String name,Long phone) {
		System.out.println("string long paramatrized");
		System.out.println(name);
		System.out.println(phone);
	}
	public static void main(String[] args) {
		Sample s = new Sample();
		Sample s1 = new Sample(20);
		Sample s2= new Sample("ganesh",5678799l);
		
		
	}
}
