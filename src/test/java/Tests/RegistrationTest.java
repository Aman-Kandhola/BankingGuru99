package Tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.opencsv.exceptions.CsvValidationException;

import Pages.UserRegister;

public class RegistrationTest extends BaseClass{

	@Test
	public void register() throws CsvValidationException, IOException {
		//System.out.println("this is Registration class");
		UserRegister obj = new UserRegister(utilObj);
		obj.goToRegisterPage();
		obj.SwitchIframe1();
		utilObj.implictWait(10);
		//Thread.sleep(5000);
		
		try {
		//if(obj.chooseAdd()!=null) {
			obj.CloseAdd1();
		//}
		}
		catch(Exception e) {
			System.out.print(e);
			obj.SwitchIframe2();
			obj.CloseAdd2();
		}
		
		obj.enterEmailCSV();
		
		}

	}
