package seleniumMavenPkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class selMavenClass {

	public static void main(String[] args) {
	   System.setProperty("webdriver.chrome.driver","/Users/Reddy/eclipse-workspace/chromedriver");
       WebDriver driver = new ChromeDriver();
       driver.get("https://google.com");
       System.out.println("Title For This WebSite is:-> " + driver.getTitle());
       System.out.println("Current Website=:  " + driver.getCurrentUrl());
       driver.quit();
       
	}

}
