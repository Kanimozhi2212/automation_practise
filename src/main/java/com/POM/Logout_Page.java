package com.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout_Page {
	
	public static WebDriver driver;
	
	@FindBy(xpath="//a[text()='Logout']")
	private WebElement logout;

	public Logout_Page(WebDriver driver2) {
		Logout_Page.driver=driver2;
		PageFactory.initElements(driver2, this);
	}

	public WebElement getLogout() {
		return logout;
	}

}
