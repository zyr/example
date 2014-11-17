package com.example.tests;

import org.testng.annotations.Test;

public class GroupRemovingTests extends TestBase {

	@Test
	public void removeSomeGroup() {
		app.getNavigationHelper().openMainPage();
		app.getNavigationHelper().movingToGroups();
		app.getGroupHelper().removeGroup(1);
		app.getGroupHelper().returnToGroupPage();
	}
}
