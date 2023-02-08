package Java_Basic;

import java.util.ArrayList;
import java.util.List;

public class addelement_arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	List<String> List_Strings = new ArrayList<>();
		
		List_Strings.add("Blue");
		List_Strings.add("Red");
		List_Strings.add("White");
		List_Strings.add("Black");
		List_Strings.add("yellow");
		
		System.out.println(List_Strings);
		
		List_Strings.add(2,"Pink");
		List_Strings.add(0,"violet");
		List_Strings.add(5,"skyblue");
		System.out.println(List_Strings);
	}

}
