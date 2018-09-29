package com.indigo.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.indigo.qa.pages.Bookingpage;
import com.indigo.qa.pages.HomePage;
import com.indigo.qa.pages.IndigoSpecial;
import com.indigo.qa.pages.giftspecialpage;

public class Homepagetest extends com.indigo.qa.base.Testbase{
	HomePage Home;
	Bookingpage searchbtn;
	IndigoSpecial especial;
	giftspecialpage giftspecial;
	
	
	public Homepagetest() {
	super();
	
  }

	@BeforeMethod
	public void setup() {
		intialization();
		Home=new HomePage();
		
	}
	
	@Test(priority=1)

	public void searchflighttest() throws InterruptedException {
	Home.bookflightclick();
	Home.originbox();
	Home.destinationbox();
	Home.depaturecalender();
	Home.clicknext();
	Home.clickondate();
	searchbtn = Home.searchflight();
		
	}
	
	@Test(priority=2)

	public void clickespecialimg() throws InterruptedException {
	especial=Home.special();
	driver.close();
	}

	@Test(priority=3)

	public void clickgiftimg() throws InterruptedException {
	giftspecial = Home.giftspecial();
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}

}

