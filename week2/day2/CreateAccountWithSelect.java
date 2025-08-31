package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountWithSelect {

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
		
		driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("accountnewerty");
		
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Selenium Automation Tester.");
		
		//industry dropdown
		WebElement industryDropdown = driver.findElement(By.xpath("//select[@name='industryEnumId']"));
		Select industryDropdownList = new Select(industryDropdown);
		industryDropdownList.selectByVisibleText("Computer Software");
		//ownership dropdown
				WebElement ownershipDropdown = driver.findElement(By.xpath("//select[@name='ownershipEnumId']"));
				Select ownershipDropdownList = new Select(ownershipDropdown);
				ownershipDropdownList.selectByVisibleText("S-Corporation");
		//source dropdown
				WebElement sourceDropdown = driver.findElement(By.xpath("//select[@id='dataSourceId']"));
				Select sourceDropdownList = new Select(sourceDropdown);
				sourceDropdownList.selectByValue("LEAD_EMPLOYEE");
				
				//select[@id='marketingCampaignId']
				//marketing dropdown
				WebElement marketingDropdown = driver.findElement(By.xpath("//select[@id='marketingCampaignId']"));
				Select marketingDropdownList = new Select(marketingDropdown);
				marketingDropdownList.selectByIndex(7);
						
				//state dropdown
				WebElement stateDropdown = driver.findElement(By.xpath("//select[@id='generalStateProvinceGeoId']"));
				Select stateDropdownList = new Select(stateDropdown);
				stateDropdownList.selectByValue("TX");
				
		
		//create account submit
		driver.findElement(By.xpath("//input[@value='Create Account']")).click();
				
				//PRINT ACCOUNT NAME
				
				
						
		String accountName = driver.findElement(By.xpath("(//span[@class='tabletext'])[3]")).getText();
		System.out.println(accountName);
		

	}

}
