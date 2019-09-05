package com.testingfoo.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.testingfoo.pages.HomePage;
import com.testingfoo.pages.LandingPage;
import com.testingfoo.utils.Utils;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

public class SignUpTest extends BaseTest{
	
	private LandingPage landingPage;
	private HomePage homePage;
	private String firstName;
	private String lastName;
	
	
	@Test
	@Severity(SeverityLevel.CRITICAL)
	@Description("SignUp test")
	@Story("Story Name: To check signup feature in Facebook")
	public void test() throws InterruptedException {
		
		landingPage=page.getInstance(LandingPage.class);
		String pageTitle=landingPage.getPageTitle();
		Assert.assertEquals(pageTitle, "Facebook – log in or sign up");
		
		firstName=Utils.randomFirstName();
		lastName=Utils.randomLastName();
		
		
		landingPage.enterFirstName(firstName);
		landingPage.enterLastName(lastName);
		String emailId=firstName+lastName+Utils.randomAlphaNumeric(8)+"@gmail.com";
		landingPage.enterPhoneOrEmailID(emailId);
		landingPage.reEnterPhoneOrEmailID(emailId);

		landingPage.enterNewPassword("pass1234");
		
		landingPage.selectDay("2");
		landingPage.selectMonths("Aug");
		landingPage.selectYears("1990");
				
		landingPage.selectMaleGender();
		
		homePage=landingPage.clickSignUpBtn();
		
		Thread.sleep(25000);

		

	}
	

}
