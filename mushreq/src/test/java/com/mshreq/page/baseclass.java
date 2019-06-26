package com.mshreq.page;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;



public class baseclass {
	protected WebDriver driver;
	
	@BeforeClass
	public void setup() {
		
	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//driver//chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.mashreqbank.com/uae/en/personal/home");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
	
		
				
		
	}
		
	@AfterClass
	public void teardown()
	{
		driver.quit();
		
	}
}
