package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserRegisterOR {

	@FindBy(xpath="//a[text()=\"here\"]")
	protected WebElement goToRegisterPageLink;
	
	@FindBy(xpath="//div[@id=\"dismiss-button\"]")
	protected WebElement closeAdd1;
	
	@FindBy(xpath="//span[text()=\"Close\"]")//This is for the add with close button with no cross button
	protected WebElement closeAdd2;
	


	@FindBy(xpath="//iframe[@id='google_ads_iframe_/24132379/INTERSTITIAL_DemoGuru99_0']")
	protected WebElement addIframe1;
	
	@FindBy(xpath="//iframe[@name='ad_iframe']")
	protected WebElement addIframe2;
	
	
	@FindBy(xpath="//input[@name=\"emailid\"]")
	protected WebElement enterEmailforRegistration;
	
}


//iframe[@id=\"google_ads_iframe_/24132379/INTERSTITIAL_DemoGuru99_0\"
