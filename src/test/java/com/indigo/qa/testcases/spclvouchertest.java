package com.indigo.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.indigo.qa.base.Testbase;
import com.indigo.qa.pages.HomePage;
import com.indigo.qa.pages.IndigoSpecial;
import com.indigo.qa.pages.specialvoucher;

public class spclvouchertest extends Testbase{

	HomePage Home;
	IndigoSpecial especial;
	specialvoucher voucher;
	
	public spclvouchertest() {
		super();
	}
	
	@BeforeMethod
	public void setup() throws InterruptedException {
		intialization();
		Home=new HomePage();
		especial=Home.special();
		voucher = especial.specialsearchpage();	
	}
	@Test

	public void vochertexttest() {
		String text = voucher.voucherpage();
		Assert.assertEquals(text, "Track 6E Special Vouchers");
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	

}
