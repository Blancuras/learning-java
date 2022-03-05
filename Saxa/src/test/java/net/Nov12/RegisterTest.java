package net.Nov12;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class RegisterTest {

	private WebDriver driver; 
	private RegisterPage registerPage; 
	
	@BeforeEach
	void setUp() throws Exception { 
		registerPage = new RegisterPage(driver); 
		driver = registerPage.chromeDriverConnection(); 
		registerPage.visit("http://demo.guru99.com/test/newtours/");
	}

	@AfterEach
	void tearDown() throws Exception {
		driver.close();
	}

	@Test
	void test() throws InterruptedException {
		registerPage.registerUser(); 
		assertEquals("Note: Your user name is qualityadmin.", registerPage.registeredMessage());
	}

}
