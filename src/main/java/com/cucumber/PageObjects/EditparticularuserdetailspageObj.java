package com.cucumber.PageObjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import com.cucumber.TestBase.TestBase;
import com.cucumber.utility.Constants;


public class EditparticularuserdetailspageObj {
	WebDriver driver;
	Actions act;
	TestBase testbase;
	private final int TIMEOUT_WAIT = 30;
	private final int POOLING_WAIT = 8000;

	By userMenu = By.xpath("//span[text()='Users']/../../../..");
	By searchFields = By.xpath("//input[@placeholder='Search User']");
	By EditButton = By.xpath("//table/tbody/tr/td[7]/button[2]");
	By middleName = By.xpath("//input[@formcontrolname='middle_name']");
	By SaveBtn = By.xpath("//span[text()='Save']");
	By OkBtn = By.xpath("//button[text()='OK']");


    public EditparticularuserdetailspageObj(WebDriver driver) {
		this.driver = driver;
		testbase = new TestBase();
	}

    public void clickonUserMenu()
	{
    	Constants.driver.findElement(userMenu).click();
	}

	public void EnterUserName(String Name) throws InterruptedException {
		Constants.driver.findElement(searchFields).sendKeys(Name);
		Thread.sleep(4000);
		
	}
	public void clickonEditBtn() throws Exception
	{
		Thread.sleep(2000);
    	Constants.driver.findElement(EditButton).click();
	}
	public void EditUserDetails(String MiddleName) throws Exception
	{
		Thread.sleep(2000);
		testbase.waitForElement(Constants.driver.findElement(middleName), TIMEOUT_WAIT, POOLING_WAIT);
    	WebElement mn= Constants.driver.findElement(middleName);
    	mn.click();
    	Thread.sleep(2000);
    	mn.clear();
    	Thread.sleep(4000);
    	mn.sendKeys(MiddleName);
	}
	public void clickonSaveBtn() throws Exception
	{
		Thread.sleep(2000);
    	Constants.driver.findElement(SaveBtn).click();
    	Thread.sleep(2000);
    	Constants.driver.findElement(OkBtn).click();
	}
	

	
    

}