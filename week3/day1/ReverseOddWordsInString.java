package week3.day1;

public class ReverseOddWordsInString {

	public static void main(String[] args) {
		String[] inputText = {"I"," ","am"," ","a"," ","software"," "," ","tester"};
								//0 1 2	
		
		for (String s : inputText) {
			
			System.out.print(s);
		}
		
		System.out.println("");
		
		for (int i = 0; i < inputText.length; i++) {
			
			if((i+1)%2!=0) {
				char[] charArray = inputText[i].toCharArray();
				for (int j = charArray.length; j >0; j--) {
					char c = charArray[j-1];
					System.out.print(c);
				}
			}else {
				System.out.print(inputText[i]);
			}
			
		}
		

	}

}
