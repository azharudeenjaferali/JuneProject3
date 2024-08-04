package com.aiite.pageexecution;

import java.io.IOException;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import com.aiite.basepackage.BaseClass;
import com.aiite.pagefactory.LoginPage;

public class LoginPageExecution {
	
	@Test
	public void loginValidCredentialTest() throws IOException, InterruptedException {
		BaseClass.browserLauch();
		BaseClass.loadUrl(BaseClass.getProperty("SiteUrl"));
		
		LoginPage lp = new LoginPage();
//		BaseClass.elementRightClick(lp.userName);
//		Thread.sleep(2000);
		lp.userName.sendKeys(BaseClass.getProperty("UserName"));
		lp.passWord.sendKeys(BaseClass.getProperty("Password"));
		Thread.sleep(2000);
		lp.loginBtn.click();
		
		//Validation
		Thread.sleep(2000);
		Assert.assertTrue(lp.menuBtn.isDisplayed());
		BaseClass.closeBrowser();
	}
	
	public void loginUser() throws IOException {
		LoginPage lp = new LoginPage();
		lp.userName.sendKeys(BaseClass.getProperty("UserName"));
		lp.passWord.sendKeys(BaseClass.getProperty("Password"));
		lp.loginBtn.click();
	}
	
	@Ignore
	@Test
	public void loginInvalidCredentialTest() throws IOException, InterruptedException {
		BaseClass.browserLauch();
		BaseClass.loadUrl(BaseClass.getProperty("SiteUrl"));
		
		LoginPage lp = new LoginPage();
		lp.userName.sendKeys(BaseClass.getProperty("UserName"));
		lp.passWord.sendKeys("Welcome@123");
		Thread.sleep(2000);
		lp.loginBtn.click();
		
		//Validation
		Thread.sleep(2000);
		Assert.assertTrue(lp.menuBtn.isDisplayed());
		BaseClass.closeBrowser();
	}
	

}
