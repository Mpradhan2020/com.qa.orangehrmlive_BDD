package com.qa.orangehrmlive_BDD.StepDefination;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.qa.orangehrmlive_BDD.Pages.OrangehrmlivePages;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Orangehrmlive_TC18_StepDefination  {

	WebDriver driver;
	OrangehrmlivePages OrangeOR;
	

@Given("^user open the browser$")
public void user_open_the_browser()  {
   

	System.setProperty("webdriver.chrome.driver", "C:\\Murali\\Java-Learn\\Selenium\\Browser_driver\\chromedriver.exe");  
    driver=new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
 	
}

@Then("^user run URL$")
public void user_run_URL()  {
   
	driver.get("https://opensource-demo.orangehrmlive.com/");  
    OrangeOR = new OrangehrmlivePages(driver);
    driver.manage().window().maximize();
}

@Given("^I am in OrangeHRP Application Page$")
public void i_am_in_OrangeHRP_Application_Page()  {
    
	String homeURL=driver.getCurrentUrl();
	System.out.println("URL is " + homeURL);
	Assert.assertTrue(homeURL.contains("opensource-demo.orangehrmlive.com"));
		
}

@Then("^login to the Application$")
public void login_to_the_Application() throws InterruptedException  {
    
	OrangeOR.setUserName("Admin");
	OrangeOR.setPassName("admin123");
	OrangeOR.setSubmit();
	Thread.sleep(3000);
	String strDashboard=driver.getCurrentUrl();
	System.out.println("Current URL contains " + strDashboard);
	Assert.assertTrue(strDashboard.contains("dashboard"));
	
}

@When("^landing page is available to user$")
public void landing_page_is_available_to_user()  {
   
	
	String strDashboard=driver.getCurrentUrl();
	System.out.println("Current URL contains  " + strDashboard);
	Assert.assertTrue(strDashboard.contains("dashboard"));
}

@Then("^click on Admin menu$")
public void click_on_Admin_menu()  {
    
	OrangeOR.clickAdmin();
}

@Then("^close Browser$")
public void close_Browser()  {
    driver.quit();
}


@Then("^Verify the title contains admin$")
public void verify_the_title_contains_admin()
{

	String stradmin=driver.getCurrentUrl();
	System.out.println("Current URL contains  " + stradmin);
	Assert.assertTrue(stradmin.contains("admin"));
	
}


@Then("^click on Dashboard menu$")
public void click_on_Dashboard_menu() {
	
OrangeOR.clickDashboard();	
}


@Then("^Verify the title contains dashboard$")
public void verify_the_title_contains_dashboard()
{
	String strDashboard=driver.getCurrentUrl();
	System.out.println("Current URL contains : " + strDashboard);
	Assert.assertTrue(strDashboard.contains("dashboard"));
}

@Then("^click on Leave menu$")
public void click_on_Leave_menu()
{
	OrangeOR.clickLeave();
}

	
@Then("^Verify the title contains leave$")
public void verify_the_title_contains_leave()
{
	String strleave=driver.getCurrentUrl();
	System.out.println("Current URL contains : " + strleave);
	Assert.assertTrue(strleave.contains("leave"));
}

}
