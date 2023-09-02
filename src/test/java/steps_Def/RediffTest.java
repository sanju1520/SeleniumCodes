package steps_Def;

import java.io.File;
import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;
//import java.util.List;

//import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Pages.RediffPageFactory;

//import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class RediffTest {
	WebDriver driver;
	RediffPageFactory red;
	
	@Given("user is on create account page")
	public void user_is_on_create_account_page() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();         // creating web-driver instance
		driver.get("http://register.rediff.com/register/register.php?FormName=user_details"); 
		driver.manage().window().maximize();
		
	}
	@When("user takes full_name , mailId , password , repassword , alternateMailId , mobileNo from excel sheet")
	public void user_takes_full_name_mail_id_password_repassword_alternate_mail_id_mobile_no_from_excel_sheet() throws IOException {
		red=new RediffPageFactory(driver);
		
		File file=new File("C:\\Users\\satate\\eclipse_workspace_3\\SeleniumTraining\\SeleniumCodes\\ExcelSheets\\Data.xlsx");
		FileInputStream fis=new FileInputStream(file);
		Workbook w=new XSSFWorkbook(fis);
		Sheet s=w.getSheetAt(0);
		
		String c1=s.getRow(0).getCell(0).getStringCellValue();
		String c2=s.getRow(0).getCell(1).getStringCellValue();
		String c3=s.getRow(0).getCell(2).getStringCellValue();
		String c4=s.getRow(0).getCell(3).getStringCellValue();
		String c5=s.getRow(0).getCell(4).getStringCellValue();
		String c6=s.getRow(0).getCell(5).getStringCellValue();
		
		red.createAccount(c1,c2, c3,c4,c5, c6);

		
	}
	@And("click on create my account button")
	public void click_on_create_my_account_button() {
	   red.clickBtn();
	}
	@Then("The message box should display")
	public void the_message_box_should_display() {
	    
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	@Given("user is on create account page")
//	public void user_is_on_create_account_page() {
//		WebDriverManager.chromedriver().setup();
//		  driver = new ChromeDriver();         // creating web-driver instance
//		  driver.get("http://register.rediff.com/register/register.php?FormName=user_details"); 
//		  driver.manage().window().maximize();
//	}
//	@When("user enters full_name , mailId , password , repassword , alternateMailId , mobileNo")
//	public void user_enters_full_name_mail_id_password_repassword_alternate_mail_id_mobile_no(DataTable data) {
//	   red=new RediffPageFactory(driver);
//	   List<List<String>> list= data.asLists(String.class);
//	   for(List<String> table:list) {
//	   red.createAccount(table.get(0),table.get(1),table.get(2), table.get(3), table.get(4),table.get(5));
//	  }
//    }
//	  
//	@When("click on create my account button")
//	public void click_on_create_my_account_button() {
//	  red.clickBtn();
//	}
//	@Then("The message box should display")
//	public void the_message_box_should_display() {
//	    
//	}
	
//	@Given("user is on home page")
//	public void user_is_on_home_page() {
//		 WebDriverManager.chromedriver().setup();
//		  driver = new ChromeDriver();         // creating web-driver instance
//		  driver.get("https://www.rediff.com/"); 
//		  driver.manage().window().maximize();
//	    
//	}
//	@When("user enters keyword in search bar")
//	public void user_enters_keyword_in_search_bar(DataTable keyword) {
//		red=new RediffPageFactory(driver);
//	    List<String> cells= keyword.asList(String.class);
//	    red.sText(cells.get(0));
//	}
//	@And("click on search icon")
//	public void click_on_search_icon() {
//	   red.sButton();
//	}
//	@Then("info about keyword should display")
//	public void info_about_keyword_should_display() {
//	    driver.close();
//	}
	
	
	
//	@Given("user is on home page")
//	public void user_is_on_home_page() {
//		 WebDriverManager.chromedriver().setup();
//		  driver = new ChromeDriver();         // creating web-driver instance
//		  driver.get("https://www.rediff.com/"); 
//		  driver.manage().window().maximize();
//	   
//	}
//	
//	@When("^user enters (.*) in search bar$")
//	public void user_enters_manipur_in_search_bar(String keyword) {
//	    red=new RediffPageFactory(driver);
//	    red.sText(keyword);
//	}
//	
//	@And("click on search icon")
//	public void click_on_search_icon() {
//		red.sButton();
//	    
//	}
//	@Then("info about keyword should display")
//	public void info_about_keyword_should_display() {
//	    driver.close();
//	}


}
