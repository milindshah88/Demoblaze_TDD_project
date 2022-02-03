package pompackage;

import static org.testng.Assert.assertEquals;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import Basepackage.BaseDemoblazeClass;

public class Homepage extends BaseDemoblazeClass {
	
	public Homepage() throws FileNotFoundException {
		super();
		PageFactory.initElements(driver, this);
	}

	@FindBy (xpath ="//a[contains(text(),'Laptops')] ")
	WebElement Laptops;
	
   @FindBy (id ="cartur")
   WebElement cart;

   @FindBy (xpath ="//a[contains(text(),'MacBook air')]")
   WebElement Macbookair;
   @FindBy (xpath ="//a[contains(text(),'Sony vaio i5')]")
   WebElement sonyvio;
   @FindBy (xpath ="//a[contains(text(),'Add to cart')]")
   WebElement addtocartbutton;
   @FindBy (className="table-responsive")
	WebElement shoppingtable;
   public void purchaseproduct () throws InterruptedException
   
   {
	   @SuppressWarnings("deprecation")
	WebDriverWait wait = new WebDriverWait(driver, 50);
wait.until(ExpectedConditions.elementToBeClickable(Laptops)).click();


wait.until(ExpectedConditions.elementToBeClickable(Macbookair)).click();
  
wait.until(ExpectedConditions.elementToBeClickable(addtocartbutton)).click();
	 
	    
   }
	
   public void checkthecart()
   {cart.click();
	   
   }
   
   
   public  void verifycart() {
		String observedtext =shoppingtable.getText();
		
		
if (observedtext.contains("MacBook air"))
{boolean result = true;
Assert.assertEquals(result, true);
	}
else {boolean result =false;

Assert.assertEquals(result, true);
}



   }}
		
   


