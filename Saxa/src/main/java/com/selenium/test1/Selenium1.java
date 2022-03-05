package com.selenium.test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/Users/Aileen/Documents/Selenium/chromedriver_win32/chromedriver.exe");  
	    WebDriver driver=new ChromeDriver();  
	    driver.navigate().to("http://www.google.com/");  
	    driver.findElement(By.name("q")).sendKeys("javatpoint tutorials");  
	    
	    Thread.sleep(5000);
	    driver.findElement(By.name("btnK")).click();  
	    
	    Thread.sleep(2000);
	    driver.navigate().to("http://neorobotino.com");  
	    driver.findElement(By.xpath("/html/body/div[2]/header/nav/ul[1]/li[2]/form/input")).sendKeys("Mojojojo"); ;
	    Thread.sleep(1000);
	    driver.close();
	}
}
