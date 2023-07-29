package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Salesforcehomework {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//https://login.salesforce.com/?locale=in
		
		/*
		 * https://login.salesforce.com/?locale=in hari.radhakrishnan@qeagle.com
		 * Leaf$1234
		 */
		
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/?locale=in");
		driver.manage().window().maximize();
		//driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("hari.radhakrishnan@qeagle.com");
		//crmsfa
		driver.findElement(By.id("password")).sendKeys("Leaf$1234");
		driver.findElement(By.id("Login")).click();
		
		
		Thread.sleep(2000);
		driver.close();
		
		
		
		
		
		
		
		
		
		/*
		 * String text = driver.findElement(By.tagName("h2")).getText();
		 * System.out.println(text);
		 * 
		 * WebElement username = driver.findElement(By.id("username"));
		 * username.sendKeys("demoSalesManager"); //sendKeys -->to type in the textbox
		 * driver.findElement(By.id("password")).sendKeys("crmsfa"); //className
		 * -->class attribute
		 * driver.findElement(By.className("decorativeSubmit")).click(); WebElement crm
		 * = driver.findElement(By.linkText("CRM/SFA")); String crmTxt = crm.getText();
		 * System.out.println(crmTxt); crm.click(); String title =
		 * driver.getTitle();//browser level verification System.out.println(title);
		 */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		


	}

}
