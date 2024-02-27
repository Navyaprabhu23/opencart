package testCases;

import org.testng.annotations.Test;

import TestBase.BaseClass;
import junit.framework.Assert;
import pageObjects.HomePage;
import pageObjects.LoginPage;

public class Tc_002_loginPage extends BaseClass{
	@Test(groups= {"sanity","master"})
	public void verify_login()
	{
		logger.info("this will verify");
		logger.debug("this will goging to debug");
		try {HomePage hp=new HomePage(driver);
		logger.info("we clicked on my login link");
		hp.clickLogin();
		
		LoginPage lp=new LoginPage(driver);
		lp.setEmail(p.getProperty("email"));
		lp.setPassword(p.getProperty("password"));
		lp.clickLogin();
		

		} catch(Exception e)
		{
		}
		
	}

}
