package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage {
	
	WebDriver driver = new ChromeDriver();
	
	public void homePageTitle(){
		driver.getTitle();
	}

}
