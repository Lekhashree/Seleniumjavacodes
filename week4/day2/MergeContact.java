package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class MergeContact {

	public static void main(String[] args) throws InterruptedException {
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
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.xpath("//a[text()=\"Merge Contacts\"]")).click();
		driver.findElement(By.xpath("//table[@name=\"ComboBox_partyIdFrom\"]//following::a/img")).click();
		//driver.findElement(By.xpath("))
		Set<String> mulwindows= driver.getWindowHandles();
		List<String> windowslist= new ArrayList<>(mulwindows);
		driver.switchTo().window(windowslist.get(1));
		driver.findElement(By.xpath("//table[@class=\"x-grid3-row-table\"]//div/a")).click();
		driver.switchTo().window(windowslist.get(0));                
		Thread.sleep(2000);
		driver.findElement(By.xpath("//table[@name=\"ComboBox_partyIdTo\"]//following::a/img")).click();
		Set<String> mulwindows2= driver.getWindowHandles();
		List<String> windowslist2= new ArrayList<>(mulwindows2);
		driver.switchTo().window(windowslist2.get(1));
		driver.findElement(By.xpath("(//table[@class=\"x-grid3-row-table\"])[2]/following::div/a")).click();
		driver.switchTo().window(windowslist2.get(0));
		//click on merge button
		driver.findElement(By.xpath("//a[text()=\"Merge\"]")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		String parenttitle=driver.getTitle();
		System.out.println(parenttitle);
	}

}
