package application;

import entities.Client;

public class Program {

	public static void main(String[] args) {

		Client c1 = new Client("Maria", "maria@gmail.com");
		Client c3 = new Client("Maria", "maria@gmail.com");
		Client c2 = new Client("Alex", "alex@gmail.com");

		String s1 = new String("test");
		String s2 = new String("test");//da false
		
		
		String s3 = "test";//da true
		String s4 = "test";
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c3.hashCode());

		System.out.println(c1.equals(c2));
		System.out.println(c1.equals(c3));
		
		
		System.out.println(c1 == c2);
		System.out.println(s1 == s2);
		System.out.println(s3 == s4);
	}

}
