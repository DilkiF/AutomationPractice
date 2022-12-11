package coursePract;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Dropdowns {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dfnisansala\\AutomationP\\SeleniumPOM\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();

		//select drop down with select tag - static
		WebElement staticDropDown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropdown = new Select( staticDropDown);
		dropdown.selectByIndex(3);
		System.out.println(dropdown.getFirstSelectedOption().getText()); // get selected option
		dropdown.selectByVisibleText("AED"); // select AED 
		System.out.println(dropdown.getFirstSelectedOption().getText()); // get newly selected option
		dropdown.selectByValue("INR"); // select INR by value...check value from inspect under element value tag
		System.out.println(dropdown.getFirstSelectedOption().getText()); 

		//select item from dropdown & increase items
		driver.findElement(By.id("divpaxinfo")).click();
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

		int i = 1;
		while(i<5) { //can use for loop too (for (i=1;i<5;i++))

			driver.findElement(By.id("hrefIncAdt")).click();
			i++;

		}

		driver.findElement(By.id("btnclosepaxoption")).click();
		//System.out.println(driver.findElement(By.id("divpaxinfo")).getText()); //or can user assertion to validate
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
		
		/*Dynamic dropdown - select value from/to dropdown (wants to select 1value to get options from other dropdown to select)
		1way to use index*/
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
//		driver.findElement(By.xpath("(//a[@value='MAA'])[1]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("(//a[@value='DEL'])[2]")).click();
		
		/*2nd way use parent & child xpath */ 
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='MAA']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='DEL']")).click();
		
		//Auto suggested dropdown
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		Thread.sleep(3000);
		List<WebElement> options = driver.findElements(By.cssSelector("li[class = 'ui-menu-item'] a"));
		
		for(WebElement option : options) {
			
			if(option.getText().equalsIgnoreCase("India")) {
				option.click();
				break;
			}
			
		}
		
		
		
		
		driver.close();
	}


}
