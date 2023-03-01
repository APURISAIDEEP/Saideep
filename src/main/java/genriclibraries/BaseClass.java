package genriclibraries;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import PomPages.ContactUsPage;
import PomPages.CoreJavaForSeleniumPage;
import PomPages.CoreJavaVidieoPage;
import PomPages.HomePage;
import PomPages.SeliniumtrainingPage;
import PomPages.SkillraryDemoAppPage;
import PomPages.TestingPage;

public class BaseClass {

		protected PropertiesUtility property;
		protected 	ExcelUtility excel;
		protected WebDriverUtility web;
		protected WebDriver driver;
		protected HomePage home;
		protected SkillraryDemoAppPage demoApp;
		protected SeliniumtrainingPage  selenium;
		protected CoreJavaVidieoPage javaVedio;
		protected CoreJavaForSeleniumPage coreJava;
		protected TestingPage testing;
		protected ContactUsPage contact;
		
		
		//@BeforeSuite
		//@BeforeTest
		@BeforeClass
		public void classConfiguration()
		{
			property=new PropertiesUtility();
			 excel=new ExcelUtility();
			 web=new WebDriverUtility();
			 
			 property.propertiesInitialization(IConstantPath.PROPERTIES_FILEPATH);
			 excel.excelInitialization(IConstantPath.EXCEL_FILE_PATH);
		}
		@BeforeMethod
		public void methodConfiguration()
		{
			long time=Long.parseLong(property.fetchProperty("timeouts"));
			driver =web.openApplcation(property.fetchProperty("browser"),property.fetchProperty("url"), time);
			home =new HomePage(driver);
			Assert.assertTrue(true);
			demoApp=new SkillraryDemoAppPage(driver);
			selenium =new SeliniumtrainingPage(driver);
			testing =new TestingPage(driver);
			coreJava =new CoreJavaForSeleniumPage(driver);
			javaVedio =new CoreJavaVidieoPage(driver);
			contact =new ContactUsPage(driver);
			
			
			
		}
		@AfterMethod
		public void methodTearDown()
		{
			web.quit Browser();
		}
		@AfterClass
		public void classTearDown()
		{
			excel.closeExcel();
		}
		
		//@AfterTest
		//@AfterSuite
		
	}