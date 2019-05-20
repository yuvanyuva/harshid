package Scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fbTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pc\\eclipse-workspace\\Mechchanical_Da\\src\\Scripts\\fbTest.java");
WebDriver driver =new ChromeDriver();

driver.get("http://www.facebook.com");
Thread.sleep(2000);
WebElement unTB = driver.findElement(By.id("email"));
WebElement pwdTB = driver.findElement(By.id("pass"));
WebElement loginBtn = driver.findElement(By.id("u_0_2"));
Thread.sleep(2000);
driver.close();




















	}

}
