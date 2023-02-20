package Polymorphism;

public class Addition {
	
	
	int add(int a, int b) {
		return a+b;
	}
	
	int add(int x, int y, int z) {
		return x+y+z;
	}
	
	float add(float a, float b, float c) {
		return a+b+c;
	}

	public static void main(String[] args) {
		
		Addition obj = new Addition();
		
		System.out.println("sum of the two number: " +obj.add(10 ,12));
		System.out.println("sum of the one int and one float: " +obj.add(12, 45));
		System.out.println("sum of the three number: "+obj.add(10 ,12, 23));
		

	}

}
