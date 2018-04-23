package aemTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import aemPages.ColumnControlComp;
import aemPages.Template;
import helper.Browser;

public class ColumnControl {
	
	WebDriver driver;
	
	@BeforeClass
	public void StartBrowser(){
		driver = Browser.StartBrowser("chrome");
	}
	
	@Test(priority = 0)
	public void CreateNewTemplate() throws InterruptedException{
		Template NewTemplate = PageFactory.initElements(driver, Template.class);
		NewTemplate.NewTemplate("Column Control");
	}
	
	@Test(priority = 1)
	public void AddColumnControl() throws InterruptedException{
		ColumnControlComp CreateComponent = PageFactory.initElements(driver, ColumnControlComp.class);
		CreateComponent.AddColumnControlComponent();
		CreateComponent.ColumnControlConfig();
		CreateComponent.CControl2View5050("2 column view for 50 % 50");
	}
	
	//@AfterClass
	public void CloseBrowser(){
		driver.quit();
	}

}
