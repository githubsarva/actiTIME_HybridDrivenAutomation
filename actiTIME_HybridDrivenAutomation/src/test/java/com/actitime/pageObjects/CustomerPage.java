package com.actitime.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomerPage {
	
	public WebDriver ldriver;
	public CustomerPage(WebDriver rdriver){
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//a[@class='content tasks']//following-sibling::img")
	WebElement Tasks;
	
	@FindBy(linkText="Projects & Customers")
	WebElement ProjectCustomers;
	
	@FindBy(xpath="//span[text()='Create Customer']")
	WebElement clickCreateCustomer;
	
     @FindBy(xpath="//input[@name='name']")
     WebElement CustomerName;
     
     @FindBy(xpath="//input[@type='submit']")
     WebElement Submit;
     
     @FindBy(xpath="//a[text()='SVD']")
     WebElement ChooseCustomer;
     
     @FindBy(xpath="//input[@value='Delete This Customer']")
     WebElement delete;
     
     public void clickOpenTasks(){
    	 Tasks.click();
     }
     
     public void clickProjectsCustomers(){
    	 ProjectCustomers.click();
     }
     

     public void clickCreateCusstomer(){
    	 clickCreateCustomer.click();
     }
     
     public void enterCustomerNmae(String name){
    	 CustomerName.sendKeys(name);
     }
     public void submit(){
    	 Submit.click();
     }
public void choosecustomer(){
	ChooseCustomer.click();
}

public void deletecustomer() throws InterruptedException{
	delete.click();
	Thread.sleep(5000);
}
}

