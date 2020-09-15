package com.xyz.capstone_test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 * Hello world!
 *
 */
public class App 
{
	static WebDriver driver;
	static String webDriverPath="/root/chromedriver";
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        System.setProperty("webdriver.chrome.driver", webDriverPath );
        ChromeOptions  options = new ChromeOptions();
        options.addArguments("--headless");
        options.addArguments("window-size=1920,1080");

        driver = new ChromeDriver(options);
        driver.get("http://localhost:82/");
        System.out.println(driver.getTitle());

        driver.quit();

    }
}
