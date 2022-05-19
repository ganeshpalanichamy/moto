package org.nlc;

public class Note {
	public Note() {
		this(89);
		System.out.println("default");
		
	}
	public Note(int id) {
		System.out.println("int parameter");
		System.out.println(id);
		
	}
}
