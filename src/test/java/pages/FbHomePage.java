package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class FbHomePage {

	WebDriver driver;

	public FbHomePage(WebDriver driver)

	{
		this.driver = driver;
	}

	// Using Findby for locating elements

	@FindBy(xpath = "//div[@aria-label='Account']")
	WebElement accountDropdown;
	@FindBy(xpath = "//span[contains(text(), 'See your profile')]")
	WebElement seeYourProfileText;
	@FindBy(xpath = "(//span[contains(text(), 'Raj Voda')])[1]")
	WebElement loggedInUserNameText;
	@FindBy(xpath = "//span[contains(text(),'Log Out')]")
	WebElement logoutButton;

	// Now defining all the user actions(Methods) that can be performed in facebook
	// home page.

	// This method clicks on Profile Dropdown
	public void ClickOnProfileDropdown() {
		accountDropdown.click();
	}

	// This method verify See your profile text
	public void VerifySeeYourProfileText() {
		String seeProfileText = seeYourProfileText.getText();
		Assert.assertEquals(seeProfileText, "See your profile");
	}

	// This method verify the username text
	public void VerifyLoggedInUserNameText() {
		String UserNameText = loggedInUserNameText.getText();
		Assert.assertEquals(UserNameText, "Raj Voda");
	}

	// Method to click on Logout Button
	public void ClickOnLogoutButton() {
		logoutButton.click();
	}

}
