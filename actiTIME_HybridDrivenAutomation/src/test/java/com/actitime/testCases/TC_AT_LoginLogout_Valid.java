package com.actitime.testCases;



import org.testng.annotations.Test;

import com.actitime.pageObjects.AT_LoginLogout_Valid;
import com.actitime.utilities.Config;

import junit.framework.Assert;

@Test
public class TC_AT_LoginLogout_Valid extends Config {
	
	
	
	public void TC_AT_LoginLogout_ValidTest() throws InterruptedException{
		ps.navigatetestURL();
		lo = new AT_LoginLogout_Valid(driver);
		lo.setusername("admin");
		lo.setPassword("manager");
		lo.login();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		if(driver.getTitle().equals("actiTIME - Enter Time-Track")){
			Assert.assertTrue(true);
		}else{
			Assert.assertTrue(false);
		}
		
		lo.logout();
	}
}
