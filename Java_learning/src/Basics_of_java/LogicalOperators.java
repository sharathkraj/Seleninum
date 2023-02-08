package Basics_of_java;

import java.util.Scanner;

public class LogicalOperators {

	@SuppressWarnings("resource")
	public static void main(String args[]) {

		String gender = null;
		//int boy, girl;

		System.out.println("pls specify your gender ");
		Scanner sc = new Scanner(System.in);
		gender = sc.nextLine();

		if (!gender.equals(null)&& gender.equals("male")) {

			System.out.println("Hi man pls enter your age ");
			int ageLimit = sc.nextInt();
			if (ageLimit >= 18 && ageLimit <= 60) {
				System.out.println("hi buddy welcome to our dating club ");
			} else {
				System.out.println("sorry ur not permited ");
			}

		} else {
			if(!gender.equals(null)&& gender.equals("female")){
			System.out.println("hi lady pls enter your age");

			int geLimit = sc.nextInt();

			if (geLimit >= 18 && geLimit <= 45) {
				System.out.println("Welcome to our dating club ");
			} else {
				System.out.println("sorry ur not eligible");
			}
			}
		}
		//System.out.println("Invalid entry");
		sc.close(); 
	}

}
