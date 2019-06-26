package com.mashreq.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.mshreq.page.baseclass;
import com.mshreq.page.contact;

public class contact_test extends baseclass{
	
	public WebDriver driver;
	contact contact1=new contact(driver);
	@Test
	public void submitform()
	
	{
		
		contact1.clicksubmitempty();
		
	}
	@Test
	public void verifylookingforddoptions() {
		
		int optionscount=contact1.verifylookdropdown();
		if(optionscount==4)
		{
			Assert.assertTrue(true);;
			
		}else
		{
			Assert.assertTrue(false);
		}
	}
		
		
		
	@Test
	private void verifymoberrortext() {
		boolean flag1=contact1.verifymobilenoinvalid("123456");
		if (flag1==true) {
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		
		}
	}
	@Test
		public void verifysubproductempty() {
			int count1=contact1.selectsubproductempty();
			if(count1==0) {
				Assert.assertTrue(true);
			}
			else {
				Assert.assertTrue(false);
			}
			
			}
	@Test
	public void verifyselectprodloans() {
		int count3=contact1.selectproductloans();
		if(count3==6)
		{
			Assert.assertTrue(true);
			
		}
		else {
			Assert.assertTrue(false);
		}
		
		}
	}
		
		
		
	
	
	
	
	
	


