package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	private WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	//Locator for login button
	By LoginBtn = By.id("login");

	By userName = By.id("userName");

	By password = By.id("password");

	By login = By.id("login");

	//Method to click login button

	public void clickLogin() {
		driver.findElement(LoginBtn).click();
	}

	public void enterUserName(String user) {

		driver.findElement(userName).sendKeys(user);
	}

	public void enterPassword(String pass) {

		driver.findElement(password).sendKeys(pass);
	}

	public void clickLoginBtn() {

		driver.findElement(login).click();
	}


}
