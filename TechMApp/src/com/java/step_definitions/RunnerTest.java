package com.java.step_definitions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src\\com\\resources\\features",
	    glue={"com\\java\\step_definitions"},
		plugin = {"pretty", "html:target/cucumber-html-report"},
		tags = {"@Regression,@Smoke,@First,@Second"}
		)
public class RunnerTest{
	
}