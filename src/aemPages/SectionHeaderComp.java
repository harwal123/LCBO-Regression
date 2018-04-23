package aemPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SectionHeaderComp {
WebDriver driver;
	
	@FindBy(xpath = ".//*[@class='cq-dialog-content coral-FixedColumn u-coral-noPadding u-coral-noMargin']/div/div/div/div[2]")
	WebElement SectionTitle;
	
	@FindBy(xpath = ".//div[@class='cq-dialog-actions u-coral-pullRight']/button[4]")
	WebElement DoneConfig;
	
	public SectionHeaderComp(WebDriver driver){
		this.driver = driver;
	}
	
	public void SectionHeaderConfigOne(){
		SectionTitle.sendKeys("This is the section header title");
		DoneConfig.click();
	}
	
	public void SectionHeaderConfigTwo(){
		SectionTitle.sendKeys("This is the long section header Title. This is the long section header Title. This is the long section header Title.");
		DoneConfig.click();
	}

}
