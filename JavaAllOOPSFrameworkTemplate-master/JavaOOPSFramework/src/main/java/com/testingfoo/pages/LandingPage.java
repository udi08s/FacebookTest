package com.testingfoo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class LandingPage extends BasePage {
	
	
	//Page Locator
	
	private By firstNameInputField=By.xpath("//input[@name='firstname' and contains(@class,'inputtext')]");
	private By lastNameInputField=By.xpath("//input[@name='lastname' and contains(@class,'inputtext')]");
	private By phoneOrEmailIDInputField=By.xpath("//input[@name='reg_email__' and contains(@class,'inputtext')]");
	private By reEnterMailIDInputField=By.xpath("//input[@name='reg_email_confirmation__' and contains(@class,'inputtext')]");
	private By newPasswordInputField=By.xpath("//input[@name='reg_passwd__' and contains(@class,'inputtext')]");
	
	private By dropDownDays=By.xpath(".//*[@id='day']");
	private By dropDownMonths=By.xpath(".//*[@id='month']");
	private By dropDownYears=By.xpath(".//*[@id='year']");
	
	private By genderMaleRadioBtn=By.xpath("//input[@name='sex' and @value='2']");
	private By genderFemaleRadioBtn=By.xpath("//input[@name='sex' and @value='1']");
	
	private By signUpBtn=By.xpath("//button[@name='websubmit' and contains(@class,'_6j')]");
	
	

	/**
	 * @return the signUpBtn
	 */
	public WebElement getSignUpBtn() {
		return getElement(signUpBtn);
	}




	/**
	 * @return the genderMaleRadioBtn
	 */
	public WebElement getGenderMaleRadioBtn() {
		return getElement(genderMaleRadioBtn);
	}


	/**
	 * @return the genderFemaleRadioBtn
	 */
	public WebElement getGenderFemaleRadioBtn() {
		return getElement(genderFemaleRadioBtn);
	}


	/**
	 * @return the dropDownDays
	 */
	public WebElement getDropDownDays() {
		return getElement(dropDownDays);
	}


	/**
	 * @return the dropDownMonths
	 */
	public WebElement getDropDownMonths() {
		return getElement(dropDownMonths);
	}


	/**
	 * @return the dropDownYears
	 */
	public WebElement getDropDownYears() {
		return getElement(dropDownYears);
	}



	/**
	 * @return the reEnterMailIDInputField
	 */
	public WebElement getReEnterMailIDInputField() {
		return getElement(reEnterMailIDInputField);
	}




	public LandingPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	/**
	 * @return the firstNameInputField
	 */
	public WebElement getFirstNameInputField() {
		return getElement(firstNameInputField);
	}

	/**
	 * @return the lastNameInputField
	 */
	public WebElement getLastNameInputField() {
		return getElement(lastNameInputField);
	}


	/**
	 * @return the phoneOrEmailIDInputField
	 */
	public WebElement getPhoneOrEmailIDInputField() {
		return getElement(phoneOrEmailIDInputField);
	}


	/**
	 * @return the newPasswordInputField
	 */
	public WebElement getNewPasswordInputField() {
		return getElement(newPasswordInputField);
	}


	public String getLandingPageTitle() {
		return getPageTitle();
	}	
	
	public void enterFirstName(String name) {
		wait.until(ExpectedConditions.elementToBeClickable(getFirstNameInputField()));
		getFirstNameInputField().sendKeys(name);
		
	}
	
	public void enterLastName(String name) {
		wait.until(ExpectedConditions.elementToBeClickable(getLastNameInputField()));
		getLastNameInputField().sendKeys(name);
		
	}
	
	public void enterPhoneOrEmailID(String name) {
		wait.until(ExpectedConditions.elementToBeClickable(getPhoneOrEmailIDInputField()));
		getPhoneOrEmailIDInputField().sendKeys(name);
		
	}
	
	public void reEnterPhoneOrEmailID(String name) {
		wait.until(ExpectedConditions.elementToBeClickable(getReEnterMailIDInputField()));
		getReEnterMailIDInputField().sendKeys(name);
		
	}
	
	public void enterNewPassword(String name) {
		wait.until(ExpectedConditions.elementToBeClickable(getNewPasswordInputField()));
		getNewPasswordInputField().sendKeys(name);
		
	}




	public void selectDay(String days) {
		wait.until(ExpectedConditions.elementToBeClickable(getDropDownDays()));
		Select sel1 = new Select(getDropDownDays());
	    sel1.selectByVisibleText(days);
	}




	public void selectMonths(String months) {
		wait.until(ExpectedConditions.elementToBeClickable(getDropDownMonths()));
		Select sel1 = new Select(getDropDownMonths());
	    sel1.selectByVisibleText(months);
		
	}




	public void selectYears(String years) {
		wait.until(ExpectedConditions.elementToBeClickable(getDropDownYears()));
		Select sel3 = new Select(getDropDownYears());
	    sel3.selectByVisibleText(years);
		
	}




	public void selectMaleGender() {
		
		wait.until(ExpectedConditions.elementToBeClickable(getGenderMaleRadioBtn()));
		getGenderMaleRadioBtn().click();
		
		
	}


	public HomePage clickSignUpBtn() {
		// TODO Auto-generated method stub
		wait.until(ExpectedConditions.elementToBeClickable(getSignUpBtn()));
		getSignUpBtn().click();
		return getInstance(HomePage.class);

		
	}
	
	
	
	
	
}



	
	
	

