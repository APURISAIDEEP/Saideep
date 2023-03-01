package PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genriclibraries.WebDriverUtility;

public class SeliniumtrainingPage {
	
		//Declaration
		@FindBy(xpath="//h1[@class='page-header']")
		private WebElement pageheader;
		@FindBy(id="add")
		private WebElement plusbutton;
		@FindBy(xpath="//button[.=' Add to Cart']")
		private WebElement addToCartButton;
		@FindBy(xpath="//div[@id='callout']")
		private WebElement itemAddedMesage;
		//Initialization
		public void SeleniumTrainingPage(WebDriver driver) {
			PageFactory.initElements(driver, this);
				}
		//Utilization
		public String getPageHeader() {
			return pageheader.getText();
			
		}
		public void doubleClickPlusButton(WebDriverUtility web) {
			web.doubleClickOnElement(plusbutton);
		}
		
		public void clickAddToCart() {
			addToCartButton.click();
		}
		
		public String getItemAddedMessage() {
			return itemAddedMesage.getText();
		}
	}


	


