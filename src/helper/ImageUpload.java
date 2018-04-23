package helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ImageUpload {
	
	WebDriver driver;
	
	@FindBy(xpath = ".//*[@class='coral-TabPanel-content u-coral-noPadding u-coral-noMargin']/div[2]/section/div/div[1]/span/div/div[2]/span/a/input")
	WebElement DEhancedProductHero;
	
	
	public ImageUpload(WebDriver driver){
		this.driver = driver;
	}
	
	public void DEhancedHeroImage(){
		DEhancedProductHero.sendKeys("D:\\LCBOImages\\DEnhancedHero.jpg");
	}

}
