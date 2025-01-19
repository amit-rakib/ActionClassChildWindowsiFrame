import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		WebDriver driver = new ChromeDriver();

		driver.get("https://testsigma.com/blog/action-class-in-selenium/");

		Actions action = new Actions(driver);

         
		// Move to specific element
		// Every Action needs to be build() and perform() to execute
		WebElement place = driver.findElement(By.xpath("//p[normalize-space()='Products']"));

		action.moveToElement(place).build().perform();

	}

}
