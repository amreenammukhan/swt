import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class screenshot {

	public static void findScreenshot() {
		try
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\SWT\\Desktop\\Selenium\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.facebook.com/login/");
			
			File screen=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileHandler.copy(screen, new File("C:\\Users\\SWT\\Desktop\\AMREEN\\abc.jpeg"));
			
		
		}

		catch (Exception exception)
		{
			System.out.println(exception);
			
		}
	}
	public static void main(String[] args)
	{
		screenshot obj=new screenshot();
		obj.findScreenshot();
	}

}
