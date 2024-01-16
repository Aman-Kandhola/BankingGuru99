package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Utility {
	
	
	WebDriver driver;
	
  public void launchBrowser() {
	  System.out.println("this is before class");
	   WebDriverManager.chromedriver().setup();
	   driver = new ChromeDriver();
	   driver.get("https://demo.guru99.com/V4/");
	   driver.manage().window().maximize();
  }
	
	
//Function to perform click action	
  public void clickAction(WebElement e) {
	  e.click();
  }
  
//Function to perform text
  public void sendText(WebElement e, String inputText) {
	  e.sendKeys(inputText);
  }
  
  
	public WebDriver getDriver() {
		
		return driver;
	}
	
  
}
