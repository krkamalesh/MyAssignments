package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CreateLead {

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
		//navigate to leads
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		//navigate to create lead
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		//Input form
		driver.findElement(By.xpath("//input[@name='firstName' and @id = 'createLeadForm_firstName']")).sendKeys("firstname");
		driver.findElement(By.xpath("//input[@name='lastName' and @id = 'createLeadForm_lastName']")).sendKeys("lastname");
		driver.findElement(By.xpath("//input[@name='companyName' and @id = 'createLeadForm_companyName']")).sendKeys("companyname");
		driver.findElement(By.xpath("//input[@id = 'createLeadForm_generalProfTitle']")).sendKeys("testtitle");
		//submitting lead
		driver.findElement(By.xpath("//input[@value='Create Lead']")).click();
		
		
		//capturing title
		String title = driver.findElement(By.xpath("//span[@id='viewLead_generalProfTitle_sp']")).getText();
		System.out.println(title);
		//close browser
		driver.close();

		
		
		
		

	}

}
