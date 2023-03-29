package com.Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/resources/Features"
,glue ={"com.Stepdefinitions","com.Utils.Helper", "appHooks"}
,monochrome=true,dryRun = false  


//plugin= {"pretty","html:target/cucumber.html",
//		"json:target/cucumber-reports/reports.json", 
//		"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
//		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
)

public class Testrunnertestng extends AbstractTestNGCucumberTests {
	

}