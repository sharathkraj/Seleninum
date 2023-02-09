package testNG;

import org.testng.annotations.Test;



/* priority, skip the test case */

public class Drive_car {
	
	 @Test(priority = 0)
		public void firstTestcase(){
			
		 System.out.println("Start the car");
		 
		}
	    
	    @Test(priority = 3, enabled = false)
		public void secondtestcase(){
			
			 System.out.println("put the 1st gear");
			 
			}
		
	    @Test(priority = 2)
		public void thirdtestcase(){
			
			 System.out.println("put the 2nd gear");
			 
			}
		
	    @Test(priority = 4)
		public void fourthtestcase(){
			
			 System.out.println("put the 3rd gear");
			 
			}
	    
	    @Test(priority = 1)
	  		public void fifthtestcase(){
	  			
	  			 System.out.println("put the 4th gear");
	  			 
	  			}

}
