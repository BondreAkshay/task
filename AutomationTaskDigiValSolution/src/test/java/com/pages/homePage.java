package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utility.helper;

public class homePage {
	
   static WebDriver driver;
	
	public homePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath = "//*[@id='i9']") private WebElement english;
	
	@FindBy (xpath = "//*[@id='i13']") private WebElement spanish;
	
	@FindBy (xpath = "//*[@class='er8xn']") private WebElement inputTextFeild;
	
	@FindBy (xpath = "//*[@class='ryNqvb']") private WebElement textResult;
	
	@FindBy (xpath = "//*[@class='DVHrxd']//*[text()='clear']") private WebElement clearButton;

	
	
	public void clickEnglish()
	{
		english.click();
	}
	
	public void clickSpanish() throws InterruptedException
	{
		spanish.click();
		Thread.sleep(2000);
		spanish.click();
	}
	
	public void enterEnglishText(String Text)
	{
		inputTextFeild.sendKeys(Text);
	}
	
	public String resultText()
	{
		String text=textResult.getText();
		return text ;
	}
	
	public void clear()
	{
		helper.javaClick(driver, clearButton);
	}

}
