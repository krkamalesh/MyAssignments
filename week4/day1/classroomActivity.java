package week4.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class classroomActivity {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("Guest");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("phones");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(Keys.RETURN);


		List<WebElement> priceList = driver.findElements(By.xpath("//span[@class='a-price-whole']"));

		List<String> mobilePrice = new ArrayList<String>();

		for (WebElement price : priceList) {


			String text = price.getText();

			mobilePrice.add(text);

		}
		System.out.println(mobilePrice);
		List<Integer> numberPrice = new ArrayList<Integer>();
		//numberPrice.addAll(mobilePrice);
		//numberPrice.addAll(mobilePrice)
		System.out.println(mobilePrice);
	}

}
