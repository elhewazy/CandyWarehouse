package com.revature.runners;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.revature.pages.LoginPage;
import com.revature.pages.MainPage;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources", glue = "com.revature.steps", strict = true, plugin = { "pretty" })
public class CandyWHRunner {

	public static WebDriver driver;
	public static MainPage mainPage;
	public static LoginPage loginPage;

	@BeforeClass
	public static void setUp() {
		String path = "C:/Users/ahmed/Downloads/chromedriver_win32/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		driver = new ChromeDriver();
		mainPage = new MainPage(driver);
		loginPage = new LoginPage(driver);
	}

	@AfterClass
	public static void tearDown() {
		driver.quit();
	}

}