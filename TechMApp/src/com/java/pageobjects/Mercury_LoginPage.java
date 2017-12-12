package com.java.pageobjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
public class Mercury_LoginPage extends BaseClass{

	public Mercury_LoginPage(WebDriver driver){
		super(driver);
	}    

	
	@FindBy(how=How.NAME, using="userName")
	public static WebElement email;
	
	@FindBy(how=How.NAME, using="password")
	public static WebElement password;
	
	@FindBy(how=How.NAME, using="login")
	public static WebElement signin_button;
	

	/*@FindBy(how=How.ID, using="email_create")
	public static WebElement email_create;

	@FindBy(how=How.ID, using="SubmitCreate")
	public static WebElement submit_create;*/
			
	}
		

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
