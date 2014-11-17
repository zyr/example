package com.example.jtestsfw;

import org.openqa.selenium.By;

import com.example.tests.UserData;

public class UserHelper extends HelperBase {

	public UserHelper(AppManager manager) {
		super(manager);
	}

	public void initAddUser() {
		click(By.linkText("add new"));
	}

	public void fillUserData(UserData userData) {
		type(By.name("firstname"), userData.userName);
		type(By.name("lastname"), userData.userSndName);
		type(By.name("address"), userData.userMainAddress);
		type(By.name("home"), userData.userHomeTelephone);
		type(By.name("mobile"), userData.userMobilePhone);
		type(By.name("work"), userData.userWorkTelephone);
		type(By.name("email"), userData.userEmail);
	    selectByText(By.name("bday"), userData.userBrthDay);
	    selectByText(By.name("bmonth"), userData.userBrthMonth);
		type(By.name("byear"), userData.userBrthYear);
		//selectByText(By.name("new_group"), userData.userGroupName);
		type(By.name("address2"), userData.userSndAddress);
		type(By.name("phone2"), userData.userSndPhone);
	}

	public void initUserSubmit() {
		click(By.name("submit"));
	}

	public void selectUser(int index) {
		click(By.xpath("//tbody/tr[" + ++index + "]/td[7]/a"));
	}

	public void submitUserModification() {
		click(By.xpath("//input[@value=\"Update\"]"));				
	}

	public void removeUser(int index) {
		selectUser(index);		
		click(By.xpath("//input[@value=\"Delete\"]"));
	}

}
