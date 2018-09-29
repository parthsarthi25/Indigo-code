package com.indigo.qa.pages;

import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends com.indigo.qa.base.Testbase {


	public HomePage() {
		PageFactory.initElements(driver,this);
		
	}
	
	@FindBy(xpath="//a[text()='Book Flight']")
	WebElement bookflight;
	
	public void bookflightclick() {
		bookflight.click();
	}
	
	@FindBy(xpath="(//input[@aria-label='Origin'])[2]")
	WebElement frombox;
	
	public void originbox() {
		frombox.clear();
		
		frombox.sendKeys("chennai");
	}
	
	@FindBy(xpath="(//input[@aria-label='Destination'])[2]")
	WebElement tobox;
	
	public void destinationbox() {
		tobox.clear();
		tobox.sendKeys("bhubaneswar");
	}
	
	@FindBy(xpath="//input[@name='indiGoOneWaySearch.DepartureDate']")
	WebElement departcalender;
	
	public void depaturecalender() {
		departcalender.click();
	}
	
	@FindBy(xpath="//a[@title='Next']")
	WebElement nextbutton;
	
	public void clicknext() {
		nextbutton.click();
	}
	
	@FindBy(xpath="//table//a[@class='ui-state-default']//following::tr/following::a[4]")
	WebElement date;
	
	public void clickondate() {
		date.click();
	}
	
	@FindBy(xpath="(//div[@class='submit_tab custom_search'])[2]")
	WebElement search;
	
	public Bookingpage searchflight() {
		search.click();
		return new Bookingpage();
	}
	
	
	@FindBy(xpath="//img[@title='6E Special - Buy and get upto 4x benefits']")
	WebElement Especial;
	
	
	public IndigoSpecial special() throws InterruptedException {
	Especial.click();
	
	String parent = driver.getWindowHandle();
	System.out.println("parent window is"+ parent);
	Set<String> allwindows = driver.getWindowHandles();
	int count=allwindows.size();
	System.out.println("total window"+count);
	
	for(String child:allwindows)
	{
		if(!parent.equalsIgnoreCase(child)){
			driver.switchTo().window(child);
		}
	}
	
	return new IndigoSpecial();
	}
	
	@FindBy(xpath="//img[@title='Gift Voucher - Perfect gift for your loved ones']")
	WebElement giftspeciallink;
	
	
	public giftspecialpage giftspecial() throws InterruptedException {
	giftspeciallink.click();
	
	String parent = driver.getWindowHandle();
	System.out.println("parent window is"+ parent);
	Set<String> allwindows = driver.getWindowHandles();
	int count=allwindows.size();
	System.out.println("total window"+count);
	
	for(String child:allwindows)
	{
		if(!parent.equalsIgnoreCase(child)){
			driver.switchTo().window(child);
		}
	}
	
	return new giftspecialpage();
	}

}
