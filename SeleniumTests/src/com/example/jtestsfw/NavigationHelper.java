package com.example.jtestsfw;

import org.openqa.selenium.By;

public class NavigationHelper extends BaseHelper {

	public NavigationHelper(AppManager manager) {
		super(manager);
	}

	public void movingToGroups() {
	    driver.findElement(By.linkText("groups")).click();
	}

	public void openMainPage() {
		driver.get(manager.baseUrl + "/addressbookv4.1.4/");
	}

	public void movingHomePage() {
		driver.findElement(By.linkText("home page")).click();
	}

}
