package allmodules;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Utility {

/*	public void Tab_search(WebDriver driver) {
		//TAB Search
				WebElement Tab = driver.findElement(By.xpath("//input[@id='Wikipedia1_wikipedia-search-input']"));
				Tab.clear();
				Tab.sendKeys("Test");
				WebElement TabSearch = driver.findElement(By.xpath("//input[@class='wikipedia-search-button']"));
				TabSearch.click();
	}*/
	// 🔧 Helper method to switch windows by URL
    public static void switchToWindowWithUrl(WebDriver driver, String expectedUrl) {
        Set<String> windows = driver.getWindowHandles();
        for (String windowID : windows) {
            driver.switchTo().window(windowID);
            if (driver.getCurrentUrl().equalsIgnoreCase(expectedUrl)) {
                return; // stay here
            }
        }
        throw new RuntimeException("Window with URL not found: " + expectedUrl);
    }

public static void switchToParentWindowURL(WebDriver driver, String prntexpectedUrl) {
    Set<String> windows = driver.getWindowHandles();
    for (String windowID : windows) {
        driver.switchTo().window(windowID);
        if (driver.getCurrentUrl().equalsIgnoreCase(prntexpectedUrl)) {
        	driver.close();
            return; // stay here
        }
    }
    throw new RuntimeException("Window with URL not found: " + prntexpectedUrl);
}
}
	

