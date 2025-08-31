package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CreateAccount {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("Guest");
		WebDriver driver = new ChromeDriver(options);
		
		//login
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		//navigate to crm
		driver.findElement(By.xpath("//a[contains(text(),'CRM') ]")).click();
		//navigate to accounts
		
		driver.findElement(By.xpath("//a[text()='Accounts']")).click();
		//navigate tp create account
		
		driver.findElement(By.xpath("//a[text()='Create Account']")).click();
		//Input form
		
		driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("accountnew");
		
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Selenium Automation Tester.");
		
		
		driver.findElement(By.xpath("//input[@id='numberEmployees']")).sendKeys("1");
		
		driver.findElement(By.xpath("//input[@id='numberEmployees']")).sendKeys("1");
		
		driver.findElement(By.xpath("//input[@id='officeSiteName']")).sendKeys("LeafTaps");
		
		//create account submit
		driver.findElement(By.xpath("//input[@value='Create Account']")).click();
		
		//page title
		
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.close();
		
		
		
		
		
	}

}
