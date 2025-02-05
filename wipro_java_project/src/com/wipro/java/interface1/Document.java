package com.wipro.java.interface1;

public class Document implements Showable,Printable{
	public void print() {
		System.out.println("print");
	}
	public void show() {
		System.out.println("show");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Document doc = new Document();
		doc.show();
		doc.print();
	}

}
