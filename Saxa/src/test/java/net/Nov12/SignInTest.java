package net.Nov12;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class SignInTest {
	private WebDriver driver;
	private SignInPage signInPage;

	@BeforeEach
	void setUp() throws Exception {
		signInPage = new SignInPage(driver);
		driver = signInPage.chromeDriverConnection();
		signInPage.visit("http://demo.guru99.com/test/newtours/");
	}

	@AfterEach
	void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	void test() throws InterruptedException {
		signInPage.signIn();
		Thread.sleep(2000); 
		driver.get("http://demo.guru99.com/test/newtours/reservation.php"); 
		Thread.sleep(2000); 
		assertTrue(signInPage.isHomePageDisplayed());

	}

}
