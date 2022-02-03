package pompackage;

import java.io.FileNotFoundException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Basepackage.BaseDemoblazeClass;



public class PomLogin extends BaseDemoblazeClass{
	public PomLogin() throws FileNotFoundException {
		super();
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}

	//object respository

	
	@FindBy (id ="login2")
	WebElement Login;
	
	
	  
	  @FindBy(id ="loginusername") WebElement uname;
	  
	  @FindBy (id ="loginpassword") WebElement pass;
	  
	  @FindBy(xpath ="//*[@id=\"logInModal\"]/div/div/div[3]/button[2]")
	  WebElement loginbutton;
	 
	


public void clicklogin()
{ 
	Login.click();

	}
	
	  public void typeusername(String name) { uname.sendKeys(name); }
	  
	  public void typepassword (String pword) { pass.sendKeys(pword);
	  
	  }
	  
	  public void clickloginbutton() {loginbutton.click(); }
	 

}