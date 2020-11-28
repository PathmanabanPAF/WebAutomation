package com.test1.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class MyaccountTest {
	WebDriver driver = null;
	  @Test
	  public void f() throws InterruptedException {
		  driver= new FirefoxDriver();
		  driver.get("http://api.checklist.com/login");
		  Thread.sleep(3000);
		  driver.findElement(By.id("email")).sendKeys("pathmanaban.govindhan1984@gmail.com");
		  driver.findElement(By.name("j_password")).sendKeys("testing");
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//div[3]/button")).click();
		  Thread.sleep(3000);
		  driver.close();
	  }
}
