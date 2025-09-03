package allmodules;

import java.util.Set;
import org.openqa.selenium.WebDriver;
public class Utility {


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

}
	

