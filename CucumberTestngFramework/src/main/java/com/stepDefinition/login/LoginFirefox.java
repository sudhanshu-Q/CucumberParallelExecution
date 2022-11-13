package com.stepDefinition.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginFirefox {

	static WebDriver driver;

	@Given("^Navigate to url \"([^\"]*)\"$")
	public void navigate_to_url(String url1) throws Throwable {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.get(url1);
	}

	@Given("^Enter the username1 and password1$")
	public void enter_the_username_and_password(DataTable arg1) throws Throwable {

	}

	@Then("^User navigate to homepage$")
	public void user_navigate_to_homepage() throws Throwable {

	}

	@Then("^Verify LogOut icon$")
	public void verify_LogOut_icon() throws Throwable {

	}

}
