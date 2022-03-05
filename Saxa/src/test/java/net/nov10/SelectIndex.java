package net.nov10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectIndex {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/Aileen/Documents/Selenium/chromedriver_win32/chromedriver.exe");

		driver = new ChromeDriver();

		driver.get("https://atestermate.com/AutomationExample.php");

		Thread.sleep(500);

		driver.manage().window().maximize();

		// Select comboPerfil = new Select(driver.findElement(By.name("profile")));
		// comboPerfil.selectByIndex(4);

		driver.findElement(By.name("profile")).click();
		Thread.sleep(2000); 
		driver.findElement(By.xpath("//*[text()='Test Manager']")).click();

		Thread.sleep(6000);

		driver.quit();

	}
}
