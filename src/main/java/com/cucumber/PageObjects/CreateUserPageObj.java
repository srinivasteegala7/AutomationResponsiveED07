package com.cucumber.PageObjects;

import java.awt.Robot;
import java.awt.event.KeyEvent;

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



public class CreateUserPageObj {
	WebDriver driver;
	Actions act;
	TestBase testbase;
	private final int TIMEOUT_WAIT = 30;
	private final int POOLING_WAIT = 8000;
	private final int WAIT = 2000;
	 By searchByDropDown = By.xpath("//mat-label[text()='Search By:']/../../../..");
		By searchBySelect = By.xpath("//span[text()='Username']");
		By EnterUserName = By.xpath("//label[@for='searchInput']");
		By goButton = By.xpath("//span[text()='Go']");
	
	@FindBy(xpath = "//mat-label[text()=\"Institution's:\"]")
	private WebElement institutinsDropDown;
	
	@FindBy(xpath = "(//mat-label[text()=\"Role's:\"])[2]")
	private WebElement rolesDropDown;
	
	@FindBy(xpath = "//mat-label[text()='Last Name']/../../../../div[2]/input")
	private WebElement lastNameText;
	
	@FindBy(xpath = "//mat-label[text()='Middle Name']/../../../../div[2]/input")
	private WebElement middleNameText;
	
	@FindBy(xpath = "//mat-label[text()='First Name']/../../../../div[2]/input")
	private WebElement firstNameText;
	
	@FindBy(xpath = "//mat-label[text()='Email']/../../../../div[2]/input")
	private WebElement emailText;
	
	@FindBy(xpath = "//mat-label[text()='UserName']/../../../../div[2]/input")
	private WebElement userNameText;

	@FindBy(xpath = "//*[name()='svg' and @fill=\"currentColor\"]")
	private WebElement dateIcon;
	
	@FindBy(xpath = "//mat-label[text()='Suffix']")
	private WebElement sufixDropDown;
	
	@FindBy(xpath = "//mat-label[text()='Timezone ID']")
	private WebElement timeZoneIDDropDown;
	
	@FindBy(xpath = "//mat-label[text()='Gender']")
	private WebElement genderDropDown;
	
	@FindBy(xpath = "//mat-label[text()='Nick Name']/../../../../div[2]/input")
	private WebElement nickNameText;
	
	@FindBy(xpath = "//mat-label[text()='Password']/../../../../div[2]/input")
	private WebElement passWordText;
	
	@FindBy(xpath = "//mat-label[text()='Re-enter Password']/../../../../div[2]/input")
	private WebElement reEnterPassWordText;
	
	@FindBy(xpath = "//mat-icon[text()='visibility_off']")
	private WebElement visibilityOffPassWordButton;
	
	@FindBy(xpath = "(//span[text()='Create'])[2]")
	private WebElement createButton;
	
	@FindBy(xpath = "//span[text()='Close']")
	private WebElement closeButton;
	
	@FindBy(xpath = "//mat-icon[text()='close']")
	private WebElement closeXButton;
	
	@FindBy(xpath = "//button[text()='OK']")
	private WebElement createUserOkButton;
	
	public CreateUserPageObj(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getInstitutinsDropDown() {
		return institutinsDropDown;
	}

	public WebElement getRolesDropDown() {
		return rolesDropDown;
	}

	public WebElement getLastNameText() {
		return lastNameText;
	}

	public WebElement getMiddleNameText() {
		return middleNameText;
	}

	public WebElement getFirstNameText() {
		return firstNameText;
	}

	public WebElement getEmailText() {
		return emailText;
	}

	public WebElement getUserNameText() {
		return userNameText;
	}

	public WebElement getDateIcon() {
		return dateIcon;
	}

	public WebElement getSufixDropDown() {
		return sufixDropDown;
	}

	public WebElement getTimeZoneIDDropDown() {
		return timeZoneIDDropDown;
	}

	public WebElement getGenderDropDown() {
		return genderDropDown;
	}

	public WebElement getNickNameText() {
		return nickNameText;
	}

	public WebElement getPassWordText() {
		return passWordText;
	}

	public WebElement getReEnterPassWordText() {
		return reEnterPassWordText;
	}

	public WebElement getVisibilityOffPassWordButton() {
		return visibilityOffPassWordButton;
	}

	public WebElement getCreateButton() {
		return createButton;
	}

	public WebElement getCloseButton() {
		return closeButton;
	}

	public WebElement getCloseXButton() {
		return closeXButton;
	}

	public WebElement getCreateUserOkButton() {
		return createUserOkButton;
	}
	
	public void clickonUserMenu()
	{
		Constants.driver.findElement(By.xpath("//span[text()='Users']/../../../..")).click();
	}
	

	public void clickonCreateButton()
	{
		Constants.driver.findElement(By.xpath("//span[text()='Create']")).click();
	}

	
	public void ResponsiveEDcreateUser(WebDriver driver) throws Throwable {
		JavaUtility rw = new JavaUtility();
		int num=rw.getRandomNumber();
		int length =5;
		String ran=RandomStringGenerator.generateRandomString(length);
		excelGeniricUtillity ex = new excelGeniricUtillity();
		String Institution = ex.getDataFromExcel("User", 2, 0);
		String Role = ex.getDataFromExcel("User", 2, 1);
		String lastName = ex.getDataFromExcel("User", 2, 2);
		String MiddleName = ex.getDataFromExcel("User", 2, 3);
		String FirstName = ex.getDataFromExcel("User", 2, 4);
		String Email = ex.getDataFromExcel("User", 2, 5);
		String UserName = ex.getDataFromExcel("User", 2, 6);
		String Suffix = ex.getDataFromExcel("User", 2, 7);
		String TimeZoneID = ex.getDataFromExcel("User", 2, 8);
		String Gender = ex.getDataFromExcel("User", 2, 9);
		String NickName = ex.getDataFromExcel("User", 2, 10);
		String Password = ex.getDataFromExcel("User", 2, 11);
		Thread.sleep(2000);
		CreateUserPageObj cup =  new CreateUserPageObj(driver);
		cup.getInstitutinsDropDown().click();
		driver.findElement(By.xpath("//span[text()='"+Institution+"']")).click();
		Thread.sleep(2000);
		cup.getRolesDropDown().click();
		driver.findElement(By.xpath("(//span[text()='"+Role+"'])[2]")).click();
		Thread.sleep(2000);
		cup.getLastNameText().click();
		cup.getLastNameText().sendKeys(lastName+ran);
		Thread.sleep(2000);
		cup.getMiddleNameText().click();
		cup.getMiddleNameText().sendKeys(MiddleName+ran);
		Thread.sleep(2000);
		cup.getFirstNameText().click();
		cup.getFirstNameText().sendKeys(FirstName+ran);
		Thread.sleep(2000);
		cup.getEmailText().click();
		cup.getEmailText().sendKeys(Email+num+"@gmail.com");
		Thread.sleep(2000);
		cup.getUserNameText().click();
		cup.getUserNameText().sendKeys(UserName+num);
		Thread.sleep(2000);
		WebElement date = driver.findElement(By.xpath("//*[name()='svg' and @fill=\"currentColor\"]"));
		Actions act = new Actions(driver);
		act.moveToElement(date).click().build().perform();
		Thread.sleep(1000);
		WebElement date2 = driver.findElement(By.xpath("//span[text()=' 1 ']/.."));
		act.moveToElement(date2).click().build().perform();
		Thread.sleep(2000);
		cup.getSufixDropDown().click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='"+Suffix+"']")).click();
		Thread.sleep(2000);
		cup.getTimeZoneIDDropDown().click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='"+TimeZoneID+"']")).click();
		Thread.sleep(2000);
		cup.getGenderDropDown().click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='"+Gender+"']")).click();
		Thread.sleep(2000);
		cup.getNickNameText().click();
		Thread.sleep(2000);
		cup.getNickNameText().sendKeys(NickName+num);
		Thread.sleep(2000);
		cup.getPassWordText().click();
		Thread.sleep(2000);
		cup.getPassWordText().sendKeys(Password);
		Thread.sleep(2000);
		cup.getReEnterPassWordText().click();
		Thread.sleep(2000);
		cup.getReEnterPassWordText().sendKeys(Password);
		Thread.sleep(2000);
		
		cup.getUserNameText().click();
//		Robot robot = new Robot();
//		// Simulate Ctrl + A to select all text
//		robot.keyPress(KeyEvent.VK_CONTROL); // Press Ctrl key
//        robot.keyPress(KeyEvent.VK_A); // Press A key
//        robot.keyRelease(KeyEvent.VK_A); // Release A key
//        robot.keyRelease(KeyEvent.VK_CONTROL); // Release Ctrl key
//        // Simulate Ctrl + C to copy
//        robot.keyPress(KeyEvent.VK_CONTROL); // Press Ctrl key
//        robot.keyPress(KeyEvent.VK_C); // Press C key
//        robot.keyRelease(KeyEvent.VK_C); // Release C key
//        robot.keyRelease(KeyEvent.VK_CONTROL); // Release Ctrl key
//		Thread.sleep(2000);
//		robot.keyPress(KeyEvent.VK_CONTROL); 
//		robot.keyPress(KeyEvent.VK_V); 
//		robot.keyRelease(KeyEvent.VK_V); 
//		robot.keyRelease(KeyEvent.VK_CONTROL);
//		cup.getCreateButton().click();
//		Thread.sleep(2000);
//		cup.getCreateUserOkButton().click();
//		Thread.sleep(2000);
	}
	
	
	public void createuser()
	{
		Constants.driver.findElement(By.xpath("(//span[text()='Create'])[2]")).click();
	}
		
	public void CreateUserOkButton() throws Exception
	{
		Constants.driver.findElement(By.xpath("//button[text()='OK']")).click();
//		Thread.sleep(5000);
//		Constants.driver.findElement(By.xpath("//span[text()='GO']")).click();
//		Thread.sleep(4000);
//		Constants.driver.findElement(By.xpath("//input[@placeholder='Search User']/..")).click();
//		Constants.driver.findElement(By.xpath("//input[@placeholder='Search User']/..")).
//		sendKeys("robot.keyPress(KeyEvent.VK_CONTROL); \r\n"
//				+ "		robot.keyPress(KeyEvent.VK_V); \r\n"
//				+ "		robot.keyRelease(KeyEvent.VK_V); \r\n"
//				+ "		robot.keyRelease(KeyEvent.VK_CONTROL);");
		
//		
//			testbase.waitForElement(Constants.driver.findElement(By.xpath("//mat-label[text()='Search By:']/../../../..")), TIMEOUT_WAIT, POOLING_WAIT);
//	    	Constants.driver.findElement(searchByDropDown).click();
//	    	testbase.waitForElement(Constants.driver.findElement(By.xpath("//mat-label[text()='Search By:']/../../../..")), TIMEOUT_WAIT, POOLING_WAIT);
//	    	Constants.driver.findElement(searchBySelect).click();
//	    	Thread.sleep(WAIT);
//	    	testbase.waitForElement(Constants.driver.findElement(EnterUserName), TIMEOUT_WAIT, POOLING_WAIT);
//	    	Constants.driver.findElement(EnterUserName).click();
//	    	Thread.sleep(WAIT);
//	    	Constants.driver.findElement(EnterUserName).sendKeys("robot.keyPress(KeyEvent.VK_CONTROL); // Press Ctrl key\r\n"
//	    			+ "		robot.keyPress(KeyEvent.VK_V); // Press V key\r\n"
//	    			+ "		robot.keyRelease(KeyEvent.VK_V); // Release V key\r\n"
//	    			+ "		robot.keyRelease(KeyEvent.VK_CONTROL); // Release Ctrl key");
//	    	Thread.sleep(WAIT);
//	    	Thread.sleep(WAIT);
//	    	testbase.waitForElement(Constants.driver.findElement(goButton), TIMEOUT_WAIT, POOLING_WAIT);
//	    	Constants.driver.findElement(goButton).click();
//	    	Thread.sleep(WAIT);
		
		
	}
}
