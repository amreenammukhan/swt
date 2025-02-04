package JAVA;

import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;

import org.testng.annotations.BeforeTest;

import static org.testng.Assert.assertEquals;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class TestNGpgm1 {
	public String baseUrl = "http://demo.guru99.com/test/newtours/";
	String driverPath = "C:\\Users\\SWT\\Desktop\\Selenium\\chromedriver.exe";
	public WebDriver driver;
	
  @Test
  public void f() {
	  String expectedTitle = "Welcome: Mercury Tours";
	  String actualTitle = driver.getTitle();
	  System.out.println(actualTitle);
	  org.testng.Assert.assertEquals(actualTitle,expectedTitle);
	  
	  
  }
  
  @BeforeTest
  public void beforeTest() {
	  System.out.println("launching chrome browser");
	  System.setProperty("webdriver.chrome.driver",driverPath);
	  
	  driver = new ChromeDriver();
	  driver.get(baseUrl);
	  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
