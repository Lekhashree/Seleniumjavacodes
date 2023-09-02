
package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateContact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(30));
		//Enter Username and password and login
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		//Click on contact
		driver.findElement(By.linkText("Create Contact")).click();
		//Create contact
		driver.findElement(By.id("firstNameField")).sendKeys("Lekha");
		driver.findElement(By.id("lastNameField")).sendKeys("TestContact");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Lekhalocal");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("locallast"); 
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("local description test");
		driver.findElement(By.id("createContactForm_description")).sendKeys("Description box test content");
		
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("lekhatest@gmail.com");
		Select state=new Select(driver.findElement(By.id("createContactForm_generalStateProvinceGeoId")));
		state.selectByVisibleText("New York");
		driver.findElement(By.xpath("//input[@value=\"Create Contact\"]")).click();
		//Edit
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateContactForm_description")).clear();
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("Entered text in imp notes");
		driver.findElement(By.xpath("//input[@value=\"Update\"]")).click();
		String title = driver.getTitle();
		System.out.println("Title of the page is : "+title);
		
		

	}

}
