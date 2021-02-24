package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FbLoginPage {

	WebDriver driver;

	FbLoginPage(WebDriver driver) {
		this.driver = driver;
	}

	// Using Findby annotation for locating elements

	@FindBy(id = "email")
	WebElement emailTextField;
	@FindBy(id = "passContainer")
	WebElement passwordTextFiled;
	@FindBy(name = "login")
	WebElement LogInButton;

	public void setEmailOrNumber(String strEmail) {
		emailTextField.sendKeys(strEmail);
	}

	public void setPassword(String strPassword) {
		passwordTextFiled.sendKeys(strPassword);
	}

	public void ClickOnLoginButton() {
		LogInButton.click();
	}

}
