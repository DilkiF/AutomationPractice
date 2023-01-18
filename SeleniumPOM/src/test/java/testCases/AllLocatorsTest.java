package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class AllLocatorsTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Udemy\\project\\AutomationPractice-master\\SeleniumPOM\\drivers\\New folder\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();

		/*Dynamic dropdown - select value from/to dropdown (wants to select 1value to get options from other dropdown to select)
		1way to use index*/

		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();	
		/*use parent & child xpath */ 
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='MAA']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='DEL']")).click();

		//select date
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-hover")).click();

		//select item from dropdown & increase items
		driver.findElement(By.id("divpaxinfo")).click();
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		Thread.sleep(500);

		for (int i = 1; i<5; i++) {

			driver.findElement(By.id("hrefIncAdt")).click();
		}

		driver.findElement(By.id("btnclosepaxoption")).click();
		//System.out.println(driver.findElement(By.id("divpaxinfo")).getText()); //or can user assertion to validate
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");


		//select drop down with select tag - static
		WebElement staticDropDown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropdown = new Select( staticDropDown);
		dropdown.selectByIndex(3);
		System.out.println(dropdown.getFirstSelectedOption().getText()); // get selected option

		//Click search
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();

		driver.close();
	}

}
