package Basics_of_java;

import java.util.Scanner;

public class BasicCalculator {

	public static void main(String args[]) {

		double fnum, snum, answer;

		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter the value of doubles");
		fnum = sc.nextDouble();
		
		System.out.println("please enter the value for snum ");
		snum = sc.nextDouble();

		answer = snum + fnum;
		
		System.out.println(answer);
		
		sc.close();

	}
}
