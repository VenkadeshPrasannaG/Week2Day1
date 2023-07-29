package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//https://login.salesforce.com/?locale=in
		
		
		
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		//driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("demoSalesManager");
		//crmsfa
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.id("")).click();
		
		
		Thread.sleep(2000);
		driver.close();

	}

}
