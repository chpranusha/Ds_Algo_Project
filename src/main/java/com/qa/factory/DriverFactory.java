package com.qa.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {
	
public WebDriver driver;
	
	public static ThreadLocal<WebDriver> tlDriver =new ThreadLocal<WebDriver>();
 /**
  * This method is used to initialize the threadlocal driver on the basis of given browser
  * @param browser
  * @return this will return tldriver.
  */
	
	public WebDriver  init_driver(String browser) {
		
		System.out.println("browser value is: " + browser);
		
		
		
		if (browser.equals("chrome")) {
		 WebDriverManager.chromedriver().setup();
		 
		 ChromeOptions options = new ChromeOptions();
		 options.addArguments("--remote-allow-origins=*");
		 options.addArguments("--disable notifications");
		 DesiredCapabilities cp =new DesiredCapabilities();
		 cp.setCapability(ChromeOptions.CAPABILITY ,options);
		 options.merge(cp);
		 tlDriver.set(new ChromeDriver(options));
		
		 }

		
		else if(browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			
			 tlDriver.set(new FirefoxDriver());
			
		}
		else if(browser.equals("safari")) {
			//WebDriverManager.Safaridriver().setup();
			 tlDriver.set(new SafariDriver());
			
		}
		else {
			System.out.println("please pass the correct browser value: "+ browser);
		}
		getDriver().manage().deleteAllCookies();
		getDriver().manage().window().maximize();
		return getDriver();
		
	}
	
	/**
	 * This is used to get the driver with ThreadLocal
	 * @return
	 */
	public static synchronized WebDriver getDriver() {
		return tlDriver.get();
	}


}
