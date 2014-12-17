package com.example.tests;

import static org.testng.Assert.assertEquals;

import java.util.Collections;
import java.util.List;
import java.util.Random;

import org.testng.annotations.Test;

public class GroupRemovingTests extends TestBase {

	@Test
	public void removeSomeGroup() {	    
	    app.getNavigationHelper().openMainPage();
		app.getNavigationHelper().movingToGroups();
	    
	    // save old state
	    List<GroupData> oldList = app.getGroupHelper().getGroups();

	    Random rn = new Random();
	    int index = rn.nextInt(oldList.size() - 1);

	    //actions
	    //Remove [index + 1] group
		app.getGroupHelper()
			.removeGroup(index)
			.returnToGroupPage();
   
	    // save new state
	    List<GroupData> newList = app.getGroupHelper().getGroups();
	    
	    //compare states
	    oldList.remove(index);
	    Collections.sort(oldList);
	    assertEquals(newList, oldList);
	}
}
