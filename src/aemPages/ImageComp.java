package aemPages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class ImageComp {
WebDriver driver;
	
	@FindBy(name = "./image/jcr:title")
	WebElement ImageTitle;
	
	@FindBy(name = "./image/alt")
	WebElement ImageAltTxt;
	
	@FindBy(name = "./description")
	WebElement Description;
	
	@FindBy(name = "./linkURL")
	WebElement LinkURL;
	
	@FindBy(xpath = ".//nav[@class='coral-TabPanel-navigation']/a[2]")
	WebElement ImageTab;
	
	@FindBy(xpath = ".//div[@class='coral-TabPanel-content u-coral-noPadding u-coral-noMargin']/div[2]/section/div/div[1]/span/div/div[2]/span/a/input")
	WebElement DImageLoad;
	
	@FindBy(xpath = ".//div[@class='cq-dialog-actions u-coral-pullRight']/button[4]")
	WebElement DoneConfig;
	
	//Image
	
	@FindBy(xpath = ".//*[@class='editor-panel editor-panel-active']/div[1]/coral-actionbar/coral-actionbar-primary/coral-actionbar-item[1]")
	WebElement ImageProperties;
					
	@FindBy(id = "assetsearch")
	WebElement AssetSearch;
					
	@FindBy(xpath = ".//*[@class='sidepanel-tab sidepanel-tab-assets editor-AssetFinder']/div[2]/coral-masonry/coral-masonry-item[1]/coral-card")
	WebElement DSource;
					
	@FindBy(xpath = ".//*[@class='coral-Dialog-content u-coral-noPadding u-coral-noMargin']/div/div/div[2]/section/div/div[1]/span/div")
	WebElement DTarget;
	
	public ImageComp(WebDriver driver){
		this.driver = driver;
	}
	
	public void ImageConfig(){
		ImageTitle.sendKeys("Image Title");
		ImageAltTxt.sendKeys("Image Alt Text");
		Description.sendKeys("Whether you're hosting a big crowd or just having a few friends over to watch the game, have something "
				+ "special on hand to offer guests as they arrive. Try these easy-to-put-together pitcher cocktails — simply chill, "
				+ "pour and serve. Go beyond the tradition of just cracking beers without having to flex your bartending skills.");
		LinkURL.sendKeys("http://google.com");
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
	
	public void DImageUpload(){
		ImageTab.click();
		(new Actions(driver)).dragAndDrop(DSource, DTarget).perform();
	}
	
	public void ConfigurationComplete(){
		DoneConfig.click();
	}

}
