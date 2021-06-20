package com.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_Hotel {
	
	public static WebDriver driver;
	
	
	@FindBy(id="radiobutton_0")
	private WebElement selecthotel;


	@FindBy(id="continue")
	private WebElement submit;
	


	public Select_Hotel(WebDriver driver2) {
		Select_Hotel.driver=driver2;
		PageFactory.initElements(driver2, this);
	}

	public WebElement getSelecthotel() {
		return selecthotel;
	}

	public WebElement getSubmit() {
		return submit;
	}
	
	
	
	

}
