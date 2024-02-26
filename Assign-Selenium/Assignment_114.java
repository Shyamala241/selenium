package seleniumAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment_114 {

	public static void main(String[] args) {
		// Launch Amazon and click on mobile tab.
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.Amazon.in");
		driver.manage().window().maximize();
		WebElement e1=driver.findElement(By.linkText("Mobiles"));
		e1.click();
		
		
	}

}
