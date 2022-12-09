package OverrideFunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import pages.FirstandFinal;

public class WebElements extends FirstandFinal {
	public WebElements(WebDriver driver) {
		FirstandFinal.driver=driver;
		PageFactory.initElements(driver, this);
	}
	//WebDriver driver;
	
	public void selectListItem(String nameListbox,String valueToselect,By location){
		
		driver.findElement(location).sendKeys(valueToselect);
		
		
	 }

	public void enterTextValue(String nameListbox,String valueToEnter,By location) {
		
		driver.findElement(location).sendKeys(valueToEnter);
		
		
	 }
	public void clickButton(String buttonToClick,By location) {
		
		driver.findElement(location).click();		
		
	 }
}
