package com.test.UIAutomation.homepage;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;
import com.test.UIAutomation.Actions.HomePage;
import com.test.UIAutomation.Actions.LoginPage;
import com.test.UIAutomationTestBase.BaseTest;

@Listeners(CustomListener.class)

public class TC101_VerifyLoginPage extends BaseTest{
	
	LoginPage objLoginpage;
	HomePage objHomePage;
	
	public static final Logger log=Logger.getLogger(TC101_VerifyLoginPage.class);
	
	@BeforeClass
	public void setup() throws IOException
	{
		OpenApplication();
		
	}
	
	@Test
	public void verifyValidLogin()
	{
		//Create Login Page object
		log.info("starting tescase");
		
		objLoginpage=new LoginPage(driver);
		//Verify login page title

	    String loginPageTitle = objLoginpage.getLoginTitle();
	    takeScreenShot("LoginPage");

	    Assert.assertTrue(loginPageTitle.toLowerCase().contains("guru99 bank"));
	    log.info("verifying page Title");

	    //login to application

	    objLoginpage.loginToGuru99("mgr123", "mgr!23");
	    log.info("Enter username and password");
	    // go the next page
	    
	  //Create Home Page object

	    objHomePage = new HomePage(driver);

	    //Verify home page
	  
	    Assert.assertTrue(objHomePage.getHomePageDashboardUserName().toLowerCase().contains("manger id : mgr123"));
	    System.out.println("Test passed");
	    //takeScreenShot("LoginTest");
	    
	}
	
	@AfterTest
	 public void endTest(){
		closeApplication();
	 }
	
}

	


