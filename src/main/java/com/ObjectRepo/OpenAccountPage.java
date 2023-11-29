package com.ObjectRepo;

import java.awt.AWTException;

import javax.print.DocFlavor.STRING;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.bixi.GenericUtilitls.WebDriverUtils;

public class OpenAccountPage {
	WebDriverUtils wlib = new WebDriverUtils();

	@FindBy(name = "name")
	private WebElement nameTf;

	@FindBy(name = "gender")
	private WebElement genderDD;

	@FindBy(name = "mobile")
	private WebElement mobTf;

	@FindBy(name = "email")
	private WebElement emailTf;

	@FindBy(name = "landline")
	private WebElement landlineTf;

	@FindBy(name = "dob")
	private WebElement dobTf;

	@FindBy(name = "pan_no")
	private WebElement panTf;

	@FindBy(name = "citizenship")
	private WebElement citizenshipTf;

	@FindBy(name = "homeaddrs")
	private WebElement homeTf;

	@FindBy(name = "officeaddrs")
	private WebElement officeTf;

	@FindBy(name = "country")
	private WebElement countryTf;

	@FindBy(name = "state")
	private WebElement stateDD;

	@FindBy(name = "city")
	private WebElement cityDD;

	@FindBy(name = "pin")
	private WebElement pinTf;

	@FindBy(name = "arealoc")
	private WebElement areaTf;

	@FindBy(name = "nominee_name")
	private WebElement nomineeTf;

	@FindBy(name = "nominee_ac_no")
	private WebElement nomineeAcNoTf;

	@FindBy(name = "acctype")
	private WebElement acctypeDD;

	@FindBy(name = "submit")
	private WebElement submitBtn;

	// inialization
	public OpenAccountPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
//utilization 

	public WebElement getNameTf() {
		return nameTf;
	}

	public WebElement getGenderTf() {
		return genderDD;
	}

	public WebElement getMobTf() {
		return mobTf;
	}

	public WebElement getEmailTf() {
		return emailTf;
	}

	public WebElement getLandlineTf() {
		return landlineTf;
	}

	public WebElement getDobTf() {
		return dobTf;
	}

	public WebElement getPanTf() {
		return panTf;
	}

	public WebElement getCitizenshipTf() {
		return citizenshipTf;
	}

	public WebElement getHomeTf() {
		return homeTf;
	}

	public WebElement getOfficeTf() {
		return officeTf;
	}

	public WebElement getCountryTf() {
		return countryTf;
	}

	public WebElement getGenderDD() {
		return genderDD;
	}

	public WebElement getStateDD() {
		return stateDD;
	}

	public WebElement getCityDD() {
		return cityDD;
	}

	public void setAcctypeDD(WebElement acctypeDD) {
		this.acctypeDD = acctypeDD;
	}

	public WebElement getPinTf() {
		return pinTf;
	}

	public WebElement getAreaTf() {
		return areaTf;
	}

	public WebElement getNomineeTf() {
		return nomineeTf;
	}

	public WebElement getNomineeAcNoTf() {
		return nomineeAcNoTf;
	}

	public WebElement getSubmitBtn() {
		return submitBtn;

	}

	// business logic
	public void SENDKEYS_OA_Textfield(String NAME, String MOB, String EMAIL, String LANDLINE, String PAN,
			String CITIZEN, String HOME, String OFFICE, String PIN, String AREA, String NOMINEE, String NOMINEEACNO) {

		nameTf.sendKeys(NAME);
		mobTf.sendKeys(MOB);
		emailTf.sendKeys(EMAIL);
		landlineTf.sendKeys(LANDLINE);
		panTf.sendKeys(PAN);
		citizenshipTf.sendKeys(CITIZEN);
		homeTf.sendKeys(HOME);
		officeTf.sendKeys(OFFICE);

		pinTf.sendKeys(PIN);
		areaTf.sendKeys(AREA);
		nomineeTf.sendKeys(NOMINEE);
		nomineeAcNoTf.sendKeys(NOMINEEACNO);
		
		

	}

	public void openAccount_Dropdown(String GENDER, String STATE, String CITY, String ACCTYPE) {
		Select s1 = new Select(genderDD);
		s1.selectByVisibleText(GENDER);

		Select s2 = new Select(stateDD);
		s2.selectByVisibleText(STATE);

		Select s3= new Select(cityDD);
		s3.selectByVisibleText(CITY);

		Select s4= new Select(acctypeDD);
		s4.selectByVisibleText(ACCTYPE);
	}
	

	
	public void sendkeys_date(String DOB)
	{
		dobTf.sendKeys(DOB);
	}
	

}
