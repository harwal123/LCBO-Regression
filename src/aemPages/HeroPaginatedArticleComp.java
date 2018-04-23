package aemPages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class HeroPaginatedArticleComp {
WebDriver driver;
	
	@FindBy(xpath = ".//*[@class='coral-TabPanel-content u-coral-noPadding u-coral-noMargin']/div[1]/div/div[1]/div/div[2]")
	WebElement MiniTitle;
	
	@FindBy(xpath = ".//*[@class='coral-TabPanel-content u-coral-noPadding u-coral-noMargin']/div[1]/div/div[2]/div/div[2]")
	WebElement Title;
	
	@FindBy(xpath = ".//*[@class='coral-TabPanel-content u-coral-noPadding u-coral-noMargin']/div[1]/div/div[3]/div/div[2]")
	WebElement SubTitle;
	
	@FindBy(xpath = ".//*[@class='coral-TabPanel-navigation']/a[2]")
	WebElement DescriptionTab;
	
	@FindBy(xpath = ".//*[@class='coral-TabPanel-content u-coral-noPadding u-coral-noMargin']/div[2]/div/div/div/div[2]")
	WebElement DescriptionText;
	
	@FindBy(xpath = ".//*[@class='coral-TabPanel-navigation']/a[3]")
	WebElement ImageTab;
	
	@FindBy(xpath = ".//*[@class='coral-TabPanel-content u-coral-noPadding u-coral-noMargin']/div[3]/div/section[1]/div/div[1]/input")
	WebElement ImageTitle;
	
	@FindBy(xpath = ".//*[@class='coral-TabPanel-content u-coral-noPadding u-coral-noMargin']/div[3]/div/section[1]/div/div[2]/input")
	WebElement ImageAltTxt;
	
	@FindBy(xpath = ".//*[@class='coral-TabPanel-content u-coral-noPadding u-coral-noMargin']/div[3]/div/section[1]/div/div[3]/coral-fileupload/div/div[2]/span/a")
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
				
	@FindBy(xpath = ".//*[@class='coral-Dialog-content u-coral-noPadding u-coral-noMargin']/div/div/div[3]/div/section[1]/div/div[3]/span/div")
	WebElement DTarget;
	
	public HeroPaginatedArticleComp(WebDriver driver){
		this.driver = driver;
	}
	
	public void HeroPaginatedArticleConfig(){
		MiniTitle.sendKeys("Summer Wine");
		Title.sendKeys("Brazilian Beef Kababs + Jackson-Triggs Cabernet Sauvignon");
		SubTitle.sendKeys("Each month, we'll post some of our favourite pairings featuring seasonal recipes served with wine, beer, spirits or coolers.");
		DescriptionTab.click();
		DescriptionText.sendKeys("These juicy Brazilian Beef Kababs with Rice Pilaf are a great choice for summer grilling. Serve over garlicky "
				+ "rice cooked in the Brazilian manner for a firm yet fluffy texture. Jackson-Triggs Cabernet Sauvignon has berry, cassis and "
				+ "vanilla notes that are well-suited to grilled meat dishes. Plus, the bag in box format is convenient for serving at a backyard barbecue.");
	}
	
	public void DImageUpload(){
		ImageTab.click();
		ImageTitle.sendKeys("Image Title");
		ImageAltTxt.sendKeys("Image Alt Text");
		(new Actions(driver)).dragAndDrop(DSource, DTarget).perform();
	}
	
	public void ConfigurationComplete(){
		DoneConfig.click();
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
