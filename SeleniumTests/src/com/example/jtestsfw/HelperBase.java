package com.example.jtestsfw;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import com.example.tests.TestBase;

public abstract class HelperBase {
	
	protected AppManager manager;
	protected WebDriver driver;	

	public boolean acceptNextAlert = true;

	public HelperBase(AppManager manager) {
		this.manager = manager;		
		this.driver = manager.driver;
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
	      Alert alert = manager.driver.switchTo().alert();
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

	protected void type(By locator, String text) {
		if (text != null) {
			driver.findElement(locator).clear();
			driver.findElement(locator).sendKeys(text);
		}		
	}

	protected void click(By locator) {
		driver.findElement(locator).click();
	}
	
	protected void selectByText(By locator, String text) {
		if (text != null) {
			new Select(driver.findElement(locator)).selectByVisibleText(text);
		}
	}
}
