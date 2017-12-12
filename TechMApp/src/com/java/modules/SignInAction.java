package com.java.modules;

import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

import com.java.helpers.Log;
import com.java.pageobjects.MercuryHomePage;
import com.java.pageobjects.Mercury_LoginPage;


public class SignInAction {

	public static void Execute(WebDriver driver,HashMap<String,String> map) throws Exception{
		
		/*AutomationHomePage.sign_in.click();
		Log.info("Click action is perfromed on My Account link" );*/

		Mercury_LoginPage.email.sendKeys(map.get("username"));

		Log.info(" is entered in UserName text box" );
		
		Mercury_LoginPage.password.sendKeys(map.get("password"));
		Log.info(" is entered in Password text box" );

		Mercury_LoginPage.signin_button.click();
		Log.info("Click action is performed on Submit button");

		Reporter.log("SignIn Action is successfully perfomred");

	}
}
