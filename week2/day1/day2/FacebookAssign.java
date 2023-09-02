package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookAssign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(30));
		driver.findElement(By.linkText("Create new account")).click();
		//Enter first and last name 
		driver.findElement(By.name("firstname")).sendKeys("Lekha");
		driver.findElement(By.name("lastname")).sendKeys("Test");
		//Enter mobile number
		driver.findElement(By.xpath("//div[contains(text(),\"Mobile number\")]/following-sibling::input")).sendKeys("9500341245");
		//Enter password
		driver.findElement(By.xpath("//div[text()=\"New password\"]/following-sibling::input")).sendKeys("Test1ing@");
		//DOB
		Select date=new Select(driver.findElement(By.name("birthday_day")));
		date.selectByValue("20");
		//month
		Select month=new Select(driver.findElement(By.id("month")));
		month.selectByVisibleText("May");
		//Year
		Select year=new Select(driver.findElement(By.id("year")));
		year.selectByVisibleText("1993");
		//Select gender
		driver.findElement(By.xpath("//label[text()=\"Female\"]")).click();
		




	}

}
