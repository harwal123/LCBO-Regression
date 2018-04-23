package aemTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import aemPages.ImageComp;
import aemPages.Template;
import helper.Browser;
import helper.DragAndDropComponent;
import helper.Publish;

public class Image {
WebDriver driver;
	
	@BeforeClass
	public void StartBrowser(){
		driver = Browser.StartBrowser("chrome");
	}
	
	@Test(priority = 0)
	public void CreateNewTemplate() throws InterruptedException{
		Template NewTemplate = PageFactory.initElements(driver, Template.class);
		NewTemplate.NewTemplate("Image");
	}
	
	@Test(priority = 1)
	public void ImageConfiguration() throws InterruptedException{
		ImageComp comp = PageFactory.initElements(driver, ImageComp.class);
		comp.OpenImageProperties();
		Thread.sleep(3000);
		DragAndDropComponent Comp = PageFactory.initElements(driver, DragAndDropComponent.class);
		Comp.DragAndDropImageComp("Image");;
		comp.ImageConfig();
		comp.SearchAsset("article_feature_2");
		comp.DImageUpload();
		comp.ConfigurationComplete();
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
