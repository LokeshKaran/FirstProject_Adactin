package com.adactin.runner;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.json.Json;

import com.adactin.baseclass.BaseClass;
import com.adactin.utility.ConfigurationReader;
import com.adactin.utility.fileReaderManager;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/com/adactin/feature/Adactin.feature", glue = {
		"com/adactin/stepdefinition" }, monochrome = true, dryRun = false,strict = false,
				plugin = {/*"pretty"*/"html:Reports/Cucumber.html","json:Reports/Cucumber.json",
		/*
		 * "com.vimalselvam.cucumber.listener.ExtentCucumberFormatter:Reports/CucumberExtendReport.html"
		 */})
public class AdactinRunner {
	public static WebDriver driver ;
	
	@BeforeClass
	public static void setup() throws IOException {
//		ConfigurationReader cr = new ConfigurationReader();
//		String browserName = cr.browserName();
		 String browserName = fileReaderManager.getInstance().getCrInstance().browserName();
		 driver = BaseClass.getBrowser(browserName);

	}
	
	@AfterClass
	public static void tearDown() {
		driver.close();
	}
	
	 

}
