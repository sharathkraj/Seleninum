package Collections_framework;

import java.util.Scanner;

public class Constructors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b;
				
		System.out.println("enter the number: ");
        Scanner b1 = new Scanner(System.in);
		
		b = b1.nextInt();

		
		System.out.println(b++);
		System.out.println(b);
		System.out.println(++b);
		
		new Constructors();

	}
	public Constructors() {
		int a;
		
		a=10;
		System.out.println(a);
		System.out.println(a++);
		System.out.println(a);
		System.out.println(++a);
		
	}

}
