package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage {
	public MyAccountPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath="//a[@class=\"ico-logout\"]")
	WebElement lnkLogout;
	//@FindBy(xpath = "//a[@class='ico-login']")
	//WebElement lnkLogin;
	

	/*public void clickLogin() {
		lnkLogin.click();

	}*/
	public void clickLogout() {
		lnkLogout.click();

	}


	
}

