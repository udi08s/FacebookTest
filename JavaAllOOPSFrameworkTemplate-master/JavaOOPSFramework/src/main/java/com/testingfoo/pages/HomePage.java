package com.testingfoo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends BasePage {

	//Page Locator
	
	private By accountSettingsOption=By.xpath("//*[@id='userNavigationLabel' and contains(@class,'6qfu')]");
	private By updateContactBtn=By.xpath("//input[@name='code' and contains(@class,'inputtext _55r1')]");
	private By signUpBtn=By.xpath("//button[@name='websubmit' and contains(@class,'_6j')]");
	
	
	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public boolean isContactUpdatePageDisplayed() {
		// TODO Auto-generated method stub
		wait.until(ExpectedConditions.visibilityOf(getUpdateContactBtn()));
		return getUpdateContactBtn().isDisplayed();
		
	}

	/**
	 * @return the signUpBtn
	 */
	public WebElement getSignUpBtn() {
		return getElement(signUpBtn);
	}


	/**
	 * @return the accountSettingsOption
	 */
	public WebElement getAccountSettingsOption() {
		return getElement(accountSettingsOption);
	}

	/**
	 * @return the updateContactBtn
	 */
	public WebElement getUpdateContactBtn() {
		return getElement(updateContactBtn);
	}

	public void clickAccountSettingsOption() {
		// TODO Auto-generated method stub
		wait.until(ExpectedConditions.elementToBeClickable(getAccountSettingsOption()));
		getAccountSettingsOption().click();
	}

	public boolean isSignUpButtonNotDisplayed() {
		// TODO Auto-generated method stub
		wait.until(ExpectedConditions.elementToBeClickable(getSignUpBtn()));
		return getSignUpBtn().isDisplayed();
	}



}
