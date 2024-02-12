package com.cucumber.stepdefination;


import com.cucumber.PageObjects.CreateDuplicateUserPageObj;
import com.cucumber.PageObjects.CreateUserPageObj;
import com.cucumber.PageObjects.LoginPageObjects;
import com.cucumber.utility.Constants;
import com.cucumber.utility.TestContext;

import cucumber.api.java.en.*;

public class CreateDuplicateUser {
	TestContext testContext;
	LoginPageObjects login;
	CreateDuplicateUserPageObj Duplicate;

	public CreateDuplicateUser(TestContext context) {
		System.out.println("Started CL2plus1 Step Definition ");
		testContext = context;
		login = testContext.getPageObjectManager().getlogin();
		Duplicate = testContext.getPageObjectManager().getDuplicateUser();
		
		
	}
	
	@Given("^the user is logged in with valid credentials$")
	public void the_user_is_logged_in_with_valid_credentials() throws Throwable {
		login.Logintoappln("srinivas.test", "Welcome1!");
	}

	@When("^the User accesses the UserMenu$")
	public void the_User_accesses_the_UserMenu() throws Throwable {
		Duplicate.clickonUserMenu();
	}

	@Then("^Click on The GO Button$")
	public void click_on_The_GO_Button() throws Throwable {
		Duplicate.clickonGOButton();
	}

	@When("^the User searches for a specific user by name$")
	public void the_User_searches_for_a_specific_user_by_name() throws Throwable {
		Duplicate.EnterUserName("srinivas07");
	}

	@Then("^Click on Duplicate Account button$")
	public void click_on_Duplicate_Account_button() throws Throwable {
		Duplicate.clickonDuplicateicon();
	}

	@Then("^Enter Duplicate user details$")
	public void enter_Duplicate_user_details() throws Throwable {
		Duplicate.EnterAllDuplicateUserDetails();
	}

	@Then("^click on Create button$")
	public void click_on_Create_button() throws Throwable {
		Duplicate.clickonCreateButton();
	}

	
	
	
}
