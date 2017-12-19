package com.java.step_definitions;

import java.net.MalformedURLException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks{
    public static WebDriver driver;

    
    @Before
    /*
     * Delete all cookies at the start of each scenario to avoid
     */
    public void openBrowser() throws MalformedURLException {
    	System.out.println("Called openBrowser");
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\MS00533056\\AppData\\Local\\Google\\Chrome\\Application\\chromedriver.exe");
    	driver = new ChromeDriver();
    	driver.manage().deleteAllCookies();
    	driver.manage().window().maximize();
        System.out.println("This will run before the Scenario");

    }
    @Before("@First")
    public void beforeFirst()
    {
        System.out.println("This will run only before the First Scenario");
    }	
 
	@Before("@Second")
    public void beforeSecond()
	{
        System.out.println("This will run only before the Second Scenario");
    }	
     
    @After
    /*
     * Embed a screenshot in test report if test is marked as failed
     */
    public void embedScreenshot(Scenario scenario)
    {
       
        if(scenario.isFailed()) 
        {
        try {
        	 scenario.write("Current Page URL is " + driver.getCurrentUrl());
//           byte[] screenshot = getScreenshotAs(OutputType.BYTES);
            byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshot, "image/png");
        } catch (WebDriverException somePlatformsDontSupportScreenshots) {
            System.err.println(somePlatformsDontSupportScreenshots.getMessage());
        }
        
        }
        driver.quit();
        System.out.println("This will run after the Scenario");
       
    }
   
	@After("@First")
    public void afterFirst()
	{
        System.out.println("This will run only after the First Scenario");   
    }	
	@After("@Second")
    public void afterSecond(){
        System.out.println("This will run only after the Second Scenario");   
    }	
	
}