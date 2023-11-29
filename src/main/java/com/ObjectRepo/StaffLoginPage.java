package com.ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StaffLoginPage 
{
	//declaration
	@FindBy(name="staff_id")
	private WebElement unTf;
	
	@FindBy(name="password")
	private WebElement pwdTf;
	
	@FindBy(name="staff_login-btn")
	private WebElement loginbtn;

	//initialization
	public StaffLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	//utilization

	public WebElement getUnTf() {
		return unTf;
	}

	public WebElement getPwdTf() {
		return pwdTf;
	}

	public WebElement getLoginbtn() {
		return loginbtn;
	}
	
//business logic
	public void loginAsStaff(String UN, String PWD)
	{
		unTf.sendKeys(UN);
		pwdTf.sendKeys(PWD);
		loginbtn.click();
	}
	
}
