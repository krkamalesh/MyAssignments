package week3.day1;



public class OddIndexToUpper {

	public static void main(String[] args) {
		String test = "changeme"; 
		char[] testArray = test.toCharArray();
		System.out.println("Before conversion"+": "+test);
		String testArrayObj = new String(testArray);
		System.out.println("converting odd index to upper");
		for (int i = 0; i < testArray.length; i++) {
			if (i%2 ==0) {
				char X = testArrayObj.charAt(i);
				String str = String.valueOf(X);

				System.out.print(str);
			

			}else if (i%2 !=0) {
				char X = testArrayObj.charAt(i);
				String str = String.valueOf(X);

				System.out.print(str.toUpperCase());
			}
			
		}

	}

}
