package publishTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import helper.ModelWindow;
import helper.PublishBrowser;
import publishPages.PublishEnhancedContent;

public class EnhancedContentPublish {
	WebDriver driver;
	
	@BeforeClass
	public void StartBrowser(){
		driver = PublishBrowser.StartPublishBrowser("chrome");
		driver.get("http://10.150.18.140/content/lcbo-demo/testing/enhancedcontent.html");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	@Test(priority = 0)
	public void SelectEnglishLanguage(){
		ModelWindow eng = PageFactory.initElements(driver, ModelWindow.class);
		eng.EnglishLanguage();
	}
	
	@Test(priority = 1)
	public void EnhancedContentVerification(){
		PublishEnhancedContent verify = PageFactory.initElements(driver, PublishEnhancedContent.class);
		verify.EnhancedContentValidation();
	}
	
	@AfterClass
	public void CloseBrowser(){
		driver.close();
	}

}
