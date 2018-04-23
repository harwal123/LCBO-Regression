package migrationPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EditorialLayout2Page {
	
	WebDriver driver;
	
	//Enhanced Product and RTE
	
	@FindBy(xpath = ".//*[@class='enhancedproducthero']/div/div/div[1]/picture")
	WebElement EnhancedProductImage;
	
	@FindBy(xpath = ".//*[@class='enhancedproducthero']/div/div/div[2]/div[1]/div[2]/h2")
	WebElement EnhancedProductTitle;
	
	@FindBy(xpath = ".//*[@class='enhancedproducthero']/div/div/div[2]/div[1]/div[3]")
	WebElement EnhancedProductSubTitle;
	
	@FindBy(xpath = ".//*[@class='enhancedproducthero']/div/div/div[2]/div[2]/div/p")
	WebElement EnhancedProductDescription;
	
	@FindBy(xpath = ".//*[@class='columncontrol']/div/div[2]/div/div/div/div[1]/picture")
	WebElement RTE1Image;
	
	@FindBy(xpath = ".//*[@class='columncontrol']/div/div[2]/div/div/div/div[2]/h4")
	WebElement RTE1Heading;
	
	@FindBy(xpath = ".//*[@class='columncontrol']/div/div[2]/div/div/div/div[3]/p")
	WebElement RTE1Description;
	
	@FindBy(xpath = ".//*[@class='columncontrol']/div/div[2]/div/div/div/span")
	WebElement RTE1Link;
	
	@FindBy(xpath = ".//*[@class='columncontrol']/div/div[3]/div/div/div/div[1]/picture")
	WebElement RTE2Image;
	
	@FindBy(xpath = ".//*[@class='columncontrol']/div/div[3]/div/div/div/div[2]/h4")
	WebElement RTE2Heading;
	
	@FindBy(xpath = ".//*[@class='columncontrol']/div/div[3]/div/div/div/div[3]/p")
	WebElement RTE2Description;
	
	@FindBy(xpath = ".//*[@class='columncontrol']/div/div[3]/div/div/div/span")
	WebElement RTE2Link;
	
	@FindBy(xpath = ".//*[@class='columncontrol']/div/div[4]/div/div/div/div[1]/picture")
	WebElement RTE3Image;
	
	@FindBy(xpath = ".//*[@class='columncontrol']/div/div[4]/div/div/div/div[2]/h4")
	WebElement RTE3Heading;
	
	@FindBy(xpath = ".//*[@class='columncontrol']/div/div[4]/div/div/div/div[3]/p")
	WebElement RTE3Description;
	
	@FindBy(xpath = ".//*[@class='columncontrol']/div/div[4]/div/div/div/span")
	WebElement RTE3Link;
	
	//Image Component and Enhanced Product 
	
	@FindBy(xpath = ".//*[@class='image']/div/div/div/div/picture")
	WebElement ImageComp;
	
	@FindBy(xpath = ".//*[@class='main']/div[4]/div/div/div/h1")
	WebElement ImageRTEHeading;
	
	@FindBy(xpath = ".//*[@class='main']/div[4]/div/div/div/h3")
	WebElement ImageRTEDescription;
	
	@FindBy(xpath = ".//*[@class='main']/div[3]/div/div/div[1]/picture")
	WebElement EnhancedImage1;
	
	@FindBy(xpath = ".//*[@class='main']/div[3]/div/div/div[2]/div[1]/div[2]/h2")
	WebElement EnhancedHeader1;
	
	@FindBy(xpath = ".//*[@class='main']/div[3]/div/div/div[2]/div[1]/div[3]")
	WebElement EnhancedSubHeader1;
	
	@FindBy(xpath = ".//*[@class='main']/div[5]/div/div/div[1]/picture")
	WebElement EnhancedImage2;
	
	@FindBy(xpath = ".//*[@class='main']/div[5]/div/div/div[2]/div[1]/div[2]/h2")
	WebElement EnhancedHeader2;
	
	@FindBy(xpath = ".//*[@class='main']/div[5]/div/div/div[2]/div[1]/div[3]")
	WebElement EnhancedSubHeader2;
	
	@FindBy(xpath = ".//*[@class='main']/div[5]/div/div/div[2]/div[2]/div[1]/p")
	WebElement EnhancedDescription2;
	
	@FindBy(xpath = ".//*[@class='main']/div[7]/div/div/div[1]/picture")
	WebElement EnhancedImage3;
	
	@FindBy(xpath = ".//*[@class='main']/div[7]/div/div/div[2]/div[1]/div[2]/h2")
	WebElement EnhancedHeader3;
	
	@FindBy(xpath = ".//*[@class='main']/div[7]/div/div/div[2]/div[1]/div[3]")
	WebElement EnhancedSubHeader3;
	
	@FindBy(xpath = ".//*[@class='main']/div[7]/div/div/div[2]/div[2]/div[1]/p")
	WebElement EnhancedDescription3;
	
	@FindBy(xpath = ".//*[@class='main']/div[9]/div/div/div[1]/picture")
	WebElement EnhancedImage4;
	
	@FindBy(xpath = ".//*[@class='main']/div[9]/div/div/div[2]/div[1]/div[2]/h2")
	WebElement EnhancedHeader4;
	
	@FindBy(xpath = ".//*[@class='main']/div[9]/div/div/div[2]/div[1]/div[3]")
	WebElement EnhancedSubHeader4;
	
	@FindBy(xpath = ".//*[@class='main']/div[9]/div/div/div[2]/div[2]/div[1]/p")
	WebElement EnhancedDescription4;
	
	// Only Images on the page
	
	@FindBy(xpath = ".//*[@class='main']/div[3]/div/div[2]/div/div/div/div[1]/h3")
	WebElement EnhancedContentTitle1;
	
	@FindBy(xpath = ".//*[@class='main']/div[3]/div/div[2]/div/div/div/div[2]/a")
	WebElement EnhancedContentLink1;
	
	@FindBy(xpath = ".//*[@class='main']/div[3]/div/div[2]/div/div/div/div[2]/a/picture")
	WebElement EnhancedContentPicture1;
	
	@FindBy(xpath = ".//*[@class='main']/div[3]/div/div[3]/div/div/div/div[1]/h3")
	WebElement EnhancedContentTitle2;
	
	@FindBy(xpath = ".//*[@class='main']/div[3]/div/div[3]/div/div/div/div[2]/a")
	WebElement EnhancedContentLink2;
	
	@FindBy(xpath = ".//*[@class='main']/div[3]/div/div[3]/div/div/div/div[2]/a/picture")
	WebElement EnhancedContentPicture2;
	
	@FindBy(xpath = ".//*[@class='main']/div[3]/div/div[4]/div/div/div/div[1]/h3")
	WebElement EnhancedContentTitle3;
	
	@FindBy(xpath = ".//*[@class='main']/div[3]/div/div[4]/div/div/div/div[2]/a")
	WebElement EnhancedContentLink3;
	
	@FindBy(xpath = ".//*[@class='main']/div[3]/div/div[4]/div/div/div/div[2]/a/picture")
	WebElement EnhancedContentPicture3;
	
	@FindBy(xpath = ".//*[@class='main']/div[4]/div/div[2]/div/div/div/div[1]/h3")
	WebElement EnhancedContentTitle4;
	
	@FindBy(xpath = ".//*[@class='main']/div[4]/div/div[2]/div/div/div/div[2]/a")
	WebElement EnhancedContentLink4;
	
	@FindBy(xpath = ".//*[@class='main']/div[4]/div/div[2]/div/div/div/div[2]/a/picture")
	WebElement EnhancedContentPicture4;
	
	@FindBy(xpath = ".//*[@class='main']/div[4]/div/div[3]/div/div/div/div[1]/h3")
	WebElement EnhancedContentTitle5;
	
	@FindBy(xpath = ".//*[@class='main']/div[4]/div/div[3]/div/div/div/div[2]/a")
	WebElement EnhancedContentLink5;
	
	@FindBy(xpath = ".//*[@class='main']/div[4]/div/div[3]/div/div/div/div[2]/a/picture")
	WebElement EnhancedContentPicture5;
	
	@FindBy(xpath = ".//*[@class='main']/div[4]/div/div[4]/div/div/div/div[1]/h3")
	WebElement EnhancedContentTitle6;
	
	@FindBy(xpath = ".//*[@class='main']/div[4]/div/div[4]/div/div/div/div[2]/a")
	WebElement EnhancedContentLink6;
	
	@FindBy(xpath = ".//*[@class='main']/div[4]/div/div[4]/div/div/div/div[2]/a/picture")
	WebElement EnhancedContentPicture6;
	
	@FindBy(xpath = ".//*[@class='main']/div[5]/div/div[2]/div/div/div/div[1]/h3")
	WebElement EnhancedContentTitle7;
	
	@FindBy(xpath = ".//*[@class='main']/div[5]/div/div[2]/div/div/div/div[2]/a")
	WebElement EnhancedContentLink7;
	
	@FindBy(xpath = ".//*[@class='main']/div[5]/div/div[2]/div/div/div/div[2]/a/picture")
	WebElement EnhancedContentPicture7;
	
	@FindBy(xpath = ".//*[@class='main']/div[5]/div/div[3]/div/div/div/div[1]/h3")
	WebElement EnhancedContentTitle8;
	
	@FindBy(xpath = ".//*[@class='main']/div[5]/div/div[3]/div/div/div/div[2]/a")
	WebElement EnhancedContentLink8;
	
	@FindBy(xpath = ".//*[@class='main']/div[5]/div/div[3]/div/div/div/div[2]/a/picture")
	WebElement EnhancedContentPicture8;
	
	@FindBy(xpath = ".//*[@class='main']/div[5]/div/div[4]/div/div/div/div[1]/h3")
	WebElement EnhancedContentTitle9;
	
	@FindBy(xpath = ".//*[@class='main']/div[5]/div/div[4]/div/div/div/div[2]/a")
	WebElement EnhancedContentLink9;
	
	@FindBy(xpath = ".//*[@class='main']/div[5]/div/div[4]/div/div/div/div[2]/a/picture")
	WebElement EnhancedContentPicture9;
	
	@FindBy(xpath = ".//*[@class='main']/div[6]/div/div[2]/div/div/div/div[1]/h3")
	WebElement EnhancedContentTitle10;
	
	@FindBy(xpath = ".//*[@class='main']/div[6]/div/div[2]/div/div/div/div[2]/a")
	WebElement EnhancedContentLink10;
	
	@FindBy(xpath = ".//*[@class='main']/div[6]/div/div[2]/div/div/div/div[2]/a/picture")
	WebElement EnhancedContentPicture10;
	
	@FindBy(xpath = ".//*[@class='main']/div[6]/div/div[3]/div/div/div/div[1]/h3")
	WebElement EnhancedContentTitle11;
	
	@FindBy(xpath = ".//*[@class='main']/div[6]/div/div[3]/div/div/div/div[2]/a")
	WebElement EnhancedContentLink11;
	
	@FindBy(xpath = ".//*[@class='main']/div[6]/div/div[3]/div/div/div/div[2]/a/picture")
	WebElement EnhancedContentPicture11;
	
	@FindBy(xpath = ".//*[@class='main']/div[6]/div/div[4]/div/div/div/div[1]/h3")
	WebElement EnhancedContentTitle12;
	
	@FindBy(xpath = ".//*[@class='main']/div[6]/div/div[4]/div/div/div/div[2]/a")
	WebElement EnhancedContentLink12;
	
	@FindBy(xpath = ".//*[@class='main']/div[6]/div/div[4]/div/div/div/div[2]/a/picture")
	WebElement EnhancedContentPicture12;




}
