package testNG;

import org.testng.annotations.Test;

public class Grouping {
	
	@Test(groups = {"Oneplus"})
	public void Oneplus1(){
		
	 System.out.println("oneplus1 testing");
	 
	}
	@Test(groups = {"Oneplus"})
	public void Oneplus2(){
		
		 System.out.println("oneplus2 testing");
		 
		}
	@Test(groups = {"apple"})
	public void apple1(){
		
		 System.out.println("apple1 testing");
		 
		}
	
	@Test(groups = {"apple"})
	public void apple2(){
		
		 System.out.println("apple2 testing");
		 
		}
   @Test(groups = {"moto"})
	public void moto1(){
		
		 System.out.println("moto1 testing");
		 
		}
   
   @Test(groups = {"moto"})
	public void moto2(){
		
		 System.out.println("moto2 testing");
		 
		}
	@Test(groups = {"vivo"})
	public void vivo1(){
		
		 System.out.println("vivo1 testing");
		 
		}
	
	@Test(groups = {"vivo"})
	public void vivo2(){
		
		 System.out.println("vivo2 testing");
		 
		}
	
	
	
	


}
