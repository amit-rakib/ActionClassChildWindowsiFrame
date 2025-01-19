import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.co.uk/");

		Actions action = new Actions(driver);

		WebElement searchBox = driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
        // to write in capital letter
		action.moveToElement(searchBox).click().keyDown(Keys.SHIFT).sendKeys("hello world").build().perform();

		// to select using double click 
		action.moveToElement(searchBox).doubleClick().build().perform();
		
		
	}

}
