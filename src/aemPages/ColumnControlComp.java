package aemPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class ColumnControlComp {

	WebDriver driver;
	String ParentWindow;

	@FindBy(xpath = ".//*[@id='OverlayWrapper']/div[3]/div")
	WebElement DragComponent;

	@FindBy(xpath = ".//*[@id='EditableToolbar']/button")
	WebElement AddComponent;

	@FindBy(xpath = ".//*[@class='coral-SelectList-group']/coral-selectlist-item[4]")
	WebElement ColumnControl;
	
	@FindBy(xpath = ".//*[@id='EditableToolbar']/button[1]")
	WebElement ConfigButton;
	
	//@FindBy(xpath = ".//*[@id='ContentScrollView']/div[2]/div[3]/div[1]")
	//WebElement ConfigColumnControl;
	
	@FindBy(xpath = "//div[@class='editor-panel-content editor-panel-content-with-header']/div[2]/div[3]/div[1]")
	WebElement ConfigColumnControl;
	
	@FindBy(xpath = ".//*[@class='cq-dialog-content coral-FixedColumn u-coral-noPadding u-coral-noMargin']/div/div[1]/input")
	WebElement SectionHeading;
	
	@FindBy(xpath = ".//*[@class='coral-Form-field coral-Select']/select")
	static WebElement DropDownValue;
	
	@FindBy(xpath = ".//*[@class='cq-dialog-actions u-coral-pullRight']/button[4]")
	WebElement ConfigDone;
	
	public ColumnControlComp(WebDriver driver){
		this.driver = driver;
	}
	
	public static void SelectValue(String Value){
		Select select = new Select(DropDownValue);
		select.selectByValue(Value);
	}

	public void AddColumnControlComponent() throws InterruptedException {
		DragComponent.click();
		AddComponent.click();
		ParentWindow = driver.getWindowHandle();
		for (String ChildWindow : driver.getWindowHandles()) {
			driver.switchTo().window(ChildWindow);
		}

		ColumnControl.click();
		driver.switchTo().window(ParentWindow);
		Thread.sleep(4000);
	}
	
	public void ColumnControlConfig() throws InterruptedException{
		//ConfigColumnControl.click();
		Actions builder = new Actions(driver);   
		builder.moveToElement(ConfigColumnControl).moveByOffset(1, 70).click().perform();
		//builder.moveToElement(ConfigColumnControl, 675, 195).doubleClick().build().perform();
		//ConfigColumnControl.click();
		ConfigButton.click();
		for(String WindHandle : driver.getWindowHandles()){
			driver.switchTo().window(WindHandle);
		}
	}
	
	public void CControl2View5050(String EnterSectionHeading){
		SectionHeading.sendKeys(EnterSectionHeading);
		ColumnControlComp.SelectValue("6|6");
		ConfigDone.click();
	}




}
