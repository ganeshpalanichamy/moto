package org.nlc;

public class Ganesh extends Ganesh2  {
	
	public Ganesh(int age) {
		super(20000.45f);
		
	System.out.println(age);	
		
	}
	
	public Ganesh(int age,String ug) {
		this(25);
	System.out.println(age+ "   "+ug);
	}
public  Ganesh() {
this(24, "dfs");
	System.out.println("default");
}

public static void main(String[] args) {
	Ganesh v = new Ganesh();
	
	
}


	








}
