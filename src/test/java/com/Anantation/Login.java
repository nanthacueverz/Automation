package com.Anantation;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class Login {
	WebDriver driver;
	ExtentTest test;
	ExtentReports report;
  @Test
  public void f() throws InterruptedException, IOException {
	  	driver.findElement(By.id("phone_number")).sendKeys("9493450243");
		driver.findElement(By.id("password")).sendKeys(";lkjhgh");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("D:\\selenium\\Halalfull-testing\\HalalfullAutomation\\src\\screenshot\\screenshot.png"));
		test.log(LogStatus.PASS, "Pass a Value Correctly");
		Thread.sleep(2000);
  }
  @BeforeMethod
  public void beforeMethod() throws InterruptedException {
	  report = new ExtentReports("D:\\selenium\\Halalfull-testing\\HalalfullAutomation\\src\\report\\report.html");
	  test = report.startTest("Login");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://halalfull.com/");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("(//a[@class='d-flex'])[1]")).click();
	  Thread.sleep(2000);
  }

  @AfterMethod
  public void afterMethod() throws InterruptedException {
	  Thread.sleep(5000);
	  report.endTest(test);
	  report.flush();
	  driver.quit();
  }

}
