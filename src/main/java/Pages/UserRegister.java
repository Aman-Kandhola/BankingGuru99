package Pages;

import org.openqa.selenium.support.PageFactory;

import generic.Utility;

public class UserRegister extends UserRegisterOR{

	Utility utilObjReg;
	
	public void goToRegisterPage() {
		utilObjReg.clickAction(goToRegisterPageLink);
	}
	
	
	public UserRegister(Utility utilObj) {
		this.utilObjReg=utilObj;
	
		PageFactory.initElements(utilObjReg.getDriver(), this);
	}
	
}
