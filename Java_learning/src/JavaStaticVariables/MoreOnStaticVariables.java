package JavaStaticVariables;

public class MoreOnStaticVariables {

	private String first;
	private String last;
	private static int members = 0;

	public MoreOnStaticVariables(String fn, String ln) {

		first = fn;
		last = ln;
		members++;
		System.out.printf("The Constructors for  %s %s , Total members in the club : %d\n, ", first, last, members);

	}

	public String getFirst() {
		return first;

	}
	public String getLast(){
		return last;
		
	}
	
	public int getMembers(){
		return members;
	}

}
