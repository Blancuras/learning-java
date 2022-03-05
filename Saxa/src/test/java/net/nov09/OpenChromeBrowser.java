package net.nov09;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChromeBrowser {
	private static WebDriver driver; 

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/Aileen/Documents/Selenium/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver(); 
		driver.get("https://google.com.");  
		driver.manage().window().maximize(); 
		driver.findElement(By.name("q")).sendKeys("A tester mate"); 
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER); 
		//driver.findElement(By.name("btnK")).click(); 
		Thread.sleep(5000); 
		driver.quit(); 
		
	}

}
