package com.epam.ta.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class CommonConditions {
  protected WebDriver driver;

  @BeforeClass
  public void setupBrowser() {
    driver = new ChromeDriver();
  }

  @AfterClass(alwaysRun = true)
  public void stopBrowser() {
    driver.quit();
    driver = null;
  }
}
