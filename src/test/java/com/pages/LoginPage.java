package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utilities.GlobalLibrary;

public class LoginPage extends GlobalLibrary {
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
@FindBy(id="email")
private WebElement txtUserName;

@FindBy(id="pass")
private WebElement txtPassword;

@FindBy(name="login")
private WebElement btnLogin;

public WebElement getTxtUserName() {
	return txtUserName;
}

public WebElement getTxtPassword() {
	return txtPassword;
}

public WebElement getBtnLogin() {
	return btnLogin;
}

public void login(String username,String password) {
	typeInput(getTxtUserName(), username);
	typeInput(getTxtPassword(), password);
     click(getBtnLogin());
}

}
