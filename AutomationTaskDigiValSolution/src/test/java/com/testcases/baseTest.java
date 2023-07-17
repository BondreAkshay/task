package com.testcases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.pages.homePage;

public class baseTest {
	
	public static  WebDriver driver;
	
	public homePage hp;
	
	@BeforeSuite
	public void initbrowser()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://translate.google.com");	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	}
	
	@BeforeClass
	public void Objects()
	{
		hp = new homePage(driver);
	}
	
	@BeforeMethod
	public void cler()
	{
		hp.clear();
	}
	
	@AfterSuite
	public void tearDown()
	{
		driver.quit();
	}
}
