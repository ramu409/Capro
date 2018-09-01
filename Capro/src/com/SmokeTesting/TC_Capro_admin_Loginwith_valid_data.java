package com.SmokeTesting;

import java.io.IOException;

import javax.swing.text.Document;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.CommonUtilities.Data_Driven_design;

public class TC_Capro_admin_Loginwith_valid_data {
	WebDriver driver;
	@FindBy(xpath=".//*[@id='email']")
	WebElement email;
	@FindBy(xpath=".//*[@id='password']")
	WebElement password;
	@FindBy(xpath=".//*[@id='login-form']/footer/button")
	WebElement login;
	@FindBy(xpath=".//*[@id='extr-page']/body/div[3]/div/button[1]")
	WebElement OK;
	public TC_Capro_admin_Loginwith_valid_data(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void login(WebDriver driver) throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		JavascriptExecutor js=(JavascriptExecutor)driver;
//		js.executeScript("document.getElementById('email').value='admin@testmail.com'");
//		js.executeScript("document.getElementById('Password').value='000000'");
	
		js.executeScript("arguments[0].scrollIntoView();",email);
		
	
		Data_Driven_design data1=new Data_Driven_design();
		String em=data1.getdata("Sheet1",4,1);
		String pass=data1.getdata("Sheet1",4,5);
		
		data1.setdata("Sheet1",10,10,"Pass");
		
		email.sendKeys(em);
		password.sendKeys(pass);
		login.submit();
//		Thread.sleep(2000);
//		OK.click();
//driver.switchTo().alert().accept();
	}

}
