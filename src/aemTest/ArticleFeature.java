package aemTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import aemPages.ArticleFeatureComp;
import aemPages.Template;
import helper.Browser;
import helper.DragAndDropComponent;
import helper.Publish;

public class ArticleFeature {
	WebDriver driver;
	
	@BeforeClass
	public void StartBrowser(){
		driver = Browser.StartBrowser("chrome");
	}
	
	@Test(priority = 0)
	public void CreateNewTemplate() throws InterruptedException{
		Template NewTemplate = PageFactory.initElements(driver, Template.class);
		NewTemplate.NewTemplate("ArticleFeature");
	}
	
	@Test(priority = 1)
	public void ArtFeatureLargeImageLeftAlign() throws InterruptedException{
		ArticleFeatureComp comp = PageFactory.initElements(driver, ArticleFeatureComp.class);
		comp.OpenImageProperties();
		Thread.sleep(3000);
		DragAndDropComponent Comp = PageFactory.initElements(driver, DragAndDropComponent.class);
		Comp.DragAndDrop("Article Feature");
		comp.ArtFeatureConfigData("Article Feature", "COCKTAIL OF THE MONTH: WINTER BUCK", "We've put a twist on the classic whisky and ginger "
				+ "combo with a splash of cranberry and hint of lime. It's the perfect cocktail for a winter gathering!", 
				"Get the receipe", "http://google.com");
		comp.SearchAsset("0.0_articlefeature_1_DESK");
		comp.DeskTopImageUpload();
		comp.ConfigComplete();
	}
	
	@Test(priority = 2)
	public void ArtFeatureLargeImageRightAlign() throws InterruptedException{
		//ArticleFeatureComp comp = PageFactory.initElements(driver, ArticleFeatureComp.class);
		//comp.OpenImageProperties("0.0_articlefeature_2_DESK");
		DragAndDropComponent Comp = PageFactory.initElements(driver, DragAndDropComponent.class);
		Comp.DragAndDrop2("Article Feature");
		ArticleFeatureComp comp = PageFactory.initElements(driver, ArticleFeatureComp.class);
		comp.ArtFeatureRightAlign();
		comp.ArtFeatureConfigData("Article Feature", "SHOP AND GET REWARDED", "With hundreds of products on offer, get more AIR MILES® Bonus "
				+ "Miles every time you shop! Check out some of this month's best offers.", "Read More", "http://google.com");
		comp.DeskTopImageUpload();
		comp.ConfigComplete();
	}
	
	@Test(priority = 3)
	public void ArtFeatureLargeImageTopAlign() throws InterruptedException{
		//ArticleFeatureComp comp = PageFactory.initElements(driver, ArticleFeatureComp.class);
		//comp.OpenImageProperties("1406-OntarioWine-0.0-articlefeature-4-DESK");
		DragAndDropComponent Comp = PageFactory.initElements(driver, DragAndDropComponent.class);
		Comp.DragAndDrop3("Article Feature");
		ArticleFeatureComp comp = PageFactory.initElements(driver, ArticleFeatureComp.class);
		comp.ArtFeatureTopAlign();
		comp.ArtFeatureConfigData("Article Feature", "ORDER UP A GIFT CARD!", "Give someone the joy of choosing with a gift card. "
				+ "Get free shipping and handling on all online gift card orders until January 28, 2018.", "Learn More", "http://goole.com");
		comp.SearchAsset("1406-OntarioWine-0.0-articlefeature-4-DESK");
		comp.DeskTopImageUpload();
		comp.ConfigComplete();
	}
	
	@Test(priority = 4)
	public void ArtFeatureSmallImageLeftAlign() throws InterruptedException{
		DragAndDropComponent Comp = PageFactory.initElements(driver, DragAndDropComponent.class);
		Comp.DragAndDrop4("Article Feature");
		ArticleFeatureComp comp = PageFactory.initElements(driver, ArticleFeatureComp.class);
		comp.ArtFeatureImageSmall();
		comp.ArtFeatureConfigData("Article Feature", "COCKTAIL OF THE MONTH: WINTER BUCK", "We've put a twist on the classic whisky and ginger "
				+ "combo with a splash of cranberry and hint of lime. It's the perfect cocktail for a winter gathering!", 
				"Get the receipe", "http://google.com");
		comp.SearchAsset("article-1");
		comp.DeskTopImageUpload();
		comp.ConfigComplete();
	}
	
	@Test(priority = 5)
	public void ArtFeatureSmallImageRightAlign() throws InterruptedException{
		DragAndDropComponent Comp = PageFactory.initElements(driver, DragAndDropComponent.class);
		Comp.DragAndDrop5("Article Feature");
		ArticleFeatureComp comp = PageFactory.initElements(driver, ArticleFeatureComp.class);
		comp.ArtFeatureImageSmall();
		comp.ArtFeatureRightAlign();
		comp.ArtFeatureConfigData("Article Feature", "SHOP AND GET REWARDED", "With hundreds of products on offer, get more AIR MILES® Bonus "
				+ "Miles every time you shop! Check out some of this month's best offers.", "Get the receipe", "http://google.com");
		comp.SearchAsset("article-2");
		comp.DeskTopImageUpload();
		comp.ConfigComplete();
	}
	
	//@Test(priority = 6)
	public void ArtFeatureSmallImageTopAlign() throws InterruptedException{
		DragAndDropComponent Comp = PageFactory.initElements(driver, DragAndDropComponent.class);
		Comp.DragAndDrop6("Article Feature");
		ArticleFeatureComp comp = PageFactory.initElements(driver, ArticleFeatureComp.class);
		comp.ArtFeatureImageSmall();
		//comp.ArtFeatureTopAlign();
		comp.ArtFeatureConfigData("Article Feature", "ORDER UP A GIFT CARD!", "Give someone the joy of choosing with a gift card. "
				+ "Get free shipping and handling on all online gift card orders until January 28, 2018.", "Learn More", "http://goole.com");
		comp.ImageUploadSmall("Image Title", "Image Alt Text");
		comp.ConfigComplete();
	}
	
	@Test(priority = 7)
	public void PublishThePage() throws InterruptedException{
		Publish publish = PageFactory.initElements(driver, Publish.class);
		publish.PublishPage();
	}
	
	@AfterClass
	public void CloseBrowser(){
		driver.quit();
	}

}
