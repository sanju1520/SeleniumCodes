package steps_Def;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Pages.LogFactory;
import com.testNG.Utility;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginScenarioTest {
	WebDriver driver=null;
	LogFactory logfactory=new LogFactory(driver);
	
	@Given("user is on the login page of Swag Lab")
	public void user_is_on_the_login_page_of_swag_lab() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@When("User enter username & password")
	public void user_enter_username_password(io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	    throw new io.cucumber.java.PendingException();
	}
	@And("User clicks on login button")
	public void user_clicks_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("Login should be successful")
	public void login_should_be_successful() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	@Given("user is on the login page of Swag Lab")
//	public void user_is_on_the_login_page_of_swag_lab() {
//		WebDriverManager.chromedriver().setup();
//		  driver = new ChromeDriver();         // creating web-driver instance
//		  driver.get("https://www.saucedemo.com/"); 
//		  driver.manage().window().maximize();
//	    
//	}
//	@When("^User enter (.*) & (.*)$")
//	public void user_enter_uname_secret_sauce(String username,String password) {
//		logfactory.swagLabsLogInData(username, password);
//		
//	}
//	@And("User clicks on login button")
//	public void user_clicks_on_login_button() {
//		logfactory.clickbtn();
//	}
//	@Then("Login should be successful")
//	public void login_should_be_successful() throws IOException {
//		Utility.capture(driver);
//	}

}

	
	
	
	
	
	
	
	
	
//	@Given("user is on the login page of Swag Lab")
//	public void user_is_on_the_login_page_of_swag_lab() {
//		  WebDriverManager.chromedriver().setup();
//		  driver = new ChromeDriver();         // creating web-driver instance
//		  driver.get("https://www.saucedemo.com/"); 
//		  driver.manage().window().maximize();
//	}
//	
//	@When("User enter (.*) & (.*) ")
//	public void user_enter(String uname, String password) {
//		logfactory.swagLogin(uname, password);;
//	   
//	}
//	@And("User clicks on login button")
//	public void user_clicks_on_login_button() {
//		logfactory.clickbtn();
//	    
//	}
//	@Then("Login should be successful")
//	public void login_should_be_successful() throws IOException {
//		Utility.capture(driver);
//	    
//	}

