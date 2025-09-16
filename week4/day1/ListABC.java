package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListABC {

	public static void main(String[] args) throws InterruptedException {
		 {
			 ChromeDriver driver = new ChromeDriver();
			 driver.get("https://www.myntra.com/");
			 driver.manage().window().maximize();
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
			 
			 driver.findElement(By.xpath("//input[@class='desktop-searchBar']")).sendKeys("bags");
			 driver.findElement(By.xpath("//a[@class='desktop-submit']/span")).click();
			 Thread.sleep(2000);
			 driver.findElement(By.xpath("(//ul[@class='gender-list']//label)[1]")).click();
			 Thread.sleep(2000);
			 driver.findElement(By.xpath("(//ul[@class='categories-list']//label)[3]")).click();
			 List<WebElement> list  = driver.findElements(By.xpath("//h3[@class='product-brand']"));
			 System.out.println(list.size());
			 
			 List<String> li = new ArrayList<String>();
			 
			 for (int i = 0; i < list.size(); i++) 
			 {
		     WebElement element = driver.findElements(By.xpath("//h3[@class='product-brand']")).get(i);
		     li.add(element.getText());
			 }
			 System.out.println(li);
			 
			 List<WebElement> list2 = driver.findElements(By.xpath("//h4[@class='product-product']"));
			 
			 List<String> li2 = new ArrayList<String>();
			 
			 for(int i=0;i<list2.size();i++)
			 {
				 WebElement element2 = driver.findElements(By.xpath("//h3[@class='product-brand']")).get(i);
				 li2.add(element2.getText());
			 }
			 
			 System.out.println(li2);
		 }
	}

	}


