package com.MavenFirstProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.demo.LoginPage;
import com.demo.TestBase;

public class Demo extends TestBase{
	
//	public static String getScreenshot(WebDriver driver, String screenshotName){
//		
//		String dateName = new SimpleDataFormat ("");
//		
//	}
	// public static WebDriver driver;
	@Test
	public void test() {
		//	@Test(priority = 1)
		
			//WebDriver driver = new FirefoxDriver();
			driver.get("file:///E:/java/java/Offline%20website/index.html");
//			WebElement username = driver.findElement(By.id("email"));
//			username.sendKeys("kiran@gmail.com");
//			WebElement password = driver.findElement(By.id("password"));
//			password.sendKeys("123456");
			//driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		//	driver.findElement(By.id("password")).sendKeys("123");		
//			WebElement submit1 = driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button"));
//			submit1.click();
//			
//			Assert.assertEquals(driver.getTitle(), "JavaByKiran | Dashboard");
		///////// 1st code optimaztion
//			LoginPage lp = new LoginPage();
//			
//			WebElement uname = lp.unameTextBox(driver);
//			
//			lp.enterText(uname, "kiran@gmail.com");
//			lp.enterText(lp.passTextBox(driver), "12345");
//			
//			lp.clickbutton(lp.loginButton(driver));
//			Assert.assertEquals(driver.getTitle(), "JavaByKiran | Dashboard");
			
			
			
	
	}
	
		
}
