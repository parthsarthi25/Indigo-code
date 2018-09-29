package com.indigo.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.indigo.qa.base.Testbase;

public class giftspecialpage extends Testbase {

	public giftspecialpage() {
		PageFactory.initElements(driver,this);
	}

	@FindBy(xpath="(//div[@class='fig-wrp'])[9]//preceding-sibling::img")
	WebElement giftimg;
	
	public giftspecialpage giftimgpage() {
		giftimg.click();
		return this;
	}
	
	@FindBy(xpath="//select[@id='SelectedVoucherValue']")
	WebElement dropdownprice;
	
	public void vouchervalue() {
	Select dropdown1=new Select(dropdownprice);
	dropdown1.selectByVisibleText("500");
	
	}
	
	@FindBy(xpath="//select[@id='SelectedVoucherQuantity']")
	WebElement dropdownquantity;
	
	public void voucherquantity() {
	Select dropdown2=new Select(dropdownquantity);
	dropdown2.selectByIndex(1);
	}
	
	@FindBy(xpath="//input[@id='chkPersonal']")
	WebElement checkbox;
	
	public void clickchchbox() {
		checkbox.click();
	}
	
	@FindBy(xpath="//input[@id='Per_Fname']")
	WebElement dearbox;
	
	public void dearboxpage() {
		dearbox.sendKeys("Hi,Parth");
	}
	
	@FindBy(xpath="//textarea[@id='message']")
	WebElement message;
	
	public void messagepage() {
		message.sendKeys("happy bday to u");
	}
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement submit;
	
	public HBDpage previewpage() {
		submit.click();
		return new HBDpage();
	}

}
