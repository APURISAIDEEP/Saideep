package Testscript;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import genriclibraries.BaseClass;

public class Thirdtest extends BaseClass {
	
		 @Test
		 public void thirdTest() throws InterruptedException {
			 SoftAssert soft=new SoftAssert();
			 home.searchFor("core java for selenium");
			 soft.assertEquals(corejava.getPageHeader(),"CORE JAVA FOR SELENIUM");
			 corejava.clickCoreJavaForSeleniumLink();
		     soft.assertEquals(javavideo.pageHeader(),"Core java for selenium Training");
		     javavideo.clickPlayButton();
		     Thread.sleep(1000);
		     javavideo.cliclPauseButton();
		     web.switchbackFromFrame();
		     
		     soft.assertAll();
		 }
		 
		 
		}