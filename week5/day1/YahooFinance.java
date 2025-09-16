package week5.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class YahooFinance {

	public static void main(String[] args) {
		//Initialize webdriver
		WebDriver driver = new ChromeDriver();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//maximize browser
		driver.manage().window().maximize();
		//open Yahoo
		driver.get("https://finance.yahoo.com/");
		//Mouse over More webelement and click
		WebElement element = driver.findElement(By.xpath("//span[text()='More']"));
		Actions act = new Actions(driver);
		act.moveToElement(element).perform();
		driver.findElement(By.xpath("//a[@aria-label='Finance: General']/following-sibling::ul/li[8]")).click();
		//Reference table xpaths
		//div[contains(@class,'table-container')]/table/tbody
		//div[contains(@class,'table-container')]/table/tbody/tr
		//div[contains(@class,'table-container')]/table/tbody/tr/td
		//div[contains(@class,'table-container')]/table/tbody/tr[2]/td[1]
		
		List<WebElement> elements = driver.findElements(By.xpath("//div[contains(@class,'table-container')]/table/tbody/tr"));
		List<String> cryptoListSymbol = new ArrayList<String>();
		List<String> cryptoListName = new ArrayList<String>();
		
		//for loop for loading data to list
		for (int i = 1; i < (elements.size()+1); i++) {

			WebElement element2 = driver.findElement(By.xpath("//div[contains(@class,'table-container')]/table/tbody/tr["+i+"]/td[1]"));
			cryptoListSymbol.add(element2.getText());
			WebElement element3 = driver.findElement(By.xpath("//div[contains(@class,'table-container')]/table/tbody/tr["+i+"]/td[2]"));
			cryptoListName.add(element3.getText());
		}
		System.out.println("Crypto List");
		
		//for loop to display data in order
		for (int i = 0; i < cryptoListSymbol.size(); i++) {
			String string1 = cryptoListSymbol.get(i);
			String string2 = cryptoListName.get(i);

			System.out.println();
			System.out.println(string1 +"---->"+ string2);
		}

	}

}
