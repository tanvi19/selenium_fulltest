package com.sample.mvc.seleniumTests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class EmployeeAddSeleniumTest {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "http://172.27.59.131:4040/EmployeeApplicationSprint4-1.0-SNAPSHOT/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void EmployeeAddSelenium() throws Exception {
    driver.get("http://localhost:4040/EmployeeApplicationSprint4-1.0-SNAPSHOT/");
    assertEquals("Employee Application", driver.getTitle());
    driver.findElement(By.id("AddEmployeeLink")).click();
    assertEquals("Employee Application", driver.getTitle());
    driver.findElement(By.name("code")).clear();
 
    driver.findElement(By.name("code")).sendKeys("121");
    driver.findElement(By.name("name")).clear();
    driver.findElement(By.name("name")).sendKeys("ritu");
    driver.findElement(By.name("city")).clear();
    driver.findElement(By.name("city")).sendKeys("kalyan");
    driver.findElement(By.id("SubmitEmployee")).click();
    assertEquals("Employee List", driver.getTitle());
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
    
    }
  }

 












