package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ElementsPage {
	
	
	private WebDriver driver;

	public ElementsPage(WebDriver driver) {
	this.driver = driver;
	}
	
	By elements = By.cssSelector("div.header-text");
	
	By txtBox = By.cssSelector("span.text");
	
	By fullname = By.id("userName");
	
	By email = By.id("userEmail");
	
	By addres = By.id("currentAddress");
	
	By permAdd = By.id("permanentAddress");
	
	By submit = By.cssSelector("#submit");
	
	public void clickElements() {
		driver.findElement(elements).click();
		
	}
	
	public void clickText() {
		driver.findElement(txtBox).click();
		
	}
	
	public void sendFullName() {
		driver.findElement(fullname).sendKeys("Dilki Fernando");
		
	}

	public void sendEmail() {
		driver.findElement(email).sendKeys("test@gmail.com");;
		
	}

	public void sendAddress() {
		driver.findElement(addres).sendKeys("Colombo");
		
	}

	public void sendParmanentAddresst() {
		driver.findElement(permAdd).sendKeys("Colombo, Sri Lanka");
		
	}

	
	public void clickSubmit() {
		driver.findElement(submit).click();
		
	}


}
