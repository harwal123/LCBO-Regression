package aemTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import aemPages.HeroImageComponent;
import aemPages.Template;
import helper.Browser;
import helper.Publish;

public class HeroImage {
WebDriver driver;
	
	@BeforeClass
	public void StartBrowser(){
		driver = Browser.StartBrowser("chrome");
	}
	
	@Test(priority = 0)
	public void CreateNewTemplate() throws InterruptedException{
		Template NewTemplate = PageFactory.initElements(driver, Template.class);
		NewTemplate.NewTemplate("Hero Image");
	}
	
	@Test(priority = 1)
	public void AddHeroImage() throws InterruptedException{
		HeroImageComponent NewHeroImage = PageFactory.initElements(driver, HeroImageComponent.class);
		NewHeroImage.OpenImageProperties();
		Thread.sleep(3000);
		NewHeroImage.HeroImageConfig("Title of the Hero Image", "Image Alt text", "http://google.com");
		NewHeroImage.SearchAsset("1709-Holiday");
		NewHeroImage.DImageUpdate();
		NewHeroImage.ConfigComplete();
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
