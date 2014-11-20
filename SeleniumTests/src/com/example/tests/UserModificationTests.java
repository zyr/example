package com.example.tests;

import static org.testng.Assert.assertEquals;

import java.util.Collections;
import java.util.List;
import java.util.Random;

import org.testng.annotations.Test;

public class UserModificationTests extends TestBase{
	
	@Test
	public void modifySomeUser(){
		app.getNavigationHelper().openMainPage();
	    
	    // save old state
	    List<UserData> oldList = app.getUserHelper().getUsers();
	    		
		Random rn = new Random();
		int index = rn.nextInt(oldList.size() - 1);
	    
	    //actions
		//Initiation of the [index + 1] user modification
		app.getUserHelper().selectUser(index);
		UserData userData = new UserData();
		userData.userSndName = "2nd name mod rand";
		app.getUserHelper().fillUserData(userData);
		app.getUserHelper().submitUserModification();
		app.getNavigationHelper().movingHomePage();		
	    
	    // save new state
	    List<UserData> newList = app.getUserHelper().getUsers();
	    
	    //compare states
	    oldList.remove(index);
	    oldList.add(userData);
	    Collections.sort(oldList);
	    assertEquals(newList, oldList);
	}
}
