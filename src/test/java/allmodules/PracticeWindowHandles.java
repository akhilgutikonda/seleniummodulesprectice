package allmodules;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeWindowHandles  {
	String ParentID;
	WebDriver driver;
	

	public void open() {
		driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		 ParentID = driver.getWindowHandle();
		//TAB Search
		WebElement Tab = driver.findElement(By.xpath("//input[@id='Wikipedia1_wikipedia-search-input']"));
		Tab.clear();
		Tab.sendKeys("Test");
		WebElement TabSearch = driver.findElement(By.xpath("//input[@class='wikipedia-search-button']"));
		TabSearch.click();
	}

	
	public void WindowHandleMultiple() {
		 
		//Test URL
		driver.findElement(By.xpath("//a[@href=\"https://en.wikipedia.org/wiki/Test\"]")).click();
		String expectedUrl = "https://en.wikipedia.org/wiki/Test";
		Utility.switchToWindowWithUrl(driver, expectedUrl);
		if(driver.getCurrentUrl().equalsIgnoreCase(expectedUrl)) {
			System.out.println(driver.getCurrentUrl());
			WebElement Login_TestURL = driver.findElement(By.xpath("//li[@id='pt-login-2']//span[normalize-space()='Log in']"));
			Login_TestURL.click();
			WebElement username = driver.findElement(By.xpath("//input[@id='wpName1']"));
			username.sendKeys("Akhil");
		//	driver.close();
			driver.switchTo().window(ParentID);
		}
		
	
	}
		public void windowtwo() {
		// Navigate to Testicle link
	    driver.findElement(By.xpath("//a[normalize-space()='Testicle']")).click();
	    String expectedUrl = "https://en.wikipedia.org/wiki/Testicle";
	    Utility.switchToWindowWithUrl(driver, expectedUrl);
	    if (driver.getCurrentUrl().equalsIgnoreCase(expectedUrl)) {
	        System.out.println(driver.getCurrentUrl());

	        WebElement Testicle_SearchText = driver.findElement(By.xpath("//form[@id='searchform']//input[@name='search']"));
	        Testicle_SearchText.sendKeys("AKHIL");
	    driver.switchTo().window(ParentID);
		}
		
	}
		public void Testosterone(){
			driver.findElement(By.xpath("//a[normalize-space()='Testosterone']")).click();
			String expectedUrl = "https://en.wikipedia.org/wiki/Testosterone";
		Utility.switchToWindowWithUrl(driver, expectedUrl);
		if (driver.getCurrentUrl().equalsIgnoreCase(expectedUrl)) {
	        System.out.println(driver.getCurrentUrl());

	    
		}
		}
	
	
}
