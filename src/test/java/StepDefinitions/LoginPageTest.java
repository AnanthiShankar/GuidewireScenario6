package StepDefinitions;

import org.testng.annotations.Test;

import io.cucumber.java.en.Given;
import pages.FirstandFinal;
import pages.LoginPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import utility.ExcelDataProvider;

public class LoginPageTest extends FirstandFinal {
	

  @Test
  @Given("User is Logging in Guidewire HomePage")
  public void user_is_on_the_guidewire_home_page() throws InterruptedException {
	 	  
	   	 LoginPage LP=PageFactory.initElements(FirstandFinal.driver, LoginPage.class);
		 ExcelDataProvider EDP=new ExcelDataProvider();
		 LP.launchBrowser();
		for (int i=1;i<=(EDP.getRowCount(0));i++) {
			LP.enterUsername(EDP.getStringData(0, i, 0));
			LP.enterPassword(EDP.getStringData(0, i, 1));
			LP.LoginActtion();
			//LP.printMessage();
		}
		
		
  }
}

