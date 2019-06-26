package com.mashreq.test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.mshreq.page.baseclass;
import com.mshreq.page.home;

import junit.framework.Assert;

public class home_test extends baseclass{
	public WebDriver driver;
	home home=new home(driver);
	@Test
	public void verifynavbars()
	{
		
		int count2=home.verifynavitems();
		if(count2==9) {
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
		
		
		
		
	}
	@Test
	public void navigationtocontact() {
		home.verifycontactusvisible();
		home.clickoncontactus();
		String expurl="https://www.mashreqbank.com/uae/en/personal/contactus";
		String actualurl=driver.getCurrentUrl();
		if(actualurl.equals(expurl)) {
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
			
		}
		
		}
		
	
@Test	
 public void verifyifnewsdisplayed() {
	 Assert.assertTrue(home.verifynewsdisplayed());
 }
}
