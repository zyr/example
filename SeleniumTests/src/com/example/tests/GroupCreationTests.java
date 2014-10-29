package com.example.tests;

import org.testng.annotations.Test;

public class GroupCreationTests extends TestBase {
  @Test
  public void testNonEmptyGroupCreation() throws Exception {
	app.navigationHelper.openMainPage();
    app.navigationHelper.movingToGroups();
    app.navigationHelper.initNewGroupCreation();
    GroupData groupParams = new GroupData();
    groupParams.groupName = "zoki_group";
    groupParams.groupHeader = "header!";
    groupParams.groupFooter = "footer!";
	app.fillGroupInformation(this, groupParams);
    app.navigationHelper.movingToGroups();
  }

  @Test
  public void testEmptyGroupCreation() throws Exception {
	app.navigationHelper.openMainPage();
    app.navigationHelper.movingToGroups();
    app.navigationHelper.initNewGroupCreation();
    app.fillGroupInformation(this, new GroupData("", "", ""));
    app.navigationHelper.movingToGroups();
  }
}
