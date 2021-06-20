package com.Adactin_Cucumber;

import java.io.File;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {
	public static WebDriver driver;

	//web element method
	//click
	public static void clickOnElement(WebElement element) {
		element.click();

	}
	//sendkeys
	public static void sendvalues(WebElement element,String values) {
	    element.sendKeys(values);

	}

	//clear
    public static void clear(WebElement element) {
    	element.clear();
	}
	
	//is displayed
	public static void is_displayed(WebElement element) {
		element.isDisplayed();
	}
	//is enabled
	public static void is_enabled(WebElement element) {
		element.isEnabled();
	}
	//is selected
	public static void is_selected(WebElement element) {
		element.isSelected();
		}
    
	//get url
    public static void geturl(String Url){
       try {
		driver.get(Url);
	} catch (Exception e) {
		e.printStackTrace();
	}
	}
    //get current url
    public static void get_current_url() {
    	String currentUrl = driver.getCurrentUrl();
    	System.out.println(currentUrl);
	}
    //get text
    public static void get_text(WebElement element) {
    	System.out.println(element.getText());
	}
    //get attribute
    public void get_attribute(WebElement element) {
		String attribute = element.getAttribute(null);
		System.out.println(attribute);
}
    //navigate to
  	public static void navigate_to(String s) {
         driver.navigate().to(s); 
  	}
  	 //navigate back
  	public static void navigate_back() {
         driver.navigate().back(); 
  	}
    //navigate forward
  	public static void navigate_forward() {
         driver.navigate().forward(); 
  	}
  	 //navigate refresh
  	public static void navigate_refresh() {
         driver.navigate().refresh(); 
  	}
  	 //alert
  	public static void alert() {
         driver.switchTo().alert(); 
  	}
  	 //frame
  	public static void frame(WebElement element) {
         driver.switchTo().frame(element); 
  	}
  	 //robot
//  	public static void robot() throws AWTException {
//         Robot r = new Robot(); 
//  	}
  //action
  	public static void Actionsac(WebElement element,WebDriver driver) {
  	Actions ac = new Actions(driver);
  	ac.moveToElement(element).build().perform();
  	ac.contextClick(element).build().perform();
  	}
  	
  	
  //single dropdown
    public static void single_dropdown(WebElement element,int index) {
	Select s = new Select(element);
	s.selectByIndex(index);
    }
   
    
    //scroll up 
    public void scroll_up(WebElement element) {
    	 JavascriptExecutor js = (JavascriptExecutor) driver;
 	    js.executeScript("arguments[0].scrollIntoView();",element);
	}
    //scroll down
    public void scroll_down(WebElement element) {
    JavascriptExecutor js1 = (JavascriptExecutor) driver;
     js1.executeScript("arguments[0].scrollIntoView();",element);
    }
    //screenshot
    public static void screenshot(String save_path_in_file) throws Throwable {
    TakesScreenshot ts = (TakesScreenshot) driver;
    File s= ts.getScreenshotAs(OutputType.FILE);
    File d = new File(save_path_in_file);
    FileUtils.copyFile(s, d);
    
    }
    //multiple dropdown
    public static void multiple_dropdown(WebElement element, int j ) {
    	Select s = new Select(element);
    	boolean multiple = s.isMultiple();
    	System.out.println(multiple);
    
  //get option
  		List<WebElement> Options = s.getOptions();
  	//size
  			int a = Options.size();
  		//for each
  	for (WebElement webElement : Options) {
  		System.out.println(webElement.getText());
  	}
  	//for loop
  	for(int i = 0; i<a ;i++) {
  		if(i==j) {
  		s.selectByIndex(i);	
  	}
  	}
  				
    //get first selected option
    WebElement firstSelectedOption = s.getFirstSelectedOption();
	System.out.println(firstSelectedOption.getText());
    //get all selected option
	List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
	for (WebElement allSelectedOption : allSelectedOptions) {
		System.out.println(allSelectedOption.getText());
	}
    }
  //close
    public static void close() {
    	driver.close();
	}
  //quit
    public static void quit() {
    	driver.quit();
	}
    //check box
    public static void checkbox(WebElement element) {
		element.click();

	}
    //wait-implicit
    public static void implicit(WebDriver driver) {
    	 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

	}
    
    //explicit
    public static void explicit(WebElement element,WebDriver driver) {
    	WebDriverWait wait = new WebDriverWait(driver, 10);
    	wait.until(ExpectedConditions.visibilityOf(element));
    }
    
 
  //windows handling
    public static void window_handling(WebDriver driver) {
  		Set<String> windowHandles = driver.getWindowHandles();
  		
  		for (String String : windowHandles) {
  			String element1 = driver.switchTo().window(String).getTitle();
  			System.out.println(element1);
  			}
    }
    
    

    //--->null
    public static  WebDriver browserLaunch(String browser) throws Throwable{
    	try {
			
				System.setProperty("webdriver.chrome.driver", 
						"C:\\Users\\HI\\eclipse-workspace\\Adactin_Cucumber\\driver\\chromedriver.exe"); 
				driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
    	
    	return driver;
   
    
  }
	public static WebDriver getDriver(String string) {
		return null;
	}


}
