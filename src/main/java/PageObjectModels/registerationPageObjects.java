package PageObjectModels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class registerationPageObjects {

	
    public WebDriver driver;
	
	private By firstname = By.xpath("//input[@id='input-firstname']");
	private By lastname  = By.xpath("//input[@id='input-lastname']");
	private By email  =By.xpath("//input[@id='input-email']");
	private By phonenumber=By.xpath("//input[@id='input-telephone']");
	private By password =By.xpath("//input[@id='input-password']");
	private By comformpassword = By.xpath("//input[@id='input-confirm']");
	private By subscriberedio  =By.xpath("(//input[@type='radio'])[3]");
	private By privecypolicy =By.xpath("//input[@type='checkbox']");
	private By submit =By.xpath("//input[@type='submit']");
	
	//registerationsusccesull
	
	
	
	public registerationPageObjects(WebDriver driver) {

		this.driver=driver;
	}
	public WebElement enterfirstname() {
		return driver.findElement(firstname);
	}
	public WebElement enterlastname() {
		return driver.findElement(lastname);
	}
	public WebElement enteremail() {
		return driver.findElement(email);
	}
	public WebElement enterphonenumber() {
		return driver.findElement(phonenumber);
	}
	public WebElement enterpassword() {
		return driver.findElement(password);
	}
	public WebElement entercomformpassword() {
		return driver.findElement(comformpassword);
	}
	public WebElement clickonrediobutton() {
		return driver.findElement(subscriberedio);
	}
	public WebElement clickonprivecypolicy() {
		return driver.findElement(privecypolicy);
	}
	public  WebElement clickonsubmit() {
		return driver.findElement(submit);
	}


	
	
}
