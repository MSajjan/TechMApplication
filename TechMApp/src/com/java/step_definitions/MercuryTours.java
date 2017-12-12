package com.java.step_definitions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class MercuryTours{
    public WebDriver driver;
//    public List<HashMap<String,String>> datamap = DataHelper.data();
    public static List<HashMap<String,String>> datamap = null;
    
    
    public MercuryTours()
    {
    	driver = Hooks.driver;
    	
    	datamap = new ArrayList<HashMap<String,String>>();
    	HashMap<String,String> sampleData = new HashMap<String,String>();
    	sampleData.put("username","Mahesh.ahsajjan@gmail.com");
    	sampleData.put("password","Mahesh@123");
    	System.out.println("Current data" +sampleData);
    	datamap.add(sampleData);
    }
    
    @When("^I open automationpractice website$")
    public void i_open_automationpractice_website() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    	driver.get("http://newtours.demoaut.com/mercurysignon.php");
    }

    @When("^I sign in$")
    public void i_sign_in() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    	PageFactory.initElements(driver, com.java.pageobjects.MercuryHomePage.class);
		PageFactory.initElements(driver, com.java.pageobjects.Mercury_LoginPage.class);
        Thread.sleep(10);
		com.java.modules.SignInAction.Execute(driver,datamap.get(0));
    }

    @Then("^I sign out$")
    public void i_sign_out() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Thread.sleep(30);
    	com.java.modules.SignoutAction.Execute(driver);
    	System.out.println("Successfully Loged Out!!");
    }
    
}