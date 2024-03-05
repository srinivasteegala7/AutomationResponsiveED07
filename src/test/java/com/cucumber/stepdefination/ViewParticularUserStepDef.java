package com.cucumber.stepdefination;


import com.cucumber.PageObjects.LoginPageObjects;
import com.cucumber.PageObjects.ViewParticularUserpageObj;
import com.cucumber.utility.TestContext;
import cucumber.api.java.en.*;

public class ViewParticularUserStepDef {
	TestContext testContext;
	LoginPageObjects login;
	ViewParticularUserpageObj view;
	
	public ViewParticularUserStepDef(TestContext context) {
		System.out.println("Started searchUserStepDef Step Definition ");
		testContext = context;
		login = testContext.getPageObjectManager().getlogin();
		view = testContext.getPageObjectManager().getViewUser();
	}
	
	
	@Given("^the user is on the login page$")
	public void the_user_is_on_the_login_page() throws Throwable {
		login.Logintoappln("srinivas.test", "Welcome1!");
		Thread.sleep(2000);
	}

	@When("^the User navigates to the UserMenu$")
	public void the_User_navigates_to_the_UserMenu() throws Throwable {
		view.clickonUserMenu();
		Thread.sleep(2000);
	}

	@When("^the User clicks the GO button$")
	public void the_User_clicks_the_GO_button() throws Throwable {
		view.ClickonGObutton();
		Thread.sleep(2000);
	}

	@Then("^the User enters the User Name to search$")
	public void the_User_enters_the_User_Name_to_search() throws Throwable {
		view.EnterUserName("srinivas07");
		Thread.sleep(2000);
	}

	@Then("^the User clicks on the View Button$")
	public void the_User_clicks_on_the_View_Button() throws Throwable {
		view.clickonViewButton();
		Thread.sleep(4000);
	}

}
