package com.sample.mvc.seleniumTests;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EmployeeEditSeleniumTest {
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
   // driver.get(baseUrl + "");
   
    //driver.findElement(By.xpath("(//a[contains(text(),'edit')])[1]")).click();
   // driver.findElement(By.name("name")).clear();
   // driver.findElement(By.name("name")).sendKeys("Ruuuu");
    //driver.findElement(By.name("city")).clear();
    //driver.findElement(By.name("city")).sendKeys("Viiiii");
    //driver.findElement(By.id("EditEmployee")).click();
    //driver.get("http://localhost:8088/EmployeeApplicationSprint4-1.0-SNAPSHOT/");
    
    
    
    //assertEquals("Employee Application", driver.getTitle());
   // driver.findElement(By.id("AddEmployeeLink")).click();
   // assertEquals("Employee Application", driver.getTitle());
    //driver.findElement(By.name("code")).clear();
    //driver.findElement(By.name("code")).sendKeys("21");
    //driver.findElement(By.name("name")).clear();
    //driver.findElement(By.name("name")).sendKeys("pushpa");
    //driver.findElement(By.name("city")).clear();
   // driver.findElement(By.name("city")).sendKeys("punjab");
    //driver.findElement(By.id("SubmitEmployee")).click();
    //assertEquals("Employee List", driver.getTitle());
   //driver.findElement(By.linkText("edit")).click();
    //assertEquals("Employee Application", driver.getTitle());
   // driver.findElement(By.name("city")).clear();
    //driver.findElement(By.name("city")).sendKeys("delhi");
    //driver.findElement(By.id("EditEmployee")).click();

    
    
    
//assertEquals("Employee List", driver.getTitle());
    
    driver.get("http://localhost:8088/EmployeeApplicationSprint4-1.0-SNAPSHOT/home.html");
    assertEquals("Employee Application", driver.getTitle());
    driver.findElement(By.linkText("List Employees")).click();
    assertEquals("Employee List", driver.getTitle());
    driver.findElement(By.linkText("edit")).click();
    assertEquals("Employee Application", driver.getTitle());
    driver.findElement(By.name("name")).clear();
    driver.findElement(By.name("name")).sendKeys("nitu singh");
    driver.findElement(By.id("EditEmployee")).click();
    driver.findElement(By.name("name")).clear();
    driver.findElement(By.name("name")).sendKeys("nitusingh");
    driver.findElement(By.id("EditEmployee")).click();
    assertEquals("Employee List", driver.getTitle());
    
    
    
  
    
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
   
  }

 
}

 