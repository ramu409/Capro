package com.FunctionalTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Tc_Capro_Index {
	WebDriver driver;
	@FindBy(xpath=".//*[@id='menuzord']/ul/li[4]/a")
	WebElement Index;
	@FindBy(xpath=".//*[@id='menuzord']/ul/li[4]/ul/li[1]/a")
	WebElement systemwise;
	@FindBy(xpath=".//*[@id='menuzord']/ul/li[4]/ul/li[2]/a")
	WebElement cardio;
	@FindBy(xpath=".//*[@id='menuzord']/ul/li[4]/ul/li[3]/a")
	WebElement Cosmethology;
	@FindBy(xpath=".//*[@id='menuzord']/ul/li[4]/ul/li[4]/a")
	WebElement Endocrine;
	@FindBy(xpath=".//*[@id='menuzord']/ul/li[4]/ul/li[5]/a")
	WebElement Excretory;
	@FindBy(xpath=".//*[@id='menuzord']/ul/li[4]/ul/li[6]/a")
	WebElement Gastro;
	@FindBy(xpath=".//*[@id='menuzord']/ul/li[4]/ul/li[7]/a")
	WebElement Immune;
	@FindBy(xpath=".//*[@id='menuzord']/ul/li[4]/ul/li[8]/a")
	WebElement Musculo;
	@FindBy(xpath=".//*[@id='menuzord']/ul/li[4]/ul/li[9]/a")
	WebElement Neural;
	@FindBy(xpath=".//*[@id='menuzord']/ul/li[4]/ul/li[10]/a")
	WebElement Reproductive;
	@FindBy(xpath=".//*[@id='menuzord']/ul/li[4]/ul/li[11]/a")
	WebElement Respiratory;
	public Tc_Capro_Index(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void Indexmain(WebDriver driver) throws InterruptedException {
		Index.click();
		Actions a=new Actions(driver);
		a.moveToElement(systemwise).click().build().perform();
		driver.navigate().back();
		Index.click();
		a.moveToElement(cardio).click().build().perform();
		driver.navigate().back();
		Thread.sleep(2000);
		Index.click();
		a.moveToElement(Cosmethology).click().build().perform();
		driver.navigate().back();
		Thread.sleep(2000);
		Index.click();
		a.moveToElement(Endocrine).click().build().perform();
		driver.navigate().back();
		Thread.sleep(2000);
		Index.click();
		a.moveToElement(Excretory).click().build().perform();
		driver.navigate().back();
		Thread.sleep(2000);
		Index.click();
		a.moveToElement(Gastro).click().build().perform();
		driver.navigate().back();
		Thread.sleep(2000);
		Index.click();
		a.moveToElement(Immune).click().build().perform();
		driver.navigate().back();
		Thread.sleep(2000);
		Index.click();
		a.moveToElement(Musculo).click().build().perform();
		driver.navigate().back();
		Thread.sleep(2000);
		Index.click();
		a.moveToElement(Neural).click().build().perform();
		driver.navigate().back();
		Thread.sleep(2000);
		Index.click();
		a.moveToElement(Reproductive).click().build().perform();
		driver.navigate().back();
		Thread.sleep(2000);
		Index.click();
		a.moveToElement(Respiratory).click().build().perform();
//		driver.navigate().back();
		
	}

}
