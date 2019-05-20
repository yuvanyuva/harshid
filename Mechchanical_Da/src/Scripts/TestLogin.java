package Scripts;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import Generics.Basetest;
import POM_pages.LoginData;
public class TestLogin extends Basetest {
	@Test
	public static void loginActiTime(WebDriver driver) {
	
		LoginData lp =new LoginData(driver);
		lp.setUsername("rajyuva.raj07mail.com");
		lp.setPassword("yuvanyuva");
		lp.clickLogin();
	}

}
