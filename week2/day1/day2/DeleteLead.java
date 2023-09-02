package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()=\"Phone\"]")).click();

		//driver.findElement(By.xpath("//input[@name=\"phoneAreaCode\"]")).sendKeys("207");
		driver.findElement(By.xpath("//input[@name=\"phoneNumber\"]")).sendKeys("11");
		driver.findElement(By.xpath("//button[text()=\"Find Leads\"]")).click();
		Thread.sleep(2000); 
		//Get first search result
		String leadid = driver.findElement(By.xpath("//table[@class=\"x-grid3-row-table\"]//td//a")).getText();
		System.out.println("Search result: Leadid = "+leadid);
		driver.findElement(By.xpath("//table[@class=\"x-grid3-row-table\"]//td//a")).click();
		driver.findElement(By.linkText("Delete")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()=\"Phone\"]")).click();
		driver.findElement(By.xpath("//input[@name=\"phoneNumber\"]")).sendKeys("0000000");
		driver.findElement(By.xpath("//button[text()=\"Find Leads\"]")).click();
		Thread.sleep(2000);
		String checkdisplay = driver.findElement(By.xpath("//div[@class=\"x-paging-info\"]")).getText();
		System.out.println(checkdisplay);
		if(checkdisplay.contains("No records"))
			System.out.println("contact Lead "+leadid+" has been deleted");
		else
			System.out.println("Records displayed");
		
	}

}
