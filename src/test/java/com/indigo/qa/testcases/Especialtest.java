package com.indigo.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.indigo.qa.pages.HomePage;
import com.indigo.qa.pages.IndigoSpecial;
import com.indigo.qa.pages.specialvoucher;

public class Especialtest extends com.indigo.qa.base.Testbase{

	HomePage Home;
	IndigoSpecial especial;
	specialvoucher voucher;
	
	
	public Especialtest() {
	super();
	
	}
	
	@BeforeMethod
	public void setup() throws InterruptedException {
		intialization();
		Home=new HomePage();
		especial=Home.special();
	}
		
	@Test	

	public void premiumtexttest() throws InterruptedException {
		String text = especial.especialpage();
		Assert.assertEquals(text, "With this pack, enjoy the following benefits");
	}
	
	@Test

	public void specialvouchertest() {
	voucher = especial.specialsearchpage();	
	}
	
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	
}
