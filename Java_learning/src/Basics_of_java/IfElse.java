package Basics_of_java;

import java.util.Scanner;

public class IfElse {

	public static void main(String args[]) {
		System.out.println("pls enter your mark obtained");
		int mark;
		Scanner sc = new Scanner(System.in);
		mark = sc.nextInt();

		if (mark < 60) {
			System.out.println("Sorry ur not Eligible ");
		} else
			System.out.println("You  are Eligible");
		if (mark > 75) {
			System.out.println("Wow You got distinction");
		} else {
			System.out.println("You got first Class");
		}
		sc.close();
	}

}
