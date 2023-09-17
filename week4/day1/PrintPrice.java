package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintPrice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://amazon.in");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobile",Keys.ENTER);
		List<WebElement> pricelist= driver.findElements(By.className("a-price-whole"));
		System.out.println("size of the list: "+pricelist.size());
		List<String> allprice=new ArrayList<>();
		for(WebElement eachprice:pricelist)
		{
			String oneprice=eachprice.getText();
			//System.out.println(oneprice);
			allprice.add(oneprice);
			
		}
		System.out.println(allprice);
		List<Integer> amountlist=new ArrayList<>();
		for(String eachpricestring:allprice)
		{
			String nocoma= eachpricestring.replace(",","");
			System.out.println(nocoma);
			int amount=Integer.parseInt(nocoma);
			amountlist.add(amount);
		}
		System.out.println(amountlist);
		Collections.sort(amountlist);
		System.out.println("The Lowest price of the mobile is : "+amountlist.get(0));
		//to remove dupicates using set
		//Set<Integer> unique= new TreeSet<>(amountlist);
		
		
	}



}


