package aemPages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import helper.DragAndDropComponent;

public class EnhancedProductHeroComp {
	
	WebDriver driver;
	
	@FindBy(xpath = ".//*[@id='coral-8']/div/div[1]/div/div[2]")
	WebElement Header;
	
	@FindBy(xpath = ".//*[@id='coral-8']/div/div[2]/div/div[2]")
	WebElement SubHeading;
	
	@FindBy(xpath = ".//*[@id='coral-8']/div/div[3]/div/div[2]")
	WebElement Description;
	
	@FindBy(xpath = ".//*[@id='coral-8']/div/div[4]/input")
	WebElement ImageTitle;
	
	@FindBy(xpath = ".//*[@id='coral-8']/div/div[5]/input")
	WebElement ImageAltText;
	
	@FindBy(xpath = ".//*[@id='coral-8']/div/div[6]/input")
	WebElement LinkText;
	
	@FindBy(xpath = ".//*[@id='coral-11']")
	WebElement LinkURL;
	
	@FindBy(xpath = ".//*[@class='coral-TabPanel-navigation']/a[2]")
	WebElement ImageLink;
	
	@FindBy(xpath = ".//*[@class='cq-dialog-actions u-coral-pullRight']/button[4]")
	WebElement Config;
	
	//Image
	
	@FindBy(xpath = ".//*[@class='editor-panel editor-panel-active']/div[1]/coral-actionbar/coral-actionbar-primary/coral-actionbar-item[1]")
	WebElement ImageProperties;
		
	@FindBy(id = "assetsearch")
	WebElement AssetSearch;
		
	@FindBy(xpath = ".//*[@class='sidepanel-tab sidepanel-tab-assets editor-AssetFinder']/div[2]/coral-masonry/coral-masonry-item[1]/coral-card")
	WebElement DSource;
		
	@FindBy(xpath = ".//*[@id='coral-9']/section/div/div[1]/span/div/div[2]")
	WebElement DTarget;
	
	public EnhancedProductHeroComp(WebDriver driver){
	this.driver = driver;
	}
	
	public void EnhancedProductHeroCompConfig(String HeaderText, String SubHeaderText, String DescripText, String ImageTitleText, 
			String ImageAltTxt, String LinkTxt, String LinkURLtxt) throws InterruptedException{
		DragAndDropComponent Comp = PageFactory.initElements(driver, DragAndDropComponent.class);
		Comp.DragAndDrop("Enhanced Product Hero");
		Header.sendKeys(HeaderText);
		SubHeading.sendKeys(SubHeaderText);
		Description.sendKeys(DescripText);
		ImageTitle.sendKeys(ImageTitleText);
		ImageAltText.sendKeys(ImageAltTxt);
		LinkText.sendKeys(LinkTxt);
		LinkURL.sendKeys(LinkURLtxt);
	}
	
	public void DImageUpdate(){
		ImageLink.click();
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
		Config.click();	
	}

}
