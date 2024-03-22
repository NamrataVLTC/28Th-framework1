package Com.Ecommerce.TestCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Com.Ecommerce.BaseClass.Ecommerce_BaseClass;
import Com.Ecommerce.PageClasses.New_Registrations;
import net.bytebuddy.utility.RandomString;

public class TC_NewRegistration extends Ecommerce_BaseClass{
	@Test
	public void Registration() {
	
//	WebDriver driver = null;
		New_Registrations NR = new New_Registrations(driver);
		
		NR.Register();
		logger.info("Click on the Register button");
		
		NR.Gender();
		logger.info("Click on the Gender");
		
		NR.SetFirstname("Namrata");
		logger.info("Enter First Name");
		
		NR.Setlastname("More");
		logger.info("Enter Last Name");
		
		String Name = RandomString.make(5);
		
		NR.SetEmail(Name+"public@gmail.com");
	
		
		NR.SetPassword("Test@123");
		logger.info("Set the Password");
		
		NR.SetConPassword("Test@123");
		logger.info("Conf the Password");
		
		NR.RegButton();
		logger.info("Click on Register Button");
		
		NR.verifyRegSuccessfully();
		logger.info("Verify Register Message");
		
		
	}

}
