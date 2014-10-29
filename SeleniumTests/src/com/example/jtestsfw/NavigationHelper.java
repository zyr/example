package com.example.jtestsfw;

import org.openqa.selenium.By;

public class NavigationHelper {

	public void initNewGroupCreation() {
	    AppManager.driver.findElement(By.name("new")).click();
	}

	public void movingToGroups() {
	    AppManager.driver.findElement(By.linkText("groups")).click();
	}

	public void openMainPage() {
	    AppManager.driver.get(AppManager.baseUrl + "/addressbookv4.1.4/");
	}

	public void initAddUser() {
		AppManager.driver.findElement(By.linkText("add new")).click();
	}

	public void movingHomePage() {
		AppManager.driver.findElement(By.linkText("home page")).click();
	}

}
