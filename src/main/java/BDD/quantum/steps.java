package main.java.BDD.quantum;



import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.qmetry.qaf.automation.keys.ApplicationProperties;
import com.qmetry.qaf.automation.step.QAFTestStep;
import com.qmetry.qaf.automation.step.QAFTestStepProvider;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebDriverCommandAdapter;
import io.github.bonigarcia.wdm.WebDriverManager;

@QAFTestStepProvider
public class steps extends QAFWebDriverCommandAdapter{
	WebDriverManager manager=null;
	WebDriver driver;
	
	@QAFTestStep(description="start the browser")
	 public void startTheBrowser() throws Exception {
		String browser=ApplicationProperties.DRIVER_NAME.getStringVal("Driver").toLowerCase();
		if(browser.contains("remote")) {
			System.out.println("remote");
			DesiredCapabilities DesiredCapabilities=new DesiredCapabilities();
			DesiredCapabilities.setBrowserName("chrome");
			DesiredCapabilities.setPlatform(Platform.WINDOWS);
			driver=new RemoteWebDriver((new URL("http://192.168.0.4:4444")),DesiredCapabilities);
		}else if(browser.contains("chrome")){
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}else if(browser.contains("edge")){
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}else if(browser.contains("firefox")){
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		
		
		//WebDriverManager.firefoxdriver().setup();
		 //driver=new FirefoxDriver();
		 driver.manage().window().maximize();
		
		 driver.get("https://www.youtube.com/");
		 System.out.println("Passed");
		 driver.quit();
		 
	 }
	@QAFTestStep(description="start the browser with google")
	 public void startthebroesereithgoogle() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.google.com/");
		 System.out.println("Passed");
		 driver.quit();
		 
	 }

	@QAFTestStep(description="change to youtube")
	 public void changetoyoutube() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.youtube.com/");
		 System.out.println("Passed");
		 driver.quit();
		 
	 }
	
}
