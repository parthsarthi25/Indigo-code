package com.indigo.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.indigo.qa.base.Testbase;
import com.indigo.qa.pages.Bookingpage;
import com.indigo.qa.pages.HomePage;

public class Bookingpagetest extends Testbase{

	HomePage Home;
	Bookingpage searchbtn;
	
	public Bookingpagetest() {
		super();
	}
	
	@BeforeMethod
	public void setup() throws InterruptedException {
		intialization();
		Home=new HomePage();
		Home.bookflightclick();
		Home.originbox();
		Home.destinationbox();
		Home.depaturecalender();
		Home.clicknext();
		Home.clickondate();
		searchbtn = Home.searchflight();
	}
	
	@Test

	public void bookflight() throws InterruptedException {
	Thread.sleep(5000);
	searchbtn.returnflightbtn();
	searchbtn.nextbtn();
	searchbtn.returndateclick();
	searchbtn.continuebtn();
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
