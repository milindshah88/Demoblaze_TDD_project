package TestLayer;

import static org.testng.Assert.assertEquals;

import java.io.FileNotFoundException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Basepackage.BaseDemoblazeClass;
import pompackage.Homepage;
import pompackage.PomLogin;

public class Testcases extends BaseDemoblazeClass{

	PomLogin Log;
	Homepage Hp;

	public Testcases () throws FileNotFoundException   {
		super();
		
		
		
	}
	
	
	@BeforeSuite
	
	
	public void setup() throws FileNotFoundException
	{initiate();
	
		Log = new PomLogin();
		Hp =new Homepage();
	
		
	}
	
	
	@BeforeMethod
	
	public void TC01_Login() throws InterruptedException
	{		
		Log.clicklogin();
		Thread.sleep(2000);
		  Log.typeusername(prop.getProperty("Username"));
		  Log.typepassword(prop.getProperty("Password"));
		  Log.clickloginbutton();
	Thread.sleep(2000);
	
	}
	
	
	  @AfterMethod
	  
	  public void teardown()
	  
	  { driver.close(); }
	 
	  
	  @Test
	  
	  public void TC02_shoppingcartverification () throws InterruptedException
	  {
		  
		  Hp.purchaseproduct();
		  Thread.sleep(5000);
		  driver.switchTo().alert().accept();
		  Thread.sleep(10000);
		  Hp.checkthecart();
		  Thread.sleep(10000);
		  Hp.verifycart();
		
		  
	  }
	
}
