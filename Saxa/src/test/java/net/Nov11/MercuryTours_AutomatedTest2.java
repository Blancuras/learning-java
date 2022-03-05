package net.Nov11;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MercuryTours_AutomatedTest2 {

	private WebDriver driver;
	private By registerLinkLocator = By.linkText("Registration"); 

	@BeforeEach
	void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/Aileen/Documents/Selenium/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mercury2020.ias.u-psud.fr/main_1st.php"); 
		Thread.sleep(2000); 
	}

	@AfterEach
	void tearDown() throws Exception { 
		driver.quit();
	}

	@Test
	void test() throws InterruptedException {
		driver.findElement(registerLinkLocator).click();
		Thread.sleep(2000); 
		driver.findElement(By.xpath("/html/body/table[3]/tbody/tr[5]/td[2]/input")).sendKeys("Aileen"); 
		Thread.sleep(2000); 
	}

}
