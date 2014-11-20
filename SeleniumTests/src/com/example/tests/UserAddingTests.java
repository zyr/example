package com.example.tests;

import static org.testng.Assert.assertEquals;

import java.util.Collections;
import java.util.List;

import org.testng.annotations.Test;

public class UserAddingTests extends TestBase{

	@Test(dataProvider = "randomValidUserGenerator")
	public void testUserAddingWithValidData(UserData userData) throws Exception {
	    app.getNavigationHelper().openMainPage();
	    
	    // save old state
	    List<UserData> oldList = app.getUserHelper().getUsers();
	    
	    //actions
	    app.getUserHelper().initAddUser();
	    app.getUserHelper().fillUserData(userData);
	    app.getUserHelper().initUserSubmit();
	    app.getNavigationHelper().movingHomePage();
	    
	    // save new state
	    List<UserData> newList = app.getUserHelper().getUsers();
	    
	    //compare states
	    oldList.add(userData);
	    Collections.sort(oldList);
	    assertEquals(newList, oldList);
	}
}
