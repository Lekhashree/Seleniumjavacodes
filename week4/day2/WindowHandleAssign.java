
package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandleAssign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(30));
		driver.findElement(By.xpath("//a[text()=\" FLIGHTS \"]")).click();
		Set<String> windows=driver.getWindowHandles();
		/*for(String each:windows)
		{
			System.out.println(each);
						
		}*/
		List<String> newwidow= new ArrayList<>(windows);
		driver.switchTo().window(newwidow.get(1));
		String title=driver.getTitle();
		System.out.println(title);
		
		
		
	}

}
