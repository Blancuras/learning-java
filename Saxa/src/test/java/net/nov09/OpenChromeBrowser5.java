package net.nov09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChromeBrowser5 {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver; 

		System.setProperty("webdriver.chrome.driver",
				"C:/Users/Aileen/Documents/Selenium/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://youtube.com");
		Thread.sleep(500);
		driver.manage().window().maximize();
		driver.findElement(By.name("search_query")).sendKeys("Armin Van Buuren");
		driver.findElement(By.id("search-icon-legacy")).click();
		Thread.sleep(5000);
		driver.quit();

	}
}
