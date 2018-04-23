package aemTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import aemPages.FeaturedContentComp;
import aemPages.Template;
import helper.Browser;
import helper.DragAndDropComponent;

public class FeaturedContent {
WebDriver driver;
	
	@BeforeClass
	public void StartBrowser(){
		driver = Browser.StartBrowser("chrome");
	}
	
	@Test(priority = 0)
	public void CreateNewTemplate() throws InterruptedException{
		Template NewTemplate = PageFactory.initElements(driver, Template.class);
		NewTemplate.NewTemplate("FeaturedContent");
	}
	
	@Test(priority = 1)
	public void SectionTitleConfig() throws InterruptedException{
		DragAndDropComponent Comp = PageFactory.initElements(driver, DragAndDropComponent.class);
		Comp.DragAndDrop("Featured Content");
		FeaturedContentComp comp = PageFactory.initElements(driver, FeaturedContentComp.class);
		comp.ClickAddButton();
		comp.AccordionOne();
		comp.ClickAddButton();
		comp.AccordionTwo();
		comp.ClickAddButton();
		comp.AccordionThree();
		comp.ClickAddButton();
		comp.AccordionFour();
		comp.ClickAddButton();
		comp.AccordionFive();
		comp.ClickAddButton();
		comp.AccordionSix();
		comp.ClickAddButton();
		comp.AccordionSeven();
		comp.ClickAddButton();
		comp.AccordionEight();
		comp.ConfigComplete();
	}
	
	@Test(priority = 2)
	public void SectionTitleConfigOpenState() throws InterruptedException{
		DragAndDropComponent Comp = PageFactory.initElements(driver, DragAndDropComponent.class);
		Comp.DragAndDrop2("Featured Content");
		FeaturedContentComp comp = PageFactory.initElements(driver, FeaturedContentComp.class);
		comp.ClickOpenState();
		comp.ClickAddButton();
		comp.AccordionOne();
		comp.ClickAddButton();
		comp.AccordionTwo();
		comp.ClickAddButton();
		comp.AccordionThree();
		comp.ClickAddButton();
		comp.AccordionFour();
		comp.ClickAddButton();
		comp.AccordionFive();
		comp.ClickAddButton();
		comp.AccordionSix();
		comp.ClickAddButton();
		comp.AccordionSeven();
		comp.ClickAddButton();
		comp.AccordionEight();
		comp.ConfigComplete();
	}


}
