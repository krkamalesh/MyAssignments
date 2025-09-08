package week3.day1;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {
		//int[] arrayElements = {1,4,3,2,8,6,7};
		int[] arrayElements = new int[7];
		arrayElements[0]= 1;
		arrayElements[1]= 4;
		arrayElements[2]= 3;
		arrayElements[3]= 2;
		arrayElements[4]= 8;
		arrayElements[5]= 6;
		arrayElements[6]= 7;
		Arrays.sort(arrayElements);
		//to display sorted 
		System.out.println("numbers after sorting");
		for (int i = 0; i < arrayElements.length; i++) {
			System.out.println(arrayElements[i]);
			
		}
		//find missing element
		System.out.println("RESULT");
		for (int i = 0; i < arrayElements.length; i++) {
			if((i+1)==arrayElements[i]) {
				//System.out.println("not a missing number"+arrayElements[i]);
			} else if ((i+1)!=arrayElements[i]) {
				System.out.println("missing number"+(i+1));
				break;
			}
			
		}

}
}
