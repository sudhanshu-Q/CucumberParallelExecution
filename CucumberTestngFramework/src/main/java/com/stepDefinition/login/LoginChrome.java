package com.stepDefinition.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginChrome {

	static WebDriver driver;

	@Given("^navigate to url \"([^\"]*)\"$")
	public void navigate_to_url(String url) throws Throwable {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(url);
	}

	@Given("^enter the username and password$")
	public void enter_the_username_and_password(DataTable arg1) throws Throwable {

	}

	@Then("^user navigate to homepage$")
	public void user_navigate_to_homepage() throws Throwable {

	}

	@Then("^verify LogOut icon$")
	public void verify_LogOut_icon() throws Throwable {

	}

}
