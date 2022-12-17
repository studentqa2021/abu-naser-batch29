package com.cucumber.test;

import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOption(
plugin = { "json:target/cucumber.json" },
features = { "src/main/resources/Login.feature" },
glue = {"com.cucumber.test" }
		

)
public class CucumberRunner extends AbstractTestNGCucumberTests {

}
