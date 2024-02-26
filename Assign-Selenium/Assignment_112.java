package seleniumAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_112 {

	public static void main(String[] args) {
		// Wap to launch Facebook using id and name locator
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("asdr1991@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("astik@123");
		driver.findElement(By.name("login")).click();
		
		
	}

}
