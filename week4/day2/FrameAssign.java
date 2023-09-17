package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameAssign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(30));
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("//button[text()=\"Try it\"]")).click();
		//driver.switchTo().defaultContent();
		driver.switchTo().alert().accept();
		String msg=driver.findElement(By.xpath("//p[text()=\"You pressed OK!\"]")).getText();
		if(msg.contains("OK"))
		{
			System.out.println("Msg Verified");
		}
		else
		{
			System.out.println("Msg not present");
		}
		
	}

}
