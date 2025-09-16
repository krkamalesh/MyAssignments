package week4.day2;


import java.util.LinkedHashSet;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) {
		String inputString = "google";
		char[] charArrayInput = inputString.toCharArray();
		int noOfDuplicate = 0;
		Set<Character> unique=new LinkedHashSet<Character>();
		Set<Character> duplicate=new LinkedHashSet<Character>();
		for (int i = 0; i < charArrayInput.length; i++) {

			boolean printDuplicate = unique.add(charArrayInput[i]);

			if(printDuplicate==false) {
				duplicate.add(charArrayInput[i]);

				noOfDuplicate++;

			}
		}
		System.out.println("Unique"+unique);
		System.out.println("Duplicates"+duplicate);
		System.out.println("No of Duplicates"+noOfDuplicate);
	}

}
