package Polymorphism;

public class Overloading {
	
	
	public void talk(Parents styleofTalking) {
		System.out.println("talk respectful!!");
		
	}
	
	public void talk(Partner styleofTalking) {
		System.out.println("talk Romantic!!");
		
	}
	
	public void talk(Boss styleofTalking) {
		System.out.println("talk Polite!!");
		
	}
	
	

	public static void main(String[] args) {
		Overloading Talk = new Overloading();
		
		Parents parents = new Parents();
		Talk.talk(parents);
		

		Partner partner = new Partner();
		Talk.talk(partner);
		
		Boss boss = new Boss();
		Talk.talk(boss);

	}

}
