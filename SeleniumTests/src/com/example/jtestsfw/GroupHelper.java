package com.example.jtestsfw;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.example.tests.GroupData;

public class GroupHelper extends HelperBase {

	public GroupHelper(AppManager manager) {
		super(manager);
	}

	public GroupHelper initNewGroupCreation() {
		click(By.name("new"));
		return this;
	}

	public GroupHelper fillGroupInformation(GroupData groupParams) {
		type(By.name("group_name"), groupParams.getGroupName());
		type(By.name("group_header"), groupParams.getGroupHeader());
		type(By.name("group_footer"), groupParams.getGroupFooter());
		return this;
	}

	public GroupHelper initGroupSubmit() {
		click(By.name("submit"));
		return this;
	}
	
	public GroupHelper returnToGroupPage() {
		click(By.linkText("group page"));
		return this;
	}

	public GroupHelper removeGroup(int index) {
		selectGroupByIndex(index);
		click(By.name("delete"));
		return this;
	}

	public GroupHelper initGroupModification(int index) {
		selectGroupByIndex(index);
		click(By.name("edit"));
		return this;
	}

	public GroupHelper submitGroupModification() {
		click(By.name("update"));
		return this;
	}

	private GroupHelper selectGroupByIndex(int index) {
		//That is on the groups enumeration start at 1 than java index must be increased, 1st group has zero java index
		click(By.xpath("//input[@name=\"selected[]\"][" + (index + 1) + "]"));
		return this;
	}

	public List<GroupData> getGroups() {
		List<GroupData> groups = new ArrayList<GroupData>();
		List<WebElement> checkboxes = driver.findElements(By.name("selected[]"));
		for (WebElement checkbox : checkboxes) {
			String groupTitle = checkbox.getAttribute("title");
			String groupName = groupTitle.substring("Select (".length(), groupTitle.length() - ")".length());
			groups.add(new GroupData().withName(groupName));
		}
		return groups;
	}
}
