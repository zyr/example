package com.example.tests;

import static org.testng.Assert.assertEquals;

import java.util.Collections;
import java.util.List;
import java.util.Random;

import org.testng.annotations.Test;

public class GroupModificationTests extends TestBase{
	
	@Test(dataProvider = "randomValidGroupGenerator")
	public void modifySomeGroup(GroupData groupData) {
		app.getNavigationHelper().openMainPage();
		app.getNavigationHelper().movingToGroups();
	    
	    // save old state
	    List<GroupData> oldList = app.getGroupHelper().getGroups();

	    Random rn = new Random();
	    int index = rn.nextInt(oldList.size() - 1);
	    
	    //actions
	    //Initiation of the [index + 1] group modification
		app.getGroupHelper().initGroupModification(index);
		app.getGroupHelper().fillGroupInformation(groupData);
		app.getGroupHelper().submitGroupModification();
		app.getGroupHelper().returnToGroupPage();
	    
	    // save new state
	    List<GroupData> newList = app.getGroupHelper().getGroups();
	    
	    //compare states
	    oldList.remove(index);
	    oldList.add(groupData);
	    Collections.sort(oldList);
	    assertEquals(newList, oldList);
	}

}
