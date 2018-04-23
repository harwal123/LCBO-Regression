package aemTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import aemPages.HeroArticleTextComp;
import aemPages.Template;
import helper.Browser;
import helper.DragAndDropComponent;
import helper.Publish;

public class HeroArticleText {
WebDriver driver;
	
	@BeforeClass
	public void StartBrowser(){
		driver = Browser.StartBrowser("chrome");
	}
	
	@Test(priority = 0)
	public void CreateNewTemplate() throws InterruptedException{
		Template NewTemplate = PageFactory.initElements(driver, Template.class);
		NewTemplate.NewTemplate("HeroArticleText");
	}
	
	@Test(priority = 1)
	public void ImageOnLeftArticleTextConfig() throws InterruptedException{
		HeroArticleTextComp comp = PageFactory.initElements(driver, HeroArticleTextComp.class);
		comp.OpenImageProperties();
		Thread.sleep(3000);
		DragAndDropComponent Comp = PageFactory.initElements(driver, DragAndDropComponent.class);
		Comp.DragAndDrop("Hero Article Text");
		comp.HeroArticleTextImageLeftConfig();
		comp.SearchAsset("2.0_article feature_1_DESK");
		comp.DImageUpdate();
		comp.ConfigComplete();
	}
	
	@Test(priority = 2)
	public void ImageOnRightArticleTextConfig() throws InterruptedException{
		DragAndDropComponent Comp = PageFactory.initElements(driver, DragAndDropComponent.class);
		Comp.DragAndDrop2("Hero Article Text");
		HeroArticleTextComp comp = PageFactory.initElements(driver, HeroArticleTextComp.class);
		comp.HeroArticleTextImageRightConfig();
		comp.SearchAsset("2.0_article feature_1_DESK");
		comp.DImageUpdate();
		comp.ConfigComplete();
	}
	
	@Test(priority = 3)
	public void ImageOnTopArticleTextConfig() throws InterruptedException{
		DragAndDropComponent Comp = PageFactory.initElements(driver, DragAndDropComponent.class);
		Comp.DragAndDrop3("Hero Article Text");
		HeroArticleTextComp comp = PageFactory.initElements(driver, HeroArticleTextComp.class);
		comp.HeroArticleTextImageTopConfig();
		comp.SearchAsset("article_desk_01");
		comp.DImageUpdate();
		comp.ConfigComplete();
	}
	
	@Test(priority = 4)
	public void PublishThePage() throws InterruptedException{
		Publish publish = PageFactory.initElements(driver, Publish.class);
		publish.PublishPage();
	}
	
	@AfterClass
	public void CloseBrowser(){
		driver.quit();
	}

}
