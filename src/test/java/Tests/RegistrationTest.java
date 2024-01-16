package Tests;

import org.testng.annotations.Test;

import Pages.UserRegister;

public class RegistrationTest extends BaseClass{

	@Test
	public void register() {
		//System.out.println("this is Registration class");
		UserRegister obj = new UserRegister(utilObj);
		obj.goToRegisterPage();
	}
}
