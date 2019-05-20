package POM_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginData {


//declare the elements
	
@FindBy(id="email")
WebElement unTB;
@FindBy(id="pass")
WebElement pwdTB;	
@FindBy(id="u_0_2")
WebElement clickLoginBtn;

public void setUsername(String un){
	unTB.sendKeys(un);	
}
public void setPassword(String pwd){
	pwdTB.sendKeys(pwd);
	}
public void clickLogin() {
	clickLoginBtn.click();
}



//initialize the elements
public LoginData(WebDriver driver){

	PageFactory.initElements(driver, this);
}


	
	
	
	
	
	
}
