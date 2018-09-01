package com.FunctionalTesting;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.CommonUtilities.Data_Driven_design;
import com.CommonUtilities.ScreenShot;

public class TC_Capro_admin_Careers_InValid {
	WebDriver driver;
	@FindBy(xpath=".//*[@id='email']")
	WebElement email;
	@FindBy(xpath=".//*[@id='password']")
	WebElement password;
	@FindBy(xpath=".//*[@id='login-form']/footer/button")
	WebElement login;
	@FindBy(xpath=".//*[@id='extr-page']/body/div[3]/div/button[1]")
	WebElement OK;
	@FindBy(xpath=".//*[@id='left-panel']/nav/ul/li[3]/a/span")
	WebElement Career;
	@FindBy(xpath=".//*[@id='name']")
	WebElement name;
	@FindBy(xpath=".//*[@id='place']")
	WebElement Locality;
	@FindBy(xpath=".//*[@id='description']")
	WebElement Description;
	@FindBy(xpath=".//*[@id='submit_button']")
	WebElement submit;
	public TC_Capro_admin_Careers_InValid(WebDriver driver) {
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
	public void career(WebDriver driver) throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		Career.click();
		Thread.sleep(200);

		Data_Driven_design data1=new Data_Driven_design();
		String Name=data1.getdata("Sheet1",10,0);
		String Local=data1.getdata("Sheet1",10,7);
		String Descrip=data1.getdata("Sheet1",10,8);
		
		name.sendKeys(Name);
		Locality.sendKeys(Local);
		Description.sendKeys(Descrip);
		ScreenShot.main( driver, "TC_Capro_admin_Careers_InValid");
		submit.click();
		
	}

}
