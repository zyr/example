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
	
	public String generateRandomStraing() {
		Random rn = new Random();
		if (rn.nextInt(3) == 0){
			return "";				
		} else {
			return "test" + rn.nextInt();
		}	
	}
}
