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

public class TC_Capro_admin_Headerlinks {
WebDriver driver;
@FindBy(xpath=".//*[@id='email']")
WebElement email;
@FindBy(xpath=".//*[@id='password']")
WebElement password;
@FindBy(xpath=".//*[@id='login-form']/footer/button")
WebElement login;
@FindBy(xpath=".//*[@id='extr-page']/body/div[3]/div/button[1]")
WebElement OK;
@FindBy(xpath=".//*[@id='activity']/i")
WebElement msgbox;
@FindBy(xpath=".//*[@id='logo-group']/div/div[1]/label[1]")
WebElement msgs;
@FindBy(xpath=".//*[@id='logo-group']/div/div[1]/label[2]")
WebElement notify;
@FindBy(xpath=".//*[@id='logo-group']/div/div[1]/label[3]")
WebElement tasks;
@FindBy(xpath=".//*[@id='fullscreen']/span/a/i")
WebElement fullscreen;
@FindBy(xpath=".//*[@id='search-fld']")
WebElement findreport;
@FindBy(xpath=".//*[@id='header']/div[2]/form/button")
WebElement serch;
@FindBy(xpath=".//*[@id='logout']/span/a/i")
WebElement logout;
@FindBy(xpath=".//*[@id='hide-menu']/span/a/i")
WebElement manu;

public TC_Capro_admin_Headerlinks(WebDriver driver) {
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
public void header(WebDriver driver) throws IOException, EncryptedDocumentException, InvalidFormatException, InterruptedException {
	msgbox.click();
	Actions a=new Actions(driver);
	a.moveToElement(msgs).click().build().perform();
	ScreenShot.main(driver, "TC_Capro_admin_Headerlinks");
//		driver.navigate().back();
//	msgbox.click();
//	a.moveToElement(notify).click().build().perform();
////	driver.navigate().back();
////	msgbox.click();
//	a.moveToElement(tasks).click().build().perform();
////	driver.navigate().back();
//	fullscreen.click();
//	Data_Driven_design data1=new Data_Driven_design();
//	String na=data1.getdata("Sheet1",6,0);
//	findreport.sendKeys(na);
//	serch.click();
//	Thread.sleep(2000);
//	ScreenShot.main(driver, "TC_Capro_admin_Headerlinks");
//	driver.navigate().back();
//	manu.click();
//	logout.click();
	
}



}
