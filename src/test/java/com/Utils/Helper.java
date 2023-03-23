package com.Utils;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Helper {
	private static Helper Helper;    
	private static WebDriver driver ;

	//public final static int TIMEOUT = 2;
	public final static int TIMEOUT = 2;


	private Helper() {

		WebDriverManager.chromedriver().setup(); //setting up and initializing webdriver
		
		//Resolving the chrome chrome websocket error

		System.setProperty("webdriver.http.factory","jdk-http-client");

	
//		ChromeOptions options = new ChromeOptions();
//
//		options.addArguments("--disable-notifications");
//
//		options.addArguments("--disable-gpu");
//
//		options.addArguments("--disable-extensions");
//
//		options.addArguments("--no-sandbox");
//
//		options.addArguments("--disable-dev-shm-usage");
//		
//		options.addArguments("--remote-allow-origins=*");
//		
//		DesiredCapabilities capabilities = new DesiredCapabilities();
//
//		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
//
//		options.merge(capabilities);
		
//		
//   ChromeOptions options = new ChromeOptions();
//
//		options.addArguments("--remote-allow-origins=*");
//
//		DesiredCapabilities cp=new DesiredCapabilities();
//
//	    cp.setCapability(ChromeOptions.CAPABILITY, options);
//
//	options.merge(cp);
	


		//pass options as argument to chromedriver
		 driver = new ChromeDriver();


		new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMEOUT));
		driver.manage().window().maximize();
	}

	public static void openPage(String url) throws InterruptedException {
		
		driver.get(url);
		Thread.sleep(2000);
	}
	
	public static String getTitle() {
		return driver.getTitle();
	}
	
	public static void NavBack() {
		driver.navigate().back();
	}
	
	public static WebDriver getDriver() {
		return driver;
	}

	public static void setUpDriver() {
		if (Helper==null) {
			Helper = new Helper();
		}
	}
	public static void tearDown() {
		if(driver!=null) {
		driver.close();
		driver.quit();
		}
		Helper = null;
	}

}