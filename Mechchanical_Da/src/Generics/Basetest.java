package Generics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Basetest implements IAutoConstant{
	WebDriver driver;
	@BeforeMethod   
	public void openApp() throws InterruptedException {
		System.setProperty(Chrome_Key, Chrome_Path);
		driver=new ChromeDriver(); 
//		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		}
	
@AfterMethod
public void closeApp(WebDriver driver,ITestResult result){
	
    driver.close();	
    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	




}