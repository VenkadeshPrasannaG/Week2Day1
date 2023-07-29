package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Week2assignment1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//https://login.salesforce.com/?locale=in
		
		
		
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		//driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("demoSalesManager");
		//crmsfa
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		//Leads
		driver.findElement(By.partialLinkText("Leads")).click();
		
		//Create Lead
		driver.findElement(By.partialLinkText("Create Lead")).click();
		
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Krish technologies");
		
		//createLeadForm_firstName
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("GV");
		
		//createLeadForm_lastName
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Prasanna");
		
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("GVP");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("TestLeaf assignment");
		
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("gvp059@gmail.com");
		
			
		//createLeadForm_companyName
		
		
		driver.findElement(By.className("smallSubmit")).click();
		
		
		String title = driver.getTitle();
		
		System.out.println(title);
		
		
		
		
		
		
		
		Thread.sleep(2000);
		driver.close();

	}

}
