package com.cucumber.stepdefination;


import org.openqa.selenium.By;

import com.cucumber.PageObjects.LoginPageObjects;
import com.cucumber.PageObjects.SearchForAParticularTeacherpageObj;
import com.cucumber.utility.Constants;
import com.cucumber.utility.TestContext;
import cucumber.api.java.en.*;

public class SearchForAParticularTeacherStepDef {
	TestContext testContext;
	LoginPageObjects login;
	SearchForAParticularTeacherpageObj TeacherView;
	
	public SearchForAParticularTeacherStepDef(TestContext context) {
		System.out.println("Started searchUserStepDef Step Definition ");
		testContext = context;
		login = testContext.getPageObjectManager().getlogin();
		TeacherView = testContext.getPageObjectManager().getTeacherView();
	}


@Given("^the user logs into the application$")
public void the_user_logs_into_the_application() throws Throwable {
	login.Logintoappln("srinivas.test", "Welcome1!");
	Thread.sleep(2000); 
}

@Given("^the User navigates to the Teacher Menu$")
public void the_User_navigates_to_the_Teacher_Menu() throws Throwable {
	TeacherView.the_User_navigates_to_the_Teacher_Menu();
}

@Given("^the User sets the filters to show all options$")
public void the_User_sets_the_filters_to_show_all_options() throws Throwable {
	TeacherView.the_User_sets_the_filters_to_show_all_options("srinivas07");
}

@Given("^the User finalizes the filter selection by clicking the GO button$")
public void the_User_finalizes_the_filter_selection_by_clicking_the_GO_button() throws Throwable {
	TeacherView.the_User_finalizes_the_filter_selection_by_clicking_the_GO_button();
}

@Then("^the User accesses the detailed view by selecting the View option$")
public void the_User_accesses_the_detailed_view_by_selecting_the_View_option() throws Throwable {
	TeacherView.the_User_accesses_the_detailed_view_by_selecting_the_View_option();
}

	
}
