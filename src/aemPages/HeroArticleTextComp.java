package aemPages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class HeroArticleTextComp {
WebDriver driver;
	
	@FindBy(xpath = ".//*[@class='coral-TabPanel-content u-coral-noPadding u-coral-noMargin']/div[1]/div/div[1]/div/label[1]/input[1]")
	WebElement LayoutLeft;
	
	@FindBy(xpath = ".//*[@class='coral-TabPanel-content u-coral-noPadding u-coral-noMargin']/div[1]/div/div[1]/div/label[2]/input[1]")
	WebElement LayoutRight;
	
	@FindBy(xpath = ".//*[@class='coral-TabPanel-content u-coral-noPadding u-coral-noMargin']/div[1]/div/div[1]/div/label[3]/input[1]")
	WebElement LayoutTop;
	
	@FindBy(xpath = ".//*[@class='cq-dialog-content coral-TabPanel coral-TabPanel--large u-coral-noPadding u-coral-noMargin']/div/div[1]/div/div[2]/div/div[2]")
	WebElement Badge;
	
	@FindBy(xpath = ".//*[@class='cq-dialog-content coral-TabPanel coral-TabPanel--large u-coral-noPadding u-coral-noMargin']/div/div[1]/div/div[3]/div/div[2]")
	WebElement Heading;
	
	@FindBy(xpath = ".//*[@class='cq-dialog-content coral-TabPanel coral-TabPanel--large u-coral-noPadding u-coral-noMargin']/div/div[1]/div/div[4]/div/div[2]")
	WebElement SubHeading;
	
	@FindBy(xpath = ".//*[@class='cq-dialog-content coral-TabPanel coral-TabPanel--large u-coral-noPadding u-coral-noMargin']/div/div[1]/div/div[5]/div/div[2]")
	WebElement Description;
	
	@FindBy(xpath = ".//*[@class='cq-dialog-content coral-TabPanel coral-TabPanel--large u-coral-noPadding u-coral-noMargin']/div/div[1]/div/div[6]/input")
	WebElement ImageTitle;
	
	@FindBy(xpath = ".//*[@class='cq-dialog-content coral-TabPanel coral-TabPanel--large u-coral-noPadding u-coral-noMargin']/div/div[1]/div/div[7]/input")
	WebElement ImageAltTxt;
	
	@FindBy(xpath = ".//*[@class='cq-dialog-content coral-TabPanel coral-TabPanel--large u-coral-noPadding u-coral-noMargin']/div/div[1]/div/div[8]/input")
	WebElement LnkTxt;
	
	@FindBy(xpath = ".//*[@class='cq-dialog-content coral-TabPanel coral-TabPanel--large u-coral-noPadding u-coral-noMargin']/div/div[1]/div/div[9]/span/span/input")
	WebElement LnkURL;
	
	@FindBy(xpath = ".//nav[@class='coral-TabPanel-navigation']/a[2]")
	WebElement ImageTab;
	
	@FindBy(xpath = ".//*[@class='cq-dialog-content coral-TabPanel coral-TabPanel--large u-coral-noPadding u-coral-noMargin']/div/div[2]/section/div/div[1]/span/div/div[2]/span/a/input")
	WebElement DImage;
	
	@FindBy(xpath = ".//*[@class='cq-dialog-actions u-coral-pullRight']/button[4]")
	WebElement ConfigDone;
	
	//Image
	
	@FindBy(xpath = ".//*[@class='editor-panel editor-panel-active']/div[1]/coral-actionbar/coral-actionbar-primary/coral-actionbar-item[1]")
	WebElement ImageProperties;
			
	@FindBy(id = "assetsearch")
	WebElement AssetSearch;
			
	@FindBy(xpath = ".//*[@class='sidepanel-tab sidepanel-tab-assets editor-AssetFinder']/div[2]/coral-masonry/coral-masonry-item[1]/coral-card")
	WebElement DSource;
			
	@FindBy(xpath = ".//*[@class='coral-TabPanel-content u-coral-noPadding u-coral-noMargin']/div[2]/section/div/div[1]/span/div")
	WebElement DTarget;
	
	public HeroArticleTextComp(WebDriver driver){
		this.driver = driver;
	}
	
	public void HeroArticleTextImageLeftConfig(){
		Badge.sendKeys("Badge");
		Heading.sendKeys("Discover Food and Drinks");
		SubHeading.sendKeys("Give someone the joy of choosing with a gift card");
		Description.sendKeys("Whether you're hosting a casual gathering or an elegant affair, catch up on the latest recipes, drinks and tips from the experts at Food & Drink.");
		ImageTitle.sendKeys("Image Title");
		ImageAltTxt.sendKeys("Image Alt Text");
		LnkTxt.sendKeys("Read more");
		LnkURL.sendKeys("http://google.com");
	}
	
	public void HeroArticleTextImageRightConfig(){
		LayoutRight.click();
		Badge.sendKeys("Badge");
		Heading.sendKeys("Discover Food and Drinks");
		SubHeading.sendKeys("Give someone the joy of choosing with a gift card");
		Description.sendKeys("Whether you're hosting a casual gathering or an elegant affair, catch up on the latest recipes, drinks and tips from the experts at Food & Drink.");
		ImageTitle.sendKeys("Image Title");
		ImageAltTxt.sendKeys("Image Alt Text");
		LnkTxt.sendKeys("Read more");
		LnkURL.sendKeys("http://google.com");
	}
	
	public void HeroArticleTextImageTopConfig(){
		LayoutTop.click();
		Badge.sendKeys("Badge");
		Heading.sendKeys("Discover Food and Drinks");
		SubHeading.sendKeys("Give someone the joy of choosing with a gift card");
		Description.sendKeys("Whether you're hosting a casual gathering or an elegant affair, catch up on the latest recipes, drinks and tips from the experts at Food & Drink.");
		ImageTitle.sendKeys("Image Title");
		ImageAltTxt.sendKeys("Image Alt Text");
		LnkTxt.sendKeys("Read more");
		LnkURL.sendKeys("http://google.com");
	}
	
	public void DImageUpdate(){
		ImageTab.click();
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
		ConfigDone.click();	
	}


}
