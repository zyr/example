package com.example.jtestsfw;

import org.openqa.selenium.By;

public class NavigationHelper extends BaseHelper {

	public NavigationHelper(AppManager manager) {
		super(manager);
	}

	public void movingToGroups() {
	    AppManager.driver.findElement(By.linkText("groups")).click();
	}

	public void openMainPage() {
	    AppManager.driver.get(AppManager.baseUrl + "/addressbookv4.1.4/");
	}

	public void movingHomePage() {
		AppManager.driver.findElement(By.linkText("home page")).click();
	}

}
