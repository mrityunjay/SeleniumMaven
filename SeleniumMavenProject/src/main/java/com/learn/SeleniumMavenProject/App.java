package com.learn.SeleniumMavenProject;

import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World! sdfsd" );
        
      //Register a user on mercurytour site
      		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mrityunjay\\selenium_learn\\chromedriver.exe");
      		//Launch a browser
      		ChromeDriver driver=new ChromeDriver();
      		
      		//navigate to site
      		driver.get("http://newtours.demoaut.com/");
    }
}
