package com.java.step_definitions;

import static org.testng.AssertJUnit.assertEquals;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class ToolsQA{
    public WebDriver driver;
    
    public ToolsQA()
    {
    	driver = Hooks.driver;
    }
    
    

   /* @Given("^User is on page$")
	public void user_is_on_Home_Page() throws Throwable 
	{
                       
         System.out.println("Welcome to Tech Mahindra Traning Session!!");
                         
	}*/
    @When("^I open seleniumframework website$")
    public void i_open_seleniumframework_website() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.get("http://toolsqa.com/automation-practice-form/");
    }

    @Then("^I validate title and URL$")
    public void i_print_title_and_URL() throws Throwable
    {
    	assertEquals("Demo Form for practicing Selenium Automation", driver.getTitle());
    	String title= driver.getTitle();
    	System.out.println(title);
    	
    	assertEquals("http://toolsqa.com/automation-practice-form/", driver.getCurrentUrl());
    	String url= driver.getCurrentUrl();
    	System.out.println(url);
    	
        System.out.println("Successfully Verified the Title!!");
    }
    
    @And("^Click on Browse button$")
		
    public void user_click_on_browse_button() throws Throwable {
		driver.findElement(By.xpath(".//*[@class='input-file']")).click();
	}

    @Then("^Provide the path of the file to upload$")
    public void provide_path_to_upload_file() throws Throwable {
      /*
		###################
		
		# FileUpload using AutoIT
		
	 	 ###################
         Thread.sleep(2);
		 Runtime.getRuntime().exec("C:\\Users\\MS00533056\\Documents\\FileUpload.exe");
         System.out.println("Successfully Uploaded file!!");
         */
         /*###################
			
			# FileUpload using Sikuli
			
		 ###################*/
		 
		 Pattern fileNameInput = new Pattern("C:\\Users\\MS00533056\\Desktop\\MSajjan\\Sikuli\\FileName.PNG");
	     Pattern openButton = new Pattern("C:\\Users\\MS00533056\\Desktop\\MSajjan\\Sikuli\\OpenButton.PNG");
	     
	     Screen screen = new Screen();
	     screen.wait(fileNameInput,8);
	     screen.type(fileNameInput, "C:\\Users\\MS00533056\\Desktop\\MSajjan\\Sikuli\\OpenButton.PNG");
	     screen.click(openButton);
	     //driver.close();
	         
         
	 /*    ###################
			
			# FileUpload using Robot Class
			
		 ################### */
		 
		  /*  Robot robot = new Robot();
		    robot.setAutoDelay(2000);
		 
		    StringSelection selection = new StringSelection("C:\\Users\\MS00533056\\Desktop\\MSajjan\\AutoIT_SampleTest\\AutoIT.txt");
	        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection,null);
	 
	        robot.setAutoDelay(1000);
	 
	        robot.keyPress(KeyEvent.VK_CONTROL);
	        robot.keyPress(KeyEvent.VK_V);
	 
	        robot.keyRelease(KeyEvent.VK_CONTROL);
	        robot.keyRelease(KeyEvent.VK_V);
	 
	        robot.setAutoDelay(1000);
	 
	        robot.keyPress(KeyEvent.VK_ENTER);
	        robot.keyRelease(KeyEvent.VK_ENTER);*/
		      
   		    System.out.println("Successfully Uploaded the file");
                 
          
    }  
    @Given("^this is the first step$")
	public void This_Is_The_First_Step(){
		System.out.println("This is the first step");
	}

	@When("^this is the second step$")
	public void This_Is_The_Second_Step(){
		System.out.println("This is the second step");
	}

}