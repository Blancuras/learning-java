package net.nov10;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/Aileen/Documents/Selenium/chromedriver_win32/chromedriver.exe");

		driver = new ChromeDriver();

		driver.get("https://www.youtube.com");

		Thread.sleep(500);

		driver.manage().window().maximize(); 
		JavascriptExecutor js = (JavascriptExecutor) driver; 

		driver.findElement(By.name("search_query")).sendKeys("A Tester Mate");
		driver.findElement(By.id("search-icon-legacy")).click();
		Thread.sleep(2000);  
		
		WebElement el1 = driver.findElement(By.xpath("/html/body/ytd-app/div/ytd-page-manager/ytd-search/div[1]/ytd-two-column-search-results-renderer/div/ytd-section-list-renderer/div[2]/ytd-item-section-renderer/div[3]/ytd-shelf-renderer[1]/div[1]/div[2]/ytd-vertical-list-renderer/div[1]/ytd-video-renderer[1]/div[1]/ytd-thumbnail/a/yt-img-shadow/img"));
		js.executeScript("arguments[0].scrollIntoView();", el1);
		Thread.sleep(1000);
		el1.click();

		Thread.sleep(5000);

		driver.quit();

	}
}
