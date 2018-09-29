package com.indigo.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.indigo.qa.base.Testbase;

public class specialvoucher extends Testbase{
	
	public specialvoucher() {
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//p[text()='Track 6E Special Vouchers']")
	WebElement vouchertext;
	
	public String voucherpage() {
		return vouchertext.getText();	
	
	}


}
