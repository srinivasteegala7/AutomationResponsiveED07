package com.cucumber.stepdefination;


import com.cucumber.PageObjects.LoginPageObjects;
import com.cucumber.PageObjects.ViewParticularUserpageObj;
import com.cucumber.PageObjects.addRolesToAparticularUserpageObj;
import com.cucumber.utility.TestContext;
import cucumber.api.java.en.*;

public class addRolesToAparticularUserStepDef {
	TestContext testContext;
	LoginPageObjects login;
	ViewParticularUserpageObj view;
	addRolesToAparticularUserpageObj AddRole;
	
	public addRolesToAparticularUserStepDef(TestContext context) {
		System.out.println("Started searchUserStepDef Step Definition ");
		testContext = context;
		login = testContext.getPageObjectManager().getlogin();
		AddRole = testContext.getPageObjectManager().getAddRole();
	}


	@Given("^the user navigates to the login page$")
	public void the_user_navigates_to_the_login_page() throws Throwable {
		login.Logintoappln("srinivas.test", "Welcome1!");
		Thread.sleep(2000);
	}

	@When("^the User selects the UserMenu$")
	public void the_User_selects_the_UserMenu() throws Throwable {
		AddRole.the_User_selects_the_UserMenu();
	}

	@Then("^the User initiates the search process by clicking the GO button$")
	public void the_User_initiates_the_search_process_by_clicking_the_GO_button() throws Throwable {
		AddRole.the_User_initiates_the_search_process_by_clicking_the_GO_button();
	}

	@Then("^the User specifies the User Name to search$")
	public void the_User_specifies_the_User_Name_to_search() throws Throwable {
		AddRole.the_User_specifies_the_User_Name_to_search("srinivas");
	}

	@Then("^the User navigates to view the user details by clicking on the View Button$")
	public void the_User_navigates_to_view_the_user_details_by_clicking_on_the_View_Button() throws Throwable {
		AddRole.the_User_navigates_to_view_the_user_details_by_clicking_on_the_View_Button();
	}

	@Then("^the User adds roles to the user$")
	public void the_User_adds_roles_to_the_user() throws Throwable {
		AddRole.the_User_adds_roles_to_the_user();
	}


	
	
}
