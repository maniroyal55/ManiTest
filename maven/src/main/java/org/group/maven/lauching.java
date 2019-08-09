package org.group.maven;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class lauching {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\srini\\eclipse-workspace\\maven\\driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.snapdeal.com/");
		
		driver.manage().window().maximize();
		
		WebElement search = driver.findElement(By.id("inputValEnter"));
		search.sendKeys("iphonex");
		
		WebElement cli=driver.findElement(By.xpath("//button[@class='searchformButton col-xs-4 rippleGrey']"));
		cli.click();
		
		WebElement pro=driver.findElement(By.xpath("//p[@title='iPhone X Soft Silicon Cases WK Design - Blue WK Fluxay Phone Case']"));
		pro.click();
		
		String win = driver.getWindowHandle();
		
		System.out.println(win);
		
		Set<String> window = driver.getWindowHandles();
		System.out.println(window);
		
		for(String g:window) {
			
		if(!win.equals(g)){
			
			 driver.switchTo().window(g);
			
			
		}}
		
	WebElement cart =driver.findElement(By.xpath("//span[text()='add to cart']"));
	cart.click();
	
	WebElement fg = driver.findElement(By.xpath("//span[text()='Rs. 324']"));
		String text = fg.getText();
		System.out.println(text);
		
		WebElement chu = driver.findElement(By.xpath("//i[@class='sd-icon sd-icon-cart-icon-white-2']"));
	
chu.click();	
	}
	
	
}
