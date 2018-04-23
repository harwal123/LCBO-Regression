package publishPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class PublishArticleFeature {
	WebDriver driver;
	
	@FindBy(xpath = ".//div[@class='main']/div[5]/div/div/div/div[1]")
	WebElement OneComponentTitle;
	
	@FindBy(xpath = ".//div[@class='main']/div[5]/div/div/div/div[2]/div[2]/div[1]")
	WebElement OneArticleTitle;
	
	@FindBy(xpath = ".//div[@class='main']/div[5]/div/div/div/div[2]/div[2]/div[2]")
	WebElement OneArticleDescription;
	
	@FindBy(xpath = ".//div[@class='main']/div[5]/div/div/div/div[2]/div[2]/div[3]/a")
	WebElement OneArticleLinkTxt;
	
	@FindBy(xpath = ".//div[@class='main']/div[6]/div/div/div/div[1]")
	WebElement TwoComponentTitle;
	
	@FindBy(xpath = ".//div[@class='main']/div[6]/div/div/div/div[2]/div[2]/div[1]")
	WebElement TwoArticleTitle;
	
	@FindBy(xpath = ".//div[@class='main']/div[6]/div/div/div/div[2]/div[2]/div[2]")
	WebElement TwoArticleDescription;
	
	@FindBy(xpath = ".//div[@class='main']/div[6]/div/div/div/div[2]/div[2]/div[3]/a")
	WebElement TwoArticleLinkTxt;
	
	@FindBy(xpath = ".//div[@class='main']/div[7]/div/div/div/div[1]")
	WebElement ThreeComponentTitle;
	
	@FindBy(xpath = ".//div[@class='main']/div[7]/div/div/div/div[2]/div[2]/div[1]")
	WebElement ThreeArticleTitle;
	
	@FindBy(xpath = ".//div[@class='main']/div[7]/div/div/div/div[2]/div[2]/div[2]")
	WebElement ThreeArticleDescription;
	
	@FindBy(xpath = ".//div[@class='main']/div[7]/div/div/div/div[2]/div[2]/div[3]/a")
	WebElement ThreeArticleLinkTxt;
	
	@FindBy(xpath = ".//div[@class='main']/div[8]/div/div/div/div[1]")
	WebElement FourComponentTitle;
	
	@FindBy(xpath = ".//div[@class='main']/div[8]/div/div/div/div[2]/div[2]/div[1]")
	WebElement FourArticleTitle;
	
	@FindBy(xpath = ".//div[@class='main']/div[8]/div/div/div/div[2]/div[2]/div[2]")
	WebElement FourArticleDescription;
	
	@FindBy(xpath = ".//div[@class='main']/div[8]/div/div/div/div[2]/div[2]/div[3]/a")
	WebElement FourArticleLinkTxt;
	
	@FindBy(xpath = ".//div[@class='main']/div[9]/div/div/div/div[1]")
	WebElement FiveComponentTitle;
	
	@FindBy(xpath = ".//div[@class='main']/div[9]/div/div/div/div[2]/div[2]/div[1]")
	WebElement FiveArticleTitle;
	
	@FindBy(xpath = ".//div[@class='main']/div[9]/div/div/div/div[2]/div[2]/div[2]")
	WebElement FiveArticleDescription;
	
	@FindBy(xpath = ".//div[@class='main']/div[9]/div/div/div/div[2]/div[2]/div[3]/a")
	WebElement FiveArticleLinkTxt;
	
	public PublishArticleFeature(WebDriver driver){
		this.driver = driver;
	}
	
	public void ArticleFeatureOne(){
		String ExpCompTitle = "Article Feature";
		String ExpArticleTitle = "COCKTAIL OF THE MONTH: WINTER BUCK";
		String ExpDescription = "We've put a twist on the classic whisky and ginger combo with a splash of cranberry and hint of lime. "
				+ "It's the perfect cocktail for a winter gathering!";
		String ExpLinkURL = "Get the receipe";
		Assert.assertEquals(ExpCompTitle, OneComponentTitle.getText());
		Assert.assertEquals(ExpArticleTitle, OneArticleTitle.getText());
		Assert.assertEquals(ExpDescription, OneArticleDescription.getText());
		Assert.assertEquals(ExpLinkURL, OneArticleLinkTxt.getText());
	}
	
	public void ArticleFeatureTwo(){
		String ExpCompTitle2 = "Article Feature";
		String ExpArticleTitle2 = "SHOP AND GET REWARDED";
		String ExpDescription2 = "With hundreds of products on offer, get more AIR MILES® Bonus Miles every time you shop! "
				+ "Check out some of this month's best offers.";
		String ExpLinkURL2 = "Read More";
		Assert.assertEquals(ExpCompTitle2, TwoComponentTitle.getText());
		Assert.assertEquals(ExpArticleTitle2, TwoArticleTitle.getText());
		Assert.assertEquals(ExpDescription2, TwoArticleDescription.getText());
		Assert.assertEquals(ExpLinkURL2, TwoArticleLinkTxt.getText());
	}
	
	public void ArticleFeatureThree(){
		String ExpCompTitle3 = "Article Feature";
		String ExpArticleTitle3 = "ORDER UP A GIFT CARD!";
		String ExpDescription3 = "Give someone the joy of choosing with a gift card. Get free shipping and handling on all online gift "
				+ "card orders until January 28, 2018.";
		String ExpLinkURL3 = "Learn More";
		Assert.assertEquals(ExpCompTitle3, ThreeComponentTitle.getText());
		Assert.assertEquals(ExpArticleTitle3, ThreeArticleTitle.getText());
		Assert.assertEquals(ExpDescription3, ThreeArticleDescription.getText());
		Assert.assertEquals(ExpLinkURL3, ThreeArticleLinkTxt.getText());
	}
	
	public void ArticleFeatureFour(){
		String ExpCompTitle4 = "Article Feature";
		String ExpArticleTitle4 = "COCKTAIL OF THE MONTH: WINTER BUCK";
		String ExpDescription4 = "We've put a twist on the classic whisky and ginger combo with a splash of cranberry and hint of lime. "
				+ "It's the perfect cocktail for a winter gathering!";
		String ExpLinkURL4 = "Read More";
		Assert.assertEquals(ExpCompTitle4, FourComponentTitle.getText());
		Assert.assertEquals(ExpArticleTitle4, FourArticleTitle.getText());
		Assert.assertEquals(ExpDescription4, FourArticleDescription.getText());
		Assert.assertEquals(ExpLinkURL4, FourArticleLinkTxt.getText());
	}
	
	public void ArticleFeatureFive(){
		String ExpCompTitle5 = "Article Feature";
		String ExpArticleTitle5 = "SHOP AND GET REWARDED";
		String ExpDescription5 = "With hundreds of products on offer, get more AIR MILES® Bonus Miles every time you shop! Check out "
				+ "some of this month's best offers.";
		String ExpLinkURL4 = "Read More";
		Assert.assertEquals(ExpCompTitle5, FiveComponentTitle.getText());
		Assert.assertEquals(ExpArticleTitle5, FiveArticleTitle.getText());
		Assert.assertEquals(ExpDescription5, FiveArticleDescription.getText());
		Assert.assertEquals(ExpLinkURL4, FiveArticleLinkTxt.getText());
	}

}
