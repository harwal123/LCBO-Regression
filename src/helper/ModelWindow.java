package helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ModelWindow {
	WebDriver driver;
	
	@FindBy(xpath = ".//*[@class='modal-footer']/a[1]")
	WebElement English;
	
	public ModelWindow(WebDriver driver){
		this.driver = driver;
	}
	
	public void EnglishLanguage(){
		String PWindow = driver.getWindowHandle();
		for (String CWindow : driver.getWindowHandles()) {
			driver.switchTo().window(CWindow);
		}
		English.click();
		driver.switchTo().window(PWindow);
	}

}
