package com.MavenFirstProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.demo.DashboardPage;
import com.demo.LoginPage;
import com.demo.TestBase;

public class LoginTest  extends TestBase{
	
	
	@BeforeSuite
	public void setUp(){
		initialization();
		lp = new LoginPage(driver);
	}
	
	
	@Test
	public void logoTest(){
		Assert.assertTrue(lp.verifyLogo());
	}

	@Test
	public void test() {
		// @Test(priority = 1)
		dp=lp.validLogin();
		Assert.assertEquals(driver.getTitle(), "JavaByKiran | Dashboard");	
	}
	
		
	
}
