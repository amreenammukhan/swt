package JAVA;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class TestNGpgm2 {
	public String baseUrl=("http://demo.guru99.com/test/newtours/");
	String driverPath="C:\\Users\\SWT\\Desktop\\Selenium\\chromedriver.exe";
	public WebDriver driver;
	public String expected=null;
	public String actual=null;
  @Test
  public void f() {
  }
  @BeforeMethod
  public void verifyHomepageTitle() {
	  String expectedTitle="Welcome:Mercury Tours";
	  String actualTitle=driver.getTitle();
	  Assert.assertEquals(actualTitle, expectedTitle);
  }
  @Test(priority=0)
  public void register() {
	  
	  driver.findElement(By.linkText("REGISTER")).click();
	  expected="Register:Mercury Tours";
	  actual=driver.getTitle();
	  Assert.assertEquals(actual, expected);
  
  }
  @Test(priority=1)
  public void support() {
	  
	  driver.findElement(By.linkText("SUPPORT")).click();
	  expected="UnderConstruction:Mercury Tours";
	  actual=driver.getTitle();
	  Assert.assertEquals(actual, expected);
  }

  @AfterMethod
  public void goBackToHomepage() {
	  driver.findElement(By.linkText("Home")).click();
  }

  @BeforeTest
  public void launchBrowser() {
	System.out.println("launching chrome browser");
	System.setProperty("webdriver.chrome.driver",driverPath);
	driver=new ChromeDriver();
	driver.get(baseUrl);
  }

  @AfterTest
  public void terminateBroowser() {
	  driver.close();
  }

}
