package com.obsqura.TestNGNew;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Base {
	public WebDriver driver;
	@BeforeMethod
	public void initializeBrowser(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PROJECTS\\eclipse-workspace\\TestNGNew\\src\\main\\java\\Resources\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
	}
	
	
	
     @AfterMethod
	 public void driverQuit() {
	    	driver.quit();
	    }

}