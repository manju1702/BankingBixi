package com.ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bixi.GenericUtilitls.WebDriverUtils;

public class HomePage extends WebDriverUtils
{
	//declaration
	@FindBy(xpath="//a[text()='Staff Login']")
	private WebElement staffLoginLink;
	
	@FindBy(xpath="//li[text()='Open Account']")
	private WebElement openAccountLink;
	
	@FindBy(xpath="//a[contains(.,'Internet Banking')]")
	private WebElement internetBankingLink;
	
	@FindBy(xpath="//li[text()='Login ']")
private WebElement internetBankingLoginLink;
	
	@FindBy(xpath="//li[text()='Register']")
	private WebElement internetBankingRegisterLink;
	
	@FindBy(xpath="//li[text()='Apply Debit Card']")
	private WebElement applyForDebitCardLink;
	
	@FindBy(xpath="//li[text()='Fund Transfer']")
	private WebElement fundTransferLink;
	
	//initialization
	public HomePage(WebDriver driver) 
	{
		PageFactory.initElements(driver,this);
	}
	//utilization

	public WebElement getStaffLoginLink() {
		return staffLoginLink;
	}

	public WebElement getOpenAccountLink() {
		return openAccountLink;
	}

	public WebElement getInternetBankingLink() {
		return internetBankingLink;
	}

	public WebElement getInternetBankingLoginLink() {
		return internetBankingLoginLink;
	}

	public WebElement getInternetBankingRegisterLink() {
		return internetBankingRegisterLink;
	}

	public WebElement getApplyForDebitCardLink() {
		return applyForDebitCardLink;
	}

	public WebElement getFundTransferLink() {
		return fundTransferLink;
	}
	
	//Business Logic
	public void click_stafflogin()
	{
		staffLoginLink.click();
	}
	public void click_openAccount()
	{
		openAccountLink.click();
	}
	public void click_applyForDebitCard()
	{
		applyForDebitCardLink.click();
	}
	
	public void mousehower_InternetBankingLink(WebDriver driver)
	{
		
		moveToElement(driver, internetBankingLink);
		moveToElement(driver, internetBankingRegisterLink);
		//internetBankingRegisterLink.click();
	}
	public void right_click(WebDriver driver) throws Throwable
	{
		contextClick(driver,internetBankingRegisterLink );
		keyPressTab(driver);
		
	}
	public void scrollThePage(WebDriver driver)
	{
		scrollBy(driver, 0, 500);
	}
	public void windowHandle(WebDriver driver)
	{
		multipleWndowHandle(driver);
	}
}
