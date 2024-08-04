package com.aiite.pagefactory;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import com.aiite.basepackage.BaseClass;

public class LoginPage extends BaseClass {
	
	public LoginPage(){
		PageFactory.initElements(driver, this);
	}
	
//	public String userName = "user-name";  //id
//	public String passWord = "password";  //id
//	public String loginBtn = "//input[@value='Login']"; //xpath
	
	
//	public WebElement userName = driver.findElement(By.id("user-name"));
//	public WebElement passWord = driver.findElement(By.id("password"));
//	public WebElement loginBtn = driver.findElement(By.xpath("//input[@value='Login']"));
	
//	List<WebElement> links = driver.findElements(By.xpath("//div[@id='pageFooterChildren']//a"));
	
	
//	@FindBy  = driver.findElemnet(By.
	
	@FindBy(id="user-name")
	public WebElement userName;
	
	@FindBy(id="password")
	public WebElement passWord;
	
	@FindBy(xpath="//input[@value='Login']")
	public WebElement loginBtn;
	
	@FindBy(xpath="//div[@id='pageFooterChildren']//a")
	public List<WebElement> links;
	
	@FindBy(id="react-burger-menu-btn")
	public WebElement menuBtn;
	
	@FindBy(id="user_dropdown")
	public WebElement userDD;

	
	@FindBys({
		@FindBy(xpath="//a[@role='button']"),
		@FindBy(id="create_acc")
	})
	public WebElement createAccount;
	
	@FindAll({
		@FindBy(xpath="//a[@role='button']"),
		@FindBy(id="create_acc")
	})
	public WebElement createAccount2;
}
