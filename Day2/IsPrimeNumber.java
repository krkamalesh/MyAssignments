package week1.day2;
//My logic works only for 11 to 100
public class IsPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i = 2; i < 100; i++) {
			
			if ((i%2!=0)&&
					(i%3!=0)&&(i%4!=0)&&
					(i%5!=0)&&(i%6!=0)&&
					(i%7!=0)&&(i%8!=0)&&
					(i%9!=0)&&
					(i%10!=0)) {
				System.out.println(i);
			}
			
		}

	}

}
