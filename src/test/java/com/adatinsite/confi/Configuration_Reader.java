package com.adatinsite.confi;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Configuration_Reader {
	
	
	public static Properties p;
	
	public Configuration_Reader() throws Throwable {
		
		File f = new File("C:\\Users\\HI\\eclipse-workspace\\Adactin_Cucumber\\src\\test\\java\\com\\adatin\\confi\\Configuration.properties");
		
		FileInputStream fis = new FileInputStream(f);
		
		p = new Properties();
		
		p.load(fis);
		
		
		}
	
	public String get_Browser() {
		String browser = p.getProperty("browser");
		return browser;
		}
	
	public String get_Url() {
		String url = p.getProperty("url");
		return url;
		}
		
	public String get_firstname() {
		String firstname = p.getProperty("firstname");
		return firstname;
	}
	
	public String get_lastname() {
		String lastname = p.getProperty("lastname");
		return lastname;
	}
	
	
	public String get_ccv() {
		String ccv = p.getProperty("ccv");
		return ccv;
	}
		
		
	

}
