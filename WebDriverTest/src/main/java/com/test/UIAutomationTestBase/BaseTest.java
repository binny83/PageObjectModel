package com.test.UIAutomationTestBase;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.log4testng.Logger;
import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;


public class BaseTest {

	
	public WebDriver driver;
	String url="http://demo.guru99.com/V4/";
	public static final Logger log=Logger.getLogger(BaseTest.class);

	public void OpenApplication()throws IOException{

		System.setProperty("webdriver.chrome.driver","//Users//bpat12//Downloads//chromedriver");
		log.warn("creating object of browser");
		driver = new ChromeDriver();
		log.debug("launch chrome browser");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        driver.get(url);
       
        log.debug("launch application url");
        driver.manage().deleteAllCookies();
        
    }
	public void closeApplication() {
		
		driver.quit();
	}
	
	public void takeScreenShot(String fileName){
		//Take screenshot and store as file format
		File src=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		//now copy the screenshot to desired location using copyFile//method
		try {
		  File dest=new File("/Users/bpat12/eclipse-workspace/WebDriverTest/test-output/" + fileName +".png");
		  FileUtils.copyFile(src,dest);
	}catch(IOException e) {
		e.printStackTrace();
	}
}
}

