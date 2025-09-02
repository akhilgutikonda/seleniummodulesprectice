package allmodules;

import org.testng.annotations.Test;

public class PageSource extends LunchBrowser{

	
	@Test
	public void Page_Source() {
		
		System.out.println(driver.getPageSource());
		
	}
}
