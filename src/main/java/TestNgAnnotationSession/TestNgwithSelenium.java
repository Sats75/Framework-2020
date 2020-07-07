package TestNgAnnotationSession;
//BT will be executed only once

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNgwithSelenium {

	WebDriver driver;

	@BeforeMethod
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		driver.manage().deleteAllCookies();
	}

	@Test(priority = 1)
	public void titleTest() {
		Assert.assertEquals(driver.getTitle(), "Google");
	}

	@Test(priority = 2)
	public void urlCheck() {
		String url = driver.getCurrentUrl();
		Assert.assertTrue(url.contains("google"));
	}

	@Test(priority = 3)
	public void searchTest() {
		
				Assert.assertTrue(driver.findElement(By.id("hplogo")).isDisplayed());
				
				
	}

	@Test(priority = 4)
	public void searchTest2() {
		
								
				
				Assert.assertTrue(driver.findElement(By.xpath("//span[text()=\"India\"]")).isDisplayed());
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}