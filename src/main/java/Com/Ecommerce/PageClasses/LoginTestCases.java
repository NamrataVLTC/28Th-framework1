package Com.Ecommerce.PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.Ecommerce.BaseClass.Ecommerce_BaseClass;

public class LoginTestCases extends Ecommerce_BaseClass {
	
	public LoginTestCases(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//a[contains(text(),\"Log in\")]")
	public WebElement Login;
	
	@FindBy(id="Email")
	public WebElement UserEmail;
	
	@FindBy(id="Password")
	public WebElement UserPass;
	
	@FindBy(xpath="//button[@class=\"button-1 login-button\"]")
	public WebElement Userloginbutton;
	
	public void LoginButton() {
		
		Login.click();
	}
	
	public void SetUserEmail() {
		
		UserEmail.sendKeys("public@gmail.com");
		
	}
	
	public void SetUserPass() {
		
		UserPass.sendKeys("Test@123");
	}
	

	public void userLoginButton() {
		
		Userloginbutton.click();
	}
}
