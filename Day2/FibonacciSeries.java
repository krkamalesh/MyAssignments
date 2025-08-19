package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("printing fibonacci");
		int addNum;

		int firstNumber = 0; // old value
		int secondNumber = 1; // current i value
		System.out.println(firstNumber+"\n"+secondNumber);
		for (int i = 2; i <= 7; i++) {
	
	addNum = firstNumber+ secondNumber;
	
	System.out.println(addNum);
	firstNumber = secondNumber;
	secondNumber = addNum;
	

}
	}}
