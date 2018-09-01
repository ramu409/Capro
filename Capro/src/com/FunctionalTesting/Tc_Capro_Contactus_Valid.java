package com.FunctionalTesting;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.CommonUtilities.Data_Driven_design;

public class Tc_Capro_Contactus_Valid {
	WebDriver driver;
	@FindBy(xpath="//a[text()='Contact Us']")
	WebElement contact;
	@FindBy(xpath="//input[@id='contact_name']")
	WebElement Name;
	@FindBy(xpath=".//*[@id='contact_email']")
	WebElement Email;
	@FindBy(xpath=".//*[@id='contact_company']")
	WebElement companyname;
	@FindBy(xpath=".//*[@id='contact_phone']")
	WebElement phone;
	@FindBy(xpath=".//*[@id='contact_message']")
	WebElement Message;
	@FindBy(xpath=".//*[@id='submit_button']")
	WebElement Sendmessage;
	@FindBy(xpath=".//*[@id='contact_form']/div[4]/button[2]")
	WebElement Reset;
	public Tc_Capro_Contactus_Valid(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	public void Contact(WebDriver driver) throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		contact.click();
		Data_Driven_design data1=new Data_Driven_design();
		String na=data1.getdata("Sheet1",1,0);
		String Em=data1.getdata("Sheet1",1,1);
		String Company=data1.getdata("Sheet1",1,2);
		String MB=data1.getdata("Sheet1",1,3);
		String msg=data1.getdata("Sheet1",1,4);
		Name.sendKeys(na);
		Email.sendKeys(Em);
		companyname.sendKeys(Company);
		phone.sendKeys(MB);
		Message.sendKeys(msg);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,200)","");
		Sendmessage.click();
		
		
	}

}
