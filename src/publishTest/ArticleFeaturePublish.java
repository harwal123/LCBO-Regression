package publishTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import helper.ModelWindow;
import helper.PublishBrowser;
import publishPages.PublishArticleFeature;

public class ArticleFeaturePublish {
	WebDriver driver;
	
	@BeforeClass
	public void StartBrowser(){
		driver = PublishBrowser.StartPublishBrowser("chrome");
		driver.get("http://10.150.18.140/content/lcbo-demo/testing/articlefeature.html");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	@Test(priority = 0)
	public void SelectEnglishLanguage(){
		ModelWindow eng = PageFactory.initElements(driver, ModelWindow.class);
		eng.EnglishLanguage();
	}
	
	//@Test(priority = 1)
	public void FirstArticleFeatureVerifciation(){
		PublishArticleFeature verify = PageFactory.initElements(driver, PublishArticleFeature.class);
		verify.ArticleFeatureOne();
	}
	
	@Test(priority = 2)
	public void SecondArticleFeatureVerifciation(){
		PublishArticleFeature verify = PageFactory.initElements(driver, PublishArticleFeature.class);
		verify.ArticleFeatureTwo();
	}
	
	@Test(priority = 3)
	public void ThirdArticleFeatureVerifciation(){
		PublishArticleFeature verify = PageFactory.initElements(driver, PublishArticleFeature.class);
		verify.ArticleFeatureThree();
	}

	@Test(priority = 4)
	public void FourArticleFeatureVerifciation(){
		PublishArticleFeature verify = PageFactory.initElements(driver, PublishArticleFeature.class);
		verify.ArticleFeatureFour();
	}

	@Test(priority = 5)
	public void FiveArticleFeatureVerifciation(){
		PublishArticleFeature verify = PageFactory.initElements(driver, PublishArticleFeature.class);
		verify.ArticleFeatureFive();
	}
	
	@AfterClass
	public void CloseBrowser(){
		driver.close();
	}

}
