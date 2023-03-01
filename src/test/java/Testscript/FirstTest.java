package Testscript;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import genriclibraries.BaseClass;

public class FirstTest extends BaseClass {
		@Test
		public void firstTest()
		{
			SoftAssert soft=new SoftAssert();
			home.clickGears();
			home.clickSkillrarydemoApp();
			web.switchToChildBrowser();
			soft.assertEquals(demoApp.getPageHeader(),"SkillRary-Ecommerce");
			demoApp.mouseHoverTocourse(web);
			demoApp.clickSeleniumTraining();
			soft.assertEquals(selenium.getPageHeader(),"Selenium Training");
			selenium.doubleClickPlusButton(web);
			selenium.clickAddToCart();
			web.handleAlert();
			
			soft.assertTrue(selenium.getItemAddedMessage().isDisplayed());
			
			soft.assertAll();
			
		}
	}