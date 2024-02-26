package seleniumAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_124 {

	public static void main(String[] args) {
		/* "Launch Growtechminds xpath form do the folllowing  
		1. Write an Xpath for books
		2. Write an Xpath for Mobiles
		3. Write an Xpath for Clothes
		4. Write an Xpath for Chocolates"*/
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.grotechminds.com/xpath/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//nav[@class=\"tree-nav defaut\"]/ul/li/span")).click();
		//driver.findElement(By.xpath("//ul[@class=\"sub-items\"]/li[1]/span")).click();
		driver.findElement(By.xpath("//ul[@class=\"main-items\"]/li/ul/li[1]/span")).click();
		driver.findElement(By.xpath("//ul[@class=\"main-items\"]/li/ul/li[1]/span")).click();
		driver.findElement(By.xpath("//ul[@class=\"main-items\"]/li/ul/li[2]/span")).click();
		driver.findElement(By.xpath("//ul[@class=\"main-items\"]/li/ul/li[2]/span")).click();
		driver.findElement(By.xpath("//ul[@class=\"main-items\"]/li/ul/li[3]/span")).click();
		driver.findElement(By.xpath("//ul[@class=\"main-items\"]/li/ul/li[3]/span")).click();
		driver.findElement(By.xpath("//ul[@class=\"main-items\"]/li/ul/li[4]/span")).click();
	}

}
