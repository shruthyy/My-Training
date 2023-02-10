package com.obsqura.mainmaven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public WebDriver driver;
	
	public void loadBrowser() {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\PROJECTS\\\\OneDrive\\\\Desktop\\\\ECLIPSE\\\\MainMaven\\\\src\\\\main\\\\java\\\\Resources\\\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.get("https://www.flipkart.com/");
		
	}
	public void pageSource() {
		String actualsource="	requestAnimationFrame(function () {";
		String source=driver.getPageSource();
		if(source.contains(actualsource)) {
			System.out.println("Same as pagesource");
		}
		else {
			System.out.println("Not same");
		}
	}
	public void navigateCommands() {
		driver.navigate().to("https://github.com/");
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.quit();
	}
	public static void main(String[] args) {
		Flipkart flipkart=new Flipkart();
		flipkart.loadBrowser();
		flipkart.pageSource();
		flipkart.navigateCommands();
	}

}
