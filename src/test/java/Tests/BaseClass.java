package Tests;


import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import generic.Utility;


public class BaseClass {
	
	public Utility utilObj;
  
   @BeforeSuite
   public void initObj() {

	   utilObj=new Utility();
	
	   utilObj.launchBrowser();
   }
   

  
}
