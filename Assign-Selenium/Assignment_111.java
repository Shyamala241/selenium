package seleniumAssignments;

import java.util.Arrays;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment_111 {

	public static void main(String[] args) {
		// wap to get the Flipkart title and save each word in an array
		FirefoxDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		System.out.println(driver.getTitle()); 
		String s=driver.getTitle();
				char[] c=s.toCharArray();
		System.out.println(Arrays.toString(c));
	}

}
