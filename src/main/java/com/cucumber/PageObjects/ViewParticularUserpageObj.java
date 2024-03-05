package com.cucumber.PageObjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import com.cucumber.TestBase.TestBase;
import com.cucumber.utility.Constants;


public class ViewParticularUserpageObj {
	WebDriver driver;
	Actions act;
	TestBase testbase;

	By userMenu = By.xpath("//span[text()='Users']/../../../..");
	By goButton = By.xpath("//span[text()='GO']");
	By searchFiels = By.xpath("//input[@placeholder='Search User']");
	By View = By.xpath("//table/tbody/tr/td[7]/button[1]");


    public ViewParticularUserpageObj(WebDriver driver) {
		this.driver = driver;
		testbase = new TestBase();
	}

    public void clickonUserMenu()
	{
    	Constants.driver.findElement(userMenu).click();
	}

    public void ClickonGObutton() throws InterruptedException {
		Constants.driver.findElement(goButton).click();
		Thread.sleep(4000);
	}
	public void EnterUserName(String Name) throws InterruptedException {
		Constants.driver.findElement(searchFiels).sendKeys(Name);
		Thread.sleep(4000);
		
	}

	 public void clickonViewButton()
		{
	    	Constants.driver.findElement(View).click();
		}
	
    

}