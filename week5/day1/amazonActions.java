package week5.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class amazonActions {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		//maximize
		driver.manage().window().maximize();
		//login
		driver.get("https://www.amazon.in/");
		boolean displayed = driver.findElement(By.xpath("//button[text()='Continue shopping']")).isDisplayed();
		if(displayed==true) {
			driver.findElement(By.xpath("//button[text()='Continue shopping']")).click();
		}

		Actions act = new Actions(driver);
		WebElement elementToScroll = driver.findElement(By.xpath("(//div[contains(@class,'navFooterCopyright')]//li)[1]"));
		act.scrollToElement(elementToScroll).perform();
		String text = driver.findElement(By.xpath("(//div[contains(@class,'navFooterCopyright')]//li)[1]")).getText();

		System.out.println(text);
		

	}

}
