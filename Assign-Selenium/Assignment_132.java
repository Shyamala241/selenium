package seleniumAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment_132 {

	public static void main(String[] args) {
		/* Launch growtechminds drag and drop page,
		do drag a image and drop it in target place,do the reverse of it.*/
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.grotechminds.com/drag-and-drop/");
		driver.manage().window().maximize();
		WebElement drag = driver.findElement(By.id("drag7"));
		WebElement drop = driver.findElement(By.id("div2"));
		Actions a1=new Actions(driver);
		a1.dragAndDrop(drag, drop).perform();
		}

}
