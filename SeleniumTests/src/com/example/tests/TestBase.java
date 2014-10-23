package com.example.tests;

import static org.junit.Assert.fail;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class TestBase {

	private static WebDriver driver;
	private static String baseUrl;
	private boolean acceptNextAlert = true;
	private StringBuffer verificationErrors = new StringBuffer();

	@BeforeTest
	public void setUp() throws Exception {
	    driver = new FirefoxDriver();
	    baseUrl = "http://localhost/";
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  }

	@AfterTest
	public void tearDown() throws Exception {
	    driver.quit();
	    String verificationErrorString = verificationErrors.toString();
	    if (!"".equals(verificationErrorString)) {
	      fail(verificationErrorString);
	    }
	  }

	protected void fillGroupInformation(GroupData groupParams) {
	driver.findElement(By.name("group_name")).clear();
	driver.findElement(By.name("group_name")).sendKeys(groupParams.groupName);
	driver.findElement(By.name("group_header")).clear();
	driver.findElement(By.name("group_header")).sendKeys(groupParams.groupHeader);
	driver.findElement(By.name("group_footer")).clear();
	driver.findElement(By.name("group_footer")).sendKeys(groupParams.groupFooter);
	driver.findElement(By.name("submit")).click();}

	protected void initNewGroupCreation() {
	    driver.findElement(By.name("new")).click();
	}

	protected void movingToGroups() {
		// Moving to groups link
	    driver.findElement(By.linkText("groups")).click();
	}

	protected void openMainPage() {
		// Opening of the main page  
	    driver.get(baseUrl + "/addressbookv4.1.4/");
	}

	private boolean isElementPresent(By by) {
	    try {
	      driver.findElement(by);
	      return true;
	    } catch (NoSuchElementException e) {
	      return false;
	    }
	  }

	private boolean isAlertPresent() {
	    try {
	      driver.switchTo().alert();
	      return true;
	    } catch (NoAlertPresentException e) {
	      return false;
	    }
	  }

	private String closeAlertAndGetItsText() {
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

	protected void fillUserData(UserData userData) {
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

	protected void movingAddUser() {
		driver.findElement(By.linkText("add new")).click();
	}

	protected void movingHomePage() {
		driver.findElement(By.linkText("home page")).click();
	}

}
