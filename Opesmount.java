package com.obsqura.mainmaven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Opesmount {
	
	public WebDriver driver;
	public void initialiseBrowser(){
		System.setProperty("webdriver.chrome.driver","C:\\Users\\PROJECTS\\OneDrive\\Desktop\\ECLIPSE\\MainMaven\\src\\main\\java\\Resources\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("http://opesmount.in/grocerystore1/index.php?route=account/registerurl");
	}

	public static void main(String[] args) {
		Opesmount opesmount=new Opesmount();
		opesmount.initialiseBrowser();
	}

}
