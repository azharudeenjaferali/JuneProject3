package com.aiite.pageexecution;

import java.io.IOException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import com.aiite.basepackage.BaseClass;
import com.aiite.pagefactory.HomePage;

public class HomePageExecution {
	
	@Test
	public void mobileSearchTest() throws IOException {
//		BaseClass.browserLauch();
//		BaseClass.loadUrl(BaseClass.getProperty("amazonUrl"));
		
		HomePage hp = new HomePage();
		hp.searchBox.sendKeys("Mobile");
		hp.searchBtn.click();
		
		//validation
//		BaseClass.closeBrowser();
	}
	
	@Test
	public void laptopSearchTest() throws IOException {
		
		HomePage hp = new HomePage();
		hp.searchBox.sendKeys("Mobile");
		hp.searchBtn.click();
		
		//validation
	}
	
	@Ignore
	@Test
	public void televisionSearchTest() throws IOException {
		HomePage hp = new HomePage();
		hp.searchBox.sendKeys("Television");
		hp.searchBtn.click();
		
		//validation
	}
	
	@Before
	public void beforeMethod() throws IOException {
		BaseClass.browserLauch();
		BaseClass.loadUrl(BaseClass.getProperty("amazonUrl"));
	}
	
	@After
	public void afterMethod() {
		BaseClass.closeBrowser();
	}
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("VPN Connection - Open");
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("VPN Connection - Close");
	}

}
