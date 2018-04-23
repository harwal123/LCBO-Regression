package helper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Publish {
	
	WebDriver driver;
	
	@FindBy(xpath = ".//*[@class='coral-ActionBar-primary']/coral-actionbar-item[2]")
	WebElement PageInfo;
	
	//@FindBy(xpath = ".//div[@class='editor-PageInfo']/button[4]")
	//WebElement PublishLink;
	
	@FindBy(xpath = ".//*[@class='pageinfo foundation-toggleable coral3-Popover is-open']/div[3]/coral-popover-content/div/button[4]")
	WebElement PublishLink;
	
	public Publish(WebDriver driver){
		this.driver = driver;
	}
	
	public void PublishPage() throws InterruptedException{
		String Pwindow = driver.getWindowHandle();
		driver.switchTo().window(Pwindow);
		//System.out.println(driver.getCurrentUrl());
		driver.navigate().refresh();
		Thread.sleep(5000);
		PageInfo.click();
		WebElement element = driver.findElement(By.xpath(".//div[@class='editor-PageInfo']/button[4]"));
		String text = element.getText();
		System.out.println(text);
		PublishLink.click();
		//WebElement PublishLink1 = (new WebDriverWait(driver, 10))
				 // .until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//div[@class='editor-PageInfo']/button[4]")));
		//PublishLink1.click();
	}

}
