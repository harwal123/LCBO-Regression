package migrationPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class EditorialLayout1Page {

	WebDriver driver;
	
	String ParentWindow;
	
	@FindBy(xpath = ".//*[@id='language-selector']/div/div/div[2]/a[1]")
	WebElement LanguageSelector;
	
	@FindBy(xpath = ".//*[@class='left-content-test']/div[1]/div/div/div/h1")
	WebElement RTETitle;
	
	@FindBy(xpath = ".//*[@class='left-content-test']/div[1]/div/div/div/p[1]")
	WebElement RTEDescription;

	@FindBy(xpath = ".//*[@class='left-content-test']/div[1]/div/div/div/div[1]/div/picture")
	WebElement HeroImageTextImage1;

	@FindBy(xpath = ".//*[@class='left-content-test']/div[1]/div/div/div/div[2]/div/h2")
	WebElement HeroImageTextTitle1;

	@FindBy(xpath = ".//*[@class='left-content-test']/div[1]/div/div/div/div[2]/div/div[1]")
	WebElement HeroImageTextSubTitle1;

	@FindBy(xpath = ".//*[@class='left-content-test']/div[1]/div/div/div/div[2]/div/div[2]")
	WebElement HeroImageTextDescription1;
	
	@FindBy(xpath = ".//*[@class='left-content-test']/div[2]/div/div/div/div[1]/div/picture")
	WebElement HeroImageTextImage2;

	@FindBy(xpath = ".//*[@class='left-content-test']/div[2]/div/div/div/div[2]/div/h2")
	WebElement HeroImageTextTitle2;

	@FindBy(xpath = ".//*[@class='left-content-test']/div[2]/div/div/div/div[2]/div/div[1]")
	WebElement HeroImageTextSubTitle2;

	@FindBy(xpath = ".//*[@class='left-content-test']/div[2]/div/div/div/div[2]/div/div[2]")
	WebElement HeroImageTextDescription2;
	
	@FindBy(xpath = ".//*[@class='left-content-test']/div[2]/div/div/div/div[2]/div/div[3]")
	WebElement HeroImageLink2;
	
	@FindBy(xpath = ".//*[@class='left-content-test']/div[3]/div/div/div/div[1]/div/picture")
	WebElement HeroImageTextImage3;

	@FindBy(xpath = ".//*[@class='left-content-test']/div[3]/div/div/div/div[2]/div/h2")
	WebElement HeroImageTextTitle3;

	@FindBy(xpath = ".//*[@class='left-content-test']/div[3]/div/div/div/div[2]/div/div[1]")
	WebElement HeroImageTextSubTitle3;

	@FindBy(xpath = ".//*[@class='left-content-test']/div[3]/div/div/div/div[2]/div/div[2]")
	WebElement HeroImageTextDescription3;
	
	@FindBy(xpath = ".//*[@class='left-content-test']/div[3]/div/div/div/div[2]/div/div[3]")
	WebElement HeroImageLink3;
	
	@FindBy(xpath = ".//*[@class='left-content-test']/div[4]/div/div/div/div[1]/div/picture")
	WebElement HeroImageTextImage4;

	@FindBy(xpath = ".//*[@class='left-content-test']/div[4]/div/div/div/div[2]/div/h2")
	WebElement HeroImageTextTitle4;

	@FindBy(xpath = ".//*[@class='left-content-test']/div[4]/div/div/div/div[2]/div/div[1]")
	WebElement HeroImageTextSubTitle4;

	@FindBy(xpath = ".//*[@class='left-content-test']/div[4]/div/div/div/div[2]/div/div[2]")
	WebElement HeroImageTextDescription4;
	
	@FindBy(xpath = ".//*[@class='left-content-test']/div[4]/div/div/div/div[2]/div/div[3]")
	WebElement HeroImageLink4;
	
	@FindBy(xpath = ".//*[@class='left-content-test']/div[5]/div/div/div/div[1]/div/picture")
	WebElement HeroImageTextImage5;

	@FindBy(xpath = ".//*[@class='left-content-test']/div[5]/div/div/div/div[2]/div/h2")
	WebElement HeroImageTextTitle5;

	@FindBy(xpath = ".//*[@class='left-content-test']/div[5]/div/div/div/div[2]/div/div[1]")
	WebElement HeroImageTextSubTitle5;

	@FindBy(xpath = ".//*[@class='left-content-test']/div[5]/div/div/div/div[2]/div/div[2]")
	WebElement HeroImageTextDescription5;
	
	@FindBy(xpath = ".//*[@class='left-content-test']/div[5]/div/div/div/div[2]/div/div[3]")
	WebElement HeroImageLink5;
	
	@FindBy(xpath = ".//*[@class='left-content-test']/div[6]/div/div/div/div[1]/div/picture")
	WebElement HeroImageTextImage6;

	@FindBy(xpath = ".//*[@class='left-content-test']/div[6]/div/div/div/div[2]/div/h2")
	WebElement HeroImageTextTitle6;

	@FindBy(xpath = ".//*[@class='left-content-test']/div[6]/div/div/div/div[2]/div/div[1]")
	WebElement HeroImageTextSubTitle6;

	@FindBy(xpath = ".//*[@class='left-content-test']/div[6]/div/div/div/div[2]/div/div[2]")
	WebElement HeroImageTextDescription6;
	
	@FindBy(xpath = ".//*[@class='left-content-test']/div[6]/div/div/div/div[2]/div/div[3]")
	WebElement HeroImageLink6;
	
	@FindBy(xpath = ".//*[@class='left-content-test']/div[7]/div/div/div/div[1]/div/picture")
	WebElement HeroImageTextImage7;

	@FindBy(xpath = ".//*[@class='left-content-test']/div[7]/div/div/div/div[2]/div/h2")
	WebElement HeroImageTextTitle7;

	@FindBy(xpath = ".//*[@class='left-content-test']/div[7]/div/div/div/div[2]/div/div[1]")
	WebElement HeroImageTextSubTitle7;

	@FindBy(xpath = ".//*[@class='left-content-test']/div[7]/div/div/div/div[2]/div/div[2]")
	WebElement HeroImageTextDescription7;
	
	@FindBy(xpath = ".//*[@class='left-content-test']/div[7]/div/div/div/div[2]/div/div[3]")
	WebElement HeroImageLink7;

    @FindBy(xpath = ".//*[@class='left-content-test']/div[8]")
    WebElement SocailShare;
    
    @FindBy(xpath = ".//*[@class='left-content-test']/div[6]")
    WebElement SocailShare1;

	public EditorialLayout1Page(WebDriver driver) {
		this.driver = driver;
	}

	public void HeroImageText1(String Title1, String SubTitle1, String Description1){
		Assert.assertEquals(true, HeroImageTextImage1.isDisplayed());
		Assert.assertEquals(HeroImageTextTitle1.getText(), Title1);
		Assert.assertEquals(SubTitle1, HeroImageTextSubTitle1.getText());
		Assert.assertEquals(Description1, HeroImageTextDescription1.getText());
	}
	
	public void HeroImageText2(String Title2, String SubTitle2, String Description2){
		Assert.assertEquals(true, HeroImageTextImage2.isDisplayed());
		Assert.assertEquals(HeroImageTextTitle2.getText(), Title2);
		Assert.assertEquals(SubTitle2, HeroImageTextSubTitle2.getText());
		Assert.assertEquals(Description2, HeroImageTextDescription2.getText());
		//Assert.assertEquals(URL, HeroImageLink2.getAttribute("href"));
	}
	
	public void HeroImageText3(String Title3, String SubTitle3, String Description3){
		Assert.assertEquals(true, HeroImageTextImage3.isDisplayed());
		Assert.assertEquals(HeroImageTextTitle3.getText(), Title3);
		Assert.assertEquals(HeroImageTextSubTitle3.getText(), SubTitle3);
		Assert.assertEquals(HeroImageTextDescription3.getText(), Description3);
		//Assert.assertEquals(HeroImageLink4.getAttribute("href"), URL);
	}
	
	public void HeroImageText4(String Title4, String SubTitle4, String Description4){
		Assert.assertEquals(true, HeroImageTextImage4.isDisplayed());
		Assert.assertEquals(HeroImageTextTitle4.getText(), Title4);
		Assert.assertEquals(HeroImageTextSubTitle4.getText(), SubTitle4);
		Assert.assertEquals(HeroImageTextDescription4.getText(), Description4);
		//Assert.assertEquals(HeroImageLink4.getAttribute("href"), URL);
	}
	
	public void HeroImageText5(String Title5, String SubTitle5, String Description5){
		Assert.assertEquals(true, HeroImageTextImage5.isDisplayed());
		Assert.assertEquals(HeroImageTextTitle5.getText(), Title5);
		Assert.assertEquals(HeroImageTextSubTitle5.getText(), SubTitle5);
		Assert.assertEquals(HeroImageTextDescription5.getText(), Description5);
		//Assert.assertEquals(HeroImageLink5.getAttribute("href"), URL);
	}
	
	public void HeroImageText6(String Title6, String SubTitle6, String Description6){
		Assert.assertEquals(true, HeroImageTextImage6.isDisplayed());
		Assert.assertEquals(HeroImageTextTitle6.getText(), Title6);
		Assert.assertEquals(HeroImageTextSubTitle6.getText(), SubTitle6);
		Assert.assertEquals(HeroImageTextDescription6.getText(), Description6);
		//Assert.assertEquals(HeroImageLink6.getAttribute("href"), URL);
	}
 
	public void HeroImageText7(String Title7, String SubTitle7, String Description7){
		Assert.assertEquals(true, HeroImageTextImage7.isDisplayed());
		Assert.assertEquals(HeroImageTextTitle7.getText(), Title7);
		Assert.assertEquals(HeroImageTextSubTitle7.getText(), SubTitle7);
		Assert.assertEquals(HeroImageTextDescription7.getText(), Description7);
		//Assert.assertEquals(HeroImageLink7.getAttribute("href"), URL);
	}
	
	public void SocailShare(){
		Assert.assertEquals(SocailShare.isDisplayed(), true);
	}
	
	public void RTEContent(String Title, String Description){
		Assert.assertEquals(RTETitle.getText(), Title);
		Assert.assertEquals(RTEDescription.getText(), Description);
	}
	
	public void SocailShare1(){
		Assert.assertEquals(SocailShare1.isDisplayed(), true);
	}


}
