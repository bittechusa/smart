package com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvide 
{

  private   static WebDriver driver;

  @DataProvider(name = "Authentication")

<<<<<<< HEAD
  public static Object[][] credentials() 
  {
=======
  public static Object[][] credentials() {
>>>>>>> 5b058983e3e3fbcf06c8fb2691428b7afb9fd4dc

        return new Object[][] { { "sislam", "Test@123" }, { "testu", "Test@1234" },{ "testu", "Test@1234" }};

  }

  // Here we are calling the Data Provider object with its Name

  @Test(dataProvider = "Authentication")

<<<<<<< HEAD
  public void test(String sUsername, String sPassword) throws InterruptedException 
  {
=======
  public void test(String sUsername, String sPassword) throws InterruptedException {
>>>>>>> 5b058983e3e3fbcf06c8fb2691428b7afb9fd4dc

	  driver = new FirefoxDriver();
	  driver.manage().window().maximize();

      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

      driver.get("http://www.facebook.com");

      driver.findElement(By.id("email")).sendKeys(sUsername);

      driver.findElement(By.id("pass")).sendKeys(sPassword);

      driver.findElement(By.id("u_0_n")).click();
      Thread.sleep(3000);

      driver.quit();

  }


}
