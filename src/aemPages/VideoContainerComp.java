package aemPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VideoContainerComp {
WebDriver driver;
	
	@FindBy(name = "./video-id")
	WebElement VideoID;
	
	@FindBy(xpath = ".//*[@class='coral-InputGroup coral-InputGroup--block']/input")
	WebElement Image;
	
	@FindBy(name = "./autoplay")
	WebElement AutoPlay;
	
	@FindBy(name = "./loop-video")
	WebElement LoopVideo;
	
	@FindBy(name = "./show-title")
	WebElement ShowVideoTitle;
	
	@FindBy(xpath = ".//div[@class='cq-dialog-actions u-coral-pullRight']/button[4]")
	WebElement DoneConfig;
	
	public VideoContainerComp(WebDriver driver){
		this.driver = driver;
	}
	
	public void VideoConfig(){
		VideoID.sendKeys("229736904");
		Image.sendKeys("/content/dam/hero-image/1492784684476.jpg");
		DoneConfig.click();
	}
	
	public void VideoAutoPlayConfig(){
		VideoID.sendKeys("222676930");
		Image.sendKeys("/content/dam/hero-image/1492784684476.jpg");
		AutoPlay.click();
		DoneConfig.click();
	}
	
	public void VideoLoopVideoConfig(){
		VideoID.sendKeys("222676930");
		Image.sendKeys("/content/dam/hero-image/1492784684476.jpg");
		LoopVideo.click();
		DoneConfig.click();
	}
	
	public void VideoAutoPlayAndLoopVideoConfig(){
		VideoID.sendKeys("222676930");
		Image.sendKeys("/content/dam/hero-image/1492784684476.jpg");
		AutoPlay.click();
		LoopVideo.click();
		DoneConfig.click();
	}
	
	public void VideoDontShowVideoTitleConfig(){
		VideoID.sendKeys("222676930");
		Image.sendKeys("/content/dam/hero-image/1492784684476.jpg");
		AutoPlay.click();
		LoopVideo.click();
		ShowVideoTitle.click();
		DoneConfig.click();
	}

}
