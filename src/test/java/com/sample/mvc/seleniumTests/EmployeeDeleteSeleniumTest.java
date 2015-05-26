package com.sample.mvc.seleniumTests;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EmployeeDeleteSeleniumTest {
  private WebDriver driver;
  private String baseUrl;
  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "http://172.27.59.109:8088/EmployeeApplicationSprint4-1.0-SNAPSHOT/list";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testEdit() throws Exception {
	  driver.get("http://localhost:8088/EmployeeApplicationSprint4-1.0-SNAPSHOT/list");
	    assertEquals("Employee List", driver.getTitle());
	    driver.findElement(By.linkText("delete")).click();
	    assertEquals("Employee List", driver.getTitle());
	    driver.findElement(By.linkText("Back to Main")).click();
	    assertEquals("Employee Application", driver.getTitle());
   
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
   
  }

 
}
