package com.cucumber.PageObjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import com.cucumber.TestBase.TestBase;
import com.cucumber.utility.Constants;


public class SearchForAParticularTeacherpageObj {
	WebDriver driver;
	Actions act;
	TestBase testbase;
	private final int TIMEOUT_WAIT = 30;
	private final int POOLING_WAIT = 8000;
	private final int WAIT = 2000;

	By TeachersMenu = By.xpath("//span[text()='Teachers']/../../../..");
	By Institution =By.xpath("//mat-label[text()='Institution:']/../../../..");
	By insSelect = By.xpath("//span[text()='ResponsiveEd Institutions']");
	By searchByDropDown = By.xpath("//mat-label[text()='Search By:']/../../../..");
	By searchBySelect = By.xpath("//span[text()='Username']");
	By EnterUserName = By.xpath("//mat-label[text()='Please Enter Username']/..");
	By goButton = By.xpath("//span[text()='Go']");
	By View = By.xpath("(//table/tbody/tr/td)[6]/button[1]");
	By name = By.id("searchInput");


    public SearchForAParticularTeacherpageObj(WebDriver driver) {
		this.driver = driver;
		testbase = new TestBase();
	}
    public void the_User_navigates_to_the_Teacher_Menu() {
    testbase.waitForElement(Constants.driver.findElement(TeachersMenu), TIMEOUT_WAIT, POOLING_WAIT);
    Constants.driver.findElement(TeachersMenu).click();
    }

    public void the_User_sets_the_filters_to_show_all_options(String Name) throws Throwable {
    	testbase.waitForElement(Constants.driver.findElement(Institution), TIMEOUT_WAIT, POOLING_WAIT); 
    	Constants.driver.findElement(Institution).click();
    	testbase.waitForElement(Constants.driver.findElement(insSelect), TIMEOUT_WAIT, POOLING_WAIT);
    	Constants.driver.findElement(insSelect).click();
    	testbase.waitForElement(Constants.driver.findElement(searchByDropDown), TIMEOUT_WAIT, POOLING_WAIT);
    	Constants.driver.findElement(searchByDropDown).click();
    	testbase.waitForElement(Constants.driver.findElement(searchBySelect), TIMEOUT_WAIT, POOLING_WAIT);
    	Constants.driver.findElement(searchBySelect).click();
    	Thread.sleep(WAIT);
    	testbase.waitForElement(Constants.driver.findElement(EnterUserName), TIMEOUT_WAIT, POOLING_WAIT);
    	Constants.driver.findElement(EnterUserName).click();
    	Thread.sleep(WAIT);
    	Constants.driver.findElement(name).sendKeys(Name);
    	Thread.sleep(WAIT);

    	
    	
    }
    public void the_User_finalizes_the_filter_selection_by_clicking_the_GO_button() throws Exception
    {
    	Thread.sleep(WAIT);
    	testbase.waitForElement(Constants.driver.findElement(goButton), TIMEOUT_WAIT, POOLING_WAIT);
    	Constants.driver.findElement(goButton).click();
    	Thread.sleep(WAIT);
    }
    public void the_User_accesses_the_detailed_view_by_selecting_the_View_option() throws Throwable {
    	testbase.waitForElement(Constants.driver.findElement(View), TIMEOUT_WAIT, POOLING_WAIT); 
    	Constants.driver.findElement(View).click();  
    }
    
}