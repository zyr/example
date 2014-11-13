package com.example.tests;

import org.testng.annotations.Test;

public class GroupCreationTests extends TestBase {
  @Test
  public void testNonEmptyGroupCreation() throws Exception {
	app.getNavigationHelper().openMainPage();
    app.getNavigationHelper().movingToGroups();
    app.getGroupHelper().initNewGroupCreation();
    GroupData groupParams = new GroupData();
    groupParams.groupName = "zoki_group";
    groupParams.groupHeader = "header!";
    groupParams.groupFooter = "footer!";
	app.getGroupHelper().fillGroupInformation(groupParams);
	app.getGroupHelper().initGroupSubmit();
    app.getNavigationHelper().movingToGroups();
  }

  @Test
  public void testEmptyGroupCreation() throws Exception {
	app.getNavigationHelper().openMainPage();
    app.getNavigationHelper().movingToGroups();
    app.getGroupHelper().initNewGroupCreation();
    app.getGroupHelper().fillGroupInformation(new GroupData("", "", ""));
    app.getGroupHelper().initGroupSubmit();
    app.getNavigationHelper().movingToGroups();
  }
}
