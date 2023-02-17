package Constructors;

public class No_arg_constructors {
	
	String emp_name;
	int emp_num;
	
	
	No_arg_constructors() {
		 
		 emp_name = "sharath";
		 emp_num = 4;
		 System.out.println("No argument constructors is created !! ");
	 }

	public static void main(String[] args) {
		
		No_arg_constructors employee = new No_arg_constructors();
		

	}

}
