package PageObjectModels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginPageObjects {

	public WebDriver driver;

	private By email = By.xpath("//input[@name='email']");
	private By password = By.xpath("//input[@name='password']");
	private By submit = By.xpath("//input[@value='Lon']");

	public loginPageObjects(WebDriver driver) {
		this.driver=driver;
	}

	public WebElement enterEmail() {

		return driver.findElement(email);
	}

	public WebElement enterPassword() {

		return driver.findElement(password);
	}

	public WebElement clickOnSubmit() {

		return driver.findElement(submit);
	}

}
