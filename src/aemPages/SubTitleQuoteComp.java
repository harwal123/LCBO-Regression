package aemPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SubTitleQuoteComp {
	WebDriver driver;
	
	@FindBy(xpath = ".//*[@class='coral-FixedColumn-column u-coral-padding u-coral-noMargin']/div[1]/div/div[2]")
	WebElement SubTitle;
	
	@FindBy(xpath = ".//*[@class='coral-FixedColumn-column u-coral-padding u-coral-noMargin']/div[2]/div/div[2]")
	WebElement Description;
	
	@FindBy(xpath = ".//*[@class='cq-dialog-actions u-coral-pullRight']/button[4]")
	WebElement ConfigDone;
	
	
	public SubTitleQuoteComp(WebDriver driver){
	this.driver = driver;
	}
	
	public void SubTitleQuoteConfig(){
		SubTitle.sendKeys("Philander to I Sharma, no run, full and wide outside off, left alone");
		Description.sendKeys("Morkel to Mohammed Shami, OUT, taken at first slip. Regulation Morkel wicket. Short one in the corridor, "
				+ "hangs his bat up to try and defend. It's a bit too quick for him. Amla with the reverse cup at throat height");
		ConfigDone.click();
	}

}
