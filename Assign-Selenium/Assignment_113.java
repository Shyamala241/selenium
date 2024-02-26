package seleniumAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment_113 {

	public static void main(String[] args) {
		// Launch Amazon Signin page and login using creditionals
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.Amazon.in");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("shyamalam07@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("astik@123");
		driver.findElement(By.name("login")).click();
		

	}

}
