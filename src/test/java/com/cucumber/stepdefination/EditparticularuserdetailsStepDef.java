package com.cucumber.stepdefination;

import org.openqa.selenium.By;

import com.cucumber.PageObjects.CreateUserPageObj;
import com.cucumber.PageObjects.EditparticularuserdetailspageObj;
import com.cucumber.PageObjects.LoginPageObjects;
import com.cucumber.PageObjects.allUserManagementDropDwnHandlePageObj;
import com.cucumber.PageObjects.sreachUserpageObj;
import com.cucumber.utility.Constants;
import com.cucumber.utility.JavaUtility;
import com.cucumber.utility.TestContext;

import cucumber.api.java.en.*;

public class EditparticularuserdetailsStepDef {
	TestContext testContext;
	LoginPageObjects login;
	CreateUserPageObj user;
	allUserManagementDropDwnHandlePageObj dropDown;
	sreachUserpageObj sreach;
	JavaUtility java;
	EditparticularuserdetailspageObj edit;
	
	public EditparticularuserdetailsStepDef(TestContext context) {
		System.out.println("Started searchUserStepDef Step Definition ");
		testContext = context;
		login = testContext.getPageObjectManager().getlogin();
		sreach = testContext.getPageObjectManager().getsearchUser();
//		dropDown = testContext.getPageObjectManager().getdropDowns();
		edit = testContext.getPageObjectManager().getEditUser();
		
	}
	@Given("^User is on the login page$")
	public void user_is_on_the_login_page() throws Throwable {
		login.Logintoappln("srinivas.test", "Welcome1!");
		Thread.sleep(2000);
	}

	@Then("^User Clicks on the UserMenu$")
	public void user_Clicks_on_the_UserMenu() throws Throwable {
		edit.clickonUserMenu();
		Thread.sleep(2000);
	}

	@Then("^User selects All Drop-down Values$")
	public void user_selects_All_Drop_down_Values() throws Throwable {
		dropDown = testContext.getPageObjectManager().getdropDowns();
		dropDown.SelectinstitutinsDropDown();
		Thread.sleep(2000);
		dropDown.SelectrolesDropDown();
		Thread.sleep(2000);
		dropDown.SelectenrollmentStatusDropDown();
		Thread.sleep(2000);
		dropDown.SlectsearchByDropDown(); 
		Thread.sleep(2000);
	}

	@Then("^User Clicks the GO button$")
	public void user_Clicks_the_GO_button() throws Throwable {
		dropDown.ClickONGOBUTTON();
	}

	@Then("^User Enters User Name in the search user field$")
	public void user_Enters_User_Name_in_the_search_user_field() throws Throwable {
		edit.EnterUserName("srinivas07");
	    Thread.sleep(2000);
	}

	@Then("^User clicks on the edit button$")
	public void user_clicks_on_the_edit_button() throws Throwable {
		
	   edit.clickonEditBtn();
	}

	@Then("^User edits the user details$")
	public void user_edits_the_user_details() throws Throwable {
		edit.EditUserDetails("Srinu");
		Thread.sleep(2000);;
		edit.clickonSaveBtn();
	}


	
}
