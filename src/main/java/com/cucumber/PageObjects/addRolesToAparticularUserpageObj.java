package com.cucumber.PageObjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import com.cucumber.TestBase.TestBase;
import com.cucumber.utility.Constants;


public class addRolesToAparticularUserpageObj {
	WebDriver driver;
	Actions act;
	TestBase testbase;
	private final int TIMEOUT_WAIT = 30;
	private final int POOLING_WAIT = 8000;
	private final int WAIT = 2000;

	By userMenu = By.xpath("//span[text()='Users']/../../../..");
	By goButton = By.xpath("//span[text()='GO']");
	By searchFiels = By.xpath("//input[@placeholder='Search User']");
	By View = By.xpath("//table/tbody/tr/td[7]/button[1]");
	By Add  = By.xpath("//span[text()=' Add ']");
	By SelectInstitution =  By.xpath("//mat-label[text()='Select Institution:']");
	By  ResponsiveEdInstitutions = By.xpath("//span[text()=' ResponsiveEd Institutions ']");
	By SelectRoles = By.xpath("//mat-label[text()='Select Roles:']");
	By Advisor = By.xpath("//span[text()='Advisor']/..");
	By saveButton = By.xpath("//mat-icon[text()='save']/..");
	By OKBtn = By.xpath("//button[text()='OK']");
	By Xbtn = By.xpath("//mat-icon[text()='close']/..");
	


    public addRolesToAparticularUserpageObj(WebDriver driver) {
		this.driver = driver;
		testbase = new TestBase();
	}

    public void the_User_selects_the_UserMenu() throws Throwable 
	{
    	testbase.waitForElement(Constants.driver.findElement(userMenu), TIMEOUT_WAIT, POOLING_WAIT);
    	Constants.driver.findElement(userMenu).click();
	}

    public void the_User_initiates_the_search_process_by_clicking_the_GO_button() throws Throwable{
    	testbase.waitForElement(Constants.driver.findElement(goButton), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(goButton).click();
		Thread.sleep(WAIT);
	}
    public void the_User_specifies_the_User_Name_to_search(String Name) throws Throwable  {
    	Constants.driver.findElement(searchFiels).sendKeys(Name);
    	Thread.sleep(WAIT);	
	}
    public void the_User_navigates_to_view_the_user_details_by_clicking_on_the_View_Button()
		{
    	testbase.waitForElement(Constants.driver.findElement(View), TIMEOUT_WAIT, POOLING_WAIT);
	    	Constants.driver.findElement(View).click();
	    	
		}
	
    public void the_User_adds_roles_to_the_user() throws Throwable 
    {
    	Thread.sleep(4000);	
    	testbase.waitForElement(Constants.driver.findElement(Add), TIMEOUT_WAIT, POOLING_WAIT);
    	Constants.driver.findElement(Add).click();
    	testbase.waitForElement(Constants.driver.findElement(SelectInstitution), TIMEOUT_WAIT, POOLING_WAIT);
    	Constants.driver.findElement(SelectInstitution).click();
    	testbase.waitForElement(Constants.driver.findElement(ResponsiveEdInstitutions), TIMEOUT_WAIT, POOLING_WAIT);
    	Constants.driver.findElement(ResponsiveEdInstitutions).click();
    	testbase.waitForElement(Constants.driver.findElement(SelectRoles), TIMEOUT_WAIT, POOLING_WAIT);
    	Constants.driver.findElement(SelectRoles).click();
    	testbase.waitForElement(Constants.driver.findElement(Advisor), TIMEOUT_WAIT, POOLING_WAIT);
    	Constants.driver.findElement(Advisor).click();
    	// Create Actions instance
        Actions actions = new Actions(driver);
        // Simulate moving to a specific location on the page (x, y coordinates)
        int xCoordinate = 100; // Provide the x-coordinate of the location
        int yCoordinate = 200; // Provide the y-coordinate of the location
        actions.moveByOffset(xCoordinate, yCoordinate).click().perform();
        testbase.waitForElement(Constants.driver.findElement(saveButton), TIMEOUT_WAIT, POOLING_WAIT);
    	Constants.driver.findElement(saveButton).click();
    	testbase.waitForElement(Constants.driver.findElement(OKBtn), TIMEOUT_WAIT, POOLING_WAIT);
    	Constants.driver.findElement(OKBtn).click();
    	Thread.sleep(4000);	
    	testbase.waitForElement(Constants.driver.findElement(Xbtn), TIMEOUT_WAIT, POOLING_WAIT);
    	Constants.driver.findElement(Xbtn).click();
    }

}