package com.indigo.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.indigo.qa.base.Testbase;

public class Bookingpage extends Testbase {


	public Bookingpage() {
		PageFactory.initElements(driver,this);
		
	}
	
	@FindBy(xpath="(//button[@id='continue-button'])[1]")
	WebElement returnflight;
	
	public void returnflightbtn() {
		returnflight.click();
	}
	
	@FindBy(xpath="//span[@class='rw-i rw-i-caret-right']")
	WebElement nxtbtn;
	
	public void nextbtn() {
		nxtbtn.click();
	}
	
	@FindBy(xpath="(//table//tr[@role='row'])[2]//following::td[@title='November 5, 2018']")
	WebElement returndate;
	
	public void returndateclick() {
		returndate.click();
	}
	
	@FindBy(xpath="//button[@id='continue-button']")
	WebElement contibtn;
	
	public void continuebtn() {
		contibtn.click();
	}
	
	
	
	
	
	
	
}
