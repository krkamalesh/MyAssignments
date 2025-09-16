package week4.day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FrameAssignment {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("Guest");
		WebDriver driver = new ChromeDriver(options);

		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		//maximize
		driver.manage().window().maximize();
		//login
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");

		WebElement frameTarget = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
		driver.switchTo().frame(frameTarget);
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		Alert alertTarget = driver.switchTo().alert();
		System.out.println(alertTarget.getText());
		alertTarget.accept();
		String resultText = driver.findElement(By.xpath("//p[@id ='demo']")).getText();
		System.out.println(resultText);


// to dismiss
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		alertTarget.dismiss();
		String resultText1 = driver.findElement(By.xpath("//p[@id ='demo']")).getText();
		System.out.println(resultText1);
		boolean containsresultText = resultText.contains("Hello Harry Potter! How are you today?");
		System.out.println("Alert accept shows correct text :"+containsresultText);
		boolean containsresultText1 = resultText1.contains("User cancelled the prompt");
		System.out.println("Alert reject shows correct text :"+containsresultText1);

	}




}


