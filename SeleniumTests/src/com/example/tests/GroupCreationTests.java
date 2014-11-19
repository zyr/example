package com.example.tests;

import java.util.Collections;
import java.util.List;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class GroupCreationTests extends TestBase {
	
	@Test(dataProvider = "randomValidGroupGenerator")
	public void testGroupCreationWithValidData(GroupData groupData) throws Exception {
		app.getNavigationHelper().openMainPage();
	    app.getNavigationHelper().movingToGroups();
	    
	    // save old state
	    List<GroupData> oldList = app.getGroupHelper().getGroups();
	    
	    //actions
	    app.getGroupHelper().initNewGroupCreation();
		app.getGroupHelper().fillGroupInformation(groupData);
		app.getGroupHelper().initGroupSubmit();
	    app.getGroupHelper().returnToGroupPage();
	    
	    // save new state
	    List<GroupData> newList = app.getGroupHelper().getGroups();
	    
	    //compare states
	    oldList.add(groupData);
	    Collections.sort(oldList);
	    assertEquals(newList, oldList);
	}
}
