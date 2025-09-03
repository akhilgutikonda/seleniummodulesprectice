package allmodules;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;



public class test{
WebDriver driver;

@Test
	public void window() {
		PracticeWindowHandles ps = new PracticeWindowHandles();
		ps.open();
		ps.WindowHandleMultiple();
		ps.windowtwo();
		ps.Testosterone();
	}
	
	
	
	
	
}
