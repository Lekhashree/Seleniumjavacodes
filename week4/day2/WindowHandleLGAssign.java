package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandleLGAssign {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://leafground.com/window.xhtml;jsessionid=node0ohpw87cjok1dz9p1fgudvj6l12019.node0");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(30));
		//button/span[text()="Open"]
		//Click and Confirm new Window Opens
		String ptitle=driver.getTitle();
		System.out.println("Parent title: "+ptitle);
		driver.findElement(By.xpath("//button/span[text()=\"Open\"]")).click();
		Set<String> windowhandles=driver.getWindowHandles();
		List<String> windowhandleslist=new ArrayList<>(windowhandles);
		driver.switchTo().window(windowhandleslist.get(1));
		String chtitle=driver.getTitle();
		System.out.println("Child window title: "+chtitle);
		driver.close();
		//Find the number of opened tabs
		driver.switchTo().window(windowhandleslist.get(0));
		driver.findElement(By.xpath("//button/span[text()=\"Open Multiple\"]")).click();
		Set<String> newwindows=driver.getWindowHandles();
		int noofwindows=newwindows.size();
		System.out.println("No of windows opened: "+noofwindows);
		List<String> newwindowslist=new ArrayList<>(newwindows);
		for(int i=1;i<newwindowslist.size();i++)
		{
			driver.switchTo().window(newwindowslist.get(i));
			driver.close();
		}
		driver.switchTo().window(newwindowslist.get(0));
		//Close all windows except Primary
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button/span[text()=\"Close Windows\"]")).click();
		Set<String> freshwindows=driver.getWindowHandles();
		List<String> freshwindowslist=new ArrayList<>(freshwindows);
		for(int i=1;i<freshwindowslist.size();i++)
		{
			driver.switchTo().window(freshwindowslist.get(i));
			driver.close();
		}
		driver.switchTo().window(freshwindowslist.get(0));
		//open with delay button
		driver.findElement(By.xpath("//button/span[text()=\"Open with delay\"]")).click();
		Set<String> delaywindows=driver.getWindowHandles();
		List<String> delaywindowslist=new ArrayList<>(delaywindows);
		for(int i=1;i<delaywindowslist.size();i++)
		{
			driver.switchTo().window(delaywindowslist.get(i));
			System.out.println(driver.getTitle());
			driver.close();
			System.out.println("Closed the opened tab");
		}
		driver.switchTo().window(delaywindowslist.get(0));
		System.out.println("control switched to: "+driver.getTitle());
		
		
		
		
		
		
	}

}
