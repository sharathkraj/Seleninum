package Constructors;

public class Parameterized {
	
	String Bike_brand;
	String Bike_CC;
	
	Parameterized(String name, String CC ){
		Bike_brand = name;
		Bike_CC = CC;
		
	}

	public void getthebike() {
		
		System.out.println("bike name is" +Bike_brand+ " and its cc is "+ Bike_CC);
	}

	public static void main(String[] args) {
		
		Parameterized bike1 = new Parameterized("Honda" , "300");
		bike1.getthebike();
		Parameterized bike2 = new Parameterized("Yamaha" , "150");
		bike2.getthebike();
	}

}
