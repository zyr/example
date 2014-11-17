package com.example.jtestsfw;

import org.openqa.selenium.By;

public class NavigationHelper extends HelperBase {

	public NavigationHelper(AppManager manager) {
		super(manager);
	}

	public void movingToGroups() {
	    click(By.linkText("groups"));
	}

	public void openMainPage() {
		driver.get(manager.baseUrl + "/addressbookv4.1.4/");
	}

	public void movingHomePage() {
		click(By.linkText("home page"));
	}

}
