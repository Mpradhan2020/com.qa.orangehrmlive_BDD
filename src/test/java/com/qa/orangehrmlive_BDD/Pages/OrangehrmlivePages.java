package com.qa.orangehrmlive_BDD.Pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangehrmlivePages {

//	public static WebDriver Driver;
	WebDriver Driver;

	@FindBy(xpath = "/html/body/div[1]/div/div[3]/div[2]/div[2]/form/div[2]/input")
	@CacheLookup
	WebElement UserNameInput;

	public void setUserName(String input) {
		// UserNameInput.clear();
		UserNameInput.sendKeys(input);

	}

	@FindBy(xpath = "/html/body/div[1]/div/div[3]/div[2]/div[2]/form/div[3]/input")
	@CacheLookup
	WebElement UserPassInput;

	public void setPassName(String inputpass) {
		// UserNameInput.clear();
		UserPassInput.sendKeys(inputpass);

	}

	public void verifyLoginSuccess()
	{
		String strDashboard=Driver.getCurrentUrl();
		System.out.println("Current URL contains " + strDashboard);
		Assert.assertTrue(strDashboard.contains("dashboard"));
	}
	
	@FindBy(xpath = "/html/body/div[1]/div/div[3]/div[2]/div[2]/form/div[5]/input")
	@CacheLookup
	WebElement ClickSubmit;

	public void setSubmit() {
		ClickSubmit.click();
	}

	@FindBy(linkText = "Admin")
	@CacheLookup
	WebElement ClickAdmin;

	public void clickAdmin() {
		ClickAdmin.click();
	}

@FindBy(id="menu_dashboard_index")

@CacheLookup
WebElement ClickDashboard;

public void clickDashboard()
{

	ClickDashboard.click();
}


@FindBy(xpath="//*[@id=\"menu_leave_viewLeaveModule\"]/b")
@CacheLookup
WebElement ClickLeave;

public void clickLeave()
{

	ClickLeave.click();
}	


@FindBy(id="menu_admin_Job")
@CacheLookup
WebElement ClickJob;
public void clickJob()
{

	ClickJob.click();
}



@FindBy(id="menu_admin_viewJobTitleList")
@CacheLookup
WebElement ClickJobTitle;
public void clickJobTitle()
{

	ClickJobTitle.click();
}


public void verifyJobTitile()
{
	//viewJobTitleList
	
	String strJobTitle=Driver.getCurrentUrl();
	System.out.println("Current URL contains : " + strJobTitle);
	Assert.assertTrue(strJobTitle.contains("viewJobTitleList"));
	}

public void closeBrowser()
{
	
	Driver.quit();
}

	
	public OrangehrmlivePages(WebDriver Driver) {
		this.Driver = Driver;
		PageFactory.initElements(Driver, this);
	}

}
