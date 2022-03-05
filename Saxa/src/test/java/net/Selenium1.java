package net;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium1 {

	private static WebDriver driver;
	
	@BeforeAll    //Inicializar driver  //IMPORTANTE
	public static void before() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/Users/Aileen/Documents/Selenium/chromedriver_win32/chromedriver.exe");  
	    driver=new ChromeDriver();  
	}
	
	@AfterAll //cerrar driver  //IMPORTANTE
	public static void despuesFinal() {
		driver.close();
	}
	
	@Test 
	public void testSum() throws InterruptedException {
		
		//Abrir pagina
		driver.navigate().to("http://www.google.com/");  
		 Thread.sleep(2000); 
		//fin abrir pagina 
		 
	    driver.findElement(By.name("q")).sendKeys("javatpoint tutorials");  
	    Thread.sleep(2000); 
	    driver.findElement(By.name("btnK")).click();  
	    
	    driver.navigate().to("http://neorobotino.com");  
	    Thread.sleep(2000);       ///html/body/div[2]/header/nav/ul[1]/li[2]/form/input
	    driver.findElement(By.xpath("/html/body/div[2]/header/nav/ul[1]/li[2]/form/input")).sendKeys("Mojojojo"); ;
	    Thread.sleep(2000);
	} 
}
