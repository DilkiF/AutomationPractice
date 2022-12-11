package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
	WebDriver driver;

	//Constructor that will be automatically called as soon as the object of the class is created
	public HomePage(WebDriver driver) {
		this.driver=driver;
	} 

	By homeNav = By.cssSelector("label#userName-value");
	
	public String verifyHomePageNav() {
		String navigateHome = driver.findElement(homeNav).getText();
		return navigateHome;
		
	}

}
