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

		 ChromeOptions options = new ChromeOptions();
	     options.addArguments("--disable-blink-features=AutomationControlled");

		
		WebDriver driver = new ChromeDriver(options);

		driver.get("https://www.amazon.com/");

		Actions action = new Actions(driver);

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("nav-link-accountList")));

		
		// Every Action needs to be build() and perform() to execute
		WebElement place = driver.findElement(By.id("nav-link-accountList"));

		action.moveToElement(place).build().perform();

	}

}
