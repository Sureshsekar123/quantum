package main.java.BDD.quantum;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.qmetry.qaf.automation.keys.ApplicationProperties;
import com.qmetry.qaf.automation.step.QAFTestStep;
import com.qmetry.qaf.automation.step.QAFTestStepProvider;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebDriverCommandAdapter;
import io.github.bonigarcia.wdm.WebDriverManager;
@QAFTestStepProvider
public class steps extends QAFWebDriverCommandAdapter {
	WebDriver driver;
	
	@QAFTestStep(description="start the browser")
	 public void startTheBrowser() throws Exception {
		 
		 WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
		System.out.println(ApplicationProperties.DRIVER_NAME.toString());
		 driver.get("https://www.youtube.com/");
		 driver.quit();
		 
	 }
	@QAFTestStep(description="start the browser with google")
	 public void startthebroesereithgoogle() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.google.com/");
		 driver.quit();
		 
	 }

	@QAFTestStep(description="change to youtube")
	 public void changetoyoutube() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.youtube.com/");
		 driver.quit();
		 
	 }
	
}
