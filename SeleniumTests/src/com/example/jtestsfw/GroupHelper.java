package com.example.jtestsfw;

import org.openqa.selenium.By;

import com.example.tests.GroupData;

public class GroupHelper extends BaseHelper {

	public GroupHelper(AppManager manager) {
		super(manager);
	}

	public void initNewGroupCreation() {
		driver.findElement(By.name("new")).click();
	}
	
	public void fillGroupInformation(GroupData groupParams) {
		driver.findElement(By.name("group_name")).clear();
		driver.findElement(By.name("group_name")).sendKeys(groupParams.groupName);
		driver.findElement(By.name("group_header")).clear();
		driver.findElement(By.name("group_header")).sendKeys(groupParams.groupHeader);
		driver.findElement(By.name("group_footer")).clear();
		driver.findElement(By.name("group_footer")).sendKeys(groupParams.groupFooter);
	}

	public void initGroupSubmit() {
		driver.findElement(By.name("submit")).click();
	}

}
