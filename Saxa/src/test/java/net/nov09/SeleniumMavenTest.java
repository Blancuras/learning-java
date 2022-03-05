package net.nov09;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumMavenTest {

	@Test
	public void ejecutaTest() throws InterruptedException  {
		WebDriver driver;

		System.setProperty("webdriver.chrome.driver",
				"C:/Users/Aileen/Documents/Selenium/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("http://www.google.com");
		Thread.sleep(5000);
		driver.close();
	}
}
