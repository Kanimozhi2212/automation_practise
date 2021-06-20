package com.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Hotel_Page {
	
	public static WebDriver driver;
	
	
	@FindBy(id="location")
	private WebElement location;

	@FindBy(id="hotels")
	private WebElement hotel;
	
	@FindBy(id="room_type")
	private WebElement roomtype;
	
	@FindBy(id="room_nos")
	private WebElement noofrooms;

	@FindBy(id="datepick_in")
	private WebElement datepcheckin;
	
	@FindBy(id="datepick_out")
	private WebElement datecheckout;
	
	@FindBy(id="adult_room")
	private WebElement adultperroom;

	@FindBy(id="child_room")
	private WebElement childrenperroom;
	
	@FindBy(id="Submit")
	private WebElement submit;
	
	

	public Search_Hotel_Page(WebDriver driver2) {
		Search_Hotel_Page.driver=driver2;
		PageFactory.initElements(driver2, this);
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotel() {
		return hotel;
	}

	public WebElement getRoomtype() {
		return roomtype;
	}

	public WebElement getNoofrooms() {
		return noofrooms;
	}

	public WebElement getDatepcheckin() {
		return datepcheckin;
	}

	public WebElement getDatecheckout() {
		return datecheckout;
	}

	public WebElement getAdultperroom() {
		return adultperroom;
	}

	public WebElement getChildrenperroom() {
		return childrenperroom;
	}

	public WebElement getSubmit() {
		return submit;
	}

	
	

}
