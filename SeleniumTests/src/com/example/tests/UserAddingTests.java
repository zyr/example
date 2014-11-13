package com.example.tests;

import org.testng.annotations.Test;

public class UserAddingTests extends TestBase{

  @Test
  public void testNonEmptyUserCreation() throws Exception {
    app.getNavigationHelper().openMainPage();
    app.getUserHelper().initAddUser();
    UserData userData = new UserData();
    userData.userName = "Ivan";
    userData.userSndName = "Ivanov";
    userData.userMainAddress = "1, Red squre, Moscow, Russia";
    userData.userHomeTelephone = "12345";
    userData.userMobilePhone = "+79121231234";
    userData.userWorkTelephone = "none";
    userData.userEmail = "vanya@anebaran.da";
    userData.userBrthDay = "9";
    userData.userBrthMonth = "May";
    userData.userBrthYear = "1945";
    userData.userGroupName = "Main group";
    userData.userSndAddress = "Right on the square";
    userData.userSndPhone = "nono phone";
    app.getUserHelper().fillUserData(userData);
    app.getUserHelper().initUserSubmit();
    app.getNavigationHelper().movingHomePage();
  }
  
  @Test
  public void testEmptyUserCreation() throws Exception {
	    app.getNavigationHelper().openMainPage();
	    app.getUserHelper().initAddUser();
	    UserData userData = new UserData("","","","","","","","-","-","","","","");
	    app.getUserHelper().fillUserData(userData);
	    app.getUserHelper().initUserSubmit();
	    app.getNavigationHelper().movingHomePage();
  }
}
