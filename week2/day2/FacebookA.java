package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookA {
	


	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		//firstname
		
		driver.findElement(By.xpath("//input[@type = 'text' and @name = 'firstname']")).sendKeys("kamalesh");
		//sur name
		
		driver.findElement(By.xpath("//input[@type = 'text' and @name = 'lastname']")).sendKeys("kumar");
		//dob
		
		//day
		
		 WebElement dayDropdown = driver.findElement(By.xpath("//select[@id='day']"));
		 Select dayDropdownList = new Select (dayDropdown);
		 dayDropdownList.selectByValue("1");
		 
		 //month
		 
		 WebElement monthDropdown1 = driver.findElement(By.xpath("//select[@id='month']"));
		 Select monthDropdownList1 = new Select (monthDropdown1);
		 monthDropdownList1.selectByValue("9");
		 
		 //year
		 WebElement yearDropdown11 = driver.findElement(By.xpath("//select[@id='year']"));
		 Select yearDropdownList11 = new Select (yearDropdown11);
		 yearDropdownList11.selectByValue("2017");
		 
		 //select male
		 
		//input[@id='sex' and @value ='2']
		 driver.findElement(By.xpath("//input[@id='sex' and @value ='2']")).click();
		 
			
		 
	}

}
