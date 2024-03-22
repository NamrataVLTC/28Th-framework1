package Com.Ecommerce.TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import Com.Ecommerce.BaseClass.Ecommerce_BaseClass;
import Com.Ecommerce.PageClasses.LoginTestCases;

public class TC_LoginApplication extends Ecommerce_BaseClass {
	@Test
	public void Login() {
		
		LoginTestCases LT = new LoginTestCases(driver);
		
		LT.LoginButton();
		
		logger.info("Click on the login button");
		
		LT.SetUserEmail();
		logger.info("Enter the User email");
		
		LT.SetUserPass();
		logger.info("Enter the User password");
		
		LT.userLoginButton();
		logger.info("Click on the login button");
		
		String Title= driver.getTitle();
		
		if(Title.equals("nopCommerce demo store")) {
			
			Assert.assertTrue(true);
			logger.info("login test case pass");
		}
		else {
			
			Assert.assertTrue(false);
			logger.info("login test case failed");
		}
	}
	
	

}
