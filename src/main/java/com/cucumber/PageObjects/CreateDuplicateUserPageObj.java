package com.cucumber.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cucumber.TestBase.TestBase;
import com.cucumber.utility.Constants;
import com.cucumber.utility.JavaUtility;
import com.cucumber.utility.RandomStringGenerator;
import com.cucumber.utility.excelGeniricUtillity;



public class CreateDuplicateUserPageObj {

	WebDriver driver;
	Actions act;
	TestBase testbase;
	private final int TIMEOUT_WAIT = 30;
	private final int POOLING_WAIT = 8000;

	By UserMenu = By.xpath("//span[text()='Users']/../../../..");
	By GObtn = By.xpath("//span[text()='GO']");
	By searchFiels = By.xpath("//input[@placeholder='Search User']");
	By Duplicate = By.xpath("//table/tbody/tr/td[7]/button[3]");
	By lastNameText = By.xpath("//*[@formcontrolname='last_name']");
	By middleNameText = By.xpath("//*[@formcontrolname='middle_name']");
	By firstNameText = By.xpath("//*[@formcontrolname='first_name']");
	By nickNameText = By.xpath("//*[@formcontrolname='nickName']");
	By emailText = By.xpath("//*[@formcontrolname='email_address']");
	By userNameText = By.xpath("//*[@formcontrolname='username']");
	By dateIcon = By.xpath("//*[name()='svg' and @fill='currentColor']");
	By sufixDropDown = By.xpath("//*[text()='Suffix']");
	By timeZoneIDDropDown = By.xpath("//*[text()='Timezone ID']");
	By genderDropDown = By.xpath("//mat-label[text()='Gender']");
	By passWordText = By.xpath("//*[@formcontrolname='password']");
	By reEnterPassWordText = By.xpath("//*[@formcontrolname='reenterPassword']");
	By visibilityOffPassWordButton = By.xpath("//*[text()='visibility_off']");
	By createButton = By.xpath("(//span[text()='Create'])[2]");
	By closeButton = By.xpath("//span[text()='Close']");
	By closeXButton = By.xpath("//mat-icon[text()='close']");
	By createUserOkButton = By.xpath("//button[text()='OK']");
	By DateSelect = By.xpath("//span[text()=' 1 ']/..");


	public CreateDuplicateUserPageObj(WebDriver driver)
	{
		this.driver = driver;
		testbase = new TestBase();
	}


	public void clickonUserMenu()
	{
		testbase.waitForElement(Constants.driver.findElement(UserMenu), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(UserMenu).click();
	}


	public void clickonGOButton() throws Exception
	{
		testbase.waitForElement(Constants.driver.findElement(GObtn), TIMEOUT_WAIT, POOLING_WAIT);
		Thread.sleep(2000);
		Constants.driver.findElement(GObtn).click();
	}

	public void EnterUserName(String Name) throws InterruptedException {
		Constants.driver.findElement(searchFiels).sendKeys(Name);
		Thread.sleep(4000);

	}

	public void clickonDuplicateicon() {
		testbase.waitForElement(Constants.driver.findElement(Duplicate), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(Duplicate).click();
	}


	public void EnterAllDuplicateUserDetails() throws Throwable {
		JavaUtility rw = new JavaUtility();
		int num=rw.getRandomNumber();
		int length =5;
		String ran=RandomStringGenerator.generateRandomString(length);
		excelGeniricUtillity ex = new excelGeniricUtillity();
		String lastName = ex.getDataFromExcel("User", 7, 0);
		String MiddleName = ex.getDataFromExcel("User", 7, 1);
		String FirstName = ex.getDataFromExcel("User", 7, 2);
		String Email = ex.getDataFromExcel("User", 7, 3);
		String UserName = ex.getDataFromExcel("User", 7, 4);
		String Suffix = ex.getDataFromExcel("User", 7, 5);
		String TimeZoneID = ex.getDataFromExcel("User", 7, 6);
		String Gender = ex.getDataFromExcel("User", 7, 7);
		String NickName = ex.getDataFromExcel("User", 7, 8);
		String Password = ex.getDataFromExcel("User", 7, 9);
		Constants.driver.findElement(firstNameText).click();
		Constants.driver.findElement(firstNameText).sendKeys(FirstName+ran);
		Thread.sleep(2000);
		Thread.sleep(2000);
		Constants.driver.findElement(lastNameText).click();
		Constants.driver.findElement(lastNameText).sendKeys(lastName+ran);
		Thread.sleep(2000);
		Constants.driver.findElement(middleNameText).click();
		Constants.driver.findElement(middleNameText).sendKeys(MiddleName+ran);
		Thread.sleep(2000);
		Constants.driver.findElement(nickNameText).click();
		Thread.sleep(2000);
		Constants.driver.findElement(nickNameText).sendKeys(NickName+num);
		Thread.sleep(2000);
		Constants.driver.findElement(userNameText).click();
		Constants.driver.findElement(userNameText).sendKeys(UserName+ran);
		Thread.sleep(2000);
		Constants.driver.findElement(emailText).click();
		Constants.driver.findElement(emailText).sendKeys(Email+num+"@gmail.com");
		Thread.sleep(2000);
		Constants.driver.findElement(genderDropDown).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='"+Gender+"']")).click();
		Thread.sleep(2000);
		WebElement date = Constants.driver.findElement(dateIcon);
		Actions act = new Actions(driver);
		act.moveToElement(date).click().build().perform();
		Thread.sleep(1000);
		WebElement date2 = Constants.driver.findElement(DateSelect);
		act.moveToElement(date2).click().build().perform();
		Thread.sleep(2000);
		Constants.driver.findElement(sufixDropDown).click();
		driver.findElement(By.xpath("//span[text()='"+Suffix+"']")).click();
		Thread.sleep(2000);
		Constants.driver.findElement(timeZoneIDDropDown).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='"+TimeZoneID+"']")).click();
		Thread.sleep(2000);
		Constants.driver.findElement(passWordText).click();
		Thread.sleep(2000);
		Constants.driver.findElement(passWordText).sendKeys(Password);
		Thread.sleep(2000);
		Constants.driver.findElement(reEnterPassWordText).click();
		Thread.sleep(2000);
		Constants.driver.findElement(reEnterPassWordText).sendKeys(Password);
		Thread.sleep(2000);

	}

	public void clickonCreateButton() throws Exception {
		Constants.driver.findElement(createButton).click();
		Thread.sleep(2000);
		
		Constants.driver.findElement(createUserOkButton).click();
	}
}
