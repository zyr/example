package com.example.tests;

import org.testng.annotations.Test;

public class GroupModificationTests extends TestBase{
	
	@Test
	public void modifySomeGroup() {
		app.getNavigationHelper().openMainPage();
		app.getNavigationHelper().movingToGroups();
		app.getGroupHelper().initGroupModification(1);
		GroupData groupData = new GroupData();
		groupData.groupName = "name_mod";
		app.getGroupHelper().fillGroupInformation(groupData);
		app.getGroupHelper().submitGroupModification();
		app.getGroupHelper().returnToGroupPage();
	}

}
