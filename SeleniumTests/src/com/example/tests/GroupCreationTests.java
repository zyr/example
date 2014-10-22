package com.example.tests;

import org.testng.annotations.Test;

public class GroupCreationTests extends TestBase {
  @Test
  public void testNonEmptyGroupCreation() throws Exception {
	openMainPage();
    movingToGroups();
    initNewGroupCreation();
    GroupData groupParams = new GroupData();
    groupParams.groupName = "zoki_group";
    groupParams.groupHeader = "header!";
    groupParams.groupFooter = "footer!";
	fillGroupInformation(groupParams);
    movingToGroups();
  }

  @Test
  public void testEmptyGroupCreation() throws Exception {
	openMainPage();
    movingToGroups();
    initNewGroupCreation();
    fillGroupInformation(new GroupData("", "", ""));
    movingToGroups();
  }
}
