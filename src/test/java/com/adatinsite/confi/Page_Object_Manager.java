package com.adatinsite.confi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.POM.Book_A_Hotel;
import com.POM.Booking_Confirmation;
import com.POM.Login_Page;
import com.POM.Logout_Page;
import com.POM.Search_Hotel_Page;
import com.POM.Select_Hotel;

public class Page_Object_Manager {
	
	public WebDriver driver;
	
	private Login_Page login;  //null
	
	private Search_Hotel_Page search;
	
	private Select_Hotel select;
	
	private Book_A_Hotel book;
	
	private Booking_Confirmation confirmation;
	
	private Logout_Page logout;
	
	

	
	public Page_Object_Manager(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}


	public Login_Page get_Instance_Login() {
	    login = new Login_Page(driver);
		return login;
		}
	
	public Search_Hotel_Page get_Instance_Search() {
		search = new Search_Hotel_Page(driver);
		return search;
	}
	
	public Select_Hotel get_Instance_Select() {
		 select = new Select_Hotel(driver);
		return select;
	}
	
	public Book_A_Hotel get_Instance_Book() {
		book = new Book_A_Hotel(driver);
		return book;
	}
	
	public Booking_Confirmation get_Instance_Confirmation() {
		confirmation = new Booking_Confirmation(driver);
		return confirmation;
	}
	
	public Logout_Page get_Instance_Logout() {
		logout = new Logout_Page(driver);
		return logout;
	}
	
	
	
	
   

}
