package week4.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindMissingElementUsingList {

	public static void main(String[] args) {
		List<Integer> array1=new ArrayList<Integer>();
		
		array1.addAll(Arrays.asList(1, 2, 3, 4, 10, 6, 8));
		Collections.sort(array1);
		System.out.println(array1);
		
		for (int i = 0; i < array1.size()-1; i++) {
			int early = array1.get(i);
			int next = array1.get(i+1);
			if ((next-early==1)) {
				System.out.println("no action");
			}
			else {
				for (int j = early+1; j < next; j++) {
					System.out.println(j);
					
				}
			}
		}

	}

}
