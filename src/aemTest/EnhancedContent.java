package aemTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import aemPages.EnhancedContentComp;
import aemPages.Template;
import helper.Browser;
import helper.DragAndDropComponent;
import helper.Publish;

public class EnhancedContent{
WebDriver driver;
	
	@BeforeClass
	public void StartBrowser(){
		driver = Browser.StartBrowser("chrome");
	}
	
	@Test(priority = 0)
	public void CreateNewTemplate() throws InterruptedException{
		Template NewTemplate = PageFactory.initElements(driver, Template.class);
		NewTemplate.NewTemplate("EnhancedContent");
	}
	
	@Test(priority = 1)
	public void EnhancedContentConfig() throws InterruptedException{
		EnhancedContentComp comp = PageFactory.initElements(driver, EnhancedContentComp.class);
		comp.OpenImageProperties();
		Thread.sleep(3000);
		DragAndDropComponent Comp = PageFactory.initElements(driver, DragAndDropComponent.class);
		Comp.DragAndDrop("Enhanced Content");
		comp.EnhancedContentConfig("United Kingdom", "This impressive English ale offers", "With its light bitterness and fresh tropical "
				+ "fruit flavours, this Belgian-style ale is a great match with Thai food or sharp cheddar.", "Read more", "http://google.com");
		comp.SearchAsset("1613-OntarioCider-3.6-MsHero-01");
		comp.ImageLoad("Image Title", "Image Alt Text");
		comp.ConfigComplete();
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
