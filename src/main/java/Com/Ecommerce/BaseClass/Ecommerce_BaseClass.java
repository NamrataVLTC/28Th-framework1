package Com.Ecommerce.BaseClass;

import java.util.concurrent.TimeUnit;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import Com.Ecommerce.Utlities.WaitUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import Com.Ecommerce.Configuration.Readconfiguration;


public class Ecommerce_BaseClass {

	public static Logger logger;
	
	public  WebDriver driver;
	
	Readconfiguration readconfig = new Readconfiguration();
	
	public  String BaseURL= readconfig.getApplicationURL();
	public  String Username= readconfig.Username();
	public  String Password= readconfig.Password();
	
	@BeforeMethod
	public void initialization() {
		
		logger =logger.getLogger("28Oct_Auto_Framework");
		
		PropertyConfigurator.configure("\\Users\\User\\eclipse-workspace\\28Oct_Auto_Framework\\src\\test\\resources\\Configuration\\log4j.properties");
		
		WebDriverManager.chromedriver().setup();
		
		driver= new ChromeDriver();
		
		logger.info("Open browser");
		
		driver.manage().window().maximize();
		logger.info("Maximize browser");
		
		driver.manage().timeouts().implicitlyWait(WaitUtils.IMPLICIT_WAIT, TimeUnit.SECONDS);
		
		driver.manage().timeouts().pageLoadTimeout(WaitUtils.PAGE_LOAD_TIMEOUT,TimeUnit.SECONDS);
		
		driver.get(BaseURL);
		logger.info("Open the application");
	}
	
	@AfterMethod
	public void Teardown() throws InterruptedException {
		
		Thread.sleep(2000);
		
		driver.quit();
		logger.info("Close the browser");
		
	}
}
