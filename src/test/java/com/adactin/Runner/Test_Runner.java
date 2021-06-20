package com.adactin.Runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.Adactin_Cucumber.BaseClass;
import com.adatinsite.confi.File_Reader_Manager;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\adactin\\feature",
glue = "com.adactin.Stepdefinition",
monochrome = true,//special char remover
dryRun = false, //it must be in false 
strict = false,//true- it shows exception,false-it doesn't
tags = ("@SmokeTest,@SanityTest"),
plugin = {"html:Report/HTML_Report",
		"Dark",
		"json:Report/CucumberJSON_Report.json",
		
		  })


public class Test_Runner {
	
	
	public static WebDriver driver; //null driver
	
	@BeforeClass
	public static void set_Up() throws Throwable {
		
		String browser = File_Reader_Manager.getInstance().getInstanceCR().get_Browser();
		
		driver=BaseClass.browserLaunch(browser);

	}
	
	@AfterClass
	public static void tear_Down() {
		
//		driver.close();
		
	}

}
