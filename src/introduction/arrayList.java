package introduction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class arrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> pvp = new ArrayList();
		pvp.add("Arshad");
		pvp.add("Sherin");
		pvp.add("balu");
		pvp.add("Vineeth");
		
		System.out.print("Pavapetta veetile pillers are  " );
		
		for(String s : pvp) {
			System.out.print(s + " , ");
		}
		System.out.println("");
		System.out.println(pvp.contains("Sherin"));
		
		//array to arraylist
		
		String[] array = {"jagan" , "geethu" , "shambhu"};
		
		List<String> converted=Arrays.asList(array);
		System.out.println(converted.contains(" jagan"));
		
		System.out.print("new commits");
	}

}
