package aemPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class FooterComponent {
	
	WebDriver driver;
	String PWindow;
	
	@FindBy(xpath = ".//*[@id='OverlayWrapper']/div[4]/div[1]")
	WebElement DragFooterComponent;

	@FindBy(xpath = ".//*[@id='EditableToolbar']/button[1]")
	WebElement AddFooterComponent;

	@FindBy(xpath = ".//*[@class='coral-SelectList-group']/coral-selectlist-item")
	WebElement FooterSelection;
	
	@FindBy(xpath = ".//*[@class='cq-dialog-actions u-coral-pullRight']/button[4]")
	WebElement ConfigAdd;
	
	@FindBy(xpath = ".//*[@id='coral-5']/div/div[1]/span[1]/select")
	static WebElement NumberOfColumns;
	
	@FindBy(name = "./backToTop")
	WebElement BackToTopText;
	
	@FindBy(name = "./labelEnglish")
	WebElement EnglishText;
	
	@FindBy(name = "./labelFrench")
	WebElement FrenchText;
	
	@FindBy(name = "./copyRight")
	WebElement CopyRightText;
	
	@FindBy(xpath = ".//*[@class='coral-TabPanel-navigation']/a[1]")
	WebElement FooterColumn;
	
	@FindBy(xpath = ".//*[@class='coral-TabPanel-navigation']/a[2]")
	WebElement ColumnOne;
	
	@FindBy(xpath = ".//*[@class='coral-TabPanel-navigation']/a[3]")
	WebElement ColumnTwo;
	
	@FindBy(xpath = ".//*[@class='coral-TabPanel-navigation']/a[4]")
	WebElement ColumnThree;
	
	@FindBy(xpath = ".//*[@class='coral-TabPanel-navigation']/a[5]")
	WebElement ColumnFour;
	
	@FindBy(xpath = ".//*[@class='coral-TabPanel-navigation']/a[6]")
	WebElement ColumnFive;
	
	@FindBy(xpath = ".//*[@class='coral-TabPanel-navigation']/a[7]")
	WebElement ColumnSix;
	
	//Columns Link text and URL
	@FindBy(xpath = ".//*[@class='coral-Form-field coral-Multifield']/coral-multifield-item[1]/coral-multifield-item-content/div/div[1]/input")
	WebElement ColumnLinkText1;
	
	@FindBy(xpath = ".//*[@class='coral-Form-field coral-Multifield']/coral-multifield-item[1]/coral-multifield-item-content/div/div[2]/foundation-autocomplete/div/div/input")
	WebElement ColumnLinkURL1;
	
	@FindBy(xpath = ".//*[@class='coral-Form-field coral-Multifield']/coral-multifield-item[1]/coral-multifield-item-content/div/coral-checkbox/span")
	WebElement OpenNewTabCheckBox1;
	
	@FindBy(xpath = ".//*[@class='coral-Form-field coral-Multifield']/coral-multifield-item[2]/coral-multifield-item-content/div/div[1]/input")
	WebElement ColumnLinkText2;
	
	@FindBy(xpath = ".//*[@class='coral-Form-field coral-Multifield']/coral-multifield-item[2]/coral-multifield-item-content/div/div[2]/foundation-autocomplete/div/div/input")
	WebElement ColumnLinkURL2;
	
	@FindBy(xpath = ".//*[@class='coral-Form-field coral-Multifield']/coral-multifield-item[2]/coral-multifield-item-content/div/coral-checkbox/span")
	WebElement OpenNewTabCheckBox2;
	
	@FindBy(xpath = ".//*[@class='coral-Form-field coral-Multifield']/coral-multifield-item[3]/coral-multifield-item-content/div/div[1]/input")
	WebElement ColumnLinkText3;
	
	@FindBy(xpath = ".//*[@class='coral-Form-field coral-Multifield']/coral-multifield-item[3]/coral-multifield-item-content/div/div[2]/foundation-autocomplete/div/div/input")
	WebElement ColumnLinkURL3;
	
	@FindBy(xpath = ".//*[@class='coral-Form-field coral-Multifield']/coral-multifield-item[3]/coral-multifield-item-content/div/coral-checkbox/span")
	WebElement OpenNewTabCheckBox3;
	
	@FindBy(xpath = ".//*[@class='coral-Form-field coral-Multifield']/coral-multifield-item[4]/coral-multifield-item-content/div/div[1]/input")
	WebElement ColumnLinkText4;
	
	@FindBy(xpath = ".//*[@class='coral-Form-field coral-Multifield']/coral-multifield-item[4]/coral-multifield-item-content/div/div[2]/foundation-autocomplete/div/div/input")
	WebElement ColumnLinkURL4;
	
	@FindBy(xpath = ".//*[@class='coral-Form-field coral-Multifield']/coral-multifield-item[4]/coral-multifield-item-content/div/coral-checkbox/span")
	WebElement OpenNewTabCheckBox4;
	
	@FindBy(xpath = ".//*[@class='coral-Form-field coral-Multifield']/coral-multifield-item[5]/coral-multifield-item-content/div/div[1]/input")
	WebElement ColumnLinkText5;
	
	@FindBy(xpath = ".//*[@class='coral-Form-field coral-Multifield']/coral-multifield-item[5]/coral-multifield-item-content/div/div[2]/foundation-autocomplete/div/div/input")
	WebElement ColumnLinkURL5;
	
	@FindBy(xpath = ".//*[@class='coral-Form-field coral-Multifield']/coral-multifield-item[5]/coral-multifield-item-content/div/coral-checkbox/span")
	WebElement OpenNewTabCheckBox5;
	
	@FindBy(xpath = ".//*[@class='coral-Form-field coral-Multifield']/coral-multifield-item[6]/coral-multifield-item-content/div/div[1]/input")
	WebElement ColumnLinkText6;
	
	@FindBy(xpath = ".//*[@class='coral-Form-field coral-Multifield']/coral-multifield-item[6]/coral-multifield-item-content/div/div[2]/foundation-autocomplete/div/div/input")
	WebElement ColumnLinkURL6;
	
	@FindBy(xpath = ".//*[@class='coral-Form-field coral-Multifield']/coral-multifield-item[6]/coral-multifield-item-content/div/coral-checkbox/span")
	WebElement OpenNewTabCheckBox6;
	
	//Column One
	@FindBy(name = "./one/columnHeading")
	WebElement ColumnOneHeading;
	
	@FindBy(xpath = ".//*[@class='coral-TabPanel-content u-coral-noPadding u-coral-noMargin']/section[2]/div/div[2]/coral-multifield/button")
	WebElement ColumnOneAdd;
	
	//Column Two
	@FindBy(name = "./two/columnHeading")
	WebElement ColumnTwoHeading;
	
	@FindBy(xpath = ".//*[@class='coral-TabPanel-content u-coral-noPadding u-coral-noMargin']/section[3]/div/div[2]/coral-multifield/button")
	WebElement ColumnTwoAdd;
	
	@FindBy(xpath = ".//*[@class='cq-dialog-content coral-TabPanel coral-TabPanel--large u-coral-noPadding u-coral-noMargin']/div/section[3]/div/div[2]/coral-multifield/coral-multifield-item[1]/coral-multifield-item-content/div/div[1]/input")
	WebElement Column2LinkText1;
	
	@FindBy(xpath = ".//*[@class='cq-dialog-content coral-TabPanel coral-TabPanel--large u-coral-noPadding u-coral-noMargin']/div/section[3]/div/div[2]/coral-multifield/coral-multifield-item[1]/coral-multifield-item-content/div/div[2]/foundation-autocomplete/div/div/input")
	WebElement Column2LinkURL1;
	
	@FindBy(xpath = ".//*[@class='cq-dialog-content coral-TabPanel coral-TabPanel--large u-coral-noPadding u-coral-noMargin']/div/section[3]/div/div[2]/coral-multifield/coral-multifield-item[2]/coral-multifield-item-content/div/div[1]/input")
	WebElement Column2LinkText2;
	
	@FindBy(xpath = ".//*[@class='cq-dialog-content coral-TabPanel coral-TabPanel--large u-coral-noPadding u-coral-noMargin']/div/section[3]/div/div[2]/coral-multifield/coral-multifield-item[2]/coral-multifield-item-content/div/div[2]/foundation-autocomplete/div/div/input")
	WebElement Column2LinkURL2;
	
	@FindBy(xpath = ".//*[@class='cq-dialog-content coral-TabPanel coral-TabPanel--large u-coral-noPadding u-coral-noMargin']/div/section[3]/div/div[2]/coral-multifield/coral-multifield-item[3]/coral-multifield-item-content/div/div[1]/input")
	WebElement Column2LinkText3;
	
	@FindBy(xpath = ".//*[@class='cq-dialog-content coral-TabPanel coral-TabPanel--large u-coral-noPadding u-coral-noMargin']/div/section[3]/div/div[2]/coral-multifield/coral-multifield-item[3]/coral-multifield-item-content/div/div[2]/foundation-autocomplete/div/div/input")
	WebElement Column2LinkURL3;
	
	@FindBy(xpath = ".//*[@class='cq-dialog-content coral-TabPanel coral-TabPanel--large u-coral-noPadding u-coral-noMargin']/div/section[3]/div/div[2]/coral-multifield/coral-multifield-item[4]/coral-multifield-item-content/div/div[1]/input")
	WebElement Column2LinkText4;
	
	@FindBy(xpath = ".//*[@class='cq-dialog-content coral-TabPanel coral-TabPanel--large u-coral-noPadding u-coral-noMargin']/div/section[3]/div/div[2]/coral-multifield/coral-multifield-item[4]/coral-multifield-item-content/div/div[2]/foundation-autocomplete/div/div/input")
	WebElement Column2LinkURL4;
	
	//Column Three
	@FindBy(name = "./three/columnHeading")
	WebElement ColumnThreeHeading;
	
	@FindBy(xpath = ".//*[@class='coral-TabPanel-content u-coral-noPadding u-coral-noMargin']/section[4]/div/div[2]/coral-multifield/button")
	WebElement ColumnThreeAdd;
	
	@FindBy(xpath = ".//*[@class='cq-dialog-content coral-TabPanel coral-TabPanel--large u-coral-noPadding u-coral-noMargin']/div/section[4]/div/div[2]/coral-multifield/coral-multifield-item[1]/coral-multifield-item-content/div/div[1]/input")
	WebElement Column3LinkText1;
	
	@FindBy(xpath = ".//*[@class='cq-dialog-content coral-TabPanel coral-TabPanel--large u-coral-noPadding u-coral-noMargin']/div/section[4]/div/div[2]/coral-multifield/coral-multifield-item[1]/coral-multifield-item-content/div/div[2]/foundation-autocomplete/div/div/input")
	WebElement Column3LinkURL1;
	
	@FindBy(xpath = ".//*[@class='cq-dialog-content coral-TabPanel coral-TabPanel--large u-coral-noPadding u-coral-noMargin']/div/section[4]/div/div[2]/coral-multifield/coral-multifield-item[2]/coral-multifield-item-content/div/div[1]/input")
	WebElement Column3LinkText2;
	
	@FindBy(xpath = ".//*[@class='cq-dialog-content coral-TabPanel coral-TabPanel--large u-coral-noPadding u-coral-noMargin']/div/section[4]/div/div[2]/coral-multifield/coral-multifield-item[2]/coral-multifield-item-content/div/div[2]/foundation-autocomplete/div/div/input")
	WebElement Column3LinkURL2;
	
	@FindBy(xpath = ".//*[@class='cq-dialog-content coral-TabPanel coral-TabPanel--large u-coral-noPadding u-coral-noMargin']/div/section[4]/div/div[2]/coral-multifield/coral-multifield-item[3]/coral-multifield-item-content/div/div[1]/input")
	WebElement Column3LinkText3;
	
	@FindBy(xpath = ".//*[@class='cq-dialog-content coral-TabPanel coral-TabPanel--large u-coral-noPadding u-coral-noMargin']/div/section[4]/div/div[2]/coral-multifield/coral-multifield-item[3]/coral-multifield-item-content/div/div[2]/foundation-autocomplete/div/div/input")
	WebElement Column3LinkURL3;
	
	//Column Four
	@FindBy(name = "./four/columnHeading")
	WebElement ColumnfourHeading;
	
	@FindBy(xpath = ".//*[@class='coral-TabPanel-content u-coral-noPadding u-coral-noMargin']/section[5]/div/div[2]/coral-multifield/button")
	WebElement ColumnFourAdd;
	
	@FindBy(xpath = ".//*[@class='cq-dialog-content coral-TabPanel coral-TabPanel--large u-coral-noPadding u-coral-noMargin']/div/section[5]/div/div[2]/coral-multifield/coral-multifield-item[1]/coral-multifield-item-content/div/div[1]/input")
	WebElement Column4LinkText1;
	
	@FindBy(xpath = ".//*[@class='cq-dialog-content coral-TabPanel coral-TabPanel--large u-coral-noPadding u-coral-noMargin']/div/section[5]/div/div[2]/coral-multifield/coral-multifield-item[1]/coral-multifield-item-content/div/div[2]/foundation-autocomplete/div/div/input")
	WebElement Column4LinkURL1;
	
	@FindBy(xpath = ".//*[@class='cq-dialog-content coral-TabPanel coral-TabPanel--large u-coral-noPadding u-coral-noMargin']/div/section[5]/div/div[2]/coral-multifield/coral-multifield-item[2]/coral-multifield-item-content/div/div[1]/input")
	WebElement Column4LinkText2;
	
	@FindBy(xpath = ".//*[@class='cq-dialog-content coral-TabPanel coral-TabPanel--large u-coral-noPadding u-coral-noMargin']/div/section[5]/div/div[2]/coral-multifield/coral-multifield-item[2]/coral-multifield-item-content/div/div[2]/foundation-autocomplete/div/div/input")
	WebElement Column4LinkURL2;
	
	@FindBy(xpath = ".//*[@class='cq-dialog-content coral-TabPanel coral-TabPanel--large u-coral-noPadding u-coral-noMargin']/div/section[5]/div/div[2]/coral-multifield/coral-multifield-item[3]/coral-multifield-item-content/div/div[1]/input")
	WebElement Column4LinkText3;
	
	@FindBy(xpath = ".//*[@class='cq-dialog-content coral-TabPanel coral-TabPanel--large u-coral-noPadding u-coral-noMargin']/div/section[5]/div/div[2]/coral-multifield/coral-multifield-item[3]/coral-multifield-item-content/div/div[2]/foundation-autocomplete/div/div/input")
	WebElement Column4LinkURL3;
	
	@FindBy(xpath = ".//*[@class='cq-dialog-content coral-TabPanel coral-TabPanel--large u-coral-noPadding u-coral-noMargin']/div/section[5]/div/div[2]/coral-multifield/coral-multifield-item[4]/coral-multifield-item-content/div/div[1]/input")
	WebElement Column4LinkText4;
	
	@FindBy(xpath = ".//*[@class='cq-dialog-content coral-TabPanel coral-TabPanel--large u-coral-noPadding u-coral-noMargin']/div/section[5]/div/div[2]/coral-multifield/coral-multifield-item[4]/coral-multifield-item-content/div/div[2]/foundation-autocomplete/div/div/input")
	WebElement Column4LinkURL4;
	
	//Column Five
	@FindBy(name = "./five/columnHeading")
	WebElement ColumnFiveHeading;
	
	@FindBy(xpath = ".//*[@class='coral-TabPanel-content u-coral-noPadding u-coral-noMargin']/section[6]/div/div[2]/coral-multifield/button")
	WebElement ColumnFiveAdd;
	
	//Column Six
	@FindBy(name = "./six/columnHeading")
	WebElement ColumnSixHeading;
	
	@FindBy(xpath = ".//*[@class='coral-TabPanel-content u-coral-noPadding u-coral-noMargin']/section[7]/div/div[2]/coral-multifield/button")
	WebElement ColumnSixAdd;

	public FooterComponent(WebDriver driver) {
		this.driver = driver;
	}
	
	public static void FooterColumnSelection(String ColumnValue){
		Select Column = new Select(NumberOfColumns);
		Column.selectByValue(ColumnValue);
	}
	
	public void SelectFooterComponent() throws InterruptedException {
		String ParentWindow;
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}
		Thread.sleep(2000);
		DragFooterComponent.click();
		AddFooterComponent.click();
		ParentWindow = driver.getWindowHandle();
		for (String ChildWindow : driver.getWindowHandles()) {
			driver.switchTo().window(ChildWindow);
		}

		FooterSelection.click();
		driver.switchTo().window(ParentWindow);
		Thread.sleep(2000);

	}
	
	public void ColumnOneConfig(String EnterColumnOneHeading, String LinkText1, String LinkURL1, String LinkText2, String LinkURL2, 
			String LinkText3, String LinkURL3, String LinkText4, String LinkURL4) throws InterruptedException{
		
		DragFooterComponent.click();
		AddFooterComponent.click();
		PWindow = driver.getWindowHandle();
		for (String ChildWindow : driver.getWindowHandles()) {
			driver.switchTo().window(ChildWindow);
		}
		Thread.sleep(2000);
		FooterComponent.FooterColumnSelection("1");
		ColumnOne.click();
		ColumnOneHeading.sendKeys(EnterColumnOneHeading);
		ColumnOneAdd.click();
		ColumnLinkText1.sendKeys(LinkText1);
		ColumnLinkURL1.sendKeys(LinkURL1);
		//OpenNewTabCheckBox1.click();
		ColumnOneAdd.click();
		ColumnLinkText2.sendKeys(LinkText2);
		ColumnLinkURL2.sendKeys(LinkURL2);
		ColumnOneAdd.click();
		ColumnLinkText3.sendKeys(LinkText3);
		ColumnLinkURL3.sendKeys(LinkURL3);
		//OpenNewTabCheckBox3.click();
		ColumnOneAdd.click();
		ColumnLinkText4.sendKeys(LinkText4);
		ColumnLinkURL4.sendKeys(LinkURL4);
	}
	
	public void ColumnTwoConfig(String EnterColumnTwoHeading, String LinkText1, String LinkURL1, String LinkText2, String LinkURL2, 
			String LinkText3, String LinkURL3, String LinkText4, String LinkURL4){
		FooterColumn.click();
		FooterComponent.FooterColumnSelection("2");
		ColumnTwo.click();
		ColumnTwoHeading.sendKeys(EnterColumnTwoHeading);
		ColumnTwoAdd.click();
		Column2LinkText1.sendKeys(LinkText1);
		Column2LinkURL1.sendKeys(LinkURL2);
		ColumnTwoAdd.click();
		Column2LinkText2.sendKeys(LinkText2);
		Column2LinkURL2.sendKeys(LinkURL2);
		ColumnTwoAdd.click();
		Column2LinkText3.sendKeys(LinkText3);
		Column2LinkURL3.sendKeys(LinkURL3);
		//OpenNewTabCheckBox3.click();
		ColumnTwoAdd.click();
		Column2LinkText4.sendKeys(LinkText4);
		Column2LinkURL4.sendKeys(LinkURL4);
		
	}
	
	public void ColumnThreeConfig(String EnterColumnThreeHeading, String LinkText1, String LinkOneURL, String LinkText2, String LinkURL2,
			String LinkText3, String LinkURL3){
		FooterColumn.click();
		FooterComponent.FooterColumnSelection("3");
		ColumnThree.click();
		ColumnThreeHeading.sendKeys(EnterColumnThreeHeading);
		ColumnThreeAdd.click();
		Column3LinkText1.sendKeys(LinkText1);
		Column3LinkURL1.sendKeys(LinkOneURL);
		ColumnThreeAdd.click();
		Column3LinkText2.sendKeys(LinkText2);
		Column3LinkURL2.sendKeys(LinkURL2);
		ColumnThreeAdd.click();
		Column3LinkText3.sendKeys(LinkText3);
		Column3LinkURL3.sendKeys(LinkURL3);
	}
	
	public void ColumnFourConfig(String EnterColumnFourHeading, String LinkText1, String LinkOneURL, String LinkText2, String LinkURL2,
			String LinkText3, String LinkURL3, String LinkText4, String LinkURL4){
		FooterColumn.click();
		FooterComponent.FooterColumnSelection("4");
		ColumnFour.click();
		ColumnfourHeading.sendKeys(EnterColumnFourHeading);
		ColumnFourAdd.click();
		Column4LinkText1.sendKeys(LinkText1);
		Column4LinkURL1.sendKeys(LinkOneURL);
		ColumnFourAdd.click();
		Column4LinkText2.sendKeys(LinkText2);
		Column4LinkURL2.sendKeys(LinkURL2);
		ColumnFourAdd.click();
		Column4LinkText3.sendKeys(LinkText3);
		Column4LinkURL3.sendKeys(LinkURL3);
		ColumnFourAdd.click();
		Column4LinkText4.sendKeys(LinkText4);
		Column4LinkURL4.sendKeys(LinkURL4);
	}
	
	public void FooterMainConfig(String BckToTpText, String EnText, String FnText, String CpRgtText){
		FooterColumn.click();
		BackToTopText.sendKeys(BckToTpText);
		EnglishText.sendKeys(EnText);
		FrenchText.sendKeys(FnText);
		CopyRightText.sendKeys(CpRgtText);
	}
	
	public void ConfigFooter(){
		ConfigAdd.click();
		driver.switchTo().window(PWindow);
	}


}
