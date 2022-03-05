package net.Nov12;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.test.context.event.annotation.AfterTestExecution;

public class MercuryToursAutomatedTest2 {

	private WebDriver driver;
	// Elementos de la pagina Register
	private By registerLinkLocator = By.linkText("REGISTER");
	private By registerPageLocator = By.xpath("//img[@src='images/mast_register.gif']");

	private By usernameLocator = By.id("email");
	private By passwordLocator = By.name("password");
	private By confirmPasswordLocator = By.xpath(
			"/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[15]/td[2]/input");

	private By registerBtnLocator = By.xpath(
			"/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[17]/td/input");

	// Elementos de la pagina de Sign in
	private By userLocator = By.name("userName");
	private By passLocator = By.name("password");
	private By signInBtnLocator = By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[4]/td/input");

	private By homePageLocator = By.xpath(
			"/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[1]/td/img");

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("Setup");
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/Aileen/Documents/Selenium/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/newtours/");
		Thread.sleep(2000);
	}

	@AfterTestExecution
	void tearDown() throws Exception {
		System.out.println("teardown");
		driver.quit();
	}

	@Test
	public void registerUser() throws InterruptedException {
		driver.findElement(registerLinkLocator).click();
		Thread.sleep(2000);
		if (driver.findElement(registerPageLocator).isDisplayed()) {
			driver.findElement(usernameLocator).sendKeys("qualityadmin");
			driver.findElement(passwordLocator).sendKeys("pass1");
			driver.findElement(confirmPasswordLocator).sendKeys("pass1");

			driver.findElement(registerBtnLocator).click();
		} else {
			System.out.println("Register pages was not found");
		}

		List<WebElement> fonts = driver.findElements(By.tagName("font"));
		assertEquals("Note: Your user name is qualityadmin.", fonts.get(5).getText());
		
		
		
		// abrir pagina 
		driver.get("http://demo.guru99.com/test/newtours/login.php"); 
		Thread.sleep(3000); 
		//Test 2
		if (driver.findElement(userLocator).isDisplayed()) {
			driver.findElement(userLocator).sendKeys("qualityamin");
			driver.findElement(passLocator).sendKeys("pass1");
			driver.findElement(signInBtnLocator).click();
			Thread.sleep(2000);
			assertTrue(driver.findElement(homePageLocator).isDisplayed());
		} else {
			System.out.println("username textbox was not present");
		}
	}
	
	@AfterEach
	public void quit() {
		driver.quit();
	}

}
