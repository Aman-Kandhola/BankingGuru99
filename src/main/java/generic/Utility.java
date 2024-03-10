package generic;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.Duration;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

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
  
	
//Function to read data from CSV
	public void ReadFromCSV(String path) throws IOException {
        
        /* Create a new BufferReader object and pass the path of CSV file
        Reader reader = Files.newBufferedReader(Paths.get(path));
         
        // parse the file into csv values
        CSVParser parse = new CSVParser(reader, CSVFormat.DEFAULT);
 
        for (CSVRecord csvRecord : parse) {
            
            // Accessing Values by Column Index
            String firstname = csvRecord.get(0);
            //String lastName = csvRecord.get(1);
            //String company = csvRecord.get(2);
             
            // print the value to console
            System.out.println("Record No - " + csvRecord.getRecordNumber());
             
            System.out.println("FirstName : " + firstname);
 
        }*/
	}
	
	
	//This is to check the pasword

public String CSVread() throws CsvValidationException, IOException {
	String Email="";
	String CSVPath= "/Users/wits/eclipse-workspace/BankingGuru99/Data/Data.csv";
	
	CSVReader readEmail = new CSVReader(new FileReader(CSVPath));
	String [] csvCell;

	  while ((csvCell = readEmail.readNext()) != null) { 
	  
	   Email = csvCell[0];
	 
}
	  return Email;
}


	
	public void implictWait(int Seconds) {
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Seconds));
  }
  
	public WebDriver getDriver() {
		
		return driver;
	}
	
  
}
