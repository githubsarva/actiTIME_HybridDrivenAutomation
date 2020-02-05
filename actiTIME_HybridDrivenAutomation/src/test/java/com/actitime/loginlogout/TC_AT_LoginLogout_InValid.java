package com.actitime.loginlogout;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.actitime.pageObjects.AT_LoginLogout_Valid;
import com.actitime.utilities.Config;

public class TC_AT_LoginLogout_InValid extends Config{
	@Test
	public void TC_AT_LoginLogout_InValid_Test() throws InterruptedException{
		ps.navigatetestURL();
		lo = new AT_LoginLogout_Valid(driver);
			lo.setusername("add");
		lo.setPassword("lll");
		lo.login();
		
		String s= driver.findElement(By.className("errormsg")).getText();
		System.out.println(s);
		ps.verifyErrorMsg("Username or Password is invalid. Please try again.");
		
	}

}
