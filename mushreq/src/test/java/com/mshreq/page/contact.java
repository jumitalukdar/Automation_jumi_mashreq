package com.mshreq.page;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class contact {
public static WebDriver driver;
	
	public contact(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//button[@id='btnSubmit']")
	 WebElement SubmitButton;
	
	@FindBy(name="reachoutforproduct")	
	WebElement lookingdrop;
	Select lookdrop=new Select(lookingdrop);
	
			
		
	@FindBy(id="need")
	WebElement select1;
	Select productdrp=new Select(select1);
	
	@FindBy(id="product")
	WebElement select2;
	Select subproductdrop=new Select(select2);
	
	@FindBy(xpath="//input[@id='mobile']")
	WebElement mobile;
	
	@FindBy(xpath="//span[contains(text(),'Mobile number should be 7 digit')]")
	WebElement errortext;
	
	public void clicksubmitempty()
	{
		SubmitButton.click();
	}
	
	public int verifylookdropdown() {
		
		List<WebElement> dropoption=lookdrop.getOptions();
		int count=dropoption.size();
		System.out.println(" total dropdown options for look for dropdown is"+count);
		return count;
		
	}
	public boolean verifymobilenoinvalid(String mobile1)
	{
		mobile.sendKeys(mobile1);
		return errortext.isDisplayed();
		
		}

	public int selectsubproductempty() {
		
		List<WebElement> optionslist=subproductdrop.getOptions();
		int optionscount=optionslist.size();
		return optionscount;
		
	}
	
	public int selectproductloans() {
		productdrp.selectByVisibleText("Loans");

		List<WebElement> optionslist2=subproductdrop.getOptions();
		int optionscount1=optionslist2.size();
		if(optionscount1==6) 
		{
			
		
		       for(WebElement optionslist3:optionslist2)
	          	{
	       		String listtext=optionslist3.getText();
	    		if(listtext.equalsIgnoreCase("Home Loan UAE Resident")) {
				System.out.println(" option with text Home Loan UAE Resident populated");
			    }
		}
		return optionscount1;
		
	}
	
	




