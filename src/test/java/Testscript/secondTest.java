package Testscript;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import genriclibraries.BaseClass;

public class secondTest extends BaseClass  {
		@Test
		
		public void secondtest() {
			SoftAssert soft=new SoftAssert();
			home.clickGears();
			home.clickSkillrarydemoApp();
			web.switchTochildbrowser();
			soft.assertEquals(demoApp.getPageHeader(), "SkillRary-ECommerce");
			demoApp.selectCategory(Web,1);
			soft.assertEquals(testing.getPageHeader(), "Testing");
			web.dragandDropElement(testing.JavaImage(),testing.getCartArea());
			web.ScrollToElement(testing.getFacebookIcon());
			testing.clickFacebookIcon();
			soft.assertAll();
			
			
		}
	}