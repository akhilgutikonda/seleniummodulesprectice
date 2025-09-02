package allmodules;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WindowHandles {
//https://testautomationpractice.blogspot.com/
	@Test
	public void windowhandle() {
		 WebDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	          driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	          driver.manage().window().maximize();
	      //  driver.findElement(By.xpath("//input[@id=\"Wikipedia1_wikipedia-search-input\"]")).sendKeys("Test");
	          String parentID = driver.getWindowHandle();
	      driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
	        
	          Set<String> WindowIDs = driver.getWindowHandles();
	          
	          for(String windowid : WindowIDs) {
	        	 String WindowTile =  driver.switchTo().window(windowid).getTitle();
	        	 if(WindowTile.equalsIgnoreCase("Human Resources Management Software | HRMS | OrangeHRM")) {
	        		System.out.println(driver.getCurrentUrl());
	        		driver.findElement(By.xpath("//input[@name='EmailHomePage']")).sendKeys("AkhilTesting@gmail.com");
	        		//driver.close();
	        	 }
	        	 driver.switchTo().window(parentID);
	        	 if(WindowTile.equalsIgnoreCase("OrangeHRM")) {
		        		System.out.println(driver.getCurrentUrl());
		        	driver.findElement(By.xpath("//input[@class='oxd-input oxd-input--active' and @placeholder='Username']")).sendKeys("Akhil");
		        	 }
	          }
	          
	}
	
}
