package aemTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import aemPages.FooterComponent;
import aemPages.Template;
import helper.Browser;
import helper.Publish;

public class FooterComp {
	WebDriver driver;

	@BeforeClass
	public void StartBrowser() {
		driver = Browser.StartBrowser("chrome");
	}

	@Test
	public void AddFooterComponent() throws InterruptedException {
		Template edittemplate = PageFactory.initElements(driver, Template.class);
		edittemplate.CreateTemplate();
		FooterComponent AddComponent = PageFactory.initElements(driver, FooterComponent.class);
		AddComponent.SelectFooterComponent();
		AddComponent.ColumnOneConfig("INFORMATION", "About LCBO", "http://www.lcbo.com/content/lcbo/en/corporate-pages/about.html#.Wgq-6lWWbIU", "Media Centre", "http://www.lcbo.com/content/lcbo/en/corporate-pages/about/media-centre.html", "Responsibility", "http://lcbo.com", "Online Order FAQ", "http://lcbo.com");
		AddComponent.ColumnTwoConfig("RESOURCES", "Contact Us", "http://google.com", "Contact Us", "http://google.com", "Store Search", "http://google.com", "Glossary", "http://google.com");
		AddComponent.ColumnThreeConfig("POLICIES", "Terms & Conditions", "http://www.lcbo.com/content/lcbo/en/corporate-pages/terms-and-conditions.html", "Social Media", "http://www.lcbo.com/content/lcbo/en/corporate-pages/social-media.html", "Privacy", "http://www.lcbo.com/content/lcbo/en/corporate-pages/privacy.html");
		AddComponent.ColumnFourConfig("SITES", "Doing Business with LCBO", "http://www.doingbusinesswithlcbo.com/", "Always Taking Care", "http://www.alwaystakingcare.ca/index.html", "Vintages", "http://www.vintages.com/index.shtml", "Food & Drink", "http://foodanddrink.ca/fooddrink/index.shtml");
		AddComponent.FooterMainConfig("Back To Top", "English", "French", "@ 2017 LCBO");
		AddComponent.ConfigFooter();
		Publish FooterPublish = PageFactory.initElements(driver, Publish.class);
		FooterPublish.PublishPage();
	}


	//@AfterClass
	public void CloseBrowser() {
		driver.quit();
	}

}
