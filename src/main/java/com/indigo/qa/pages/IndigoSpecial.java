package com.indigo.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.indigo.qa.base.Testbase;

public class IndigoSpecial extends Testbase{

	public IndigoSpecial() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="(//p[@class='e-sub-txt'])[1]")
	WebElement pretext;
	
	public String especialpage() throws InterruptedException {
		Thread.sleep(2000);
		return pretext.getText();
	
	}

	@FindBy(xpath="//a[text()='Click here to track your 6E Special']")
	WebElement clickherespecial;
	
	public specialvoucher specialsearchpage() {
		clickherespecial.click();
		return new specialvoucher();
	}
	
	
}
