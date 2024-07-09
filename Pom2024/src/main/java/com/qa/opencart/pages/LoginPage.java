package com.qa.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	private WebDriver driver;
	
	//1. Private by locators:
	private By emailId = By.id("input-email");
	private By password = By.id("input-password");
	private By logninBtn = By.xpath("//button[@type='submit']");
	private By forgotPwd = By.linkText("Forgotten Password");
	
	//2. public page constructor
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		
	}
	
	//3. public page actions:

	public String getLoginPageTitle() {
		return driver.getTitle();
	}
	
	public String getLoginPageUrl() {
		return driver.getCurrentUrl();
	}
	
	public boolean isForgotPwdLinkExist() {
		return driver.findElement(forgotPwd).isDisplayed();
	
	}
	
	public void doLogin(String un, String pwd) {
		driver.findElement(emailId).sendKeys(un);
		driver.findElement(password).sendKeys(pwd);
		driver.findElement(logninBtn).click();
	}
	
	
	
}
