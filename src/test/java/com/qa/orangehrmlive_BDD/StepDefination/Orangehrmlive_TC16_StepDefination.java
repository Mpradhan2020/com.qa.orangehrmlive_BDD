package com.qa.orangehrmlive_BDD.StepDefination;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.qa.orangehrmlive_BDD.Pages.OrangehrmlivePages;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Orangehrmlive_TC16_StepDefination {

	WebDriver driver;
	OrangehrmlivePages OrangeORTC16;
	

@Given("^When I am in OrangeHRP Application$")
public void when_I_am_in_OrangeHRP_Application() {
	

	System.setProperty("webdriver.chrome.driver", "C:\\Murali\\Java-Learn\\Selenium\\Browser_driver\\chromedriver.exe");  

    WebDriver driver=new ChromeDriver();
    driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");  
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    OrangeORTC16 = new OrangehrmlivePages(driver);
    driver.manage().window().maximize();
	
}

@Then("^Login to Application$")
public void login_to_Application() throws InterruptedException{
	
	OrangeORTC16.setUserName("Admin");
	OrangeORTC16.setPassName("admin123");
	OrangeORTC16.setSubmit();
	Thread.sleep(3000);
	
}

@When("^Dashboard page is available$")
public void dashboard_page_is_available() { 
	
	OrangeORTC16.verifyLoginSuccess();
	
}

@When("^click Admin menu$")
public void click_Admin_menu() {
	
	OrangeORTC16.clickAdmin();
}
	
@Then("^close T16 browser$")
public void close_T16_browser()
{
	OrangeORTC16.closeBrowser();
	}


}
