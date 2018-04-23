package helper;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Browser {
	static WebDriver driver;

	public static WebDriver StartBrowser(String browsername) {

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
		driver.get("http://10.150.18.140:4502/sites.html");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		return driver;
	}

}
