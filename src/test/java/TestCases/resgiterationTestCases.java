package TestCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PageObjectModels.homePageObjects;
import PageObjectModels.registerationPageObjects;
import Resouces.baseClass;
import Resouces.commonMethods;
import Resouces.constants;

public class resgiterationTestCases extends baseClass {
	
	@Test
	public void verifyRegisterationWithValidData() throws IOException, InterruptedException {
		
		homePageObjects hpo = new 	homePageObjects(driver);
		
	    hpo.clickOnMyAccount().click();
	    commonMethods.eplxictWait(driver,20,hpo.clickOnRegister() );
	    hpo.clickOnRegister().click();
	    
	    registerationPageObjects rpo = new   registerationPageObjects(driver);
	    
		rpo.enterfirstname().sendKeys(constants.firstName);
		rpo.enterlastname().sendKeys(constants.lastName);
		rpo.enteremail().sendKeys(emailAdreess);
		rpo.enterphonenumber().sendKeys("9096979198");
		rpo.enterpassword().sendKeys("Aniket@123");
		rpo.entercomformpassword().sendKeys("Aniket@123");
		rpo.clickonrediobutton().click();
		rpo.clickonprivecypolicy().click();
	    rpo.clickonsubmit().click();
	    
     
	    
		
	}
	
	
	@Test
	public void verifyRegisterationWithBlankData() throws InterruptedException, IOException {
		
		
		homePageObjects hpo = new 	homePageObjects(driver);
		
	    hpo.clickOnMyAccount().click();

	    commonMethods.eplxictWait(driver,10,hpo.clickOnRegister() );
	    
	    hpo.clickOnRegister().click();
	    
	    registerationPageObjects rpo = new   registerationPageObjects(driver);
	    rpo.clickonsubmit().click();
	    
	     
	
		
	}
	


}
