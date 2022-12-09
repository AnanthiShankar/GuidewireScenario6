package runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
	features="Features/SearchHotel.feature",
	glue={"StepDefinitions"}
	//plugin={"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
	)
public class Runner extends AbstractTestNGCucumberTests{

}
