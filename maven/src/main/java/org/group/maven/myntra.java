package org.group.maven;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class myntra {

	
	public static void main(String args[]) throws AWTException {
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\srini\\eclipse-workspace\\maven\\driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.myntra.com/");
		
		driver.manage().window().maximize();
		
		WebElement ser = driver.findElement(By.xpath("//input[@class='desktop-searchBar']"));
		ser.sendKeys("iphonex");
		
		
		Robot y=new Robot();
		
		y.keyPress(KeyEvent.VK_ENTER);
		y.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement c = driver.findElement(By.xpath("(//span[@class='product-discountedPrice'])[1]"));
	    c.click();	
		
	    String pa=driver.getWindowHandle();
	    
	   Set<String> rem= driver.getWindowHandles();
	   
	   for(String x:rem) {
		   
		   if(!x.equals(pa)) {
			   
			   driver.switchTo().window(x);
			   
		   }
		   }
	   
	   WebElement bag = driver.findElement(By.xpath("//span[@class='myntraweb-sprite pdp-whiteBag sprites-whiteBag pdp-flex pdp-center']"));
	 bag.click();
	   
	   WebElement pri = driver.findElement(By.xpath("//strong[text()='Rs. 370']"));
	   
	   String text = pri.getText();
       System.out.println(text);
	}
}
