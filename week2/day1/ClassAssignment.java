package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassAssignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		String loginpage = driver.getTitle();
		System.out.println("Login page title: "+loginpage);
		driver.manage().window().maximize();
		WebElement usrname = driver.findElement(By.id("username"));
		usrname.sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.id("password")).sendKeys("Leaf$1234");
		Thread.sleep(2000);
		driver.findElement(By.id("Login")).click();
		System.out.println("Home page title: "+driver.getTitle());
		driver.close();	

	}

}
