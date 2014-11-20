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
			group.groupName = generateRandomStraing();
			group.groupHeader = generateRandomStraing();
			group.groupFooter = generateRandomStraing();
			list.add(new Object[]{group});
		}
		return list.iterator();	
	}
	
	@DataProvider
	public Iterator<Object[]> randomValidUserGenerator() {
		List<Object[]> list = new ArrayList<Object[]>();
	    UserData user = new UserData();
	    user.userName = "Ivan";
	    user.userSndName = "Ivanov";
	    user.userMainAddress = "1, Red squre, Moscow, Russia";
	    user.userHomeTelephone = "12345";
	    user.userMobilePhone = "+79121231234";
	    user.userWorkTelephone = "none";
	    user.userEmail = "vanya@anebaran.da";
	    user.userSndEmail = "none";
	    user.userBrthDay = "9";
	    user.userBrthMonth = "May";
	    user.userBrthYear = "1945";
	    user.userGroupName = "Main group";
	    user.userSndAddress = "Right on the square";
	    user.userSndPhone = "nono phone";
	    list.add(new Object[]{user});
		return list.iterator();
	}
	
	public String generateRandomStraing() {
		Random rn = new Random();
		if (rn.nextInt(3) == 0){
			return "";				
		} else {
			return "test" + rn.nextInt();
		}	
	}
}
