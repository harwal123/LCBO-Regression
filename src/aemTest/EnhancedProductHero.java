package aemTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import aemPages.EnhancedProductHeroComp;
import aemPages.Template;
import helper.Browser;
import helper.Publish;

public class EnhancedProductHero {
WebDriver driver;
	
	@BeforeClass
	public void StartBrowser(){
		driver = Browser.StartBrowser("chrome");
	}
	
	@Test(priority = 0)
	public void CreateNewTemplate() throws InterruptedException{
		Template NewTemplate = PageFactory.initElements(driver, Template.class);
		NewTemplate.NewTemplate("EnhancedProductHero");
	}
	
	@Test(priority = 1)
	public void AddEnhancedProductHero() throws InterruptedException{
		EnhancedProductHeroComp Comp = PageFactory.initElements(driver, EnhancedProductHeroComp.class);
		Comp.OpenImageProperties();
		Thread.sleep(3000);
		//DragAndDropComponent comp = PageFactory.initElements(driver, DragAndDropComponent.class);
		//comp.DragAndDrop("Enhanced Product");
		Comp.EnhancedProductHeroCompConfig("Enhanced Product Hero", "Subtitle - Celebrate your next festive occasion with some of these great "
				+ "products from the newest issue of Food & Drink. All are available to buy online, making entertaining even easier. ", 
				"Celebrate your next festive occasion with some of these great products from the newest issue of Food & Drink. All are "
				+ "available to buy online, making entertaining even easier.", "Image Title", "Image Alt Txt", "Enhanced product hero CTA", 
				"http://google.com");
		Comp.SearchAsset("124575");
		Comp.DImageUpdate();
		Comp.ConfigComplete();
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
