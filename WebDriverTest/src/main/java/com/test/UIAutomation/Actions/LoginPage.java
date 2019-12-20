package com.test.UIAutomation.Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import com.test.UIAutomationTestBase.BaseTest;

public class LoginPage extends BaseTest{

	//WebDriver driver;
	WebDriver driver;

    By user99GuruName = By.name("uid");

    By password99Guru = By.name("password");

    By titleText =By.className("barone");

    By login = By.name("btnLogin");

    public LoginPage(WebDriver driver){

        this.driver = driver;

    }

    //Set user name in textbox

    public void setUserName(String strUserName){

        driver.findElement(user99GuruName).sendKeys(strUserName);
        log.info("enter username");

    }

    //Set password in password textbox

    public void setPassword(String strPassword){

         driver.findElement(password99Guru).sendKeys(strPassword);
         log.info("enter password");
    }

    //Click on login button

    public void clickLogin(){

            driver.findElement(login).click();

    }

    //Get the title of Login Page

    public String getLoginTitle(){

     return    driver.findElement(titleText).getText();

    }
    /**

     * This POM method will be exposed in test case to login in the application

     * @param strUserName

     * @param strPasword

     * @return

     */
    public void loginToGuru99(String strUserName,String strPasword){

        //Fill user name

        this.setUserName(strUserName);

        //Fill password

        this.setPassword(strPasword);

        //Click Login button

        this.clickLogin();        
    }

}
	
	