package com.example.jtestsfw;

import static org.junit.Assert.fail;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import com.example.tests.GroupData;
import com.example.tests.TestBase;
import com.example.tests.UserData;

public class AppManager {
	
	public static WebDriver driver;
	public static String baseUrl;
	public boolean acceptNextAlert = true;
	private StringBuffer verificationErrors = new StringBuffer();
	public NavigationHelper navigationHelper;

	public AppManager() {
	    driver = new FirefoxDriver();
	    baseUrl = "http://localhost/";
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
	}
	
	public void stop() {
	    driver.quit();
	    String verificationErrorString = verificationErrors.toString();
	    if (!"".equals(verificationErrorString)) {
	      fail(verificationErrorString);
	    }
	}

	public void fillGroupInformation(TestBase testBase, GroupData groupParams) {
		driver.findElement(By.name("group_name")).clear();
		driver.findElement(By.name("group_name")).sendKeys(groupParams.groupName);
		driver.findElement(By.name("group_header")).clear();
		driver.findElement(By.name("group_header")).sendKeys(groupParams.groupHeader);
		driver.findElement(By.name("group_footer")).clear();
		driver.findElement(By.name("group_footer")).sendKeys(groupParams.groupFooter);
		driver.findElement(By.name("submit")).click();
	}

	public boolean isElementPresent(By by) {
	    try {
	      driver.findElement(by);
	      return true;
	    } catch (NoSuchElementException e) {
	      return false;
	    }
	  }

	public boolean isAlertPresent() {
	    try {
	      driver.switchTo().alert();
	      return true;
	    } catch (NoAlertPresentException e) {
	      return false;
	    }
	  }

	public String closeAlertAndGetItsText(TestBase testBase) {
	    try {
	      Alert alert = driver.switchTo().alert();
	      String alertText = alert.getText();
	      if (acceptNextAlert) {
	        alert.accept();
	      } else {
	        alert.dismiss();
	      }
	      return alertText;
	    } finally {
	      acceptNextAlert = true;
	    }
	  }

	public void fillUserData(TestBase testBase, UserData userData) {
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
	    driver.findElement(By.name("submit")).click();
	}
}
