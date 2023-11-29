package com.ObjectRepo;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bixi.GenericUtilitls.WebDriverUtils;

public class IB_RegisterPage 
{
	//declaration
	@FindBy(name="holder_name")
	private WebElement acHolderNameTf;
	
	@FindBy(name="accnum")
	private WebElement acNoTf;
	
	@FindBy(name="dbtcard")
	private WebElement dbtCardTf;
	
	@FindBy(name="dbtpin")
	private WebElement dbtPinTf;
	
	@FindBy(name="mobile")
	private WebElement mobNoTf;
	
	@FindBy(name="pan_no")
	private WebElement panNoTf;
	
	@FindBy(name="dob")
	private WebElement dobTf;
	
	@FindBy(name="last_trans")
	private WebElement lt_Tf;
	
	@FindBy(name="password")
	private WebElement powTf;
	
	@FindBy(xpath = "//input[@name='cnfrm_password']")
	private WebElement cpwdTf;
	
	@FindBy(name="submit")
	private WebElement submit_Btn;
	
	//initialization
	public  IB_RegisterPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
	//utilization

	public WebElement getAcHolderNameTf() {
		return acHolderNameTf;
	}

	public WebElement getAcNoTf() {
		return acNoTf;
	}

	public WebElement getDbtCardTf() {
		return dbtCardTf;
	}

	public WebElement getDbtPinTf() {
		return dbtPinTf;
	}

	public WebElement getMobNoTf() {
		return mobNoTf;
	}

	public WebElement getPanNoTf() {
		return panNoTf;
	}

	public WebElement getDobTf() {
		return dobTf;
	}

	public WebElement getLt_Tf() {
		return lt_Tf;
	}

	public WebElement getPowTf() {
		return powTf;
	}

	public WebElement getCpwdTf() {
		return cpwdTf;
	}

	public WebElement getSubmit_Btn() {
		return submit_Btn;
	}
	
	//BUSINESS LOGIC
public void sendkey_IBREGISTER(String ACH,String ACNO,String DBNO,String PIN,String MOB,String PAN,String LAST,String PWD,String CPWD )
{
	acHolderNameTf.sendKeys(ACH);
	acNoTf.sendKeys(ACNO);
	dbtCardTf.sendKeys(DBNO);
	dbtPinTf.sendKeys(PIN);
	mobNoTf.sendKeys(MOB);
	panNoTf.sendKeys(PAN);
	lt_Tf.sendKeys(LAST);
	powTf.sendKeys(PWD);
	cpwdTf.sendKeys(CPWD);
	
}
public void IB_REGISTER_datePopup(WebDriver driver) throws AWTException
{
	WebDriverUtils wlib = new WebDriverUtils();
	wlib.keyPress_0();
	wlib.keyPress_1();
	wlib.keyPress_tab();
	wlib.keyPress_0();
	wlib.keyPress_9();
	wlib.keyPress_tab();
	wlib.keyPress_1();
	wlib.keyPress_9();
	wlib.keyPress_9();
	wlib.keyPress_9();
	
	
}
	
	
	
	
	

}
