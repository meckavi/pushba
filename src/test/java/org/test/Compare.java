package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class Compare extends Base {
	
@BeforeClass 
	
	private void before() {
		
		openBrowser();		
	}	
	
   @BeforeMethod
	
	private void beforem() {
		maximize();
	}
	
	@Test
	
	private void wiki() throws InterruptedException {
		launchurl("https://en.wikipedia.org/wiki/Pushpa:_The_Rise");
		WebElement Wcountry = driver.findElement(By.xpath("//td[text()='India']"));
		WebElement Releasedate1 = driver.findElement(By.xpath("//div[contains(text(),'Release date')]//parent::th//following-sibling::td//li"));
		
		String Wikicountry = Wcountry.getText();
		System.out.println("WIKIPEDIA COUNTRY :"+Wikicountry);
		
		String Wikidate = Releasedate1.getText();
		System.out.println("WIKIPEDIA DATE :"+Wikidate);		
		
		Thread.sleep(3000);
		
		launchurl("https://www.imdb.com/title/tt9389998/");
		WebElement Imcountry = driver.findElement(By.xpath("//a[text()='India']"));
		WebElement Releasedate2= driver.findElement(By.xpath("//a[text()='December 17, 2021 (United States)']"));
		
		String Imdbcountry = Imcountry.getText();
		System.out.println("IMDB COUNTRY :"+Imdbcountry);
		
		String Imdbdate = Releasedate2.getText();
		System.out.println("IMDB DATE :"+Imdbdate);
		
		
		
		Assert.assertEquals(Imdbcountry, Wikicountry);
		
		Assert.assertEquals(Wikidate, Imdbdate);
	}
	
   @AfterMethod
	
	private void afterm() {
		close();

	}	
	

	@AfterClass
	
	private void last() {

		quitbrowser();  
	}	

	

}
