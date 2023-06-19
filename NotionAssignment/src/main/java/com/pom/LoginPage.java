package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
@FindBy(name="username")
private WebElement UnTB; 
@FindBy(name="password")
private WebElement PwdTB;
@FindBy(xpath="//button[text()='Login']")
private WebElement LoginButton;
public WebElement getLoginBtn() {
	return LoginButton;
}
public LoginPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
public WebElement getUnTxtBox() {
	return UnTB;
}
public WebElement getPwdTxtBox() {
	return PwdTB;
}


}
