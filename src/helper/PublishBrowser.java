package helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class PublishBrowser {
	static WebDriver driver;

	public static WebDriver StartPublishBrowser(String browsername) {

		if (browsername.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}

		else if (browsername.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		}

		else if (browsername.equalsIgnoreCase("IE")) {
			driver = new InternetExplorerDriver();
		}

		driver.manage().window().maximize();
		
		return driver;
	}

}


