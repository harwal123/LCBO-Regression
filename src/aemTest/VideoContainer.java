package aemTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import aemPages.Template;
import aemPages.VideoContainerComp;
import helper.Browser;
import helper.DragAndDropComponent;
import helper.Publish;

public class VideoContainer {
WebDriver driver;
	
	@BeforeClass
	public void StartBrowser(){
		driver = Browser.StartBrowser("chrome");
	}
	
	@Test(priority = 0)
	public void CreateNewTemplate() throws InterruptedException{
		Template NewTemplate = PageFactory.initElements(driver, Template.class);
		NewTemplate.NewTemplate("Video");
	}
	
	@Test(priority = 1)
	public void VideoContainerConfig() throws InterruptedException{
		DragAndDropComponent DragComp = PageFactory.initElements(driver, DragAndDropComponent.class);
		DragComp.DragAndDrop("Video");
		VideoContainerComp comp = PageFactory.initElements(driver, VideoContainerComp.class);
		comp.VideoConfig();
		DragComp.DragAndDrop2("Video");
		comp.VideoAutoPlayConfig();
		DragComp.DragAndDrop3("Video");
		comp.VideoLoopVideoConfig();
	    DragComp.DragAndDrop4("Video");
	    comp.VideoAutoPlayAndLoopVideoConfig();
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
