package week4.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String companyArray[] = {"HCL","WIPRO","ASPIRE SYSTEMS","CTS"};
		
		List<String> companyList = new ArrayList<String>();
		
		for (int i = 0; i < companyArray.length; i++) {
			
			String string = companyArray[i];
			companyList.add(string);
		}
		System.out.println(companyList);
		
		Collections.sort(companyList);
		//System.out.println("List in ascending order" + companyList);
		//Collections.reverse(companyList);
		//System.out.println("List in ascending order" + companyList);
		
		//using for loop
		
		for (int i = (companyList.size()-1); i >= 0; i--) {
			
			System.out.println(companyList.get(i));
			
			
		}
		
	
}


}
