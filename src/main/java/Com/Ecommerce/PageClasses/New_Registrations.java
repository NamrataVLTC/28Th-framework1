package Com.Ecommerce.PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class New_Registrations {


//1
	public New_Registrations(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	//2
	@FindBy(xpath="//a[contains(text(),\"Register\")]")
	public WebElement Register;
		
	@FindBy(xpath="(//label[@class=\"forcheckbox\"])[1]")
	public WebElement Male;
	
	@FindBy(xpath="(//label[@class=\"forcheckbox\"])[2]")
	public WebElement Female;
	
	@FindBy(id="FirstName")
	public WebElement Firstname;
	
	@FindBy(id="LastName")
	public WebElement Lastname;
	
//	@FindBy(xpath="//option[contains(text(),\"Day\")]")
//	public WebElement Day;
	
//	@FindBy(xpath="//option[contains(text(),\"Month\")]")
//	public WebElement Month;
//	
//	@FindBy(xpath="//option[contains(text(),\"Year\")]")
//	public WebElement Year;
	
	@FindBy(id="Email")
	public WebElement Email;
	
	@FindBy(id="Password")
	public WebElement Password;
	
	@FindBy(id="ConfirmPassword")
	public WebElement ConfirmPassword;
	
	@FindBy(id="register-button")
	public WebElement registerbutton;
	
	@FindBy(xpath="//div[contains(text(),\"Your registration completed\")]")
	public WebElement RegSuccessfully;
	
	
	public void Register() {
		
		Register.click();
	}
	
	public void Gender() {
		
		Female.click();
	}
	
	public void SetFirstname(String firstname) {
		
		Firstname.sendKeys(firstname);
	}
	
	public void Setlastname(String lastname) {
		
		Lastname.sendKeys(lastname);
}
	public void SetEmail(String email) {
		
		Email.sendKeys(email);	
	
}
	
	public void SetPassword(String pass) {
		
		Password.sendKeys(pass);	
}
	public void SetConPassword(String Conpass) {
		ConfirmPassword.sendKeys(Conpass);
	}
	
	public void RegButton() {
		
		registerbutton.click();
	}
	
	public void verifyRegSuccessfully() {
		
		boolean value =RegSuccessfully.isDisplayed();
		
		if(value= true) {
			
			System.out.println("RegSucessfully");
			
			Assert.assertTrue(true);
		}
		else {
			
			Assert.assertTrue(false);
		}
	}
}
