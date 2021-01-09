package com.demo;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demo.TestBase;

public class DashboardPage extends TestBase {

	
	public DashboardPage(WebDriver driver){
		DashboardPage.driver = driver;
		PageFactory.initElements(driver, this);
	}
		@FindBy(xpath="//h1")
		private WebElement pageHeader;
		
		@FindBy(xpath="//h3")
		private List<WebElement> courseseNames;
	
	
		public void verifyCource()
		{
			for (WebElement element : courseseNames){
				element.isDisplayed();
			}
		}
}
