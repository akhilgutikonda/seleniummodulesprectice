package allmodules;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TitleVerification extends LunchBrowser{


	@Test
	public void VerifyTitel() {
		
		String Title = driver.getTitle();
		String ExpectedTitle = "Automation Testing Practice Website for QA and Developers | UI and API";
		//System.out.println(Title);
		
		
	/*	if(Title.equals(ExpectedTitle)) {
			System.out.println(" 'true' -  Actual Title: " + Title);
		}else {
			System.out.println("False");
		} */
		
		//if(ExpectedTitle.equals(Title));
		
		Assert.assertEquals(Title, ExpectedTitle, "Page title did not match! Actual Title: " + Title);
		System.out.println(Title);
	}
}
