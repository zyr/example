package com.example.tests;

import static org.testng.Assert.assertEquals;

import java.util.Collections;
import java.util.List;
import java.util.Random;

import org.testng.annotations.Test;

public class UserRemovingTests extends TestBase{
	
	@Test
	public void removeSomeUser() {	
		app.getNavigationHelper().openMainPage();
	    
	    // save old state
	    List<UserData> oldList = app.getUserHelper().getUsers();
	    		
		Random rn = new Random();
		int index = rn.nextInt(oldList.size() - 1);
	    
	    //actions
	    //Remove [index + 1] user
		app.getUserHelper().removeUser(index);
		app.getNavigationHelper().movingHomePage();		
	    
	    // save new state
	    List<UserData> newList = app.getUserHelper().getUsers();
	    
	    //compare states
	    oldList.remove(index);
	    Collections.sort(oldList);
	    assertEquals(newList, oldList);
	}
	

}
