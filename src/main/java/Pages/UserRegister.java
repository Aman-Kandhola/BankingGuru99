package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import generic.Utility;

public class UserRegister extends UserRegisterOR{


	Utility utilObjReg;
	
	public void goToRegisterPage() {
		utilObjReg.clickAction(goToRegisterPageLink);
	}
	
	
	
	public void SwitchIframe() {
		utilObjReg.switchto(addIframe);
	}
	
	
	public void choseAdd() {
		if(closeAdd1 != null) {
			utilObjReg.clickAction(closeAdd1);
		}
		else {
			utilObjReg.clickAction(closeAdd2);
		}
	}
	
	
	public UserRegister(Utility utilObj) {
		this.utilObjReg=utilObj;
	
		PageFactory.initElements(utilObjReg.getDriver(), this);
	}
}
