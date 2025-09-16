package week5.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class WindowHandle {
	private ChromeOptions option;
	private ChromeDriver driver;
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
	
	public WindowHandle() {
		option = new ChromeOptions();
		option.addArguments("guest");
		driver = new ChromeDriver(option);
	}
	
	public void elementLocatorClick(String xpath) {
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(xpath))));
		driver.findElement(By.xpath(xpath)).click();;
		
	}
	
	public void windowHandle(int i) {
		Set<String> windowHandlesSet = driver.getWindowHandles();
		List<String> windowHandlesList = new ArrayList<String>(windowHandlesSet);
		driver.switchTo().window(windowHandlesList.get(i));
	}

	public static void main(String[] args) {
		WindowHandle wH = new WindowHandle();
		ChromeDriver driver = wH.driver;
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		//click on contacts tab
		wH.elementLocatorClick("//a[text()='Contacts']");
		//click on Merge COntacts
		wH.elementLocatorClick("//a[text()='Merge Contacts']");
		//click on from contact to open 2nd window
		wH.elementLocatorClick("//input[@id='partyIdFrom']/following-sibling::a");
		//switch to Child window
		wH.windowHandle(1);
		//select data
		wH.elementLocatorClick("(//td[contains(@class,'partyId')]/div/a)[2]");
		//switch to parent
		wH.windowHandle(0);
		//open child window to select to data
		wH.elementLocatorClick("//input[@id='partyIdTo']/following-sibling::a");
		//switch to child window
		wH.windowHandle(1);
		//select data
		wH.elementLocatorClick("(//td[contains(@class,'partyId')]/div/a)[3]");
		//switch to child window
		wH.windowHandle(0);
		//click on Merge
		wH.elementLocatorClick("//a[text()='Merge']");
		//switch to Alert
		Alert alert = driver.switchTo().alert();
		alert.accept();
		//get title to verify
		String title = driver.getTitle();
		boolean contains = title.contains("View Contact");
		System.out.println("correct title displayed  :  "+contains);


	}

}
