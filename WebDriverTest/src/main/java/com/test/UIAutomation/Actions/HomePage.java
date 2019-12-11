package com.test.UIAutomation.Actions;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.log4testng.Logger;

import com.test.UIAutomationTestBase.BaseTest;


public class HomePage extends BaseTest{
	

	//public static final Loggers log = Logger.getLogger(HomePage.class.getName());
	
	WebDriver driver;
	public static final Logger log=Logger.getLogger(HomePage.class);

    By homePageUserName = By.xpath("//table//tr[@class='heading3']");

    

    public HomePage(WebDriver driver){

        this.driver = driver;

    }

    //Get the User name from Home Page

        public String getHomePageDashboardUserName(){

        	return driver.findElement(homePageUserName).getText();
       
        }

}

	


