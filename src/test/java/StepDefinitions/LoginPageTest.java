package StepDefinitions;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.FirstandFinal;
import pages.LoginPage;
import pages.SearchHotelPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import utility.ExcelDataProvider;
import utility.ReportSpark;

public class LoginPageTest extends FirstandFinal {
	LoginPage LP=PageFactory.initElements(FirstandFinal.driver, LoginPage.class);
	ExcelDataProvider EDP=new ExcelDataProvider();
	ReportSpark R1=new ReportSpark();
	SearchHotelPage SHP=PageFactory.initElements(FirstandFinal.driver, SearchHotelPage.class);
	//sparkReport SR=new sparkReport()
	  @Test
  @Given("User is on the guidewirepage")
	public void user_is_on_the_guidewirepage() {
	  LP.launchBrowser();
	}
  @Test
  @Given("User is Logging in Guidewire HomePage with values present  in Login pagesheet {string} and {string}")
  public void user_is_logging_in_guidewire_home_page_with_values_present_in_login_pagesheet_and(String sheetName,String userId) {
	  		String methodName="User is Logging in Guidewire HomePage";
	   		int i=EDP.getRowNo(sheetName,userId);
	   		if (i>0){
	   			System.out.println("The row number which matches the given user id from the sheet is :"+i+"and the value is "+EDP.getStringData(0, i, 1));
	   			LP.enterUsername(userId);
				LP.enterPassword(EDP.getStringData(0, i, 1));
				LP.LoginActtion();
				ReportSpark.capturescreenshot(driver);
				R1.sparkReportPass(methodName);
				
				}
	   			else {
	   			System.out.println("The value is not present in the sheet.Kindly Check ");
	   			R1.sparkReportFailure(methodName);
	   			
	   		}
	  		
			
		}
 
  @Test
  @Then("exit the browser")
	public void exit_the_browser() {
		//LP.exitBrowser();
	}
  @Test(priority=2)
  @Given("Validating the screen with userid")
  public void validating_the_screen_with_userid() {
     SHP.printMessage();
  }

}

