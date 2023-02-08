package Collections_framework;

public class Java_methods_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculateareas(4);
		Calculateareas(6);
		Calculateareas(8);
		Calculateareas(cal(4));
		

	}

	 public static void Calculateareas(double radius) {
		 
		 double areas = 3.14*radius*radius;
		 System.out.println(areas);
		 
	 }
	 
	 public static double cal(double radius) {
		 
		return radius;
	 }
}
