package com.MavenFirstProject;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;

import com.demo.TestBase;

public class Demo1 extends TestBase {

	public static String getScreenshot(WebDriver driver, String screenshotName) throws IOException{
		String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		// after execution, you could see a folder "FailedTestsScreenshots"
		// under src folder
		System.out.println("inside screenshot");
		String destination = System.getProperty("user.dir") + "/FailedTestsScreenshots/" + screenshotName + dateName+".jpg";
		File finalDestination = new File(destination);
		FileUtils.copyFile(source, finalDestination);
		return destination;
	}
	
	@BeforeSuite
	public void setUp(){
		initialization();
	}
	
}
