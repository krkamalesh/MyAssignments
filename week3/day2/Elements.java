package week3.day2;

public class Elements extends Button{

	public static void main(String[] args) {
		Elements eL = new Elements();
		eL.click();
		eL.setText();
		eL.submit();
		CheckBoxButton CB = new CheckBoxButton();
		CB.click();
		CB.submit();
		CB.clickCheckButton();
		CB.setText();
		TextField TF = new TextField();
		TF.getText();
		TF.click();
		TF.setText();
		
	}

}
