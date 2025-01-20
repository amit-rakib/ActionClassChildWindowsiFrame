import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ParentChildWindowHandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");

		driver.findElement(By.xpath("//a[@class='blinkingText'][1]")).click();

		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String parentWindow = it.next();
		String childWindow = it.next();

		// Child driver area
		driver.switchTo().window(childWindow);

		String text = driver.findElement(By.cssSelector(".im-para.red")).getText();
		System.out.println(text);

		// Please email us at mentor@rahulshettyacademy.com with below template to
		// receive response

		
		String email = text.split("@")[1].split("\\.")[0];
		System.out.println(email);

		// Parent window area
		driver.switchTo().window(parentWindow);

		driver.findElement(By.id("username")).sendKeys(email);
		driver.findElement(By.id("password")).sendKeys("learning");
		//driver.findElement(By.xpath("//label[2]//span[2]")).click();
		
		

		WebElement select = driver.findElement(By.xpath("//select[@class='form-control']"));

		Select option = new Select(select);
		option.selectByContainsVisibleText("Teacher");
		
		driver.findElement(By.xpath("(//input[@id='terms'])[1]")).click();
		driver.findElement(By.xpath("//input[@id='signInBtn']")).click();

	}

}
