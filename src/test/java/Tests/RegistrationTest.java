package Tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Pages.UserRegister;

public class RegistrationTest extends BaseClass{

	@Test
	public void register() {
		//System.out.println("this is Registration class");
		UserRegister obj = new UserRegister(utilObj);
		obj.goToRegisterPage();
		
		obj.SwitchIframe();
		
		utilObj.implictWait(10);
		
		//Thread.sleep(5000);
		
		obj.choseAdd();
		}
	}
