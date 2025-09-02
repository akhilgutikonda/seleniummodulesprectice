package allmodules;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LunchBrowser {
	public WebDriver driver;
	@BeforeClass
	public void Lunch() {
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\git\\seleniummodulesprectice\\Drivers\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	//	WebDriver driver = new EdgeDriver();
		//driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
          driver.get("https://practice.expandtesting.com/");
          driver.manage().window().maximize();
         // driver.quit();
	}
}
