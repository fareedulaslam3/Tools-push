package com_facebook_runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

@RunWith(Cucumber.class)

@CucumberOptions(features = "C:\\Users\\vijay\\eclipse-workspace\\Maven-cucumber\\Faceebook_9ambatch\\src\\test\\java\\com\\Facebook\\feature", glue = "com_Facebook_stepdefinition", 
publish = true, plugin = "html:Reports/Cucumber_Reports",
dryRun = true,
monochrome = true)

public class Testrunner {

	public static WebDriver driver;

	@BeforeClass
	public static void browserlaunch() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/index.php/");
	}

	@AfterClass
	public static void close() {
		driver.close();
	}

}
