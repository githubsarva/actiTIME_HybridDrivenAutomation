package com.actitime.pageObjects;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AT_LoginLogout_Valid {
	
	public WebDriver ldriver;
	public AT_LoginLogout_Valid(WebDriver rdriver){
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	
	@FindBy(xpath="//input[@name='username']")
	WebElement username;
	

	@FindBy(xpath="//input[@name='pwd']")
	WebElement password;
	
	@FindBy(id="loginButton")
	WebElement login;
	

	@FindBy(id="logoutLink")
	WebElement logout;
	public void setusername(String uname) throws InterruptedException{
		Thread.sleep(3000);
		username.sendKeys(uname);
	}
	
	public void setPassword(String pwd){
		password.sendKeys(pwd);
	}
	
	public void login() throws InterruptedException{
		Thread.sleep(5000);
		
		login.click();
	}
	
	public void logout() throws InterruptedException{
		
		Thread.sleep(5000);
		logout.click();
	}

}
