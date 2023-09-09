package week3.day2;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BrowserImplementation implements Browser{

	public RemoteWebDriver driver;

	@Override
	public void startApp() {
		// TODO Auto-generated method stub
		driver= new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
	}

	@Override
	public void startApp(String browser) {
		// TODO Auto-generated method stub
	switch(browser)	{
	case "chrome":
		driver=new ChromeDriver();
		break;
	case "edge":
		driver=new EdgeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		break;
	case "firefox":
		driver=new FirefoxDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		break;
	case "ie":
		driver=new InternetExplorerDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		break;
	default:
		break;
	}
	}
	
	
}
