package com.FunctionalTesting;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.CommonUtilities.Data_Driven_design;
import com.CommonUtilities.ScreenShot;
import com.thoughtworks.selenium.Selenium;
import com.thoughtworks.selenium.SeleniumException;
import com.thoughtworks.selenium.webdriven.commands.GetAttribute;

public class Tc_Capro_Myaccount {
	WebDriver driver;
	@FindBy(xpath=".//*[@id='header']/div[1]/div/div/div[2]/div/ul/a/strong")
	WebElement myaccount;
	@FindBy(xpath=".//*[@id='header']/div[5]/section[2]/div/div[2]/div[1]/div/ul/li[1]/a")
	WebElement myorder;
	@FindBy(xpath=".//*[@id='header']/div[5]/section[2]/div/div[2]/div[1]/div/ul/li[2]/a")
	WebElement profile;
	@FindBy(xpath=".//*[@id='header']/div[5]/section[2]/div/div[2]/div[1]/div/ul/li[3]/a")
	WebElement manageaddress;
	@FindBy(xpath=".//*[@id='header']/div[5]/section[2]/div/div[2]/div[1]/div/ul/li[4]/a")
	WebElement logout;
	@FindBy(xpath=".//*[@id='header']/div[1]/div/div/div[2]/div/ul/li[1]/a[1]")
	WebElement login;
	@FindBy(xpath=".//*[@id='loginemail']")
	WebElement email;
	@FindBy(xpath=".//*[@id='loginpassword']")
	WebElement password;
	@FindBy(xpath=".//*[@id='loginform']/div[3]/button")
	WebElement signin;

	public Tc_Capro_Myaccount(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void myaccount(WebDriver driver) throws IOException {
		WebDriverWait w=new WebDriverWait(driver, 60);
		w.until(ExpectedConditions.elementToBeClickable(myaccount)).click();
//		myaccount.click();
	
		profile.click();
		myorder.click();
		ScreenShot.main(driver,"Tc_Capro_Myaccount");
		manageaddress.click();
		logout.submit();
		
		
	}
	public void login(WebDriver driver) throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		login.click();
		
		Data_Driven_design data1=new Data_Driven_design();
		String Em=data1.getdata("Sheet1",3,1);
		String pass=data1.getdata("Sheet1",3,5);
		data1.setdata("Sheet1",10,10,"Pass");
		email.sendKeys(Em);
		password.sendKeys(pass);
		signin.click();
//		login.getAttribute("{id}");
//		System.err.println("id");
		
	}
	
	

}
