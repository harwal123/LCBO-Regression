package aemTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import aemPages.SubTitleQuoteComp;
import aemPages.Template;
import helper.Browser;
import helper.DragAndDropComponent;
import helper.Publish;

public class SubTitleQuote {
	WebDriver driver;
	
	@BeforeClass
	public void StartBrowser(){
		driver = Browser.StartBrowser("chrome");
	}
	
	@Test(priority = 0)
	public void CreateNewTemplate() throws InterruptedException{
		Template NewTemplate = PageFactory.initElements(driver, Template.class);
		NewTemplate.NewTemplate("SubTitleQuote");
	}
	
	@Test(priority = 1)
	public void SubTitleWithQuoteComponentConfig() throws InterruptedException{
		DragAndDropComponent DragComp = PageFactory.initElements(driver, DragAndDropComponent.class);
		DragComp.DragAndDrop("Sub Title");
		SubTitleQuoteComp comp = PageFactory.initElements(driver, SubTitleQuoteComp.class);
		comp.SubTitleQuoteConfig();
	}
	
	@Test(priority = 2)
	public void PublishThePage() throws InterruptedException{
		Publish publish = PageFactory.initElements(driver, Publish.class);
		publish.PublishPage();
	}

	@AfterClass
	public void CloseBrowser(){
		driver.quit();
	}

}
