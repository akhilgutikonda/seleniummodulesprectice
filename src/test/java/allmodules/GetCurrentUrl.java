package allmodules;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GetCurrentUrl extends LunchBrowser{
	
	@Test
	public void getCurrentUrl() {
		
		String ActualURL = driver.getCurrentUrl();
		String ExpectedURL = "https://practice.expandtesting.com/";
		
		//Assert.assertEquals(ExpectedURL, ActualURL, "Expected URL is not matching with Actual URL" + ExpectedURL);
		
	/*	if(ActualURL.equalsIgnoreCase(ExpectedURL)) {
			System.out.println("True : " + ActualURL);
		}else {
			System.out.println("False : " + ActualURL);
		} */
		
		if(ActualURL.equalsIgnoreCase(ExpectedURL));
		
	}

}
