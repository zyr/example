package com.example.jtestsfw;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import com.example.tests.UserData;

public class UserHelper extends BaseHelper {

	public UserHelper(AppManager manager) {
		super(manager);
	}

	public void initAddUser() {
		driver.findElement(By.linkText("add new")).click();
	}

	public void fillUserData(UserData userData) {
		driver.findElement(By.name("firstname")).clear();
	    driver.findElement(By.name("firstname")).sendKeys(userData.userName);
	    driver.findElement(By.name("lastname")).clear();
	    driver.findElement(By.name("lastname")).sendKeys(userData.userSndName);
	    driver.findElement(By.name("address")).clear();
	    driver.findElement(By.name("address")).sendKeys(userData.userMainAddress);
	    driver.findElement(By.name("home")).clear();
	    driver.findElement(By.name("home")).sendKeys(userData.userHomeTelephone);
	    driver.findElement(By.name("mobile")).clear();
	    driver.findElement(By.name("mobile")).sendKeys(userData.userMobilePhone);
	    driver.findElement(By.name("work")).clear();
	    driver.findElement(By.name("work")).sendKeys(userData.userWorkTelephone);
	    driver.findElement(By.name("email")).clear();
	    driver.findElement(By.name("email")).sendKeys(userData.userEmail);
	    new Select(driver.findElement(By.name("bday"))).selectByVisibleText(userData.userBrthDay);
	    new Select(driver.findElement(By.name("bmonth"))).selectByVisibleText(userData.userBrthMonth);
	    driver.findElement(By.name("byear")).clear();
	    driver.findElement(By.name("byear")).sendKeys(userData.userBrthYear);
	    new Select(driver.findElement(By.name("new_group"))).selectByVisibleText(userData.userGroupName);
	    driver.findElement(By.name("address2")).clear();
	    driver.findElement(By.name("address2")).sendKeys(userData.userSndAddress);
	    driver.findElement(By.name("phone2")).clear();
	    driver.findElement(By.name("phone2")).sendKeys(userData.userSndPhone);
	}

	public void initUserSubmit() {
		driver.findElement(By.name("submit")).click();
	}

}
