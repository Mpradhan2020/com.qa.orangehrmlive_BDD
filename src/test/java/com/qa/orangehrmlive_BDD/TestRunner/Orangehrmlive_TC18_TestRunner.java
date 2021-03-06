package com.qa.orangehrmlive_BDD.TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features="C:\\Users\\pradhanm\\eclipse-workspace\\com.qa.orangehrmlive_BDD\\src\\test\\java\\com\\qa\\orangehrmlive_BDD\\Features\\SmokeRegression_4TC.feature",
		glue="com.qa.orangehrmlive_BDD.StepDefination",
		dryRun=false,
		strict=true,
		monochrome=true,
		format= {"pretty", "html:test-output"},
		tags={"@SmokeTest, @RegressionTest"} 
		
		)

public class Orangehrmlive_TC18_TestRunner {

}
