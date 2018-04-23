package aemPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FeaturedContentComp {
WebDriver driver;
	
	@FindBy(name = "./sectionTitle")
	WebElement SectionTitle;
	
	@FindBy(xpath = ".//*[@class='cq-dialog-actions u-coral-pullRight']/button[4]")
	WebElement ConfigDone;
	
	@FindBy(xpath = ".//*[@class='coral-Form-field coral-RadioGroup']/coral-radio[1]")
	WebElement OpenState;
	
	@FindBy(xpath = ".//*[@class='coral-Form-field coral-Multifield']/button")
	WebElement AddButton;
	
	@FindBy(xpath = ".//*[@class='coral-Form-field coral-Multifield']/coral-multifield-item[1]/coral-multifield-item-content/div/div[1]/input")
	WebElement AccordianTitle1;
	
	@FindBy(xpath = ".//*[@class='coral-Form-field coral-Multifield']/coral-multifield-item[1]/coral-multifield-item-content/div/div[2]/textarea")
	WebElement Description1;
	
	@FindBy(xpath = ".//*[@class='coral-Form-field coral-Multifield']/coral-multifield-item[1]/coral-multifield-item-content/div/div[3]/input")
	WebElement LinkTxt1;
	
	@FindBy(xpath = ".//*[@class='coral-Form-field coral-Multifield']/coral-multifield-item[1]/coral-multifield-item-content/div/div[4]/foundation-autocomplete/div/div/input")
	WebElement LinkURL1;
	
	@FindBy(xpath = ".//*[@class='coral-Form-field coral-Multifield']/coral-multifield-item[2]/coral-multifield-item-content/div/div[1]/input")
	WebElement AccordianTitle2;
	
	@FindBy(xpath = ".//*[@class='coral-Form-field coral-Multifield']/coral-multifield-item[2]/coral-multifield-item-content/div/div[2]/textarea")
	WebElement Description2;
	
	@FindBy(xpath = ".//*[@class='coral-Form-field coral-Multifield']/coral-multifield-item[2]/coral-multifield-item-content/div/div[3]/input")
	WebElement LinkTxt2;
	
	@FindBy(xpath = ".//*[@class='coral-Form-field coral-Multifield']/coral-multifield-item[2]/coral-multifield-item-content/div/div[4]/foundation-autocomplete/div/div/input")
	WebElement LinkURL2;
	
	@FindBy(xpath = ".//*[@class='coral-Form-field coral-Multifield']/coral-multifield-item[3]/coral-multifield-item-content/div/div[1]/input")
	WebElement AccordianTitle3;
	
	@FindBy(xpath = ".//*[@class='coral-Form-field coral-Multifield']/coral-multifield-item[3]/coral-multifield-item-content/div/div[2]/textarea")
	WebElement Description3;
	
	@FindBy(xpath = ".//*[@class='coral-Form-field coral-Multifield']/coral-multifield-item[3]/coral-multifield-item-content/div/div[3]/input")
	WebElement LinkTxt3;
	
	@FindBy(xpath = ".//*[@class='coral-Form-field coral-Multifield']/coral-multifield-item[3]/coral-multifield-item-content/div/div[4]/foundation-autocomplete/div/div/input")
	WebElement LinkURL3;
	
	@FindBy(xpath = ".//*[@class='coral-Form-field coral-Multifield']/coral-multifield-item[4]/coral-multifield-item-content/div/div[1]/input")
	WebElement AccordianTitle4;
	
	@FindBy(xpath = ".//*[@class='coral-Form-field coral-Multifield']/coral-multifield-item[4]/coral-multifield-item-content/div/div[2]/textarea")
	WebElement Description4;
	
	@FindBy(xpath = ".//*[@class='coral-Form-field coral-Multifield']/coral-multifield-item[4]/coral-multifield-item-content/div/div[3]/input")
	WebElement LinkTxt4;
	
	@FindBy(xpath = ".//*[@class='coral-Form-field coral-Multifield']/coral-multifield-item[4]/coral-multifield-item-content/div/div[4]/foundation-autocomplete/div/div/input")
	WebElement LinkURL4;
	
	@FindBy(xpath = ".//*[@class='coral-Form-field coral-Multifield']/coral-multifield-item[5]/coral-multifield-item-content/div/div[1]/input")
	WebElement AccordianTitle5;
	
	@FindBy(xpath = ".//*[@class='coral-Form-field coral-Multifield']/coral-multifield-item[5]/coral-multifield-item-content/div/div[2]/textarea")
	WebElement Description5;
	
	@FindBy(xpath = ".//*[@class='coral-Form-field coral-Multifield']/coral-multifield-item[5]/coral-multifield-item-content/div/div[3]/input")
	WebElement LinkTxt5;
	
	@FindBy(xpath = ".//*[@class='coral-Form-field coral-Multifield']/coral-multifield-item[5]/coral-multifield-item-content/div/div[4]/foundation-autocomplete/div/div/input")
	WebElement LinkURL5;
	
	@FindBy(xpath = ".//*[@class='coral-Form-field coral-Multifield']/coral-multifield-item[6]/coral-multifield-item-content/div/div[1]/input")
	WebElement AccordianTitle6;
	
	@FindBy(xpath = ".//*[@class='coral-Form-field coral-Multifield']/coral-multifield-item[6]/coral-multifield-item-content/div/div[2]/textarea")
	WebElement Description6;
	
	@FindBy(xpath = ".//*[@class='coral-Form-field coral-Multifield']/coral-multifield-item[6]/coral-multifield-item-content/div/div[3]/input")
	WebElement LinkTxt6;
	
	@FindBy(xpath = ".//*[@class='coral-Form-field coral-Multifield']/coral-multifield-item[6]/coral-multifield-item-content/div/div[4]/foundation-autocomplete/div/div/input")
	WebElement LinkURL6;
	
	@FindBy(xpath = ".//*[@class='coral-Form-field coral-Multifield']/coral-multifield-item[7]/coral-multifield-item-content/div/div[1]/input")
	WebElement AccordianTitle7;
	
	@FindBy(xpath = ".//*[@class='coral-Form-field coral-Multifield']/coral-multifield-item[7]/coral-multifield-item-content/div/div[2]/textarea")
	WebElement Description7;
	
	@FindBy(xpath = ".//*[@class='coral-Form-field coral-Multifield']/coral-multifield-item[7]/coral-multifield-item-content/div/div[3]/input")
	WebElement LinkTxt7;
	
	@FindBy(xpath = ".//*[@class='coral-Form-field coral-Multifield']/coral-multifield-item[7]/coral-multifield-item-content/div/div[4]/foundation-autocomplete/div/div/input")
	WebElement LinkURL7;
	
	@FindBy(xpath = ".//*[@class='coral-Form-field coral-Multifield']/coral-multifield-item[8]/coral-multifield-item-content/div/div[1]/input")
	WebElement AccordianTitle8;
	
	@FindBy(xpath = ".//*[@class='coral-Form-field coral-Multifield']/coral-multifield-item[8]/coral-multifield-item-content/div/div[2]/textarea")
	WebElement Description8;
	
	@FindBy(xpath = ".//*[@class='coral-Form-field coral-Multifield']/coral-multifield-item[8]/coral-multifield-item-content/div/div[3]/input")
	WebElement LinkTxt8;
	
	@FindBy(xpath = ".//*[@class='coral-Form-field coral-Multifield']/coral-multifield-item[8]/coral-multifield-item-content/div/div[4]/foundation-autocomplete/div/div/input")
	WebElement LinkURL8;
	
	public FeaturedContentComp(WebDriver driver){
		this.driver = driver;
	}
	
	public void ConfigComplete(){
		ConfigDone.click();
	}
	
	public void ClickAddButton(){
		AddButton.click();
	}
	
	public void ClickOpenState(){
		OpenState.click();
	}
	
	public void AccordionOne(){
		SectionTitle.sendKeys("This is a Section Title");
		AccordianTitle1.sendKeys("Make a lemon spiral");
		Description1.sendKeys("This beautiful cocktail garnish is surprisingly simple. All you need is a simple bar tool.");
		LinkTxt1.sendKeys("Read more");
		LinkURL1.sendKeys("http://www.lcbo.com/content/lcbo/en/catalog/spirits/LemonSpiral.html");
	}
	
	public void AccordionTwo(){
		AccordianTitle2.sendKeys("Taste Wine");
		Description2.sendKeys("These four easy steps will help get you started.");
		LinkTxt2.sendKeys("Read more");
		LinkURL2.sendKeys("http://www.lcbo.com/content/lcbo/en/catalog/wine/how-to-taste-wine.html");
	}
	
	public void AccordionThree(){
		AccordianTitle3.sendKeys("Host a beer tasting");
		Description3.sendKeys("A perfect way to try something new");
		LinkTxt3.sendKeys("Learn more");
		LinkURL3.sendKeys("http://www.lcbo.com/content/lcbo/en/catalog/beer/BeerTasting.html");
	}
	
	public void AccordionFour(){
		AccordianTitle4.sendKeys("Host a beer Dinner");
		Description4.sendKeys("5 ways to keep it fun and fabulous for everyone.");
		LinkTxt4.sendKeys("Learn how");
		LinkURL4.sendKeys("http://www.lcbo.com/content/lcbo/en/catalog/beer/hosting-a-beer-dinner.html");
	}
	
	public void AccordionFive(){
		AccordianTitle5.sendKeys("Host responsibity");
		Description5.sendKeys("Our top tips on being a safety-conscious host when the party rolls around to your house.");
		LinkTxt5.sendKeys("Read more");
		LinkURL5.sendKeys("http://www.lcbo.com/content/lcbo/en/learn/responsible-hosting.html");
	}
	
	public void AccordionSix(){
		AccordianTitle6.sendKeys("Measure spirits");
		Description6.sendKeys("This know-how is essential to good bartending and responsible hosting. Learn it and you'll be rewarded with balanced and delicious cocktails every time.");
		LinkTxt6.sendKeys("Read more");
		LinkURL6.sendKeys("http://www.lcbo.com/content/lcbo/en/learn/responsible-hosting.html");
	}
	
	public void AccordionSeven(){
		AccordianTitle7.sendKeys("Make a simple syrup");
		Description7.sendKeys("This is essential know-how for any bartender, amateur or pro. And don't be intimidated. This is called simple for a reason.");
		LinkTxt7.sendKeys("Read more");
		LinkURL7.sendKeys("http://www.lcbo.com/content/lcbo/en/learn/responsible-hosting.html");
	}
	
	public void AccordionEight(){
		AccordianTitle8.sendKeys("Be a great guest");
		Description8.sendKeys("The good news about dinner party etiquette is that the most important rules have nothing to do with which fork you start with.");
		LinkTxt8.sendKeys("Read more");
		LinkURL8.sendKeys("http://www.lcbo.com/content/lcbo/en/learn/responsible-hosting.html");
	}

}
