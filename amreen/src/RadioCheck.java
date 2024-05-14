import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioCheck {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SWT\\Desktop\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/radio.html");
		WebElement radio1 = driver.findElement(By.id("vfb-7-1"));
		WebElement radio2 = driver.findElement(By.id("vfb-7-2"));
		//Radio Button 1 is selected
		radio1.click();
		System.out.println("Radio Button Option 1 Selected");
		//Radio Button 1 is selected and Radio BUtton 2 is selected
		radio2.click();
		System.out.println("Radio Button Option 2 Selected");
		//Selecting Check box
		WebElement option1 = driver.findElement(By.id("vfb-6-0"));
		//This will Toggle the Check box
		option1.click();
		//check whether the Check box is Toggled on
		if(option1.isSelected()) {
			System.out.println("Checkbox is Toggled on");
		}
		else {
			System.out.println("Checkbox is Toggled off");
		}
	}
}
		
	


