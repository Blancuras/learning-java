package net.Nov11;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchTest {
	private WebDriver driver;

	@BeforeEach
	public void setUp() throws Exception {
		System.out.println("SetUp");
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/Aileen/Documents/Selenium/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://google.com");
	}

	@Test
	public void testGooglePage() {
		WebElement buscador = driver.findElement(By.name("q"));
		buscador.clear(); //Borrar el input 
		buscador.sendKeys("quality-stream Introduccion a la Automatización de Pruebas de Software");
		buscador.submit();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		assertEquals("quality-stream Introduccion a la Automatización de Pruebas de Software - Buscar con Google",
				driver.getTitle());
	}

	@AfterEach
	public void tearDown() {
	 System.out.println("Quit");
		driver.quit();

	}

}
