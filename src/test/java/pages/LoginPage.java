package pages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends FirstandFinal {
	
	//WebDriver driver;
	public LoginPage(WebDriver driver) {
		FirstandFinal.driver=driver;
		PageFactory.initElements(driver, this);
	}
 /************************ Attributes and its values*****************************/

	By uname=(By.id("username") );
	By password=(By.name("password") );
	By loginbutton=(By.id("login") );
	//By stringValidation=By.className("login_title");
 /************************ Attributes and its values*****************************/
	/************************ methods*****************************/
	 public void LoginActtion() {
		
		 driver.findElement(loginbutton).click();
	 }
	 public void enterPassword(String password1) {
		 
		
		 driver.findElement(password).sendKeys(password1);
		 
	 }
	 public void enterUsername(String usname) {
		
		 
		 driver.findElement(uname).sendKeys(usname);
		 
	 }
		/*
		 * public void printMessage() { // driver.findElement(stringValidation)
		 * 
		 * //System.out.println(driver.findElement(stringValidation).getText()); String
		 * Actual=driver.findElement(stringValidation).getText(); if
		 * (Actual.contains("Search Hotel")){
		 * System.out.println("Search hotel page is displayed"); }
		 * 
		 * 
		 * }
		 */
	 /************************ methods*****************************/
}
