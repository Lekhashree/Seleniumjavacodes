package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver=new ChromeDriver();
		//loads url
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Login page
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		//CreateLead
		driver.findElement(By.linkText("Create Lead")).click(); 
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestCompany");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Lekha");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Test");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Testlocal");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testdepart");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Test description");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("abcd@test.com");
		WebElement drpdx = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select sec = new Select(drpdx);
		sec.selectByVisibleText("New York");
		driver.findElement(By.name("submitButton")).click();
		//Click on Edit button
		driver.findElement(By.linkText("Edit")).click();	
		driver.findElement(By.id("updateLeadForm_description")).clear();
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Entered text in important notes");
		driver.findElement(By.xpath("//input[@value=\"Update\"]")).click();
		Thread.sleep(1000);
		System.out.println("Title of the page after clicking on update button in Edit lead page is : "+driver.getTitle());;
		
	}
	

	}
