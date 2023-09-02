package com.Repository;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utils {
	public static String captureScreen(WebDriver driver,String filename) throws IOException {
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		String s="C:\\Users\\satate\\eclipse_workspace_3\\SeleniumTraining\\SeleniumCodes\\RepoScreenshot"+filename+".png";
		File dest=new File(s);
		FileUtils.copyFile(src, dest);
		return s;
	}

}
