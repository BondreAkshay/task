package com.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.utility.helper;

public class homeTest2 extends baseTest {
	
	@Test(priority = 0)
	public void engSpanishSetup()
	{
		hp.clickEnglish();
	}
	
	@Test(priority = 1)
	public void test1() throws Exception
	{
		hp.enterEnglishText(helper.excelRead(1, 0));
		String text = hp.resultText();
		Assert.assertEquals(text, helper.excelRead(1, 1));
		
		
		
		}
	
	@Test(priority = 2)
	public void test2() throws Exception
	{
		hp.enterEnglishText(helper.excelRead(2, 0));
		String text = hp.resultText();
		Assert.assertEquals(text, helper.excelRead(2, 1));	
		}
	
	@Test(priority = 3)
	public void test3() throws Exception
	{
		hp.enterEnglishText(helper.excelRead(3, 0));
		String text = hp.resultText();
		Assert.assertEquals(text, helper.excelRead(3, 1));
		
		}
	
	@Test(priority = 4)
	public void test4() throws Exception
	{
		hp.enterEnglishText(helper.excelRead(4, 0));
		String text = hp.resultText();
		Assert.assertEquals(text, helper.excelRead(4, 1));
		}
	
	@Test(priority = 5)
	public void test5() throws Exception
	{
		hp.enterEnglishText(helper.excelRead(5, 0));
		String text = hp.resultText();
		Assert.assertEquals(text, helper.excelRead(5, 1));
		}

}
