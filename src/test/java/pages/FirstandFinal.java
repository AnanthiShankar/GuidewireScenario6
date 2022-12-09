package pages;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.plugin.event.Result;
import io.cucumber.plugin.event.Status;
import utility.BrowserUtil;
import utility.ConfigDataProvider;
import utility.ReportSpark;

import java.io.File;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;


public class FirstandFinal {
	public static WebDriver driver;
	ConfigDataProvider CDP=new ConfigDataProvider();
	public ExtentSparkReporter reporter;
	public ExtentReports report;
	public void beforeSuite() {
		reporter=new ExtentSparkReporter(new File("./Reports/PC.html"));
		report=new ExtentReports();
		report.attachReporter(reporter);
	}
	
	public void launchBrowser() {
		driver=BrowserUtil.initApplication(driver,CDP.getBrowser(), CDP.getUrl());
	}
	
	public void exitBrowser() {
		BrowserUtil.exitBrowser(driver);
		//report.flush();
	}
	public void endOfTest(Result result) {
		if (result.getStatus()==Status.AMBIGUOUS ) {
			//Report.capturescreenshot(driver);
		}
		
	}
	
	 

}
