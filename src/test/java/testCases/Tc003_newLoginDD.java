package testCases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import TestBase.BaseClass;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;

public class Tc003_newLoginDD  extends BaseClass{

	
	@Test(dataProvider="LoginData",dataProviderClass=DataProvider.class)
	public void verify_loginDDT(String email,String password,String exp)
	{
		logger.info("this will verify");
		logger.debug("this will goging to debug");
		HomePage hp=new HomePage(driver);
		logger.info("we clicked on my login link");
		hp.clickLogin();
		
		LoginPage lp=new LoginPage(driver);
		lp.setEmail(email);
		lp.setPassword(password);
		lp.clickLogin();
		
		//MyAccountPage macc =new MyAccountPage(driver);
		//boolean targetPage=macc.isMyAccountPageExists();
		if(exp.equalsIgnoreCase("valid"))
		{
		
		}
		
	}
}
