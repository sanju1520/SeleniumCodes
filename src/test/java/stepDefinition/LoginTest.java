package stepDefinition;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;

import com.Pages.LogFactory;
import com.testNG.Utility;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;


public class LoginTest {
	WebDriver driver;
	LogFactory logfactory;
	
	@Given("user is on the login page of Swag Lab")
	public void user_is_on_the_login_page_of_swag_lab() {
		  WebDriverManager.chromedriver().setup();
		  driver = new ChromeDriver();         
		  driver.get("https://www.saucedemo.com/"); 
		  driver.manage().window().maximize();
	}
	
	@When("User enter uname & password")
	public void user_enter_uname_password() {
	logfactory = new LogFactory(driver);
	logfactory.swagLogin();;
	}
	
	@And("User clicks on login button")
	public void user_clicks_on_login_button() {
		logfactory.clickbtn();
	}
	
	@Then("Login should be successful")
	public void login_should_be_successful() throws IOException {
		//Assert.assertEquals(false, false);
		Utility.capture(driver);
		driver.close();
	}
	
	@When("User enter invalid uname & password")
	public void user_enter_invalid_uname_password() {
		logfactory = new LogFactory(driver);
		logfactory.swagLog();
	}
	
	@Then("Error message should display")
	public void error_message_should_display() throws IOException {
		Utility.capture(driver);
	    driver.close();
	}




}
