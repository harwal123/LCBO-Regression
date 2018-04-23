package aemPages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class ArticleFeatureComp {
	WebDriver driver;
	
	@FindBy(xpath = ".//*[@class='coral-TabPanel-content u-coral-noPadding u-coral-noMargin']/div[1]/div/div[2]/div[1]/span/select")
	WebElement ImageLayout;
	
	@FindBy(xpath = ".//*[@class='coral-TabPanel-content u-coral-noPadding u-coral-noMargin']/div[1]/div/div[1]/span/select")
	WebElement ImageAlign;
	
	@FindBy(xpath = ".//*[@class='coral-TabPanel-content u-coral-noPadding u-coral-noMargin']/div[1]/div/div[3]/div/div[2]")
	WebElement SectionTitle;
	
	@FindBy(xpath = ".//*[@class='coral-TabPanel-content u-coral-noPadding u-coral-noMargin']/div[1]/div/div[4]/div/div[2]")
	WebElement ArticleTitle;
	
	@FindBy(xpath = ".//*[@class='coral-TabPanel-content u-coral-noPadding u-coral-noMargin']/div[1]/div/div[5]/div/div[2]")
	WebElement RTE;
	
	@FindBy(xpath = ".//*[@class='coral-TabPanel-content u-coral-noPadding u-coral-noMargin']/div[1]/div/div[6]/input")
	WebElement LnkText;
	
	@FindBy(xpath = ".//*[@class='coral-TabPanel-content u-coral-noPadding u-coral-noMargin']/div[1]/div/div[7]/span[1]/span/input")
	WebElement LnkURL;
	
	@FindBy(xpath = ".//*[@class='coral-TabPanel-navigation']/a[2]")
	WebElement ImageTab;
	
	@FindBy(xpath = ".//*[@class='cq-dialog-content coral-TabPanel coral-TabPanel--large u-coral-noPadding u-coral-noMargin']/div/div[2]/div/section[1]/div/div[1]/input")
	WebElement ImageTitle;
	
	@FindBy(xpath = ".//*[@class='cq-dialog-content coral-TabPanel coral-TabPanel--large u-coral-noPadding u-coral-noMargin']/div/div[2]/div/section[1]/div/div[2]/input")
	WebElement ImageAltTxt;
	
	@FindBy(name = "./image/file")
	WebElement DImageUpload;
	
	@FindBy(xpath = ".//*[@class='cq-dialog-actions u-coral-pullRight']/button[4]")
	WebElement ConfigDone;
	
	//Image
	
	@FindBy(xpath = ".//*[@class='editor-panel editor-panel-active']/div[1]/coral-actionbar/coral-actionbar-primary/coral-actionbar-item[1]")
	WebElement ImageProperties;
	
	@FindBy(id = "assetsearch")
	WebElement AssetSearch;
	
	@FindBy(xpath = ".//*[@class='sidepanel-tab sidepanel-tab-assets editor-AssetFinder']/div[2]/coral-masonry/coral-masonry-item[1]/coral-card")
	WebElement DSource;
	
	@FindBy(xpath = ".//*[@class='cq-dialog-content coral-TabPanel coral-TabPanel--large u-coral-noPadding u-coral-noMargin']/div/div[2]/div/section[1]/div/div[3]/span/div")
	WebElement DTarget;
	
	public ArticleFeatureComp(WebDriver driver){
		this.driver = driver;
	}
	
	public void ArtFeatureConfigData(String EntSectTitle, String EntArtTitle, String EntRTETxt, String EntLnkTxt, 
			String EntLnkUrl){
		SectionTitle.sendKeys(EntSectTitle);
		ArticleTitle.sendKeys(EntArtTitle);
		RTE.sendKeys(EntRTETxt);
		LnkText.sendKeys(EntLnkTxt);
		LnkURL.sendKeys(EntLnkUrl);
	}
	
	public void ArtFeatureImageSmall(){
		Select select = new Select(ImageLayout);
		select.selectByValue("three-by-five");
	}
	
	public void ArtFeatureRightAlign(){
		Select select = new Select(ImageAlign);
		select.selectByValue("right");
	}
	
	public void ArtFeatureTopAlign(){
		Select select = new Select(ImageAlign);
		select.selectByValue("top");
	}
	
	public void ImageUpload(String EntImageTitle, String EntImageAltTxt){
		ImageTab.click();
		ImageTitle.sendKeys(EntImageTitle);
		ImageAltTxt.sendKeys(EntImageAltTxt);
		DImageUpload.sendKeys("D:\\LCBOImages\\DLargeArticleFeature.jpg");
	}
	
	public void ImageUploadSmall(String EntImageTitle, String EntImageAltTxt){
		ImageTab.click();
		ImageTitle.sendKeys(EntImageTitle);
		ImageAltTxt.sendKeys(EntImageAltTxt);
		DImageUpload.sendKeys("D:\\LCBOImages\\DSmallArticleFeature.jpg");
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
	
	public void DeskTopImageUpload(){
		ImageTab.click();
		ImageTitle.sendKeys("Image Title");
		ImageAltTxt.sendKeys("Image Alt Txt");
		(new Actions(driver)).dragAndDrop(DSource, DTarget).perform();
	}
	
	public void ConfigComplete(){
		ConfigDone.click();
	}

}
