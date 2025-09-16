package week4.day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplementingList {

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
		Thread.sleep(2000);
		//select gender
		WebElement genderSelection = driver.findElement(By.xpath("(//ul[@class='gender-list']//label)[1]"));
		genderSelection.click();
		Thread.sleep(2000);		
		WebElement checkBox = driver.findElement(By.xpath("(//ul[@class='categories-list']//label)[3]"));
		checkBox.click();
		Thread.sleep(2000);
		
		
		
		String countOfProducts = driver.findElement(By.xpath("//span[@class='title-count']")).getText();
		
		System.out.println(countOfProducts);
		
		List<WebElement> brandName = driver.findElements(By.xpath("//h3[@class='product-brand']"));
		
		for (int i = 1; i < brandName.size(); i++) {
			
			String brandNames = driver.findElement(By.xpath("(//h3[@class='product-brand'])["+i+"]")).getText();
			System.out.println(brandNames);
		}
		
		List<WebElement> BagName = driver.findElements(By.xpath("//h4[@class='product-product']"));
		for (WebElement webElement : BagName) {
			String BagNames = webElement.getText();
			System.out.println(BagNames);
		}
		
	driver.close();

	}

}
