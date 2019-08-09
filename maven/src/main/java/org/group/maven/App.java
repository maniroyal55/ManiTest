package org.group.maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\srini\\eclipse-workspace\\maven\\driver\\chromedriver.exe");
        
        WebDriver uy=new ChromeDriver();
        
        uy.get("https:www.facebook.com");
    }
}
