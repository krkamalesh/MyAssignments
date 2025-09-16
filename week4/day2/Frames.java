package week4.day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Frames {

	public static void main(String[] args) {
		
			ChromeOptions options = new ChromeOptions();
			options.addArguments("Guest");
			WebDriver driver = new ChromeDriver(options);
			
			//implicit wait
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			//maximize
			driver.manage().window().maximize();
			//login
			driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
			
			WebElement frameTarget = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
			driver.switchTo().frame(frameTarget);
			driver.findElement(By.xpath("//button[text()='Try it']")).click();
			Alert alertTarget = driver.switchTo().alert();
			System.out.println(alertTarget.getText());
			alertTarget.accept();
			String resultText = driver.findElement(By.xpath("//p[@id ='demo']")).getText();
			System.out.println(resultText);
			
			
			
			

	}

}
