package com.aiite.concepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleClass {
	
	public static void main(String[] args) {
		System.out.println("Good Morning Team!");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mvnrepository.com/");
	}

}
