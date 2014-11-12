package com.example.tests;

import org.testng.annotations.Test;

public class GroupCreationTests extends TestBase {
  @Test
  public void testNonEmptyGroupCreation() throws Exception {
	app.navigationHelper.openMainPage();
    app.navigationHelper.movingToGroups();
    app.groupHelper.initNewGroupCreation();
    GroupData groupParams = new GroupData();
    groupParams.groupName = "zoki_group";
    groupParams.groupHeader = "header!";
    groupParams.groupFooter = "footer!";
	app.groupHelper.fillGroupInformation(app, this, groupParams);
	app.groupHelper.initGroupSubmit();
    app.navigationHelper.movingToGroups();
  }

  @Test
  public void testEmptyGroupCreation() throws Exception {
	app.navigationHelper.openMainPage();
    app.navigationHelper.movingToGroups();
    app.groupHelper.initNewGroupCreation();
    app.groupHelper.fillGroupInformation(app, this, new GroupData("", "", ""));
    app.groupHelper.initGroupSubmit();
    app.navigationHelper.movingToGroups();
  }
}
