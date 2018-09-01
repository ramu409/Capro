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

public class TC_Capro_admin_Checkprescription {

	WebDriver driver;
	@FindBy(xpath=".//*[@id='email']")
	WebElement email;
	@FindBy(xpath=".//*[@id='password']")
	WebElement password;
	@FindBy(xpath=".//*[@id='login-form']/footer/button")
	WebElement login;
	@FindBy(xpath=".//*[@id='extr-page']/body/div[3]/div/button[1]")
	WebElement OK;
	@FindBy(xpath=".//*[@id='left-panel']/nav/ul/li[4]/a/span")
	WebElement Checkpre;
	@FindBy(xpath=".//*[@id='wid-id-1']/header/div[2]/a")
	WebElement color;
	@FindBy(xpath=".//*[@id='wid-id-1']/header/div[1]/a[1]/i")
	WebElement min;
	@FindBy(xpath=".//*[@id='wid-id-1']/header/div[1]/a[2]/i")
	WebElement max;
	@FindBy(xpath=".//*[@id='wid-id-1']/header/div[1]/a[3]/i")
	WebElement remove;
	@FindBy(xpath=".//*[@id='datatable_fixed_column_filter']/label/input")
	WebElement column;
	@FindBy(xpath=".//*[@id='datatable_fixed_column']/tbody/tr[1]/td[4]/button[1]")
	WebElement accepted;
	@FindBy(xpath=".//*[@id='datatable_fixed_column']/tbody/tr[1]/td[4]/button[2]")
	WebElement  deny;
	@FindBy(xpath=".//*[@id='datatable_fixed_column']/thead/tr/th[1]")
	WebElement prescription;
	public TC_Capro_admin_Checkprescription(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements( driver, this);
		
	}
//	public  void TC_Capro_admin_Checkprescription(WebDriver driver) {
//		this.driver=driver;
//		PageFactory.initElements( driver, this);
//	}
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
	public void prescription(WebDriver driver) throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		Checkpre.click();
		ScreenShot.main(driver, "TC_Capro_admin_Checkprescription");
//		min.click();
//		min.click();
//		max.click();
//		max.click();
//		Data_Driven_design data1=new Data_Driven_design();
//		String Colu=data1.getdata("Sheet1",11,0);
//		column.sendKeys(Colu);
//		ScreenShot.main(driver, "TC_Capro_admin_Checkprescription");
//		accepted.click();
//		deny.click();
//		prescription.click();
//		ScreenShot.main(driver, "TC_Capro_admin_Checkprescription");
		
	}
}
