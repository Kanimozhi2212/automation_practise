package com.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book_A_Hotel {
	
	public static WebDriver driver;
	
	
	@FindBy(id="hotel_name_dis")
	private WebElement hotelname;
	
	@FindBy(id="location_dis")
	private WebElement location;
	
	@FindBy(id="room_type_dis")
	private WebElement roomtype;
	
	@FindBy(id="room_num_dis")
	private WebElement noofrooms;

	@FindBy(id="total_days_dis")
	private WebElement totaldays;
	
	@FindBy(id="price_night_dis")
	private WebElement pricepernight;
	
	@FindBy(id="total_price_dis")
	private WebElement totalprice;

	@FindBy(id="gst_dis")
	private WebElement gst;
	
	@FindBy(id="final_price_dis")
	private WebElement finalbilledprice;
	
	@FindBy(id="first_name")
	private WebElement firstname;

	@FindBy(id="last_name")
	private WebElement lastname;
	
	@FindBy(id="address")
	private WebElement billingaddress;

	@FindBy(id="cc_num")
	private WebElement creditnumno;
	
	@FindBy(id="cc_type")
	private WebElement creditcardtype;
	
	@FindBy(id="cc_exp_month")
	private WebElement month;

	@FindBy(id="cc_exp_year")
	private WebElement year;
	
	@FindBy(id="cc_cvv")
	private WebElement ccvnum;

	@FindBy(id="book_now")
	private WebElement booknow;
	
	public Book_A_Hotel(WebDriver driver2) {
		Book_A_Hotel.driver=driver2;
		PageFactory.initElements(driver2,this);
	}
	

	public WebElement getHotelname() {
		return hotelname;
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getRoomtype() {
		return roomtype;
	}

	public WebElement getNoofrooms() {
		return noofrooms;
	}

	public WebElement getTotaldays() {
		return totaldays;
	}

	public WebElement getPricepernight() {
		return pricepernight;
	}

	public WebElement getTotalprice() {
		return totalprice;
	}

	public WebElement getGst() {
		return gst;
	}

	public WebElement getFinalbilledprice() {
		return finalbilledprice;
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getBillingaddress() {
		return billingaddress;
	}

	public WebElement getCreditnumno() {
		return creditnumno;
	}

	public WebElement getcreditcardtype() {
		return creditcardtype;
	}

	public WebElement getMonth() {
		return month;
	}

	public WebElement getYear() {
		return year;
	}

	public WebElement getCcvnum() {
		return ccvnum;
	}

	public WebElement getBooknow() {
		return booknow;
	}


	
	
	
	
	

}
