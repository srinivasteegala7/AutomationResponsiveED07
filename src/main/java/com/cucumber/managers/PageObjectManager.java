package com.cucumber.managers;

import org.apache.log4j.xml.DOMConfigurator;

import com.cucumber.PageObjects.CreateDuplicateUserPageObj;
import com.cucumber.PageObjects.CreateUserPageObj;
import com.cucumber.PageObjects.DropDownPageObj;
import com.cucumber.PageObjects.EditparticularuserdetailspageObj;
import com.cucumber.PageObjects.LoginPageObjects;
import com.cucumber.PageObjects.SearchForAParticularTeacherpageObj;
import com.cucumber.PageObjects.ViewParticularUserpageObj;
import com.cucumber.PageObjects.addRolesToAparticularUserpageObj;
import com.cucumber.PageObjects.allUserManagementDropDwnHandlePageObj;
import com.cucumber.PageObjects.sreachUserpageObj;
import com.cucumber.utility.Constants;
import com.cucumber.utility.Log;

public class PageObjectManager {

	// private WebDriver driver;

	private LoginPageObjects login;
	
	private CreateUserPageObj user;
	
	private allUserManagementDropDwnHandlePageObj dropDown;
	
	private sreachUserpageObj sreach;
	
	private DropDownPageObj DropD;

	private Log log;
	
	private EditparticularuserdetailspageObj edit;
	 
	private CreateDuplicateUserPageObj Duplicate;
	
	private ViewParticularUserpageObj view;
	
	private SearchForAParticularTeacherpageObj TeacherView;
	
	private addRolesToAparticularUserpageObj AddRole;

	
	

	


   


    
    public PageObjectManager() {
		// this.driver = driver;
		DOMConfigurator.configure("log4j.xml");
	}

	public LoginPageObjects getlogin() {
		if (login == null) {
			login = new LoginPageObjects(Constants.driver);
		}
		return login;
	}

	public CreateUserPageObj getcreateUser() {
		if (user == null) {
			user = new CreateUserPageObj(Constants.driver);
		}
		return user;
	}

	
	public sreachUserpageObj getsearchUser() {
		if (sreach == null) {
			sreach = new sreachUserpageObj(Constants.driver);
		}
		return sreach;
	}
	

	public DropDownPageObj getAllDropDown() {
		if (DropD == null) {
			DropD = new DropDownPageObj(Constants.driver);
		}
		return DropD;
	}
	
	
	public allUserManagementDropDwnHandlePageObj getdropDowns() {
		if (dropDown == null) {
			dropDown = new allUserManagementDropDwnHandlePageObj(Constants.driver);
		}
		return dropDown;
	}

	public EditparticularuserdetailspageObj getEditUser() {
		if (edit == null) {
			edit = new EditparticularuserdetailspageObj(Constants.driver);
		}
		return edit;
	}
	
	public CreateDuplicateUserPageObj getDuplicateUser() {
		if (Duplicate == null) {
			Duplicate = new CreateDuplicateUserPageObj(Constants.driver);
		}
		return Duplicate;
	}
	
	public ViewParticularUserpageObj getViewUser() {
		if (view == null) {
			view = new ViewParticularUserpageObj(Constants.driver);
		}
		return view;
	}
	
	public SearchForAParticularTeacherpageObj getTeacherView() {
		if (TeacherView == null) {
			TeacherView = new SearchForAParticularTeacherpageObj(Constants.driver);
		}
		return TeacherView;
	}
	
	public addRolesToAparticularUserpageObj getAddRole() {
		if (AddRole == null) {
			AddRole = new addRolesToAparticularUserpageObj(Constants.driver);
		}
		return AddRole;
	}
	
}
