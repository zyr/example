package com.example.tests;

import java.util.List;
import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class GroupCreationTests extends TestBase {
  @Test
  public void testNonEmptyGroupCreation() throws Exception {
	app.getNavigationHelper().openMainPage();
    app.getNavigationHelper().movingToGroups();
    
    // save old state
    List<GroupData> oldList = app.getGroupHelper().getGroups();
    
    //actions
    app.getGroupHelper().initNewGroupCreation();
    GroupData groupParams = new GroupData();
    groupParams.groupName = "a_group";
    groupParams.groupHeader = "header!";
    groupParams.groupFooter = "footer!";
	app.getGroupHelper().fillGroupInformation(groupParams);
	app.getGroupHelper().initGroupSubmit();
    app.getGroupHelper().returnToGroupPage();
    
    // save new state
    List<GroupData> newList = app.getGroupHelper().getGroups();
    
    //compare states
    assertEquals(newList.size(), oldList.size() + 1);
    oldList.add(groupParams);
    assertEquals(newList, oldList);
  }

  //@Test
  public void testEmptyGroupCreation() throws Exception {
	app.getNavigationHelper().openMainPage();
    app.getNavigationHelper().movingToGroups();
    app.getGroupHelper().initNewGroupCreation();
    app.getGroupHelper().fillGroupInformation(new GroupData("", "", ""));
    app.getGroupHelper().initGroupSubmit();
    app.getGroupHelper().returnToGroupPage();
  }
}
