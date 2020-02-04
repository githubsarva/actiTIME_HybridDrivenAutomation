package com.actitime.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.actitime.pageObjects.AT_LoginLogout_Valid;
import com.actitime.testCases.TC_AT_LoginLogout_Valid;



/*import com.actiTIME.libraries.ProjectSpecific;*/

public class Config {

	public static WebDriver driver = null;
	public static ProjectSpecific ps = null;
	
	public AT_LoginLogout_Valid lo;
	
	
	@BeforeSuite
	public void preCondition(){
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"./Drivers/chromedriver.exe");
driver= new ChromeDriver();
driver.manage().window().maximize();

ps=new ProjectSpecific(driver);
	}
	
	
	@AfterSuite
	public void afterSuiteMethod(){
		driver.quit();
	}

}
