package helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DragAndDropComponent {
	
	WebDriver driver;
	String PWindow;
	
	//@FindBy(xpath = ".//*[@id='OverlayWrapper']/div[3]/div[1]")
	//WebElement DragComponent;
	
	//@FindBy(xpath = ".//*[@id='OverlayWrapper']/div[3]/div[3]")
	//WebElement ConfigComponent;
	
	//@FindBy(xpath = ".//*[@id='EditableToolbar']/button")
	//WebElement AddComponent;
	
	//@FindBy(xpath = ".//input[@class='coral-Textfield coral-DecoratedTextfield-input coral-Search-input']")
	//WebElement InsertComponent;
	
	//@FindBy(xpath = ".//*[@class='coral-SelectList-group']/coral-selectlist-item[1]")
	//WebElement SelectComponent;
	
	//@FindBy(xpath = ".//*[@class='coral-SelectList-group']/coral-selectlist-item[3]")
	//WebElement SelectImageComponent;
	
	//@FindBy(xpath = ".//*[@id='EditableToolbar']/button[1]")
	//WebElement ConfigButton;
	
	//@FindBy(xpath = ".//*[@id='OverlayWrapper']/div[3]/div[1]")
	//WebElement DragComponent2;
	
	//@FindBy(xpath = ".//*[@id='OverlayWrapper']/div[3]/div[4]")
	//WebElement ConfigComponent2;
	
	//@FindBy(xpath = ".//*[@id='OverlayWrapper']/div[3]/div[1]")
	//WebElement DragComponent3;
	
	//@FindBy(xpath = ".//*[@id='OverlayWrapper']/div[3]/div[5]")
	//WebElement ConfigComponent3;
	
	//@FindBy(xpath = ".//*[@id='OverlayWrapper']/div[3]/div[6]")
	//WebElement ConfigComponent4;
	
	//@FindBy(xpath = ".//*[@id='OverlayWrapper']/div[3]/div[7]")
	//WebElement ConfigComponent5;
	
	//@FindBy(xpath = ".//*[@id='OverlayWrapper']/div[3]/div[8]")
	//WebElement ConfigComponent6;
	
	//@FindBy(xpath = ".//*[@id='OverlayWrapper']/div[3]/div[9]")
	//WebElement ConfigComponent7;
	
	//@FindBy(xpath = ".//*[@id='OverlayWrapper']/div[3]/div[10]")
	//WebElement ConfigComponent8;
	
	//New Drag and Drop
	
	@FindBy(xpath = ".//*[@id='OverlayWrapper']/div[4]/div[1]")
	WebElement DragComponent;
	
	@FindBy(xpath = ".//*[@id='OverlayWrapper']/div[4]/div[2]")
	WebElement ConfigComponent;
	
	@FindBy(xpath = ".//*[@id='EditableToolbar']/button")
	WebElement AddComponent;
	
	@FindBy(xpath = ".//input[@class='coral-Textfield coral-DecoratedTextfield-input coral-Search-input']")
	WebElement InsertComponent;
	
	@FindBy(xpath = ".//*[@class='coral-SelectList-group']/coral-selectlist-item[1]")
	WebElement SelectComponent;
	
	@FindBy(xpath = ".//*[@class='coral-SelectList-group']/coral-selectlist-item[3]")
	WebElement SelectImageComponent;
	
	@FindBy(xpath = ".//*[@id='EditableToolbar']/button[1]")
	WebElement ConfigButton;
	
	@FindBy(xpath = ".//*[@id='OverlayWrapper']/div[4]/div[1]")
	WebElement DragComponent2;
	
	@FindBy(xpath = ".//*[@id='OverlayWrapper']/div[4]/div[3]")
	WebElement ConfigComponent2;
	
	@FindBy(xpath = ".//*[@id='OverlayWrapper']/div[4]/div[1]")
	WebElement DragComponent3;
	
	@FindBy(xpath = ".//*[@id='OverlayWrapper']/div[4]/div[4]")
	WebElement ConfigComponent3;
	
	@FindBy(xpath = ".//*[@id='OverlayWrapper']/div[4]/div[5]")
	WebElement ConfigComponent4;
	
	@FindBy(xpath = ".//*[@id='OverlayWrapper']/div[4]/div[6]")
	WebElement ConfigComponent5;
	
	@FindBy(xpath = ".//*[@id='OverlayWrapper']/div[4]/div[7]")
	WebElement ConfigComponent6;
	
	@FindBy(xpath = ".//*[@id='OverlayWrapper']/div[4]/div[8]")
	WebElement ConfigComponent7;
	
	@FindBy(xpath = ".//*[@id='OverlayWrapper']/div[4]/div[9]")
	WebElement ConfigComponent8;
	
	public DragAndDropComponent(WebDriver driver){
		this.driver = driver;
	}
	
	public void DragAndDrop(String EnterComponentName) throws InterruptedException{
		DragComponent.click();
		AddComponent.click();
		PWindow = driver.getWindowHandle();
		for (String CWindow : driver.getWindowHandles()) {
			driver.switchTo().window(CWindow);
		}
		InsertComponent.sendKeys(EnterComponentName);
		Thread.sleep(1000);
		SelectComponent.click();
		driver.switchTo().window(PWindow);
		//System.out.println(driver.getCurrentUrl());
		Thread.sleep(4000);
		ConfigComponent.click();
		ConfigButton.click();
		for (String ChildWindow : driver.getWindowHandles()) {
			driver.switchTo().window(ChildWindow);
		}
	}
	
	public void DragAndDrop2(String EnterComponentName) throws InterruptedException{
		String PrntWin = driver.getWindowHandle();
		driver.switchTo().window(PrntWin);
		//System.out.println(driver.getCurrentUrl());
		Thread.sleep(4000);
		DragComponent2.click();
		AddComponent.click();
		PWindow = driver.getWindowHandle();
		for (String CWindow : driver.getWindowHandles()) {
			driver.switchTo().window(CWindow);
		}
		InsertComponent.sendKeys(EnterComponentName);
		Thread.sleep(1000);
		SelectComponent.click();
		driver.switchTo().window(PWindow);
		//System.out.println(driver.getCurrentUrl());
		Thread.sleep(4000);
		ConfigComponent2.click();
		ConfigButton.click();
		for (String ChildWindow : driver.getWindowHandles()) {
			driver.switchTo().window(ChildWindow);
		}
	}
	
	public void DragAndDrop3(String EnterComponentName) throws InterruptedException{
		String PWin = driver.getWindowHandle();
		driver.switchTo().window(PWin);
		Thread.sleep(4000);
		DragComponent3.click();
		AddComponent.click();
		PWindow = driver.getWindowHandle();
		for (String CWindow : driver.getWindowHandles()) {
			driver.switchTo().window(CWindow);
		}
		InsertComponent.sendKeys(EnterComponentName);
		Thread.sleep(1000);
		SelectComponent.click();
		driver.switchTo().window(PWindow);
		//System.out.println(driver.getCurrentUrl());
		Thread.sleep(4000);
		ConfigComponent3.click();
		ConfigButton.click();
		for (String ChildWindow : driver.getWindowHandles()) {
			driver.switchTo().window(ChildWindow);
		}
	}
	
	public void DragAndDrop4(String EnterComponentName) throws InterruptedException{
		String PWin = driver.getWindowHandle();
		driver.switchTo().window(PWin);
		Thread.sleep(4000);
		DragComponent3.click();
		AddComponent.click();
		PWindow = driver.getWindowHandle();
		for (String CWindow : driver.getWindowHandles()) {
			driver.switchTo().window(CWindow);
		}
		InsertComponent.sendKeys(EnterComponentName);
		Thread.sleep(1000);
		SelectComponent.click();
		driver.switchTo().window(PWindow);
		//System.out.println(driver.getCurrentUrl());
		Thread.sleep(4000);
		ConfigComponent4.click();
		ConfigButton.click();
		for (String ChildWindow : driver.getWindowHandles()) {
			driver.switchTo().window(ChildWindow);
		}
	}
	
	public void DragAndDrop5(String EnterComponentName) throws InterruptedException{
		String PWin = driver.getWindowHandle();
		driver.switchTo().window(PWin);
		Thread.sleep(4000);
		DragComponent3.click();
		AddComponent.click();
		PWindow = driver.getWindowHandle();
		for (String CWindow : driver.getWindowHandles()) {
			driver.switchTo().window(CWindow);
		}
		InsertComponent.sendKeys(EnterComponentName);
		Thread.sleep(1000);
		SelectComponent.click();
		driver.switchTo().window(PWindow);
		//System.out.println(driver.getCurrentUrl());
		Thread.sleep(4000);
		ConfigComponent5.click();
		ConfigButton.click();
		for (String ChildWindow : driver.getWindowHandles()) {
			driver.switchTo().window(ChildWindow);
		}
	}
	
	public void DragAndDrop6(String EnterComponentName) throws InterruptedException{
		String PWin = driver.getWindowHandle();
		driver.switchTo().window(PWin);
		Thread.sleep(4000);
		DragComponent3.click();
		AddComponent.click();
		PWindow = driver.getWindowHandle();
		for (String CWindow : driver.getWindowHandles()) {
			driver.switchTo().window(CWindow);
		}
		InsertComponent.sendKeys(EnterComponentName);
		Thread.sleep(1000);
		SelectComponent.click();
		driver.switchTo().window(PWindow);
		//System.out.println(driver.getCurrentUrl());
		Thread.sleep(4000);
		ConfigComponent6.click();
		ConfigButton.click();
		for (String ChildWindow : driver.getWindowHandles()) {
			driver.switchTo().window(ChildWindow);
		}
	}
	
	public void DragAndDrop7(String EnterComponentName) throws InterruptedException{
		String PWin = driver.getWindowHandle();
		driver.switchTo().window(PWin);
		Thread.sleep(4000);
		DragComponent3.click();
		AddComponent.click();
		PWindow = driver.getWindowHandle();
		for (String CWindow : driver.getWindowHandles()) {
			driver.switchTo().window(CWindow);
		}
		InsertComponent.sendKeys(EnterComponentName);
		Thread.sleep(1000);
		SelectComponent.click();
		driver.switchTo().window(PWindow);
		//System.out.println(driver.getCurrentUrl());
		Thread.sleep(4000);
		ConfigComponent7.click();
		ConfigButton.click();
		for (String ChildWindow : driver.getWindowHandles()) {
			driver.switchTo().window(ChildWindow);
		}
	}
	
	public void DragAndDrop8(String EnterComponentName) throws InterruptedException{
		String PWin = driver.getWindowHandle();
		driver.switchTo().window(PWin);
		Thread.sleep(4000);
		DragComponent3.click();
		AddComponent.click();
		PWindow = driver.getWindowHandle();
		for (String CWindow : driver.getWindowHandles()) {
			driver.switchTo().window(CWindow);
		}
		InsertComponent.sendKeys(EnterComponentName);
		Thread.sleep(1000);
		SelectComponent.click();
		driver.switchTo().window(PWindow);
		//System.out.println(driver.getCurrentUrl());
		Thread.sleep(4000);
		ConfigComponent8.click();
		ConfigButton.click();
		for (String ChildWindow : driver.getWindowHandles()) {
			driver.switchTo().window(ChildWindow);
		}
	}
	
	public void DragAndDropImageComp(String EnterComponentName) throws InterruptedException{
		DragComponent.click();
		AddComponent.click();
		PWindow = driver.getWindowHandle();
		for (String CWindow : driver.getWindowHandles()) {
			driver.switchTo().window(CWindow);
		}
		InsertComponent.sendKeys(EnterComponentName);
		Thread.sleep(1000);
		SelectImageComponent.click();
		driver.switchTo().window(PWindow);
		//System.out.println(driver.getCurrentUrl());
		Thread.sleep(4000);
		ConfigComponent.click();
		ConfigButton.click();
		for (String ChildWindow : driver.getWindowHandles()) {
			driver.switchTo().window(ChildWindow);
		}
	}

}
