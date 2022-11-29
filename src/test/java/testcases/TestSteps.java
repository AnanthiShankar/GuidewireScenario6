package testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.FirstandFinal;
import pages.LoginPage;
import utility.ExcelDataProvider;

public class TestSteps extends FirstandFinal{
	public ExcelDataProvider EDP=new ExcelDataProvider();
	
	
	
	public LoginPage LP=PageFactory.initElements(driver, LoginPage.class);
	FirstandFinal FnF=new FirstandFinal();
	@Test
	@Given("User is on the Guidewire HomePage")
	public void user_is_on_the_guidewire_home_page() throws InterruptedException {
		
		//TestSteps Ts=Ts.launchBrowser();
		FnF.launchBrowser();
		System.out.println("Login page");
		System.out.println(EDP.getRowCount(0));
		//Thread.sleep(10000);
	}
	
	@When("User enters the userid details")
	public void user_enters_the_userid_details() {
		for (int i=1;i<=(EDP.getRowCount(0));i++) {
			System.out.println(EDP.getStringData(0, i, 0));
			LP.enterUsername(EDP.getStringData(0, i, 0));
			
		}
	}
	
	@When("User enters the password details")
	public void user_enters_the_password_details() {
		for (int i=1;i<=(EDP.getRowCount(0));i++) {
			
			LP.enterPassword(EDP.getStringData(0, i, 1));
			
		}
	    
	}
	
	@When("User clicks the login button")
	public void user_clicks_the_login_button() {
		
			LP.LoginActtion();
		
	    
	}
	
	@When("Login is successful")
	public void login_is_successful() {
	   LP.printMessage();
	}

	@Given("User is on the create account page")
	public void user_is_on_the_create_account_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("User enter the details of  Person account")
	public void user_enter_the_details_of_person_account() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("User validates pop-ups")
	public void user_validates_pop_ups() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Account is created")
	public void account_is_created() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
}
