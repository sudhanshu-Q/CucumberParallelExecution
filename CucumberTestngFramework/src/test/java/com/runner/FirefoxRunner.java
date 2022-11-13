package com.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src/main/java/com/feature/loginFirefox.feature"}, 
       glue = { "com/stepDefinition/login" },
		// tags= "P2"
		 plugin = { "html:target/cucumber-html-report",
				"json:target/cucumber-json-report.json" }, monochrome = false,
					strict = true, 
				dryRun = false
//Comment
)

public class FirefoxRunner {

}
