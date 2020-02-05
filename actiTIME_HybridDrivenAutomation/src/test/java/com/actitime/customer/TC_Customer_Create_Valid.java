package com.actitime.customer;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.actitime.pageObjects.AT_LoginLogout_Valid;
import com.actitime.pageObjects.CustomerPage;
import com.actitime.utilities.Config;

public class TC_Customer_Create_Valid extends Config {

	@Test
	public void TC_Customer_Create_Valid_Test() throws InterruptedException{
		
		ps.navigatetestURL();
		lo= new AT_LoginLogout_Valid(driver);
		lo.setusername("admin");
		lo.setPassword("manager");
		lo.login();
		
		cp= new CustomerPage(driver);
		cp.clickOpenTasks();
		cp.clickProjectsCustomers();
		cp.clickCreateCusstomer();
		cp.enterCustomerNmae("SVD");
		cp.submit();
		
		ps.verifySuccessContainsMsg("SVD");
		
		cp.choosecustomer();
		cp.deletecustomer();
		WebElement textbox = driver.findElement(By.id("deleteButton"));
		textbox.sendKeys(Keys.ENTER);
		ps.verifySuccessContainsMsg("Customer has been successfully deleted.");
		lo.logout();
		
		
	}
}
