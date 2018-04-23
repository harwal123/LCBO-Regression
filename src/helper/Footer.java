package helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Footer {

	static WebDriver driver;

	@FindBy(xpath = ".//*[@id='OverlayWrapper']/div[4]/div[1]")
	static WebElement DragFooterComponent;

	@FindBy(xpath = ".//*[@id='EditableToolbar']/button[1]")
	static WebElement AddFooterComponent;

	public static void FooterConfig() throws InterruptedException {
		DragFooterComponent.click();
		AddFooterComponent.click();
		for (String ChildWindow : driver.getWindowHandles()) {
			driver.switchTo().window(ChildWindow);
		}
		Thread.sleep(2000);

	}

}
