package com.indigo.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Testbase {

	public static WebDriver driver;
	//public String sUrl,sHubUrl,sHubPort;
	public static Properties prop;
	
	public Testbase() {
		
		try {
			prop = new Properties();
			FileInputStream ip=new FileInputStream("C:\\selenium\\IndigoTest\\src\\main\\java\\com\\indigo\\qa\\config\\config.properties");
			/*sHubUrl = prop.getProperty("HUB");
			sHubPort = prop.getProperty("PORT");
			sUrl = prop.getProperty("URL");*/
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Test
	@Parameters("browser")

	public static void intialization() {
		
		String browsername=prop.getProperty("browser");
		
		if(browsername.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver", 
				"./drivers/chromedriver.exe");
		 driver = new ChromeDriver();
		 
		}else if(browsername.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.gecko.driver", 
					"./drivers/geckodriver.exe");
			 driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));

		
		
		
	}
}