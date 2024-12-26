package Resouces;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

//browser launch code
public class baseClass {

	public static WebDriver driver;
	public Properties prop;
	
	
	public static String emailAdreess= generateRandomEmail();

	public void initializeDriver() throws IOException {

		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir")+"\\src\\main\\java\\Resouces\\data.properties");
      
		
		
		prop = new Properties();
		prop.load(fis);

		String browserName = prop.getProperty("browser");

		if (browserName.equalsIgnoreCase("chrome")) {

			driver = new ChromeDriver();

		} else if (browserName.equalsIgnoreCase("firefox")) {

			driver = new FirefoxDriver();

		} else if (browserName.equalsIgnoreCase("edge")) {

			driver = new EdgeDriver();

		} else {
			System.out.println("Please choose the correct browser");
		}

	}
	
	
	public static String generateRandomEmail() {
		return System.currentTimeMillis()+"@gmail.com";
		//1231263876@gmail.com
	}
	
	
	@BeforeMethod
	public void browserLaunch() throws IOException {
		initializeDriver();
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
	
	}
	
	
	 
	 @BeforeSuite
	 public void setupReport() {
	       extentReportManager.setup();
	 }
	
	 
	 
	 @AfterSuite
	 public void endReporttest() {
		 extentReportManager.endReport();
	 }
	
	
	

	// To take the screenshot and store in one folder-
	public static String screenShot(WebDriver driver, String filename){
		String date = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		// 20241221080205

		File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String destination = System.getProperty("user.dir") + "\\Screenshots\\" + filename + "_" + date + ".png";
		 // VerifyRresgiertaionWithValiData_20241218083700.png
		try {
			FileUtils.copyFile(source, new File(destination));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		return destination;
	}
	
	//base class changes
	

}
