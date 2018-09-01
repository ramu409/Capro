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

public class TC_Capro_admin_Careers_Valid {
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
	@FindBy(xpath=".//*[@id='wid-id-0']/header/div/a[1]/i")
	WebElement mini;
	@FindBy(xpath=".//*[@id='wid-id-0']/header/div/a[2]/i")
	WebElement max;
	@FindBy(xpath=".//*[@id='wid-id-0']/header/div/a[3]/i")
	WebElement remove;
	@FindBy(xpath=".//*[@id='datatable_fixed_column']/tbody/tr[1]/td[6]/button")
	WebElement delete;
	public TC_Capro_admin_Careers_Valid(WebDriver driver) {
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
//		mini.click();
//		mini.click();
//		max.click();
//		max.click();
//		remove.click();
		Data_Driven_design data1=new Data_Driven_design();
		String Name=data1.getdata("Sheet1",9,0);
		String Local=data1.getdata("Sheet1",9,7);
		String Descrip=data1.getdata("Sheet1",9,8);
		
		name.sendKeys(Name);
		Locality.sendKeys(Local);
		Description.sendKeys(Descrip);
		submit.click();
		delete.click();
	}

}
