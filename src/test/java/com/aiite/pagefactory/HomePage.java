package com.aiite.pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aiite.basepackage.BaseClass;

public class HomePage extends BaseClass{
	
	public HomePage(){
		PageFactory.initElements(driver, this);
	}
	
//	public String searchBox = "twotabsearchtextbox";  //id
//	public String searchBtn = "//input[@value='Go']"; //xpath
	
	@FindBy(id="twotabsearchtextbox")
	public WebElement searchBox;
	
	@FindBy(xpath="//input[@value='Go']")
	public WebElement searchBtn;
	
}
