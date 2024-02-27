package testCases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import TestBase.BaseClass;
import junit.framework.Assert;
import pageObjects.AccountRegistration;
import pageObjects.HomePage;

public class Tc_001_AccountRegistration extends BaseClass {
//static WebElement driver;
	
 @Test(groups={"regression","master"})
 public void verify_acc_registration() 
 {
	 
	 logger.info("**** starting Tc_001_AccountRegistration ****");
	 
	 logger.debug("application logs..");
	 try {
	 HomePage hp=new HomePage(driver);
	
	 hp.clickRegister();
	 logger.info("clikced on registration link");
	 
	 logger.info("providing customer information");
	 AccountRegistration ap=new  AccountRegistration(driver);
	// ap.setubutn();
	 ap.setFirstName(randomeString().toUpperCase());
	 ap.setLastName(randomeString().toUpperCase());
	 ap.setEmail1(randomeString()+"@gmail.com");
	 
	 logger.info("confirming password");
	 String password=randomAlphanumeric();
	 ap.setPassword(password);
	 logger.info("confirming message");
	 ap.setConfirmation(password);
	 
	 ap.submitButton();
	 }
	 catch(Exception e)
	 {
		 logger.error("test failed");
	 }
	logger.info("logging of from page");
  } 
	
	
}
