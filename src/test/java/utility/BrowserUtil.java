package utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserUtil {

		public static WebDriver initApplication(WebDriver driver,String browserName,String appUrl) {
			if (browserName.equalsIgnoreCase("Chrome")){
				
				System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
				driver=new ChromeDriver();
			}else if (browserName.contains("Edge")) {
				System.setProperty("webdriver.edge.driver","./Drivers/edgedriver.exe");
				driver=new EdgeDriver();
			}else if (browserName.equalsIgnoreCase("Firefox")){
				System.setProperty("webdriver.gecko.driver","./Drivers/geckodriver.exe");
				driver=new FirefoxDriver();
			}
			else {
				System.out.println("This driver is not supported at this moment");
			}
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.MILLISECONDS);	
			driver.manage().window().maximize();
			driver.get(appUrl);
			return driver;
			
		}
		
		public static  void exitBrowser(WebDriver driver) {
			driver.quit();
			
		}
}
