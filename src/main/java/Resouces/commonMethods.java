package Resouces;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

public class commonMethods {
	
	
	// We need to decode the paramater by seeing ehowhc elements are getting changed by testcases 

	public static void handleAssertion(String actualResult, String expectedResult) {

		SoftAssert sa = new SoftAssert();

		String expected = expectedResult;
		String actual =actualResult;

		sa.assertEquals(actual, expected);
		sa.assertAll();

	}
	
	
	public static void eplxictWait(WebDriver driver,int time, WebElement element) {
		
		WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(time));
		wait.until(ExpectedConditions.visibilityOf(element));
		
	}

}
