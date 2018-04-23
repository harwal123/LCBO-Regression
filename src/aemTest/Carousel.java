package aemTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import aemPages.CarouselComp;
import aemPages.Template;
import helper.Browser;
import helper.DragAndDropComponent;
import helper.Publish;

public class Carousel {
WebDriver driver;
	
	@BeforeClass
	public void StartBrowser(){
		driver = Browser.StartBrowser("chrome");
	}
	
	@Test(priority = 0)
	public void CreateNewTemplate() throws InterruptedException{
		Template NewTemplate = PageFactory.initElements(driver, Template.class);
		NewTemplate.NewTemplate("Carousel");
	}
	
	@Test(priority = 1)
	public void CarouselSide1() throws InterruptedException{
		CarouselComp comp = PageFactory.initElements(driver, CarouselComp.class);
		comp.OpenImageProperties();
		Thread.sleep(3000);
		DragAndDropComponent Comp = PageFactory.initElements(driver, DragAndDropComponent.class);
		Comp.DragAndDrop("Carousel");
		comp.CarouselConfig("1");
		comp.SlideOne();
		comp.SearchAsset("1708-FallForCraft-0.0-hpcarousel-1-DESK");
		comp.DCarouselOneImage();
		comp.ConfigComplete();
	}
	
	@Test(priority = 2)
	public void CarouselSide2() throws InterruptedException{
		DragAndDropComponent Comp = PageFactory.initElements(driver, DragAndDropComponent.class);
		Comp.DragAndDrop2("Carousel");
		CarouselComp comp = PageFactory.initElements(driver, CarouselComp.class);
		comp.CarouselConfig("2");
		comp.SlideOne();
		comp.SearchAsset("1708-FallForCraft-0.0-hpcarousel-1-DESK");
		comp.DCarouselOneImage();
		comp.SlideTwo();
		comp.SearchAsset("1408-Whisky-0.0-articlefeature-1-DESK");
		comp.DCarouselTwoImage();
		comp.ConfigComplete();
	}
	
	@Test(priority = 3)
	public void CarouselSide3() throws InterruptedException{
		DragAndDropComponent Comp = PageFactory.initElements(driver, DragAndDropComponent.class);
		Comp.DragAndDrop3("Carousel");
		CarouselComp comp = PageFactory.initElements(driver, CarouselComp.class);
		comp.CarouselConfig("3");
		comp.SlideOne();
		comp.SearchAsset("1708-FallForCraft-0.0-hpcarousel-1-DESK");
		comp.DCarouselOneImage();
		comp.SlideTwo();
		comp.SearchAsset("1408-Whisky-0.0-articlefeature-1-DESK");
		comp.DCarouselTwoImage();
		comp.SlideThree();
		comp.SearchAsset("1407-0.0-homecarousel-5-DESK");
		comp.DCarouselThreeImage();
		comp.ConfigComplete();
	}
	
	@Test(priority = 4)
	public void CarouselSide4() throws InterruptedException{
		DragAndDropComponent Comp = PageFactory.initElements(driver, DragAndDropComponent.class);
		Comp.DragAndDrop4("Carousel");
		CarouselComp comp = PageFactory.initElements(driver, CarouselComp.class);
		comp.CarouselConfig("4");
		comp.SlideOne();
		comp.SearchAsset("1708-FallForCraft-0.0-hpcarousel-1-DESK");
		comp.DCarouselOneImage();
		comp.SlideTwo();
		comp.SearchAsset("1408-Whisky-0.0-articlefeature-1-DESK");
		comp.DCarouselTwoImage();
		comp.SlideThree();
		comp.SearchAsset("1407-0.0-homecarousel-5-DESK");
		comp.DCarouselThreeImage();
		comp.SlideFour();
		comp.SearchAsset("1501-StartFresh-0.0-hpcarousel-1-DESK");
		comp.DCarouselFourImage();
		comp.ConfigComplete();
	}
	
	@Test(priority = 5)
	public void CarouselSide5() throws InterruptedException{
		DragAndDropComponent Comp = PageFactory.initElements(driver, DragAndDropComponent.class);
		Comp.DragAndDrop5("Carousel");
		CarouselComp comp = PageFactory.initElements(driver, CarouselComp.class);
		comp.CarouselConfig("5");
		comp.SlideOne();
		comp.SearchAsset("1708-FallForCraft-0.0-hpcarousel-1-DESK");
		comp.DCarouselOneImage();
		comp.SlideTwo();
		comp.SearchAsset("1408-Whisky-0.0-articlefeature-1-DESK");
		comp.DCarouselTwoImage();
		comp.SlideThree();
		comp.SearchAsset("1407-0.0-homecarousel-5-DESK");
		comp.DCarouselThreeImage();
		comp.SlideFour();
		comp.SearchAsset("1501-StartFresh-0.0-hpcarousel-1-DESK");
		comp.DCarouselFourImage();
		comp.SlideFive();
		comp.SearchAsset("1602-HelloSpring-hpcarousel-1-DESK");
		comp.DCarouselFiveImage();
		comp.ConfigComplete();
	}
	
	@Test(priority = 6)
	public void CarouselSide6() throws InterruptedException{
		DragAndDropComponent Comp = PageFactory.initElements(driver, DragAndDropComponent.class);
		Comp.DragAndDrop6("Carousel");
		CarouselComp comp = PageFactory.initElements(driver, CarouselComp.class);
		comp.CarouselConfig("6");
		comp.SlideOne();
		comp.SearchAsset("1708-FallForCraft-0.0-hpcarousel-1-DESK");
		comp.DCarouselOneImage();
		comp.SlideTwo();
		comp.SearchAsset("1408-Whisky-0.0-articlefeature-1-DESK");
		comp.DCarouselTwoImage();
		comp.SlideThree();
		comp.SearchAsset("1407-0.0-homecarousel-5-DESK");
		comp.DCarouselThreeImage();
		comp.SlideFour();
		comp.SearchAsset("1501-StartFresh-0.0-hpcarousel-1-DESK");
		comp.DCarouselFourImage();
		comp.SlideFive();
		comp.SearchAsset("1602-HelloSpring-hpcarousel-1-DESK");
		comp.DCarouselFiveImage();
		comp.SlideSix();
		comp.SearchAsset("1501-StartFresh-5.0-lpcarousel-1-DESK-EN");
		comp.DCarouselSixImage();
		comp.ConfigComplete();
	}
	
	@Test(priority = 7)
	public void CarouselSide7() throws InterruptedException{
		DragAndDropComponent Comp = PageFactory.initElements(driver, DragAndDropComponent.class);
		Comp.DragAndDrop7("Carousel");
		CarouselComp comp = PageFactory.initElements(driver, CarouselComp.class);
		comp.CarouselConfig("7");
		comp.SlideOne();
		comp.SearchAsset("1708-FallForCraft-0.0-hpcarousel-1-DESK");
		comp.DCarouselOneImage();
		comp.SlideTwo();
		comp.SearchAsset("1408-Whisky-0.0-articlefeature-1-DESK");
		comp.DCarouselTwoImage();
		comp.SlideThree();
		comp.SearchAsset("1407-0.0-homecarousel-5-DESK");
		comp.DCarouselThreeImage();
		comp.SlideFour();
		comp.SearchAsset("1501-StartFresh-0.0-hpcarousel-1-DESK");
		comp.DCarouselFourImage();
		comp.SlideFive();
		comp.SearchAsset("1602-HelloSpring-hpcarousel-1-DESK");
		comp.DCarouselFiveImage();
		comp.SlideSix();
		comp.SearchAsset("1501-StartFresh-5.0-lpcarousel-1-DESK-EN");
		comp.DCarouselSixImage();
		comp.SlideSeven();
		comp.SearchAsset("ice_wine3");
		comp.DCarouselSevenImage();
		comp.ConfigComplete();
	}
	
	@Test(priority = 8)
	public void CarouselSide8() throws InterruptedException{
		DragAndDropComponent Comp = PageFactory.initElements(driver, DragAndDropComponent.class);
		Comp.DragAndDrop8("Carousel");
		CarouselComp comp = PageFactory.initElements(driver, CarouselComp.class);
		comp.CarouselConfig("8");
		comp.SlideOne();
		comp.SearchAsset("1708-FallForCraft-0.0-hpcarousel-1-DESK");
		comp.DCarouselOneImage();
		comp.SlideTwo();
		comp.SearchAsset("1408-Whisky-0.0-articlefeature-1-DESK");
		comp.DCarouselTwoImage();
		comp.SlideThree();
		comp.SearchAsset("1407-0.0-homecarousel-5-DESK");
		comp.DCarouselThreeImage();
		comp.SlideFour();
		comp.SearchAsset("1501-StartFresh-0.0-hpcarousel-1-DESK");
		comp.DCarouselFourImage();
		comp.SlideFive();
		comp.SearchAsset("1602-HelloSpring-hpcarousel-1-DESK");
		comp.DCarouselFiveImage();
		comp.SlideSix();
		comp.SearchAsset("1501-StartFresh-5.0-lpcarousel-1-DESK-EN");
		comp.DCarouselSixImage();
		comp.SlideSeven();
		comp.SearchAsset("ice_wine3");
		comp.DCarouselSevenImage();
		comp.Slideeight();
		comp.SearchAsset("1407-0.0-homecarousel-5-DESK");
		comp.DCarouselEightImage();
		comp.ConfigComplete();
	}
	
	@Test(priority = 9)
	public void PublishThePage() throws InterruptedException{
		Publish publish = PageFactory.initElements(driver, Publish.class);
		publish.PublishPage();
	}
	
	@AfterClass
	public void CloseBrowser(){
		driver.quit();
	}
	
}
		