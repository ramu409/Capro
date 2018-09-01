package com.FunctionalTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Tc_Capro_Careers {
	WebDriver driver;
	@FindBy(xpath=".//*[@id='menuzord']/ul/li[5]/a")
	WebElement careers;
	@FindBy(xpath=".//*[@id='header']/div[5]/section[1]/div/div/div/div/div/ol/li[1]/a")
	WebElement Home;
	public Tc_Capro_Careers(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void career(WebDriver driver) {
		
		careers.click();
		Home.click();
	}

}
