package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplementingListInterface {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		driver.findElement(By.xpath("//input[@class = 'desktop-searchBar']")).sendKeys("Bags");
		driver.findElement(By.xpath("//input[@class = 'desktop-searchBar']")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		//wait.until(ExpectedConditions.urlContains("Bags"));
		//ExpectedCondition<Boolean> urlContains = ExpectedConditions.urlContains("Bags");
		//System.out.println(urlContains);
		
		System.out.println(driver.getCurrentUrl());
		//select gender
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//ul[@class='gender-list']/li/label/div)[1]")));
		WebElement genderSelection = driver.findElement(By.xpath("(//ul[@class='gender-list']//label)[1]"));
		//((JavascriptExecutor) driver).executeScript("arguments[0].click();", genderSelection);
		//WebElement radioButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//ul[@class='gender-list']/li/label/div)[1]")));
		genderSelection.click();
		//System.out.println(driver.getCurrentUrl());
		//String currentUrl = driver.getCurrentUrl();
		//boolean containsBag = currentUrl.contains("bag");
		//wait.until(ExpectedConditions.urlContains("men"));
		Thread.sleep(2000);
		WebElement checkBox = driver.findElement(By.xpath("//input[@value='Laptop Bag' and @type='checkbox']"));
		checkBox.click();
		//((JavascriptExecutor) driver).executeScript("arguments[0].click();", genderSelection);
		//((JavascriptExecutor) driver).executeScript("arguments[0].click();", checkBox);
		//String currentUrl1 = driver.getCurrentUrl();
		//boolean containsLaptop = currentUrl1.contains("laptop");
		
		
		
		//System.out.println(containsBag);
		//System.out.println(containsLaptop);
	//driver.close();
	}

}
