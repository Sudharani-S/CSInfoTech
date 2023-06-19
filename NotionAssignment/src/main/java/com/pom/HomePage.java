package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	@FindBy(xpath="//span[text()='chevron_right']")
	private WebElement DropdownMenuButton; 
	@FindBy(xpath="//span[text()='Orders']")
	private WebElement OrderButton;
	@FindBy(xpath="//button[text()='Add Bulk Orders']")
	private WebElement BulkOrdersButton;
	@FindBy(xpath="//input[@type='file']")
	private WebElement ChooseFileButton;
	@FindBy(xpath="//button[text()='Import']")
	private WebElement ImportButton;
	@FindBy(xpath="//table[@class='MuiTable-root css-9177x2']")
	private WebElement webtable;
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public WebElement getDropdownMenuButton() {
		return DropdownMenuButton;
	}
	public WebElement getOrderButton() {
		return OrderButton;
	}
	public WebElement getBulkOrdersButton() {
		return BulkOrdersButton;
	}
	public WebElement getChooseFileButton() {
		return ChooseFileButton;
	}
	public WebElement getImportButton() {
		return ImportButton;
	}
	public WebElement getWebtable() {
		return webtable;
	}
	
	
	}
	

