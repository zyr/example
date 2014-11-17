package com.example.tests;

import org.testng.annotations.Test;

public class UserModificationTests extends TestBase{
	
	@Test
	public void modifySomeUser(){
		app.getNavigationHelper().openMainPage();
		app.getUserHelper().selectUser(1);
		UserData userData = new UserData();
		userData.userName = "1st name mod";
		app.getUserHelper().fillUserData(userData);
		app.getUserHelper().submitUserModification();
		app.getNavigationHelper().movingHomePage();		
	}
}
