package aemPages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class CarouselComp {
WebDriver driver;
	
	@FindBy(xpath = ".//*[@class='coral-Select-select coral-Select-select--native']")
	WebElement NoOfSlides;
	
	@FindBy(xpath = ".//nav[@class='coral-TabPanel-navigation']/a[2]")
	WebElement Slide1;
	
	@FindBy(xpath = ".//nav[@class='coral-TabPanel-navigation']/a[3]")
	WebElement Slide2;
	
	@FindBy(xpath = ".//nav[@class='coral-TabPanel-navigation']/a[4]")
	WebElement Slide3;
	
	@FindBy(xpath = ".//nav[@class='coral-TabPanel-navigation']/a[5]")
	WebElement Slide4;
	
	@FindBy(xpath = ".//nav[@class='coral-TabPanel-navigation']/a[6]")
	WebElement Slide5;
	
	@FindBy(xpath = ".//nav[@class='coral-TabPanel-navigation']/a[7]")
	WebElement Slide6;
	
	@FindBy(xpath = ".//nav[@class='coral-TabPanel-navigation']/a[8]")
	WebElement Slide7;
	
	@FindBy(xpath = ".//nav[@class='coral-TabPanel-navigation']/a[9]")
	WebElement Slide8;
	
	@FindBy(name = "./one/linkURL")
	WebElement LinkURLOne;
	
	@FindBy(name = "./one/desktop/jcr:title")
	WebElement ImageTitleOne;
	
	@FindBy(name = "./one/desktop/alt")
	WebElement ImageAltTxtOne;
	
	@FindBy(name = "./one/desktop/file")
	WebElement DImageOne;
	
	@FindBy(name = "./two/linkURL")
	WebElement LinkURLtwo;
	
	@FindBy(name = "./two/desktop/jcr:title")
	WebElement ImageTitletwo;
	
	@FindBy(name = "./two/desktop/alt")
	WebElement ImageAltTxttwo;
	
	@FindBy(name = "./two/desktop/file")
	WebElement DImagetwo;
	
	@FindBy(name = "./three/linkURL")
	WebElement LinkURLThree;
	
	@FindBy(name = "./three/desktop/jcr:title")
	WebElement ImageTitleThree;
	
	@FindBy(name = "./three/desktop/alt")
	WebElement ImageAltTxtThree;
	
	@FindBy(name = "./three/desktop/file")
	WebElement DImageThree;
	
	@FindBy(name = "./four/linkURL")
	WebElement LinkURLfour;
	
	@FindBy(name = "./four/desktop/jcr:title")
	WebElement ImageTitlefour;
	
	@FindBy(name = "./four/desktop/alt")
	WebElement ImageAltTxtfour;
	
	@FindBy(name = "./four/desktop/file")
	WebElement DImagefour;
	
	@FindBy(name = "./five/linkURL")
	WebElement LinkURLfive;
	
	@FindBy(name = "./five/desktop/jcr:title")
	WebElement ImageTitlefive;
	
	@FindBy(name = "./five/desktop/alt")
	WebElement ImageAltTxtfive;
	
	@FindBy(name = "./five/desktop/file")
	WebElement DImagefive;
	
	@FindBy(name = "./six/linkURL")
	WebElement LinkURLSix;
	
	@FindBy(name = "./six/desktop/jcr:title")
	WebElement ImageTitleSix;
	
	@FindBy(name = "./six/desktop/alt")
	WebElement ImageAltTxtSix;
	
	@FindBy(name = "./six/desktop/file")
	WebElement DImageSix;
	
	@FindBy(name = "./seven/linkURL")
	WebElement LinkURLseven;
	
	@FindBy(name = "./seven/desktop/jcr:title")
	WebElement ImageTitleseven;
	
	@FindBy(name = "./seven/desktop/alt")
	WebElement ImageAltTxtseven;
	
	@FindBy(name = "./seven/desktop/file")
	WebElement DImageseven;
	
	@FindBy(name = "./eight/linkURL")
	WebElement LinkURLeight;
	
	@FindBy(name = "./eight/desktop/jcr:title")
	WebElement ImageTitleeight;
	
	@FindBy(name = "./eight/desktop/alt")
	WebElement ImageAltTxteight;
	
	@FindBy(name = "./eight/desktop/file")
	WebElement DImageeight;
	
	@FindBy(xpath = ".//*[@class='cq-dialog-actions u-coral-pullRight']/button[4]")
	WebElement ConfigDone;
	
	//Image
	
	@FindBy(xpath = ".//*[@class='editor-panel editor-panel-active']/div[1]/coral-actionbar/coral-actionbar-primary/coral-actionbar-item[1]")
	WebElement ImageProperties;
	
	@FindBy(id = "assetsearch")
	WebElement AssetSearch;
	
	@FindBy(xpath = ".//*[@class='sidepanel-tab sidepanel-tab-assets editor-AssetFinder']/div[2]/coral-masonry/coral-masonry-item[1]/coral-card")
	WebElement DSource;
	
	@FindBy(xpath = ".//*[@class='cq-dialog-content coral-TabPanel coral-TabPanel--large u-coral-noPadding u-coral-noMargin']/div/section[2]/div/div[5]/span/div")
	WebElement DTarget;
	
	@FindBy(xpath = ".//*[@class='cq-dialog-content coral-TabPanel coral-TabPanel--large u-coral-noPadding u-coral-noMargin']/div/section[3]/div/div[5]/span/div")
	WebElement DTargetTwo;
	
	@FindBy(xpath = ".//*[@class='cq-dialog-content coral-TabPanel coral-TabPanel--large u-coral-noPadding u-coral-noMargin']/div/section[4]/div/div[5]/span/div")
	WebElement DTargetThree;
	
	@FindBy(xpath = ".//*[@class='cq-dialog-content coral-TabPanel coral-TabPanel--large u-coral-noPadding u-coral-noMargin']/div/section[5]/div/div[5]/span/div")
	WebElement DTargetFour;
	
	@FindBy(xpath = ".//*[@class='cq-dialog-content coral-TabPanel coral-TabPanel--large u-coral-noPadding u-coral-noMargin']/div/section[6]/div/div[5]/span/div")
	WebElement DTargetFive;
	
	@FindBy(xpath = ".//*[@class='cq-dialog-content coral-TabPanel coral-TabPanel--large u-coral-noPadding u-coral-noMargin']/div/section[7]/div/div[5]/span/div")
	WebElement DTargetSix;
	
	@FindBy(xpath = ".//*[@class='cq-dialog-content coral-TabPanel coral-TabPanel--large u-coral-noPadding u-coral-noMargin']/div/section[8]/div/div[5]/span/div")
	WebElement DTargetSeven;
	
	@FindBy(xpath = ".//*[@class='cq-dialog-content coral-TabPanel coral-TabPanel--large u-coral-noPadding u-coral-noMargin']/div/section[9]/div/div[5]/span/div")
	WebElement DTargetEight;
	
	public CarouselComp(WebDriver driver){
		this.driver = driver;
	}
	
	public void CarouselConfig(String EnterSlide){
		Select select = new Select(NoOfSlides);
		select.selectByValue(EnterSlide);
	}
	
	public void SlideOne(){
		Slide1.click();
		LinkURLOne.sendKeys("http://google.com");
		ImageTitleOne.sendKeys("Image Title");
		ImageAltTxtOne.sendKeys("Image Alt Text");
		//DImageOne.sendKeys("D:\\LCBOImages\\Carousel\\DCarouselOne.jpg");
	}
	
	public void SlideTwo(){
		Slide2.click();
		LinkURLtwo.sendKeys("http://google.com");
		ImageTitletwo.sendKeys("Image Title");
		ImageAltTxttwo.sendKeys("Image Alt Text");
		//DImagetwo.sendKeys("D:\\LCBOImages\\Carousel\\DCarouselTwo.jpg");
	}
	
	public void SlideThree(){
		Slide3.click();
		LinkURLThree.sendKeys("http://google.com");
		ImageTitleThree.sendKeys("Image Title");
		ImageAltTxtThree.sendKeys("Image Alt Text");
		//DImageThree.sendKeys("D:\\LCBOImages\\Carousel\\DCarouselThree.jpg");
	}
	
	public void SlideFour(){
		Slide4.click();
		LinkURLfour.sendKeys("http://google.com");
		ImageTitlefour.sendKeys("Image Title");
		ImageAltTxtfour.sendKeys("Image Alt Text");
		//DImagefour.sendKeys("D:\\LCBOImages\\Carousel\\DCarouselFour.jpg");
	}
	
	public void SlideFive(){
		Slide5.click();
		LinkURLfive.sendKeys("http://google.com");
		ImageTitlefive.sendKeys("Image Title");
		ImageAltTxtfive.sendKeys("Image Alt Text");
		//DImagefive.sendKeys("D:\\LCBOImages\\Carousel\\DCarouselFive.jpg");
	}
	
	public void SlideSix(){
		Slide6.click();
		LinkURLSix.sendKeys("http://google.com");
		ImageTitleSix.sendKeys("Image Title");
		ImageAltTxtSix.sendKeys("Image Alt Text");
		//DImageSix.sendKeys("D:\\LCBOImages\\Carousel\\DCarouselSix.jpg");
	}
	
	public void SlideSeven(){
		Slide7.click();
		LinkURLseven.sendKeys("http://google.com");
		ImageTitleseven.sendKeys("Image Title");
		ImageAltTxtseven.sendKeys("Image Alt Text");
		//DImageseven.sendKeys("D:\\LCBOImages\\Carousel\\DCarouselSeven.jpg");
	}
	
	public void Slideeight(){
		Slide8.click();
		LinkURLeight.sendKeys("http://google.com");
		ImageTitleeight.sendKeys("Image Title");
		ImageAltTxteight.sendKeys("Image Alt Text");
		//DImageeight.sendKeys("D:\\LCBOImages\\Carousel\\DCarouselEight.jpg");
	}
	
	public void ConfigComplete(){
		ConfigDone.click();
	}
	
	public void OpenImageProperties() {
		ImageProperties.click();
	}
	
	public void DCarouselOneImage(){
		(new Actions(driver)).dragAndDrop(DSource, DTarget).perform();
	}
	
	public void DCarouselTwoImage(){
		(new Actions(driver)).dragAndDrop(DSource, DTargetTwo).perform();
	}
	
	public void DCarouselThreeImage(){
		(new Actions(driver)).dragAndDrop(DSource, DTargetThree).perform();
	}
	
	public void DCarouselFourImage(){
		(new Actions(driver)).dragAndDrop(DSource, DTargetFour).perform();
	}
	
	public void DCarouselFiveImage(){
		(new Actions(driver)).dragAndDrop(DSource, DTargetFive).perform();
	}
	
	public void DCarouselSixImage(){
		(new Actions(driver)).dragAndDrop(DSource, DTargetSix).perform();
	}
	
	public void DCarouselSevenImage(){
		(new Actions(driver)).dragAndDrop(DSource, DTargetSeven).perform();
	}
	
	public void DCarouselEightImage(){
		(new Actions(driver)).dragAndDrop(DSource, DTargetEight).perform();
	}
	
	public void SearchAsset(String EnterImageAsset) throws InterruptedException{
		AssetSearch.clear();
		AssetSearch.sendKeys(EnterImageAsset);
		AssetSearch.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
	}

}
