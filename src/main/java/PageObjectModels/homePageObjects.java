package PageObjectModels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class homePageObjects {
	
	public WebDriver driver;  // null //Thos doesnt have scope

	private By myAccount = By.xpath("//span[text()='My Account']");
	private By register = By.xpath("//li//a[text()='Register']");
	private By login = By.xpath("//li//a[text()='Login']");
	
	
	//constrcutor 
	public homePageObjects(WebDriver driver) {
		
		this.driver=driver;
		
	}


	public WebElement clickOnMyAccount() {
		return driver.findElement(myAccount);

	}
	
	
	public WebElement clickOnRegister() {
		return driver.findElement(register);

	}
	
	public WebElement clickOnLogin() {
		return driver.findElement(login);

	}
	

}
