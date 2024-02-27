package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
		@FindBy(xpath="//a[@class=\"ico-register\"]")
		WebElement lnkResgister;
		@FindBy(xpath="//a[@class=\"ico-login\"]")
		WebElement linkLogin;
		
		public void clickRegister()
		{
			lnkResgister.click();
		}
	
		public void clickLogin() {
			// TODO Auto-generated method stub
			linkLogin.click();
		}
}
