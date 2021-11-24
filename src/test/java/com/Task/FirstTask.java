package com.Task;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FirstTask {

WebDriver driver;
	
	@Given("User launches the browser and navigate to facebook app")
	public void user_launches_the_browser_and_navigate_to_facebook_app() {
	    System.setProperty("webdriver.chrome.driver",
	    		"C:\\Users\\kanwa\\eclipse-workspace\\cucumber\\driver\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get("https://www.facebook.com/");
	}

	@When("User enter the login credentials in facebook app")
	public void user_enter_the_login_credentials_in_facebook_app() {
	    WebElement txtuser = driver.findElement(By.id("email"));
	    txtuser.sendKeys("9551152520");
	    
	    WebElement txtpass = driver.findElement(By.id("pass"));
	    txtpass.sendKeys("Oneplus2021");
	
	}

	@When("User login into facebook")
	public void user_login_into_facebook() {
	    WebElement btnlogin = driver.findElement(By.id("u_0_d_8Q"));
	    btnlogin.click();
	}

	 
}


