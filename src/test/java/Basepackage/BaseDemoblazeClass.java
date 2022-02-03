package Basepackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Utility.TimeUtil;

public class BaseDemoblazeClass {
	
	public static Properties prop = new Properties();
	public static WebDriver driver;


	
	
	 public BaseDemoblazeClass() throws FileNotFoundException {
		 try {
		 FileInputStream file = new FileInputStream("C:\\Users\\mkuma\\eclipse-workspace\\Demoblaze_TDD_framework\\src\\test\\java\\EnvironmentPackage\\Config.properties");
		 prop.load(file);
		  }
		 
		 catch (FileNotFoundException e)

		 
		 
		 {
			 e.printStackTrace();
			 
		 }
		 catch (IOException a ) {
			 
			 a.printStackTrace();
		 }
		 
		
	 
	 }
		 public static void initiate() {
			 
			String browsername = prop.getProperty("browser");
			
			
			if(browsername.equals("Chrome")) {
				
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\mkuma\\eclipse-workspace\\Demoblaze_TDD_framework\\chromedriver.exe");
				driver  =new ChromeDriver();}
				
				else if (browsername.equals("Firefox")){
					
					System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
					
					driver = new FirefoxDriver();
				}
			
			
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(TimeUtil.Timepage, TimeUnit.SECONDS);
			driver.get(prop.getProperty("url"));
			
	
			}
			 
			 
			 
		 }
		 
		 
		 
		 
	 
      
