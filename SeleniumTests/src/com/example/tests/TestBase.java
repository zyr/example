package com.example.tests;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

import com.example.jtestsfw.AppManager;


public class TestBase {
	
	protected static AppManager app; 

	@BeforeTest
	public void setUp() throws Exception {
		app = new AppManager();
	  }

	@AfterTest
	public void tearDown() throws Exception {
		app.stop();
	  }

	@DataProvider
	public Iterator<Object[]> randomValidGroupGenerator() {
		List<Object[]> list = new ArrayList<Object[]>();
		for (int i = 0; i < 5; i++) {
			GroupData group = new GroupData();
			group.groupName = generateRandomString("name");
			group.groupHeader = generateRandomString("header");
			group.groupFooter = generateRandomString("footer");
			list.add(new Object[]{group});
		}
		return list.iterator();	
	}
	
	@DataProvider
	public Iterator<Object[]> randomValidUserGenerator() {
		List<Object[]> list = new ArrayList<Object[]>();
	    UserData user = new UserData();
	    user.userName = generateRandomString("Ivan");
	    user.userSndName = generateRandomString("Ivanov");
	    user.userMainAddress = generateRandomString("1, Red squre, Moscow, Russia");
	    user.userHomeTelephone = generateRandomString("");
	    user.userMobilePhone = generateRandomString("");
	    user.userWorkTelephone = generateRandomString("");
	    user.userEmail = generateRandomString("vanya@anebaran.da");
	    user.userSndEmail = generateRandomString("none");
	    //user.userBrthDay = "9";
	    //user.userBrthMonth = "May";
	    user.userBrthYear = generateRandomString("");
	    //user.userGroupName = "Main group";
	    user.userSndAddress = generateRandomString("Right on the square");
	    user.userSndPhone = generateRandomString("");
	    list.add(new Object[]{user});
		return list.iterator();
	}
	
	protected String generateRandomString(String stBase) {
		Random rn = new Random();
		int randFactor = rn.nextInt(6);
		switch (randFactor) {
		case 3: case 5:
			return stBase.toUpperCase() + Math.abs(rn.nextInt());
		case 0: case 2:
			return stBase.toLowerCase() + Math.abs(rn.nextInt());
		}
		return "";
	}
	
	protected String generateRandomElementFromSelector(String element) {
		List<String> webElementsNames = app.getUserHelper().getWebElementsTextList(element);
		Random rn = new Random();
		return webElementsNames.get(rn.nextInt(webElementsNames.size()));
	} 
}
