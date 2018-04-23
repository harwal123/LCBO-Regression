package migrationTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import migrationPages.EditorialLayout1Page;

public class EditorialLayout1 {
	
	WebDriver driver;
	
	@BeforeMethod
	public void StartBrowser(){
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Test(priority = 0)
	public void SummerCraftBeer(){
		driver.get("http://10.150.18.140/content/lcbo/en/catalog/beer/SummerCraftBeer.html");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		EditorialLayout1Page page = PageFactory.initElements(driver, EditorialLayout1Page.class);
		page.HeroImageText1("Craft Summer Collection", "LIMITED EDITION SUMMER BEERS", "Savour the summer with our limited-time "
				+ "Summer Craft Beer Collection. We’ve stocked up on some of the finest craft beers from all around the world, "
				+ "thoughtfully-brewed by the world’s best brewmasters. Those with a thirst for adventure will enjoy savouring styles "
				+ "like wheat beers, sours, flavoured ales and more. This collection will be available in select LCBO stores, while supplies "
				+ "last. Don’t miss out!");
		page.HeroImageText2("Quebec", "LE TROU DU DIABLE SAISON DU TRACTEUR", "From an innovative Quebec brewery comes this farmhouse-style "
				+ "brew - loaded with passion fruit, citrus and spicy flavours.\n\nMedium & Fruity\n\n365742 375 mL $3.55");
		page.HeroImageText3("Quebec", "LES TROIS MOUSQUETAIRES GOSE", "Brewed using the sour mash technique and salty water, this unique "
				+ "Quebec brew is flavoured with coriander seeds.\n\nMedium & Fruity\n\n365759 375 mL $3.60");
		page.HeroImageText4("USA", "PYRAMID OUTBURST IMPERIAL IPA", "The Chinook hop gives this Imperial IPA its refreshingly bitter taste. "
				+ "Its massive hop flavour is balanced by a sweet malty backbone.\n\nMedium & Hoppy\n\n365692 650 mL $4.95");
		page.HeroImageText5("USA", "SOUTHERN TIER COMPASS", "With its light bitterness and fresh tropical fruit flavours, this Belgian-style "
				+ "ale is a great match with Thai food or sharp cheddar.\n\nMedium & Hoppy\n\n365700 650 mL $9.25");
		page.HeroImageText6("Belgium", "ST. LOUIS GUEUZE FOND TRADITION SOUR BELGIUM ALE", "Imagine the perfect balance between sweet, sour "
				+ "and slightly bitter. This Lambic ale delivers it with notes of citrus, strawberry and caramel.\n\nMedium & Fruity\n\n371880 375 mL $4.35");
		page.HeroImageText7("United Kingdom", "THORNBRIDGE CHIRON AMERICAN STYLE PALE ALE", "This impressive English ale offers hints of "
				+ "apricots and tangerine leading to a dry and bitter finish. Beautifully balanaced.\n\nMedium & Hoppy\n\n365676 500 mL $5.00");
		page.SocailShare();
	}
	
	@Test(priority = 1)
	public void firesidesippers(){
		driver.get("http://10.150.18.140/content/lcbo/en/catalog/spirits/fireside-sippers.html");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		EditorialLayout1Page page1 = PageFactory.initElements(driver, EditorialLayout1Page.class);
		page1.RTEContent("FIRESIDE SIPPERS", "When the snow starts to fall, start a fire and get cozy with these crisp and warming favourites. ");
		page1.HeroImageText2("Ice Dancer", "", "Give your glass a swirl and watch the pros skate for the podium with this rink-inspired vodka "
				+ "cocktail. It’s icy, clear, and ultimately tastes like victory!");
		page1.HeroImageText3("Snowboard Mountain", "", "Show your edgy side this winter with a refreshing tequila cocktail that’s inspired by "
				+ "snowboarding culture. It’s the epitome of winter cool.");
		page1.HeroImageText4("Mulled Cider Punch", "", "Forget the frost. All this warm, spiced-rum punch needs is a good movie and a cozy "
				+ "blanket to make it a delightful winter occasion.");
		page1.HeroImageText5("Chocolate Snowshake", "", "Relaxing with good friends by a roaring fire is made just a little sweeter with this "
				+ "decadent, after-dinner whisky and schnapps drink.");
		page1.SocailShare1();
	}
	
	@Test(priority = 2)
	public void BestInCanada(){
		driver.get("http://10.150.18.140/content/lcbo/en/homepage/best-in-canada.html");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		EditorialLayout1Page page2 = PageFactory.initElements(driver, EditorialLayout1Page.class);
		page2.RTEContent("BEST IN CANADA", "Looking for a special bottle? Just ask one of our LCBO in-house product consultants. "
				+ "They’ll help you to find whatever you need and discover new favourites. In recognition of Canada’s 150th anniversary, "
				+ "we asked four of them for their top homegrown picks.");
		page2.HeroImageText2("Brickworks Ciderhouse Queen Street 501", "JAMES, PRODUCT CONSULTANT, 275 RIDEAU ST., OTTAWA", "“Cider is very "
				+ "popular in Ontario, and this is my top pick. It’s so fresh and lively, and it has this crisp character, which makes it a "
				+ "great partner for grilled burgers, sausages or ribs. I’ll be sipping this with friends as we raise a glass to Confederation.”");
		page2.HeroImageText3("Henry of Pelham Cuvée Catharine Rosé Brut", "JENNIFER, PRODUCT CONSULTANT, 120 RIOCAN AVE., BARRHAVEN", "”This is "
				+ "such a fantastic value, and it's my favourite Canadian sparkling wine. Dry, with a fine mousse and lively bubbles, it’s rich "
				+ "with notes of brioche and citrus. Like Champagne, it’s very food friendly, and it’s delicious in cocktails, especially with "
				+ "rose gin.”");
		page2.HeroImageText4("Thirty Bench Riesling", "LESLIE, PRODUCT CONSULTANT, 10 SCRIVENER SQ., TORONTO", "“What can I say — I love this "
				+ "wine! Made from handpicked grapes, it’s off-dry with intense green apple, citrus and balsam notes, which gives it an unique "
				+ "character. I love it with pad Thai or mussels with red chili flakes.”");
		page2.HeroImageText5("Ungava Premium", "JERRY, PRODUCT CONSULTANT, 125 MUSKOKA RD., BRACEBRIDGE", "“This gin comes from the Ungava "
				+ "Peninsula in northern Quebec. It’s blended with botanicals that only grow in this part of the world. I love its delicate "
				+ "flavour neat or over ice. It’s also amazing in a classic martini.”");
	}
	
	@AfterMethod
	public void CloseBrowser(){
		driver.quit();
	}

}
