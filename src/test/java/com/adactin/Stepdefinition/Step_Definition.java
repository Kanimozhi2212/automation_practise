package com.adactin.Stepdefinition;

import org.openqa.selenium.WebDriver;

import com.Adactin_Cucumber.BaseClass;
import com.POM.Book_A_Hotel;
import com.POM.Booking_Confirmation;
import com.POM.Login_Page;
import com.POM.Logout_Page;
import com.POM.Search_Hotel_Page;
import com.POM.Select_Hotel;
import com.adactin.Runner.Test_Runner;
import com.adatinsite.confi.File_Reader_Manager;
import com.adatinsite.confi.Page_Object_Manager;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Step_Definition extends BaseClass{
	
	public static WebDriver driver=Test_Runner.driver;
	
	public static Page_Object_Manager pom = new Page_Object_Manager(driver);
	
	  public static Login_Page l = new Login_Page(driver);
	  public static Search_Hotel_Page s= new Search_Hotel_Page(driver);
	  public static Select_Hotel sh = new Select_Hotel(driver);
	  public static Book_A_Hotel b = new Book_A_Hotel(driver);
	  public static Booking_Confirmation bc = new Booking_Confirmation(driver);
	  public static Logout_Page lp = new Logout_Page(driver);
	
	
	
	
	@Given("^user Lanuch The Application$")
	public void user_Lanuch_The_Application() throws Throwable {
		String url = File_Reader_Manager.getInstance().getInstanceCR().get_Url();
		geturl(url);
//		geturl("https://adactinhotelapp.com/");
	}

//	@When("^user Enter The Username In Username Field$")
//	public void user_Enter_The_Username_In_Username_Field() throws Throwable {
//		sendvalues(pom.get_Instance_Login().getUsername(), "Kanimozhi22");
////		sendvalues(l.getUsername(), "Kanimozhi22");
//	    
//	}
//
//	@When("^user Enter The Password In Password Field$")
//	public void user_Enter_The_Password_In_Password_Field() throws Throwable {
//		sendvalues(pom.get_Instance_Login().getPassword(), "Kani@2212@A");
////		sendvalues(l.getPassword(), "Kani@2212@A");
//	   
//	}
	
	////////////////////////////////////////////////////////////////////////////////
	
	//single set of data
	
//	@When("^user Enter The \"([^\"]*)\" In Username Field$")
//	public void user_Enter_The_In_Username_Field(String Username) throws Throwable {
//		sendvalues(pom.get_Instance_Login().getUsername(), Username);
//	 
//	}
//
//	@When("^user Enter The \"([^\"]*)\" In Password Field$")
//	public void user_Enter_The_In_Password_Field(String Password) throws Throwable {
//		sendvalues(pom.get_Instance_Login().getPassword(), Password);
//	   
//	}
	
	////////////////////////////////////////////////////////////////////////////////
	
	//multiple set of data (the diff is <> used in scenario)
	
	@When("^user Enter The \"([^\"]*)\" In Username Field$")
	public void user_Enter_The_In_Username_Field(String Username) throws Throwable {
		sendvalues(pom.get_Instance_Login().getUsername(), Username);
	   
	}

	@When("^user Enter The \"([^\"]*)\" In Password Field$")
	public void user_Enter_The_In_Password_Field(String Password) throws Throwable {
		sendvalues(pom.get_Instance_Login().getPassword(), Password);
	    
	}

	@Then("^user Click On The Login Button and It Navigates To The Search$")
	public void user_Click_On_The_Login_Button_and_It_Navigates_To_The_Search() throws Throwable {
	   clickOnElement(pom.get_Instance_Login().getLoginbtn());
//	   clickOnElement(l.getLoginbtn());
	}
	
	
	@When("^user Select The Location$")
	public void user_Select_The_Location() throws Throwable {
		single_dropdown(pom.get_Instance_Search().getLocation(), 1);
//		single_dropdown(s.getLocation(), 1);


	   	}
	
	@When("^user Select The Hotel$")
	public void user_Select_The_Hotel() throws Throwable {
		single_dropdown(pom.get_Instance_Search().getHotel(), 1);
//		single_dropdown(s.getHotel(), 1);
	   
	}


	@When("^user Select The Room Type$")
	public void user_Select_The_Room_Type() throws Throwable {
		single_dropdown(pom.get_Instance_Search().getRoomtype(), 1);
//		single_dropdown(s.getRoomtype(), 1);
	   
	}

	@When("^user Select The Number Of Rooms$")
	public void user_Select_The_Number_Of_Rooms() throws Throwable {
		single_dropdown(pom.get_Instance_Search().getNoofrooms(), 1);
//		single_dropdown(s.getNoofrooms(), 1);
	   
	}

	@When("^user Enter The Check In Date In Check In Date Field$")
	public void user_Enter_The_Check_In_Date_In_Check_In_Date_Field() throws Throwable {
	   sendvalues(pom.get_Instance_Search().getDatepcheckin(), "12/5/2021");
//	   sendvalues(s.getDatepcheckin(), "12/5/2021");
	}

	@When("^user Enter The Check Out Date In Check Out Date Field$")
	public void user_Enter_The_Check_Out_Date_In_Check_Out_Date_Field() throws Throwable {
		sendvalues(pom.get_Instance_Search().getDatecheckout(), "13/5/2021");
//		sendvalues(s.getDatecheckout(), "13/5/2021");
	   
	}

	@When("^user Select The Adults Per Room$")
	public void user_Select_The_Adults_Per_Room() throws Throwable {
		clickOnElement(pom.get_Instance_Search().getAdultperroom());
//		clickOnElement(s.getAdultperroom());
	   
	}

	@When("^user Select The Children Per Room$")
	public void user_Select_The_Children_Per_Room() throws Throwable {
	    clickOnElement(pom.get_Instance_Search().getChildrenperroom());
//	    clickOnElement(s.getChildrenperroom());
	}

	@Then("^user Click On The Search Button and It Navigates To The Select$")
	public void user_Click_On_The_Search_Button_and_It_Navigates_To_The_Select() throws Throwable {
	   clickOnElement(pom.get_Instance_Search().getSubmit());
//	   clickOnElement(s.getSubmit());
	}

	
	
	@When("^user Select The Hotel Name$")
	public void user_Select_The_Hotel_Name() throws Throwable {
		Thread.sleep(2000);
		clickOnElement(pom.get_Instance_Select().getSelecthotel());
//		clickOnElement(sh.getSelecthotel());
	   	}

	@Then("^user Click On The Continue Button and It Navigates To The Book A Hotel$")
	public void user_Click_On_The_Continue_Button_and_It_Navigates_To_The_Book_A_Hotel() throws Throwable {
		clickOnElement(pom.get_Instance_Select().getSubmit());
//		clickOnElement(sh.getSubmit());
	   
	}

	@When("^user Enter The Firstname In Firstname Field$")
	public void user_Enter_The_Firstname_In_Firstname_Field() throws Throwable {
		sendvalues(pom.get_Instance_Book().getFirstname(), "Harry");
//		sendvalues(b.getFirstname(), "Harry");

	   	}

	@When("^user Enter The Lastname In Lastname Field$")
	public void user_Enter_The_Lastname_In_Lastname_Field() throws Throwable {
	   sendvalues(pom.get_Instance_Book().getLastname(), "Potter");
//	   sendvalues(b.getLastname(), "Potter");
		
	}

	@When("^user Enter The Billing Address In Billing Address Field$")
	public void user_Enter_The_Billing_Address_In_Billing_Address_Field() throws Throwable {
	   sendvalues(pom.get_Instance_Book().getBillingaddress(), "no.45,private st,london");
//	   sendvalues(b.getBillingaddress(), "no.45,private st,london");
	}

	@When("^user Enter The Credit Card No\\. in Credit Card No\\. Field$")
	public void user_Enter_The_Credit_Card_No_in_Credit_Card_No_Field() throws Throwable {
	   sendvalues(pom.get_Instance_Book().getCreditnumno(), "1234567891234567");
//	   sendvalues(b.getCreditnumno(), "1234567891234567");
	}

	@When("^user Select The Credit Card Type$")
	public void user_Select_The_Credit_Card_Type() throws Throwable {
	   single_dropdown(pom.get_Instance_Book().getcreditcardtype(), 1);
//	   single_dropdown(b.getcreditcardtype(), 1);
	}

	@When("^user Select The Expiry Date In Select Month Field$")
	public void user_Select_The_Expiry_Date_In_Select_Month_Field() throws Throwable {
	   single_dropdown(pom.get_Instance_Book().getMonth(), 5);
//	   single_dropdown(b.getMonth(), 5);
	}

	@When("^user Select The Expiry Date In Select Year Field$")
	public void user_Select_The_Expiry_Date_In_Select_Year_Field() throws Throwable {
	   single_dropdown(pom.get_Instance_Book().getYear(), 9);
//	   single_dropdown(b.getYear(), 9);
	}

	@When("^user Enter The Ccv In Ccv Field$")
	public void user_Enter_The_Ccv_In_Ccv_Field() throws Throwable {
	   sendvalues(pom.get_Instance_Book().getCcvnum(), "456");
//	   sendvalues(b.getCcvnum(), "456");
	}

	@Then("^user Click On The Book Now Button and It Navigates To The Booking Confirmation$")
	public void user_Click_On_The_Book_Now_Button_and_It_Navigates_To_The_Booking_Confirmation() throws Throwable {
		Thread.sleep(2000);
	   clickOnElement(pom.get_Instance_Book().getBooknow());
//	   clickOnElement(b.getBooknow());
	}
	
	
	@Then("^user Click On The My Itinerary and It Navigates To Logout Page$")
    public void user_Click_On_The_My_Itinerary_and_It_Navigates_To_Logout_Page() throws Throwable {
     	Thread.sleep(9000);
        clickOnElement(pom.get_Instance_Confirmation().getMyitinerary());
//        clickOnElement(bc.getMyitinerary());
	}

    @Then("^user Click On The Logout Page$")
  	public void user_Click_On_The_Logout_Page() throws Throwable {
   		Thread.sleep(2000);
  		clickOnElement(pom.get_Instance_Logout().getLogout());
//		clickOnElement(lp.getLogout());
    	   
    	}

	   	
	
	

	

	
	

}
