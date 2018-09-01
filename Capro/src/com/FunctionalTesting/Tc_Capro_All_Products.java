package com.FunctionalTesting;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.CommonUtilities.Data_Driven_design;
import com.CommonUtilities.ScreenShot;

public class Tc_Capro_All_Products {
	WebDriver driver;
	@FindBy(xpath=".//*[@id='menuzord']/ul/li[3]/a")
	WebElement Product;
	@FindBy(xpath=".//*[@id='menuzord']/ul/li[3]/ul/li[2]/a")
	WebElement  allproducts;
	@FindBy(xpath="//a[text()='Abcap Capsule']")
	WebElement abcap;
	@FindBy(xpath="//a[text()='Arjit Capsule']")
	WebElement arjit;
	@FindBy(xpath="//a[text()='Broncap Capsule']")
	WebElement Broncap;
	@FindBy(xpath="//a[text()='Lucatone Syrup']")
	WebElement Luncatone;
	@FindBy(xpath=".//*[@id='products_search']")
	WebElement EnterName;
	@FindBy(xpath=".//*[@id='search-members-form']/div/span/button")
	WebElement serch;
	@FindBy(xpath=".//*[@id='header']/div[5]/section[2]/div/div/div/div/div/div/div/div/div[2]/div[3]/a")
	WebElement viewdetails;
	@FindBy(xpath=".//*[@id='prescription_check']")
	WebElement upload;
	@FindBy(xpath=".//*[@id='add_to_cart']")
	WebElement addtocard;
	@FindBy(xpath=".//*[@id='buy_now']")
	WebElement buynow;
	@FindBy(xpath=".//*[@id='header']/div[5]/section[2]/div/div/div/div[1]/div[2]/div/div[3]/form/table/tbody/tr/td[2]/div/input[3]")
	WebElement Qulaityincr;
	@FindBy(xpath=".//*[@id='header']/div[5]/section[2]/div/div/div/div[1]/div[2]/div/div[3]/form/table/tbody/tr/td[2]/div/input[1]")
	WebElement qulaitydown;
	@FindBy(xpath=".//*[@id='header']/div[1]/div/div/div[2]/div/ul/li[1]/a[1]")
	WebElement login;
	@FindBy(xpath=".//*[@id='loginemail']")
	WebElement email;
	@FindBy(xpath=".//*[@id='loginpassword']")
	WebElement password;
	@FindBy(xpath=".//*[@id='loginform']/div[3]/button")
	WebElement signin;
	
	public Tc_Capro_All_Products(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void allproduct(WebDriver driver) throws InterruptedException, IOException {
		Thread.sleep(2000);
		Product.click();
		Thread.sleep(2000);
		Actions a=new Actions(driver);
		a.moveToElement(allproducts).click().build().perform();
		
//		WebDriverWait w=new WebDriverWait(driver, 30);
//		w.until(ExpectedConditions.elementToBeClickable(abcap)).click();
//		abcap.click();
//		driver.navigate().back();
//		Thread.sleep(2000);
//		arjit.click();
//		driver.navigate().back();
//		Thread.sleep(2000);
//		Broncap.click();
//		driver.navigate().back();
//		Thread.sleep(2000);
//		Luncatone.click();
//		driver.navigate().back();
		Thread.sleep(2000);
		EnterName.sendKeys("abcap capsule");
		serch.click();
		Thread.sleep(2000);
//		JavascriptExecutor js=(JavascriptExecutor)driver;
//		js.executeScript("window.scrollBy(0,10)","");
//		addtocard.click();
//		ScreenShot.main(driver,"Tc_Capro_All_Products");
		
//		viewdetails.click();
//		Thread.sleep(2000);
////		upload.click();
//		
		addtocard.click();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,-10)","");
		
		buynow.click();
		ScreenShot.main(driver,"Tc_Capro_All_Products");
		Qulaityincr.click();
		qulaitydown.click();
		
		
		
	}
	public void login(WebDriver driver) throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		login.click();
		Data_Driven_design data1=new Data_Driven_design();
		String Em=data1.getdata("Sheet1",3,1);
		String pass=data1.getdata("Sheet1",3,5);
		email.sendKeys(Em);
		password.sendKeys(pass);
		signin.click();
		
	}
	

}
