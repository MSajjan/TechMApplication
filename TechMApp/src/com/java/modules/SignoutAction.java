package com.java.modules;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

import com.java.helpers.Log;
import com.java.pageobjects.MercuryHomePage;



public class SignoutAction {

	public static void Execute(WebDriver driver) throws Exception{
		
		Thread.sleep(10);
		MercuryHomePage.sign_out.click();
		Log.info("Sign out is performed");

		Reporter.log("Sign out is performed");

	}
}
