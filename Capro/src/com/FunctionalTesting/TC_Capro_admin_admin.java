package com.FunctionalTesting;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.CommonUtilities.Data_Driven_design;
import com.CommonUtilities.ScreenShot;

public class TC_Capro_admin_admin {
	WebDriver driver;
	@FindBy(xpath=".//*[@id='email']")
	WebElement email;
	@FindBy(xpath=".//*[@id='password']")
	WebElement password;
	@FindBy(xpath=".//*[@id='login-form']/footer/button")
	WebElement login;
	@FindBy(xpath=".//*[@id='extr-page']/body/div[3]/div/button[1]")
	WebElement OK;
	@FindBy(xpath=".//*[@id='show-shortcut']/span")
	WebElement Admin;
	@FindBy(xpath=".//*[@id='shortcut']/ul/li[1]/a/span/i")
	WebElement Mail;
	@FindBy(xpath=".//*[@id='shortcut']/ul/li[2]/a/span/i")
	WebElement Calender;
	@FindBy(xpath=".//*[@id='shortcut']/ul/li[3]/a/span/i")
	WebElement Maps;
	@FindBy(xpath=".//*[@id='shortcut']/ul/li[4]/a/span/i")
	WebElement Invoice;
	@FindBy(xpath=".//*[@id='shortcut']/ul/li[5]/a/span/i")
	WebElement Gallery;
	@FindBy(xpath=".//*[@id='shortcut']/ul/li[6]/a/span/i")
	WebElement Myprofile;
	public TC_Capro_admin_admin(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	public void login(WebDriver driver) throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		Data_Driven_design data1=new Data_Driven_design();
		String em=data1.getdata("Sheet1",4,1);
		String pass=data1.getdata("Sheet1",4,5);
		
		email.sendKeys(em);
		password.sendKeys(pass);
		login.click();
		Thread.sleep(2000);
		OK.click();
	}
	public void admin(WebDriver driver) throws IOException, InterruptedException {
		Admin.click();
		Actions a=new Actions(driver);
		a.moveToElement(Mail).click().build().perform();
		Thread.sleep(2000);
		ScreenShot.main(driver, "TC_Capro_admin_admin");
//		driver.navigate().back();
//		a.moveToElement(Calender).click().build().perform();
//		Thread.sleep(2000);
//		ScreenShot.main(driver, "TC_Capro_admin_admin");
//		driver.navigate().back();
//		a.moveToElement(Maps).click().build().perform();
//		Thread.sleep(2000);
//		ScreenShot.main(driver, "TC_Capro_admin_admin");
//		driver.navigate().back();
//		a.moveToElement(Invoice).click().build().perform();
//		Thread.sleep(2000);
//		ScreenShot.main(driver, "TC_Capro_admin_admin");
//		driver.navigate().back();
//		a.moveToElement(Gallery).click().build().perform();
//		Thread.sleep(2000);
//		ScreenShot.main(driver, "TC_Capro_admin_admin");
//		driver.navigate().back();
//		a.moveToElement(Myprofile).click().build().perform();
//		Thread.sleep(2000);
//		ScreenShot.main(driver, "TC_Capro_admin_admin");
//		driver.navigate().back();
	}

}
