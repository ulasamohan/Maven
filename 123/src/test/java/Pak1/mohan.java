package Pak1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class mohan {
@Test
public  void m1() {
	
	WebDriver driver = null;
	WebDriverManager.chromedriver().setup();
	ChromeOptions options = new ChromeOptions();
	options.addArguments("start-maximized"); 
	options.addArguments("enable-automation"); 
	options.addArguments("--no-sandbox"); 
	options.addArguments("--disable-infobars");
	options.addArguments("--disable-dev-shm-usage");
	options.addArguments("--disable-browser-side-navigation"); 
	options.addArguments("--disable-gpu"); 
	driver = new ChromeDriver(options); 
	driver.get("https://www.google.com/"); 
	//WebDriverManager.chromedriver().setup();
	
	 //driver=new ChromeDriver();
	driver.get("https://www.google.com/");

	}
}

