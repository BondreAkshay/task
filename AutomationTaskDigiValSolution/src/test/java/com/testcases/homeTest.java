package com.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.utility.excelUtils;
import com.utility.helper;


public class homeTest extends baseTest {
	@Test
	public void test1() throws Exception
	{
		hp.clickEnglish();
	//	hp.clickSpanish();
		for(int i=1;i<=5;i++)
		{
		hp.enterEnglishText(helper.excelRead(i, 0));
		String text = hp.resultText();
		Assert.assertEquals(text, helper.excelRead(i, 1));
		if(text.equals(helper.excelRead(i, 1)))
		{
			excelUtils.updatePassFailStatus(i, 2, "Passed");
		}
		else
		{
			excelUtils.updatePassFailStatus(i, 2, "Failed");
		}
		hp.clear();
		}
		}
	}
	
	


