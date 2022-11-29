package pages;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utility.BrowserUtil;
import utility.ConfigDataProvider;


public class FirstandFinal {
	public static WebDriver driver;
	ConfigDataProvider CDP=new ConfigDataProvider();
	@BeforeTest
	public void launchBrowser() {
		driver=BrowserUtil.initApplication(driver,CDP.getBrowser(), CDP.getUrl());
	}
	@AfterTest
	public void exitBrowser() {
		BrowserUtil.exitBrowser(driver);
	}
	
	 

}
