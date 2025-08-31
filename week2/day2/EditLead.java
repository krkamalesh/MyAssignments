package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("Guest");
		WebDriver driver = new ChromeDriver(options);

		// login
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		// navigate to crm
		driver.findElement(By.xpath("//a[contains(text(),'CRM') ]")).click();
		// navigate to leads
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		// navigate to create lead
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		// Input form
		driver.findElement(By.xpath("//input[@name='firstName' and @id = 'createLeadForm_firstName']"))
				.sendKeys("firstname");
		driver.findElement(By.xpath("//input[@name='lastName' and @id = 'createLeadForm_lastName']"))
				.sendKeys("lastname");
		driver.findElement(By.xpath("//input[@name='companyName' and @id = 'createLeadForm_companyName']"))
				.sendKeys("companyname");
		// firstnamelocal, department, descrip[tyiom

		driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("firstnamelocal");

		driver.findElement(By.xpath("//input[@id='createLeadForm_departmentName']")).sendKeys("departmentname");

		driver.findElement(By.xpath("//textarea[@id='createLeadForm_description']")).sendKeys("testdescription");
		//email address, province
		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys("abc@xyz.com");
		WebElement stateDropdown = driver.findElement(By.xpath("//select[@id='createLeadForm_generalStateProvinceGeoId']"));
		Select stateDropdownList = new Select(stateDropdown);
		stateDropdownList.selectByVisibleText("New York");
		
		
		// submitting lead
		driver.findElement(By.xpath("//input[@value='Create Lead']")).click();
		
		//Edit Lead
		
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		
		
		
		driver.findElement(By.xpath("//textarea[@id='updateLeadForm_description']")).clear();
		
		driver.findElement(By.xpath("//textarea[@id='updateLeadForm_importantNote']")).sendKeys("ANy text");
		
		
		//update
		
		
		driver.findElement(By.xpath("//input[@name='submitButton' and @value='Update']")).click();
		
		//get page title
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);
		
	}

}
