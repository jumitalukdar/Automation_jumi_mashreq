package com.mshreq.page;

import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class home {
	public static WebDriver driver;
	
	public home(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//div[contains(@class,'col-md-9 col-xs-12 no-padding')]//ul/li/a")
	List<WebElement> navbars;
	
	@FindBy(xpath="//h3[contains(text(),'Mashreq News')]")
	WebElement MashreqNews;
	@FindBy(xpath="//h5[contains(text(),'Contact Us')]")
	WebElement ContactUsText;
	@FindBy(xpath="//p[@class=\"ac-gf-buystrip-info-copy\"][text()=\"Call +9714 424 4444 Lost your card? Enquiries?\"]")
	WebElement contactuslink;
	
	public int verifynavitems()
	{
		int count=navbars.size();
		if(count==9)
		{
					
		    for(WebElement bars: navbars)
	      	{
			
			String bartitle= bars.getText();
			System.out.println("the nav bars displayed is "+bartitle);
	     	}
		}
		else {
	     		return count;
	     	}
		return count;
	     	
	     	}
		
		
	
	
	public contact clickoncontactus()
	{
		
		contactuslink.click();
		return new contact(driver);
	}
	
	public void verifycontactusvisible()
	
	{ 
		if (ContactUsText.isDisplayed())
			
			{
		        Assert.assertTrue(true);
			}else
				
		       Assert.assertTrue(false);;
		
	}
	
	public boolean verifynewsdisplayed() {
		return MashreqNews.isDisplayed();
	}
	
}
