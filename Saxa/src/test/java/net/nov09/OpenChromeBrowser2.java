package net.nov09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChromeBrowser2 {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver;

		System.setProperty("webdriver.chrome.driver",
				"C:/Users/Aileen/Documents/Selenium/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.atestermate.com/AutomationExample.php");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Community of Software Testers |")).click();
		
		Thread.sleep(5000);
		driver.quit();

	}
}
