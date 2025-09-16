package week5.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableInteraction {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


		WebDriver driver = new ChromeDriver();
		driver.get("https://erail.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.findElement(By.xpath("//input[@id ='txtStationFrom']")).clear();
		driver.findElement(By.xpath("//input[@id ='txtStationFrom']")).sendKeys("MAS");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id ='txtStationFrom']")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//input[@id ='txtStationTo']")).clear();
		driver.findElement(By.xpath("//input[@id ='txtStationTo']")).sendKeys("MDU");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id ='txtStationTo']")).sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='chkSelectDateOnly']")).click();
		/*
		boolean enabled = driver.findElement(By.xpath("//input[@id='chkSelectDateOnly']")).isEnabled();
		if(enabled==true) {

		}*/
		//driver.findElement(By.xpath("//input[@id='buttonFromTo']")).click();
		//locate table
		driver.findElement(By.xpath("//table[contains(@class,'TrainList')]/tbody"));
		//no of rows
		List<WebElement> tableRows = driver.findElements(By.xpath("//table[contains(@class,'TrainList')]/tbody/tr"));
		//no of columns
		List<WebElement> tableColumns = driver.findElements(By.xpath("//table[contains(@class,'TrainList')]/tbody/tr/td"));
		List<String> trainName = new ArrayList<String>();
		for (int i = 2; i < tableRows.size(); i++) {
			WebElement t = driver.findElement(By.xpath("//table[contains(@class,'TrainList')]/tbody/tr["+i+"]/td[2]"));


			trainName.add(t.getText());
		}
		System.out.println("Train name from erail");
		System.out.println(trainName);
		Set<String> uniqueNames = new TreeSet<>(trainName);
		System.out.println("Removing Duplicates");
		System.out.println(uniqueNames);

	}

}


