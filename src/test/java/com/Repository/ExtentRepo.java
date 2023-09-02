package com.Repository;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtentRepo {
	WebDriver driver=null;
	ExtentTest test;
	ExtentReports report;
	
	@Test
	public void verifyTitle() {
	report= new ExtentReports("C:\\Reports\\LogReport.html");
	test=report.startTest("VerifyBlogTitle");
	WebDriverManager.edgedriver().setup();
	driver =new EdgeDriver();
	
	test.log(LogStatus.INFO, "Browser started");
	driver.get("https://www.google.com/");
	test.log(LogStatus.INFO, "Application is up & running");
	
	driver.manage().window().maximize();
	String title = driver.getTitle();
	Assert.assertTrue(title.contains("Google"));
	test.log(LogStatus.PASS, "Title Verified");
	}
	
	@AfterMethod
	public void teardown(ITestResult result) throws IOException {
		if(result.getStatus()==ITestResult.FAILURE) {
			String screen=Utils.captureScreen(driver,result.getName());
			String image=test.addScreenCapture(screen);
			test.log(LogStatus.FAIL,"Title verification failed" , image);
		}
	report.endTest(test);
	report.flush();
	
	driver.get("C:\\Reports\\LogReport.html");
    }
}
