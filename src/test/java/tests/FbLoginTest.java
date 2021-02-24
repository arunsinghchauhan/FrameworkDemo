package tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pages.FbHomePage;
import pages.FbLoginPage;

public class FbLoginTest extends TestBase{

	@Test
	public void init()
	{
		FbLoginPage loginPage=PageFactory.initElements(driver, FbLoginPage.class);
		loginPage.setEmailOrNumber("9654888946");
		loginPage.setPassword("96548889466");
		loginPage.ClickOnLoginButton();
		
		FbHomePage homePage=PageFactory.initElements(driver, FbHomePage.class);
		homePage.ClickOnProfileDropdown();
		homePage.VerifyLoggedInUserNameText();
		homePage.VerifySeeYourProfileText();
		homePage.ClickOnLogoutButton();
		
	}
	
}
