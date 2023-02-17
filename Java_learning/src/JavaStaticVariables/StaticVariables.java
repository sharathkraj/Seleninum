package JavaStaticVariables;

public class StaticVariables {
	private String first;
	private String last;
	private static int members=0;
	
	public StaticVariables ( String fn ,String ln){
		
		first = fn;
		last = ln;
		members++;
		System.out.printf("The Constructors for  %s %s , Total members in the club : %d\n, " ,first,last,members);
		
	}

	
}
