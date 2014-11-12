package com.example.jtestsfw;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import com.example.tests.TestBase;
import com.example.tests.UserData;

public class UserHelper {

	public void initAddUser() {
		AppManager.driver.findElement(By.linkText("add new")).click();
	}

	public void fillUserData(AppManager appManager, TestBase testBase, UserData userData) {
		AppManager.driver.findElement(By.name("firstname")).clear();
	    AppManager.driver.findElement(By.name("firstname")).sendKeys(userData.userName);
	    AppManager.driver.findElement(By.name("lastname")).clear();
	    AppManager.driver.findElement(By.name("lastname")).sendKeys(userData.userSndName);
	    AppManager.driver.findElement(By.name("address")).clear();
	    AppManager.driver.findElement(By.name("address")).sendKeys(userData.userMainAddress);
	    AppManager.driver.findElement(By.name("home")).clear();
	    AppManager.driver.findElement(By.name("home")).sendKeys(userData.userHomeTelephone);
	    AppManager.driver.findElement(By.name("mobile")).clear();
	    AppManager.driver.findElement(By.name("mobile")).sendKeys(userData.userMobilePhone);
	    AppManager.driver.findElement(By.name("work")).clear();
	    AppManager.driver.findElement(By.name("work")).sendKeys(userData.userWorkTelephone);
	    AppManager.driver.findElement(By.name("email")).clear();
	    AppManager.driver.findElement(By.name("email")).sendKeys(userData.userEmail);
	    new Select(AppManager.driver.findElement(By.name("bday"))).selectByVisibleText(userData.userBrthDay);
	    new Select(AppManager.driver.findElement(By.name("bmonth"))).selectByVisibleText(userData.userBrthMonth);
	    AppManager.driver.findElement(By.name("byear")).clear();
	    AppManager.driver.findElement(By.name("byear")).sendKeys(userData.userBrthYear);
	    new Select(AppManager.driver.findElement(By.name("new_group"))).selectByVisibleText(userData.userGroupName);
	    AppManager.driver.findElement(By.name("address2")).clear();
	    AppManager.driver.findElement(By.name("address2")).sendKeys(userData.userSndAddress);
	    AppManager.driver.findElement(By.name("phone2")).clear();
	    AppManager.driver.findElement(By.name("phone2")).sendKeys(userData.userSndPhone);
	}

	public void initUserSubmit() {
		AppManager.driver.findElement(By.name("submit")).click();
	}

}
