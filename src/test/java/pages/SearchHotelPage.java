package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import OverrideFunctions.WebElements;
import StepDefinitions.LoginPageTest;

public class SearchHotelPage extends FirstandFinal{
	WebElements elements=new WebElements(driver);
	public SearchHotelPage(WebDriver driver) {
		LoginPageTest.driver=driver;
		PageFactory.initElements(driver, this);
	}
	 /************************ Attributes and its values*****************************/
		By stringValidation=By.className("login_title");
		By location=(By.id("location") );
		By hotels=(By.id("hotels") );
		By roomType=(By.id("room_type") );
		By noOfRooms=By.id("room_nos");
		By adultperRoom=By.id("adult_room");
		By childrenperRoom=By.id("child_room");
		By checkInDate=By.name("datepick_in");
		By checkOutDate=By.name("datepick_out");
		By search=By.id("Submit");
		By reset=By.id("Reset");
		By radiobtn=By.id("radiobutton_0");
		By bookedIteneryLink=By.linkText("Booked Itinerary");
		By searchHotelLink=By.linkText("Search Hotel");
		By changePasswordLink=By.linkText("Change Password");
		By logoutLink=By.linkText("Logout");
		
		
	 /************************ Attributes and its values*****************************/
		public void SelectItem(String ItemName,String valueToselect) {
			
			if (ItemName.equalsIgnoreCase("Location")) {
			elements.selectListItem(ItemName, valueToselect, location);
			}else if(ItemName.equalsIgnoreCase("hotels")){
				elements.selectListItem(ItemName, valueToselect, hotels);	
			}
			else if(ItemName.equalsIgnoreCase("Room Type")){
				elements.selectListItem(ItemName, valueToselect, roomType);	
			}
			else if(ItemName.equalsIgnoreCase("Number of Rooms")){
				elements.selectListItem(ItemName, valueToselect, noOfRooms);	
			}
			else if(ItemName.equalsIgnoreCase("Adults per Room")){
				elements.selectListItem(ItemName, valueToselect, adultperRoom);	
			}
			
			
		 }
		
		
		public void enterTextvalue(String ItemName,String valueToEnter) {
			
			if (ItemName.equalsIgnoreCase("Check In Date")) {
				elements.selectListItem(ItemName, valueToEnter, checkInDate);
				}else if(ItemName.equalsIgnoreCase("Check Out Date")){
					elements.selectListItem(ItemName, valueToEnter, checkOutDate);	
				}
			
			
		 }
	
		
		public void clickButton(String buttonToClick) {
			
			elements.clickButton(buttonToClick, search);
			
			
		 }
		 public void printMessage() {
				
				String Actual=driver.findElement(stringValidation).getText();
				 if (Actual.contains("Search Hotel")){
					 System.out.println("Search hotel page is displayed");			 
				 }
			 }
		 public void validatingSelectHotel() {
					 
				 		 
			 if (driver.findElement(radiobtn).isDisplayed()){
				 System.out.println("Select hotel page is displayed");			 
			 }
		 }
	 
}
