package com.qa.hubspot.tests;

//Right click -- Properties --Java build path--Add library -- Testng--- Next---Apply --ok or
//Help--Install new s/w --url (testng eclipse url) --22nd min url--enter-- Next--Apply--Restart --6.14.3 - Latest version
//Pom - Plugin for eclipse and dependency is for maven
//pre-condition - Test -- ac vs exp --> post step
//@BeforeTest  -- @Test---Assert --@AfterTest
//browser,url --> test google title -- Google vs Google --close browser 

import java.util.Properties;
import javax.management.DescriptorKey;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.hubspot.base.BasePage;
import com.qa.hubspot.pages.HomePage;

//pre condition --> Test --> ac vs exp --> post step
//@BeforeTest -->   @Test --> Assert   --> @AfterTest
//browser, url --> test google title --> Google vs Google --> close browser
import com.qa.hubspot.pages.LoginPage;
import com.qa.hubspot.utils.Constants;

//import io.qameta.allure.Description;
//import io.qameta.allure.Epic;
//import io.qameta.allure.Feature;
//import io.qameta.allure.Severity;
//import io.qameta.allure.SeverityLevel;

//@Epic("Epic - 101 : design login feature")
//@Feature("US - 105 : design test cases for login page feature")
public class LoginPageTest {

	Properties prop;
	WebDriver driver;

	BasePage basePage;
	LoginPage loginpage;
	HomePage homePage;

	@BeforeTest
	public void setUp() throws InterruptedException {

		basePage = new BasePage();
		prop = basePage.init_prop();
		driver = basePage.init_driver(prop);
		loginpage = new LoginPage(driver);
	}

	@Test(priority = 1, enabled = true)
	// @Description("verify Login Page Title Test....")
	// @Severity(SeverityLevel.NORMAL)
	// public void verifyLoginPageTitleTest() {
	// String title = loginPage.getLoginPageTitle();
	// System.out.println("login page title is : " + title);
	// System.out.println("Constants.LOGIN_PAGE_TITLE" +
	// Constants.LOGIN_PAGE_TITLE);
	// Assert.assertEquals(title, Constants.LOGIN_PAGE_TITLE, "title is not
	// found...");

	public void VerifyLoginPageTitleTest() {
		String title = loginpage.getLoginPageTitle();
		System.out.println("get title" + title);
		Assert.assertEquals(title, Constants.login_Page_Title, "Title not found");

	}

	@Test(priority = 2, enabled = false)
	// @Description("verify Sign up link Test....")
	// @Severity(SeverityLevel.CRITICAL)
	public void verifySignUpLinkTest() {
		Assert.assertTrue(loginpage.checkSignUpLink(), "sign up link is not present....");
	}

	@Test(priority = 3)
	// @Description("verify user is able to Login - feature Test....")
	// @Severity(SeverityLevel.BLOCKER)
	// public void loginTest() {
	// HomePage homePage = loginpage.doLogin(prop.getProperty("username"),
	// prop.getProperty("password"));
	// // Assert.assertEquals(homePage.getAccountName(),
	// prop.getProperty("accountname"), "login is failed.....");
	// Assert.assertEquals(homePage.getAccountName(),prop.getProperty("accountname"),"loginfailed");

	public void LoginTest() {

	
			homePage = loginpage.doLogin(prop.getProperty("username"), prop.getProperty("password"));
		
		Assert.assertEquals(homePage.getAccountName(), prop.getProperty("accountname"), "loginfailed");

	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
