package com.notion.testscript;

import java.io.File;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.notion.generic.BaseClass;
import com.notion.generic.FileUtility;
import com.pom.HomePage;
import com.pom.LoginPage;

public class TestFileUpload extends BaseClass {
	@Test
	public void testFileUpload() throws Throwable {
		LoginPage loginPage = new LoginPage(driver);
		FileUtility fileUtils = new FileUtility();
		String username = fileUtils.readDataFromPropertyFile("userName");
		String password = fileUtils.readDataFromPropertyFile("password");
		loginPage.getUnTxtBox().sendKeys(username);
		loginPage.getPwdTxtBox().sendKeys(password);
		loginPage.getLoginBtn().click();
		HomePage homePage = new HomePage(driver);
		homePage.getDropdownMenuButton().click();
		homePage.getOrderButton().click();
		homePage.getBulkOrdersButton().click();
		WebElement fileUpload = homePage.getChooseFileButton();
		String relativePath = fileUtils.readDataFromPropertyFile("path");
		File fin = new File(relativePath);
		String path = fin.getAbsolutePath();
		fileUpload.sendKeys(path);
		homePage.getImportButton().click();
		WebElement table = homePage.getWebtable();
		File src = table.getScreenshotAs(OutputType.FILE);
		String timeStamp = LocalDateTime.now().toString().replace(':', '-');
		File destFile = new File("./screenshot/table " + timeStamp + ".png");
		FileUtils.copyFile(src, destFile);
	}
}
