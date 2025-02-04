import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SWT\\Desktop\\Selenium\\chromedriver.exe:");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		WebElement From=driver.findElement(By.xpath("//*[@id=\"credit2\"]/a"));
		WebElement tO=driver.findElement(By.xpath("//*[@id=\"bank\"]/1i"));
		Actions act=new Actions(driver);
		act.dragAndDrop(From, tO).build().perform();

		WebElement From1=driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
		WebElement tO2=driver.findElement(By.xpath("//*[@id=\"amt7\"]/li"));
		Actions act1=new Actions(driver);
		act1.dragAndDrop(From1, tO2).build().perform();

		WebElement From2=driver.findElement(By.xpath("//*[@id=\"credit1\"]/a"));
		WebElement tO3=driver.findElement(By.xpath("//*[@id=\"loan\"]/li"));
		Actions act2=new Actions(driver);
		act1.dragAndDrop(From2, tO3).build().perform();
		
	}

}
