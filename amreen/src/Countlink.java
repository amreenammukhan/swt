import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Countlink {

	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.driver","c:\\Users\\SWT\\Desktop\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String homepage=("https://www.facebook.com/login/");
		driver.get(homepage);
		System.out.println("total link count "+driver.findElements(By.tagName("a")).size());
		
		WebElement foot=driver.findElement(By.id("pageFooter"));
		System.out.println("total link in footer" +driver.findElements(By.tagName("a")).size());
		

	}

}
