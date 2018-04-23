package publishPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class PublishEnhancedContent {
WebDriver driver;
	
	@FindBy(xpath = ".//div[@class='main']/div[5]/div/div/div[1]")
	WebElement ComponentTitle;
	
	@FindBy(xpath = ".//div[@class='main']/div[5]/div/div/div[3]")
	WebElement SubTitle;
	
	@FindBy(xpath = ".//div[@class='main']/div[5]/div/div/div[4]")
	WebElement RTE;
	
	@FindBy(xpath = ".//div[@class='main']/div[5]/div/div/span")
	WebElement LinText;
	
	public PublishEnhancedContent(WebDriver driver){
		this.driver = driver;
	}
	
	public void EnhancedContentValidation(){
		String ExpCompTitle = "United Kingdom";
		String ExpSubTitle = "This impressive English ale offers";
		String ExpRTE = "With its light bitterness and fresh tropical fruit flavours, this Belgian-style ale is a great match with "
				+ "Thai food or sharp cheddar.";
		String ExpLinkText = "Read more";
		Assert.assertEquals(ExpCompTitle, ComponentTitle.getText());
		Assert.assertEquals(ExpSubTitle, SubTitle.getText());
		Assert.assertEquals(ExpRTE, RTE.getText());
		Assert.assertEquals(ExpLinkText, LinText.getText());
	}

}
