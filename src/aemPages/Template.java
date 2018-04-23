package aemPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Template {

	WebDriver driver;

	@FindBy(id = "username")
	WebElement UserName;

	@FindBy(id = "password")
	WebElement Password;

	@FindBy(id = "submit-button")
	WebElement SubmitButton;

	@FindBy(xpath = ".//*[@class='coral3-ColumnView-column']/coral-columnview-column-content/coral-columnview-item[6]/coral-columnview-item-content")
	WebElement TemplatePath;

	@FindBy(xpath = ".//*[@class='foundation-layout-panel-content']/coral-columnview/coral-columnview-column[2]/coral-columnview-column-content/coral-columnview-item[4]/coral-columnview-item-thumbnail/img")
	WebElement Template;

	@FindBy(xpath = ".//*[@class='coral-ActionBar-primary']/coral-actionbar-item[2]/button")
	WebElement TemplateEdit;
	
	@FindBy(xpath = ".//*[@class='foundation-layout-panel-content']/coral-columnview/coral-columnview-column[2]/coral-columnview-column-content/coral-columnview-item[4]/coral-columnview-item-content")
	WebElement TemplateAuto;
	
	@FindBy(xpath = ".//*[@class='foundation-collection-actionbar']/betty-titlebar-secondary/button")
	WebElement CreateLink;
	
	@FindBy(xpath = ".//*[@class='cq-siteadmin-admin-createpage foundation-collection-action coral-Link coral-BasicList-item coral-AnchorList-item']")
	WebElement CreatePageLink;
	
	@FindBy(xpath = ".//*[@class='foundation-advancedselect']/coral-masonry/coral-masonry-item[3]/coral-card")
	WebElement NewPageEdit;
	
	@FindBy(xpath = ".//*[@class='foundation-layout-inline2 foundation-layout-inline2-gap']/button")
	WebElement NextButton;
	
	@FindBy(xpath = ".//*[@id='coral-1']/div/section[1]/div[2]/div/input")
	WebElement PageTitle;
	
	@FindBy(xpath = ".//*[@class='foundation-layout-wizard2 foundation-wizard']/div/coral-panelstack/coral-panel[2]/coral-panel-content/div/button[2]")
	WebElement CreateFinalLink;
	
	@FindBy(xpath = ".//*[@class='coral-Dialog-footer']/button[2]/coral-button-label")
	WebElement OpenTemplate;

	public Template(WebDriver driver) {
		this.driver = driver;
	}

	public void CreateTemplate() throws InterruptedException {
		UserName.sendKeys("qauser");
		Password.sendKeys("qauser");
		SubmitButton.click();
		TemplatePath.click();
		Thread.sleep(2000);
		Template.click();
		TemplateEdit.click();
		Thread.sleep(3000);

	}
	
	public void NewTemplate(String EnterPageTitle) throws InterruptedException{
		UserName.sendKeys("qauser");
		Password.sendKeys("qauser!123");
		SubmitButton.click();
		TemplatePath.click();
		TemplateAuto.click();
		Thread.sleep(2000);
		CreateLink.click();
		CreatePageLink.click();
		NewPageEdit.click();
		NextButton.click();
		PageTitle.sendKeys(EnterPageTitle);
		CreateFinalLink.click();
		Thread.sleep(3000);
		OpenTemplate.click();
		for(String Winhandle : driver.getWindowHandles() ){
			driver.switchTo().window(Winhandle);
			//System.out.println(driver.getCurrentUrl());
		}
		Thread.sleep(4000);
	}

}
