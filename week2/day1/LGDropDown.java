package week2.day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LGDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/select.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		WebElement tool = driver.findElement(By.className("ui-selectonemenu"));
		Select tooldpbx = new Select(tool);
		tooldpbx.selectByVisibleText("Selenium");

		driver.findElement(By.xpath("//label[text()=\"Select Country\"]")).click();
		driver.findElement(By.xpath("//ul[@id=\"j_idt87:country_items\"]/li[text()=\"USA\"]")).click();
		/*WebElement country = driver.findElement(By.id("j_idt87:country_input"));
		Select countrydpbx = new Select(country);
		countrydpbx.selectByValue("USA");*/
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[@id=\"j_idt87:city_label\"]")).click();


		List<WebElement> citylist = driver.findElements(By.xpath("//ul[@id=\"j_idt87:city_items\"]/li"));
		System.out.println("City dropdown list for USA: ");
		for(WebElement eachlist:citylist)
		{		
			System.out.println(eachlist.getText());
		}
		driver.findElement(By.id("j_idt87:auto-complete_input")).sendKeys("sel");
		driver.findElement(By.xpath("//li[@data-item-label=\"Selenium WebDriver\"]")).click();

		driver.findElement(By.xpath("//label[@id=\"j_idt87:lang_label\"]")).click();
		String lang = "Tamil";
		driver.findElement(By.xpath("//ul[@id=\"j_idt87:lang_items\"]/li[text()=\"English\"]")).click();

		String selectedlanguage = driver.findElement(By.xpath("//label[@id=\"j_idt87:lang_label\"]")).getText();
		System.out.println("The selected Language is: "+selectedlanguage);
		Thread.sleep(2000); 
		driver.findElement(By.xpath("//label[@id=\"j_idt87:value_label\"]")).click();
		
		switch(selectedlanguage)
		{
		case "Tamil":
			driver.findElement(By.xpath("//li[@id=\"j_idt87:value_1\"]")).click();
			System.out.println("Relevant language is: "+driver.findElement(By.xpath("//li[@id=\"j_idt87:value_1\"]")).getText());
			break;
		case "English":
			driver.findElement(By.xpath("//li[text()=\"Two\"]")).click();
			break;
		default:
			System.out.println("No option selected for 2");
						
		}
			

	}

}
