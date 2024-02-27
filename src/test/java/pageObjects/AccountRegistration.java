package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistration extends BasePage {

	public AccountRegistration(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath="//input[@id=\"gender-female\"]")
	WebElement btnRadio;
	
	@FindBy(xpath="//input[@id=\"FirstName\"]")
	WebElement txtfirstname;
	
	@FindBy(xpath="//input[@id=\"LastName\"]")
	WebElement txtLastname;
	
	@FindBy(xpath="//input[@id=\"Email\"]")
	WebElement txtEmail;
	
	@FindBy(xpath="//input[@id=\"Password\"]")
	WebElement txtPassword;
	
	@FindBy(xpath="//input[@type=\"password\" and @id=\"ConfirmPassword\"]")
	WebElement txtonfirmPassword;
	
	@FindBy(xpath="//button[@id='register-button']")
	WebElement btnSubmit;
	
	@FindBy(xpath="//div[@class=\"result\"]")
	WebElement msgConfirmation;
	
	public void clickButton()
	{
		btnRadio.click();
	}
	
	public void setFirstName(String fname)
	{
		txtfirstname.sendKeys(fname);	
	}
	
	public void setLastName(String lname)
	{
		txtLastname.sendKeys(lname);	
	}
		
	public void setEmail1(String mail) {
		// TODO Auto-generated method stub
		txtEmail.sendKeys(mail);
		
	}
	
	public void setPassword(String paswd)
	{
		txtPassword.sendKeys(paswd);	
	}
	
	public void setConfirmation(String paswd)
	{
		txtonfirmPassword.sendKeys(paswd);	
	}
	public void submitButton (){
		
		btnSubmit.submit();
		
	}
 
	
	public String setmsgconfirm()
	{
		try {
			return(msgConfirmation.getText());
		}catch(Exception e) {
			return(e.getMessage());
		}
	}

	

	

	
}
