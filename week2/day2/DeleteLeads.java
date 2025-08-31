package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DeleteLeads {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("Guest");
		WebDriver driver = new ChromeDriver(options);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		//login
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		//navigate to crm
		driver.findElement(By.xpath("//a[contains(text(),'CRM') ]")).click();
		//navigate to leads
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		//navigate to find leads
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		//click on phone tab
		
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		
		//to avoid stale exception
		
		String leadRecord = driver.findElement(By.xpath("((//table[@class='x-grid3-row-table'])//a)[1]")).getText();
		System.out.println(leadRecord);
		 WebElement oldReference = driver.findElement(By.xpath("((//table[@class='x-grid3-row-table'])//a)[1]"));
		 
		 //enter phone number
		
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("9982072857");
		//click on find leads
		
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		wait.until(ExpectedConditions.stalenessOf(oldReference));
		//Relocate
		 WebElement newReference = driver.findElement(By.xpath("((//table[@class='x-grid3-row-table'])//a)[1]"));
		 String leadRecord1 = newReference.getText();
		 System.out.println(leadRecord1);
		 
		//open the lead record
		 newReference.click();
		//delete the record
				
		driver.findElement(By.xpath("//a[text()='Delete']")).click();
		//navigate to find leads
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		//enter Lead ID
		
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadRecord1);
		
		//find lead
		
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		//verify error message
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[text()='No records to display']")));
		boolean displayed = driver.findElement(By.xpath("//div[text()='No records to display']")).isDisplayed();
		System.out.println("Is record deleted"+displayed);
		
		
		
		
		//close browser
		driver.close();


	}

}
