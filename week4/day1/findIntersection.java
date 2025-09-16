package week4.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class findIntersection {

	public static void main(String[] args) {
		
		
		List<Integer> array1 = new ArrayList<Integer>();
		array1.addAll(Arrays.asList(3, 2, 11, 4, 6, 7));
		List<Integer> array2 = new ArrayList<Integer>();
		array2.addAll(Arrays.asList(1, 2, 8, 4, 9, 7));
		System.out.println("Array 1" + array1);
		System.out.println("Array 2" + array2);
		System.out.println("intersection is");
		for (int i = 0; i < array1.size(); i++) {
			for (int j = 0; j < array2.size(); j++) {
				if(array1.get(i).equals(array2.get(j))) {
					System.out.println(array1.get(i));
				}
				
			}
			
		}
	}

}
