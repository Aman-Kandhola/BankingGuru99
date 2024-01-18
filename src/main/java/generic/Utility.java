package generic;

import java.time.Duration;

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
  
  
//Function to Switch to iframe
	public void switchto(WebElement we) {
		driver.switchTo().frame(we);
	}
  
  public void implictWait(int Seconds) {
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Seconds));
  }
  
	public WebDriver getDriver() {
		
		return driver;
	}
	
  
}
