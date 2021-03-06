package com.qa.orangehrmlive_BDD.StepDefination;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.qa.orangehrmlive_BDD.Pages.OrangehrmlivePages;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Orangehrmlive_TC17_StepDefination{
	

	WebDriver driver;
	OrangehrmlivePages OrangeORTC17;

@Given("^User successful login$")
public void user_successful_login() {


	System.setProperty("webdriver.chrome.driver", "C:\\Murali\\Java-Learn\\Selenium\\Browser_driver\\chromedriver.exe");  

    WebDriver driver=new ChromeDriver();
    driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");  
    OrangeORTC17 = new OrangehrmlivePages(driver);
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	OrangeORTC17.setUserName("Admin");
	OrangeORTC17.setPassName("admin123");
	OrangeORTC17.setSubmit();

}

@Then("^validate Title of LandingPage$")
public void validate_Title_of_LandingPage() {
	OrangeORTC17.verifyLoginSuccess();
	
}

@Given("^When I click on Admin Link$")
public void when_I_click_on_Admin_Link() throws InterruptedException {
	OrangeORTC17.clickAdmin();
	Thread.sleep(3000);
}

@Then("^Click on Job$")
public void click_on_Job() throws InterruptedException {
	
	OrangeORTC17.clickJob();
	OrangeORTC17.clickJobTitle();
	Thread.sleep(3000);
}

@Then("^validate viewJobTitleList in URL$")
public void validate_viewJobTitleList_in_URL() {
	
OrangeORTC17.verifyJobTitile();
		
}
	
@Then("^close TC17 browser$")
public void close_TC17_browser()
{

	OrangeORTC17.closeBrowser();
}
	


	
}
