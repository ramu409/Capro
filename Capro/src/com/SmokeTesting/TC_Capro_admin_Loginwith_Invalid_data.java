package com.SmokeTesting;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.CommonUtilities.Data_Driven_design;

public class TC_Capro_admin_Loginwith_Invalid_data {
	WebDriver driver;
	@FindBy(xpath=".//*[@id='email']")
	WebElement email;
	@FindBy(xpath=".//*[@id='password']")
	WebElement password;
	@FindBy(xpath=".//*[@id='login-form']/footer/button")
	WebElement login;
	@FindBy(xpath=".//*[@id='extr-page']/body/div[3]/div/button[1]")
	WebElement OK;
	public TC_Capro_admin_Loginwith_Invalid_data(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void login(WebDriver driver) throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		Data_Driven_design data1=new Data_Driven_design();
		String em=data1.getdata("Sheet1",5,1);
		String pass=data1.getdata("Sheet1",5,5);
		
		email.sendKeys(em);
		password.sendKeys(pass);
		login.click();
		Thread.sleep(2000);
		OK.click();
	}
}
