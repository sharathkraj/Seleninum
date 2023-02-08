package Java_Basic;

public class Java_methods {

	public static void main(String[] args) {
		double a = 4;
		double b = 4;
		// TODO Auto-generated method stub
		// local variables		
		double area = 3.14*a*b;
		System.out.println(area);
		System.out.println(3.14*4*4);
		System.out.println("i am a main method");
		//classname().methodname();
		Java_methods.area();
		//objectname().methodname();
		
		Java_methods jjobj = new Java_methods();
		jjobj.surface();
		

	}
	// static method
	public static void area() {
		
		System.out.println("i am a static method");
	}

	// non-static method
	public  void surface() {
		
		System.out.println("i am a non static method");
		
	}
}
