package com.SmokeTesting;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.CommonUtilities.ScreenShot;

public class TC_Capro_admin_ForgotPasswordpage_valid_Data {
	WebDriver driver;
	@FindBy(xpath=".//*[@id='login-form']/fieldset/section[2]/div/a")
	WebElement forgot;
	public TC_Capro_admin_ForgotPasswordpage_valid_Data(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void forgot1(WebDriver driver) throws InterruptedException, IOException {
		forgot.click();
		Thread.sleep(2000);
		ScreenShot.main(driver,"TC_Capro_admin_ForgotPasswordpage_valid_Data");
	}

}
