package com.example.tests;

import org.testng.annotations.Test;

public class UserRemovingTests extends TestBase{
	
	@Test
	public void removeSomeUser() {
		app.getNavigationHelper().openMainPage();
		app.getUserHelper().removeUser(1);
		app.getNavigationHelper().movingHomePage();
	}
	

}
