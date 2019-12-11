package com.test.UIAutomation.homepage;

import org.testng.ITestListener;
import org.testng.ITestResult;

import com.test.UIAutomationTestBase.BaseTest;

public class CustomListener extends BaseTest implements ITestListener{
	
	 public void onTestStart(ITestResult arg0) {					
	        // TODO Auto-generated method stub				
	        		
	    }		
    public void onStart(ITestResult arg0) {					
        // TODO Auto-generated method stub				
        		
    }		
    public void onTestFailure(ITestResult arg0) {					
       System.out.println("Failed Test");
       takeScreenShot("LoginPage Test");
        		
    }		
    public void onTestSkipped(ITestResult arg0) {					
        // TODO Auto-generated method stub				
        		
    }		
    public void onTestSuccess(ITestResult arg0) {					
        // TODO Auto-generated method stub				
        		
    }			
	
}
