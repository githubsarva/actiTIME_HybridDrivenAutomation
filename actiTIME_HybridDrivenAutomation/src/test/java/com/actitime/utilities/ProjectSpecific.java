package com.actitime.utilities;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

public class ProjectSpecific  {
	
	public static WebDriver driver= null;


	ProjectSpecific(WebDriver driver){
		this.driver = driver;
	}
	
	public void navigatetestURL(){
	
		driver.get("http://localhost/login.do");
	}
	
	public void verifyErrorMsg(String ev)
	{
		String av=driver.findElement(By.className("errormsg")).getText();
		if(av.equals(ev))
		{
			Reporter.log("Verify Error Message:Pass:Error message is " + av, true);
		}
		else
		{
			String msg="Verify Error Message:Fail:\n Actual Message is " + av +"\n Expected message" + ev;
			Reporter.log(msg,true);
		}
	}
	
	public void verifySuccessMsg(String ev){
		String av= driver.findElement(By.className("successmsg")).getText();
		if(av.equals(ev))
		{
			Reporter.log("Verify Error Message:Pass:Error message is " + av, true);
		}
		else
		{
			String msg="Verify Error Message:Fail:\n Actual Message is " + av +"\n Expected message" + ev;
			Reporter.log(msg,true);
		}
	}

	public void verifySuccessContainsMsg(String ev){
		String av = driver.findElement(By.className("successmsg")).getText();
		if(av.contains(ev)){
			Reporter.log("Verify Error Message:Pass:Error message is " + av, true);
		}else
		{
			String msg="Verify Error Message:Fail:\n Actual Message is " + av +"\n Expected message" + ev;
			Reporter.log(msg,true);
		
			
		}
	
	

}
}