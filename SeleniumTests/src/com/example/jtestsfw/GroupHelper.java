package com.example.jtestsfw;

import org.openqa.selenium.By;

import com.example.tests.GroupData;

public class GroupHelper extends HelperBase {

	public GroupHelper(AppManager manager) {
		super(manager);
	}

	public void initNewGroupCreation() {
		click(By.name("new"));
	}

	public void fillGroupInformation(GroupData groupParams) {
		type(By.name("group_name"), groupParams.groupName);
		type(By.name("group_header"), groupParams.groupHeader);
		type(By.name("group_footer"), groupParams.groupFooter);
	}

	public void initGroupSubmit() {
		click(By.name("submit"));
	}
	
	public void returnToGroupPage() {
		click(By.linkText("group page"));
	}

	public void removeGroup(int index) {
		selectGroupByIndex(index);
		click(By.name("delete"));
	}

	public void initGroupModification(int index) {
		selectGroupByIndex(index);
		click(By.name("edit"));
	}

	public void submitGroupModification() {
		click(By.name("update"));
	}

	private void selectGroupByIndex(int index) {
		click(By.xpath("//input[@name=\"selected[]\"][" + index + "]"));
	}
}
