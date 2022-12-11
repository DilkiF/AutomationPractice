package testCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.ElementsPage;
import pages.HomePage;
import pages.LoginPage;

public class LoginTC1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dfnisansala\\AutomationP\\SeleniumPOM\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demoqa.com/books");
		driver.manage().window().maximize();
		
		
		LoginPage login = new LoginPage(driver);
		login.clickLogin();
		login.enterUserName("DilkiF");
		login.enterPassword("Dilki@123");
		login.clickLoginBtn();
		
		
		HomePage home = new HomePage(driver);
		String name = home.verifyHomePageNav(); //store the return value from the homepage 
		System.out.println("Login to the " + name + " " + "home page");		
		
		ElementsPage elements = new ElementsPage(driver);
		elements.clickElements();
		elements.clickText();
		elements.sendFullName();
		elements.sendEmail();
		elements.sendAddress();
		elements.sendParmanentAddresst();
		elements.clickSubmit();
	
		driver.close();

	}

}
