package org.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	
	public static WebDriver driver;
	public static void openBrowser() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		}
	
	public static void maximize() {
		
		driver.manage().window().maximize();
		}
	
 
	
	public static void close() {
		driver.close();
	}
	
	
	public static void quitbrowser() {
		
		driver.quit();

	}
	
	public static void launchurl(String url) {
		driver.get(url);

	}
	

}
