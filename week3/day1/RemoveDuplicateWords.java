package week3.day1;

public class RemoveDuplicateWords {

	public static void main(String[] args) {
		String text = "We learn Java basics as part of java sessions in java week1"; 
		String[] words = text.split(" ");


		System.out.println(words.length);
		for (int i = 0; i < words.length; i++) {
			boolean duplicate = false;
			for (int j = 0; j < i; j++) {
				if(words[i].equalsIgnoreCase(words[j])) {
					duplicate = true;
					System.out.print(" ");
					break;


				}


			}
			if(duplicate==false) {
				System.out.print(" "+words[i]);
			}


		}

	}
}
