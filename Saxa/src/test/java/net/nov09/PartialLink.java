package net.nov09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLink {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver;

		System.setProperty("webdriver.chrome.driver", //Asignando propiedades de configuracion
				"C:/Users/Aileen/Documents/Selenium/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.atestermate.com/AutomationExample.php"); 
		Thread.sleep(500);
		driver.manage().window().maximize();
		driver.findElement(By.partialLinkText("ommunity")).click();
		
		Thread.sleep(5000);
		driver.quit();

	} 
}
