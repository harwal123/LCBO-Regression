package aemPages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import helper.DragAndDropComponent;

public class HeroImageComponent {
	String AuthorWindow;
	WebDriver driver;
	
	@FindBy(name = "./imageTitle")
	WebElement ImageTitle;
	
	@FindBy(name = "./imageAlt")
	WebElement ImageAltText;
	
	@FindBy(name = "./linkURL")
	WebElement ImageLinkURL;
	
	@FindBy(name = "./image/file")
	WebElement DImageUpload;
	
	@FindBy(xpath = ".//div[@class='cq-dialog-actions u-coral-pullRight']/button[4]")
	WebElement DoneConfig;
	
	//Image
	
	@FindBy(xpath = ".//*[@class='editor-panel editor-panel-active']/div[1]/coral-actionbar/coral-actionbar-primary/coral-actionbar-item[1]")
	WebElement ImageProperties;
			
	@FindBy(id = "assetsearch")
	WebElement AssetSearch;
			
	@FindBy(xpath = ".//*[@class='sidepanel-tab sidepanel-tab-assets editor-AssetFinder']/div[2]/coral-masonry/coral-masonry-item[1]/coral-card")
	WebElement DSource;
			
	@FindBy(xpath = ".//*[@class='coral-Dialog-content u-coral-noPadding u-coral-noMargin']/div/div/section[1]/div/div/span/div")
	WebElement DTarget;
	
	public HeroImageComponent(WebDriver driver){
		this.driver = driver;
	}
	
	public void HeroImageConfig(String TitleOfImage, String TitleOfAltImage, String LinkURL) throws InterruptedException{
		DragAndDropComponent HeroImage = PageFactory.initElements(driver, DragAndDropComponent.class);
		HeroImage.DragAndDrop("Hero Image");
		ImageTitle.sendKeys(TitleOfImage);
		ImageAltText.sendKeys(TitleOfAltImage);
		ImageLinkURL.sendKeys(LinkURL);
	}
	
	public void DImageUpdate(){
		(new Actions(driver)).dragAndDrop(DSource, DTarget).perform();
	}
	
	public void OpenImageProperties() {
		ImageProperties.click();
	}
	
	public void SearchAsset(String EnterImageAsset) throws InterruptedException{
		AssetSearch.clear();
		AssetSearch.sendKeys(EnterImageAsset);
		AssetSearch.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
	}
	
	public void ConfigComplete(){
		DoneConfig.click();	
	}

}
