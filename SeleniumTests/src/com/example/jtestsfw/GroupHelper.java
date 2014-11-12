package com.example.jtestsfw;

import org.openqa.selenium.By;

import com.example.tests.GroupData;
import com.example.tests.TestBase;

public class GroupHelper {

	public void initNewGroupCreation() {
	    AppManager.driver.findElement(By.name("new")).click();
	}
	
	public void fillGroupInformation(AppManager appManager, TestBase testBase, GroupData groupParams) {
		AppManager.driver.findElement(By.name("group_name")).clear();
		AppManager.driver.findElement(By.name("group_name")).sendKeys(groupParams.groupName);
		AppManager.driver.findElement(By.name("group_header")).clear();
		AppManager.driver.findElement(By.name("group_header")).sendKeys(groupParams.groupHeader);
		AppManager.driver.findElement(By.name("group_footer")).clear();
		AppManager.driver.findElement(By.name("group_footer")).sendKeys(groupParams.groupFooter);
	}

	public void initGroupSubmit() {
		AppManager.driver.findElement(By.name("submit")).click();
	}

}
