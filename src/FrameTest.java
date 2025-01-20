import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class FrameTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/droppable/");
		
		// Identify frame by className or WebElement
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
        
		// Identify frame by index
		//driver.switchTo().frame(0);
		
		//Count how many frames are there 
	System.out.println(driver.findElements(By.tagName("iframe")).size());
		
		Actions action = new Actions(driver);
		
	WebElement source =	driver.findElement(By.id("draggable"));
	WebElement target = driver.findElement(By.id("droppable"));
	
	// Move element to destination
	action.dragAndDrop(source, target).build().perform();

	}

}
