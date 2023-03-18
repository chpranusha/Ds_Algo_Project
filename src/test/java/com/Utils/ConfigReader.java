package com.Utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

	private static Properties properties;
	private final static String propertyFilePath = "./src/test/resources/Config/config.properties";

	public static void loadConfig() throws Throwable {

		try {
			FileInputStream fis;
			fis = new FileInputStream(propertyFilePath);
			properties = new Properties();
			try {
				properties.load(fis);
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("Configuration.properties not found at " + propertyFilePath);
		}
	}
	
	public static String getBrowserType() {
		String browser = properties.getProperty("browser");
		Loggerload.info("Get property BrowserType");
		if (browser != null)
			return browser;
		else
			throw new RuntimeException("browser not specified in the Configuration.properties file.");
	}

public static String geturl(String pagename) {
	String url = properties.getProperty(pagename);
	if (url != null)
		return url;
	else
		throw new RuntimeException(pagename + " url not specified in the Configuration.properties file.");
}

public static String getexcelfilepath() {
	String excelfilelpath = properties.getProperty("excelfilepath");
	if (excelfilelpath != null)
		return excelfilelpath;
	else
		throw new RuntimeException("Excel file path not specified in the Configuration.properties file.");
}

}

