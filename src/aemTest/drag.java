package aemTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class drag {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://10.150.18.140:4502/editor.html/content/lcbo-demo/testing/enhancedcontent.html");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
	    driver.findElementById("username").sendKeys("qauser");
	    driver.findElementById("password").sendKeys("qauser!123");
	    driver.findElementById("submit-button").click();
	    Thread.sleep(5000);
	    
	    WebElement ImageProperties = (new WebDriverWait(driver, 10))
				  .until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[@class='editor-panel editor-panel-active']/div[1]/coral-actionbar/coral-actionbar-primary/coral-actionbar-item[1]")));
	    //driver.findElementByXPath(".//*[@class='coral-ActionBar-primary']/coral-actionbar-item[1]/button").click();
	    ImageProperties.click();
	    driver.findElementById("assetsearch").sendKeys("147852");
	    driver.findElementById("assetsearch").sendKeys(Keys.ENTER);
	    
	    Thread.sleep(3000);
	    driver.findElementByXPath(".//*[@class='editor-panel editor-panel-active']/div[2]/div[2]/div[4]/div").click();
	    driver.findElementByXPath(".//*[@id='EditableToolbar']/button[1]").click();
	    
	    String PWindow = driver.getWindowHandle();
		for (String CWindow : driver.getWindowHandles()) {
			driver.switchTo().window(CWindow);
		}
		driver.findElementByXPath(".//input[@class='coral-Textfield coral-DecoratedTextfield-input coral-Search-input']").sendKeys("Article Feature");
		Thread.sleep(1000);
		driver.findElementByXPath(".//*[@class='coral-SelectList-group']/coral-selectlist-item[1]").click();
		driver.switchTo().window(PWindow);
		Thread.sleep(3000);
	    driver.findElementByXPath(".//*[@id='OverlayWrapper']/div[4]/div[2]").click();
	    driver.findElementByXPath(".//*[@id='EditableToolbar']/button[1]").click();
	    //String PWin = driver.getWindowHandle();
	    for (String CWin : driver.getWindowHandles()) {
			driver.switchTo().window(CWin);
		}
		driver.findElementByXPath(".//nav[@class='coral-TabPanel-navigation']/a[2]").click();
		
		WebElement Source = driver.findElementByXPath(".//*[@class='sidepanel-tab sidepanel-tab-assets editor-AssetFinder']/div[2]/coral-masonry/coral-masonry-item[1]/coral-card");
		WebElement Target = driver.findElementByXPath(".//*[@class='cq-dialog-content coral-TabPanel coral-TabPanel--large u-coral-noPadding u-coral-noMargin']/div/div[2]/div/section[1]/div/div[3]/span/div");
		(new Actions(driver)).dragAndDrop(Source, Target).perform();

	}

}
