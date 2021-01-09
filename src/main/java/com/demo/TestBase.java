package com.demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.demo.DashboardPage;
import com.demo.LoginPage;

public class TestBase {
	
	public static WebDriver driver;
	public static LoginPage lp = null;
	public static DashboardPage dp = null;
	
	public static void initialization(){
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("file:///E:/java/java/Offline%20website/index.html");
	}

}
