package com.example.tests;

import static org.testng.Assert.assertEquals;
import static com.example.jtestsfw.UserHelper.ADDING;

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
	    userData.userBrthDay = generateRandomElementFromSelector("bDay");
	    userData.userBrthMonth = generateRandomElementFromSelector("bMonth");
	    userData.userGroupName = generateRandomElementFromSelector("group");
	    app.getUserHelper().fillUserData(userData, ADDING);
	    app.getUserHelper().submitUserAdding();
	    app.getNavigationHelper().movingHomePage();
	    
	    // save new state
	    List<UserData> newList = app.getUserHelper().getUsers();
	    
	    //compare states
	    oldList.add(userData);
	    Collections.sort(oldList);
	    assertEquals(newList, oldList);
	}
}
