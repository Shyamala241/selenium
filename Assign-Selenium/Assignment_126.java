package seleniumAssignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment_126 {

	public static void main(String[] args) {
		// // Count the number of links we have in a webpage, locate using tagName
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("The number of links is:"+links.size());
		for(int i=0;i<=links.size()-1;i++)
		{
			WebElement a = links.get(i);
			String url1 = a.getAttribute("href");
			System.out.println(url1);
		}


	}

}
