package com.indigo.qa.testcases;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.indigo.qa.base.Testbase;
import com.indigo.qa.pages.HBDpage;
import com.indigo.qa.pages.HomePage;
import com.indigo.qa.pages.giftspecialpage;

public class Giftvouchertest extends Testbase  {

	HomePage Home;
	//IndigoSpecial especial;
	giftspecialpage giftspecial;
	HBDpage preview;
	
	public Giftvouchertest() {
		super();
	}
	
	@BeforeMethod
	public void setup() throws InterruptedException {
		intialization();
		Home=new HomePage();
		//especial=Home.special();
		giftspecial = Home.giftspecial();
	}
	
	@Test

	public void giftvouchertest() throws InterruptedException {

		Thread.sleep(1000);
		giftspecial.giftimgpage();
		giftspecial.vouchervalue();	
		giftspecial.voucherquantity();
		giftspecial.clickchchbox();
		giftspecial.dearboxpage();
		giftspecial.messagepage();
		HBDpage preview = giftspecial.previewpage();
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	
	
	
	
	
	
	
	
}
