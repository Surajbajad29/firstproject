package com.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demo.TestBase;

public class LoginPage extends TestBase{
	
	

//	public LoginPage(WebDriver driver) {		this.driver = driver;//	}
//	private  WebElement unameTextBox() {		return driver.findElement(By.id("email"));}
//	private  WebElement passTextBox() {	return driver.findElement(By.id("password"));	}
//	private  WebElement loginButton() {		return driver.findElement(By.xpath("//button"));//	}
///	public void enterusername(String text)	{		unameTextBox().sendKeys(text);	}
//	public void enterPassword(String text){		passTextBox().sendKeys(text);	}
//	public void click(){		loginButton().click();	}
	
	//Using Page handler
	
	public LoginPage(WebDriver driver){
		LoginPage.driver = driver;
		PageFactory.initElements(driver, this);
	}
		@FindBy(id="email")
		private WebElement unameTextBox;
		
		@FindBy(id="password")
		private WebElement passTextBox;
		
		@FindBy(xpath="//button")
		private WebElement loginButton;
		
		@FindBy(xpath="//img")
		private WebElement logo;
		
		public void enterUsername(String text)
		{
			unameTextBox.sendKeys(text);
		}
		
		public void enterPassword(String text){
			passTextBox.sendKeys(text);
		}
		
		public void click(){
			loginButton.click();
		}
	
		public boolean verifyLogo(){
			return logo.isDisplayed();
		}
	
		public DashboardPage validLogin(){
		enterUsername("kiran@gmail.com");
		enterPassword("123456");
		click();
		return new DashboardPage (driver);
	}
}
