package aemPages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class EnhancedContentComp {
WebDriver driver;
	
	@FindBy(xpath = ".//div[@class='cq-dialog-content coral-FixedColumn foundation-layout-util-vmargin u-coral-noPadding u-coral-noMargin']/div/div[1]/div/div[2]")
	WebElement Title;
	
	@FindBy(xpath = ".//div[@class='cq-dialog-content coral-FixedColumn foundation-layout-util-vmargin u-coral-noPadding u-coral-noMargin']/div/div[2]/div/div[2]")
	WebElement SubTitle;
	
	@FindBy(xpath = ".//div[@class='cq-dialog-content coral-FixedColumn foundation-layout-util-vmargin u-coral-noPadding u-coral-noMargin']/div/div[3]/div/div[2]")
	WebElement RTE;
	
	@FindBy(name = "./linkLabel")
	WebElement LinkName;
	
	@FindBy(name = "./linkURL")
	WebElement LinkURL;
	
	@FindBy(name = "./image/jcr:title")
	WebElement ImageTitle;
	
	@FindBy(name = "./image/alt")
	WebElement ImageAltTxt;
	
	@FindBy(name = "./image/file")
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
		
	@FindBy(xpath = ".//div[@class='cq-dialog-content coral-FixedColumn foundation-layout-util-vmargin u-coral-noPadding u-coral-noMargin']/div/section[1]/div/div[3]/span/div")
	WebElement DTarget;
	
	public EnhancedContentComp(WebDriver driver){
		this.driver = driver;
	}
	
	public void EnhancedContentConfig(String EnterTitle, String EnterSubTitle, String EntRTE, String EntLnkName, String EntLnkURL){
		Title.sendKeys(EnterTitle);
		SubTitle.sendKeys(EnterSubTitle);
		RTE.sendKeys(EntRTE);
		LinkName.sendKeys(EntLnkName);
		LinkURL.sendKeys(EntLnkURL);
	}
	
	public void ImageLoad(String EntImageTitle, String EntImageAltTxt){
		ImageTitle.sendKeys(EntImageTitle);
		ImageAltTxt.sendKeys(EntImageAltTxt);
		//DImage.sendKeys("D:\\LCBOImages\\DEnhancedHero.jpg");
		(new Actions(driver)).dragAndDrop(DSource, DTarget).perform();
	}
	
	public void ConfigComplete(){
		ConfigDone.click();
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


}
