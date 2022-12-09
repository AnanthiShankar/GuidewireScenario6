package StepDefinitions;

import org.openqa.selenium.support.PageFactory;

import OverrideFunctions.WebElements;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.FirstandFinal;
import pages.LoginPage;
import pages.SearchHotelPage;
import utility.ExcelDataProvider;
import utility.ReportSpark;

public class SearchHotel extends FirstandFinal {
	LoginPage LP=PageFactory.initElements(FirstandFinal.driver, LoginPage.class);
	ExcelDataProvider EDP=new ExcelDataProvider();
	ReportSpark R1=new ReportSpark();
	WebElements WB=new WebElements(driver);
	
	SearchHotelPage SHP=PageFactory.initElements(FirstandFinal.driver, SearchHotelPage.class);
	@Given("User is on the SearchHotelPage")
	public void user_is_on_the_search_hotel_page() {
		SHP.printMessage();
	}

	@Given("User is enterting values and click on search")
	public void user_is_enterting_values_and_click_on_search() {
		String methodName="user_is_on_the_search_hotel_page";
		String sheetName="SearchHotel";
		String testCaseName="TC01";
		int rowcount=EDP.getRowCount(sheetName);
		for (int i=1;i<=rowcount;i++) {
			if (EDP.getStringData(sheetName, i, 0).contentEquals(testCaseName)) {
				if (EDP.getStringData(sheetName, i, 2).equalsIgnoreCase("WebListBox")){
					String valueToSelect=EDP.getStringData(sheetName, i, 3);
					String itemToSelect=EDP.getStringData(sheetName, i, 1);
					SHP.SelectItem(itemToSelect, valueToSelect);
					//System.out.println(itemToSelect);
				}else if (EDP.getStringData(sheetName, i, 2).contentEquals("WebTextBox")) {
					String valueEnter=EDP.getStringData(sheetName, i, 1);
					String itemToSelect=EDP.getStringData(sheetName, i, 1);
					SHP.enterTextvalue(itemToSelect, valueEnter);
				}else if (EDP.getStringData(sheetName, i, 2).contentEquals("WebButton")) {
					String buttonToClick=EDP.getStringData(sheetName, i, 1);
					SHP.clickButton(buttonToClick);
					
				}
				
				
			}
			
			
		}
		ReportSpark.capturescreenshot(driver);
		R1.sparkReportPass(methodName);
	}

	@Then("validating search results")
	public void validating_search_results() {
		SHP.validatingSelectHotel();
	}


}
