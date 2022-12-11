package coursePract;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Buttons {

	public static void main(String[] args) {
	
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\dfnisansala\\AutomationP\\SeleniumPOM\\drivers\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
			driver.manage().window().maximize();
			
			//select check box
//			System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount'")).isSelected());
//			driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount'")).click();
//			System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount'")).isSelected());
			
			//get count of the checkbox
			System.out.println(driver.findElements(By.cssSelector(" input[type='checkbox']")).size());
			
			//assertion using testng (assertion using for check whether get accepted results) 
			Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount'")).isSelected()); //expecting false
			driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount'")).click();
			Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount'")).isSelected()); //expecting true
			
			
			
			
			//driver.close();




	}

}
