package Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.opencsv.exceptions.CsvValidationException;

import generic.Utility;

public class UserRegister extends UserRegisterOR{


	Utility utilObjReg;
	
	public void goToRegisterPage() {
		utilObjReg.clickAction(goToRegisterPageLink);
	}
	
	
	
	public void SwitchIframe1() {
		utilObjReg.switchto(addIframe1);
	}
	
	
	public void SwitchIframe2() {
		utilObjReg.switchto(addIframe2);
	}
	
	
	/*
	public void choseAdd() {
		if(closeAdd1 != null) {
			utilObjReg.clickAction(closeAdd1);
		}
		else {
			utilObjReg.clickAction(closeAdd2);
		}
	}
	*/
	

/*	public WebElement chooseAdd2() {
		return closeAdd2;
	}
	
	
	public WebElement chooseAdd() {
		return closeAdd1;
	}
	*/
	public void CloseAdd1() {
		utilObjReg.clickAction(closeAdd1);
	}
	
	public void CloseAdd2() {
		utilObjReg.clickAction(closeAdd2);
	}
	
	/*public void enterEmail(String email) {
		utilObjReg.sendText(enterEmailforRegistration, email);
	}*/
	
	public void enterEmailCSV() throws CsvValidationException, IOException {
		String mail = utilObjReg.CSVread();
		utilObjReg.sendText(enterEmailforRegistration, mail);
	}
	
	
	public UserRegister(Utility utilObj) {
		this.utilObjReg=utilObj;
	
		PageFactory.initElements(utilObjReg.getDriver(), this);
	}
}
