package com.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.utility.excelUtils;
import com.utility.helper;


public class homeTest extends baseTest {
	//This is Completed Test Case
	
	@Test
	public void test1() throws Exception
	{
		hp.clickEnglish();
	//	hp.clickSpanish();
		for(int i=1;i<=5;i++)
		{
		hp.enterEnglishText(helper.excelRead(i, 0));
		String text = hp.resultText();
		SoftAssert Assert = new SoftAssert();
		Assert.assertEquals(text, helper.excelRead(i, 1));
		if(text.equals(helper.excelRead(i, 1)))
		{
			excelUtils.updatePassFailStatus(i, 2, "Pass");
			Assert.assertAll();
		}
		else
		{
			excelUtils.updatePassFailStatus(i, 2, "Fail");
		}
		hp.clear();
		}
		}
	}
	
	


