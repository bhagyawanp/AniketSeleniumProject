package TestCases;

import java.io.IOException;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PageObjectModels.homePageObjects;
import PageObjectModels.loginPageObjects;
import Resouces.baseClass;

public class loginTestCases extends baseClass{
	
	
	@Test
	public void verifyLoginWithValidData() throws IOException, InterruptedException {
		
		homePageObjects hpo = new 	homePageObjects(driver);
		
	    hpo.clickOnMyAccount().click();
		Thread.sleep(2000);
		
		hpo.clickOnLogin().click();
		
		
		loginPageObjects lpo =new loginPageObjects(driver);
		
		
		lpo.enterEmail().sendKeys(emailAdreess);
		lpo.enterPassword().sendKeys("Aniket@123");
		lpo.clickOnSubmit().click();
		
	
		
	}
	
	

}
