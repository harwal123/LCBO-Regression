package aemTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import aemPages.SectionHeaderComp;
import aemPages.Template;
import helper.Browser;
import helper.DragAndDropComponent;
import helper.Publish;

public class SectionHeader {
	WebDriver driver;
	
	@BeforeClass
	public void StartBrowser(){
		driver = Browser.StartBrowser("chrome");
	}
	
	@Test(priority = 0)
	public void CreateNewTemplate() throws InterruptedException{
		Template NewTemplate = PageFactory.initElements(driver, Template.class);
		NewTemplate.NewTemplate("SectionHeader");
	}
	
	@Test(priority = 1)
	public void SectionHeaderOneConfig() throws InterruptedException{
		DragAndDropComponent DragComp = PageFactory.initElements(driver, DragAndDropComponent.class);
		DragComp.DragAndDrop("Section Header");
		SectionHeaderComp Comp = PageFactory.initElements(driver, SectionHeaderComp.class);
		Comp.SectionHeaderConfigOne();
	}
	
	@Test(priority = 2)
	public void SectionHeaderTwoConfig() throws InterruptedException{
		DragAndDropComponent DragComp = PageFactory.initElements(driver, DragAndDropComponent.class);
		DragComp.DragAndDrop2("Section Header");
		SectionHeaderComp Comp = PageFactory.initElements(driver, SectionHeaderComp.class);
		Comp.SectionHeaderConfigTwo();
	}
	
	@Test(priority = 3)
	public void PublishThePage() throws InterruptedException{
		Publish publish = PageFactory.initElements(driver, Publish.class);
		publish.PublishPage();
	}

	@AfterClass
	public void CloseBrowser(){
		driver.quit();
	}

}
