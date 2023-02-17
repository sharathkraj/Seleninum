package JavaStaticVariables;

public class StaticMainClass2 {
	
	public static void main(String args[]){
		
		MoreOnStaticVariables mst1 = new MoreOnStaticVariables("sharath", "Rajendran");
		MoreOnStaticVariables mst2 = new MoreOnStaticVariables("sharath1", "Rajendran");
		//MoreOnStaticVariables mst3 = new MoreOnStaticVariables("sharath2", "Rajendran");
	mst1.getFirst();
	mst1.getLast();
	mst1.getMembers();
	
	System.out.printf(" The names of club members are %s\t%s\t %d\n", mst2.getFirst(),mst1.getLast(),mst1.getMembers());
	}

}
