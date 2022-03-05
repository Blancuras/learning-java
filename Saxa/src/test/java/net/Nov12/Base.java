package net.Nov12;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

	private WebDriver driver;

	public Base(WebDriver driver) {
		this.driver = driver;
	}

	public WebDriver chromeDriverConnection() {
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/Aileen/Documents/Selenium/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
		return driver;
	}

	public WebElement findElement(By locator) {
		return driver.findElement(locator);
	}

	public List<WebElement> findElements(By locator) { // LLamando dentro de nuestros metodos, los metodos de la api de
														// selenium
		return driver.findElements(locator);
	}

	public String getText(WebElement element) { // Devuelve el texto del elemento que etoy pasando como parametro
		return element.getText();
	}

	public String getText(By locator) { // Devulve el texto del elemento que estamos buscando a traves del localizador
		return driver.findElement(locator).getText();
	}

	public void sendKeys(String inputText, By locator) { // Escribe texto
		driver.findElement(locator).sendKeys(inputText);
	}

	public void click(By locator) {
		driver.findElement(locator).click();
	}

	public Boolean isDisplayed(By locator) { // Nos dice si el elemento se encuentra listo para ser utilizado
		try {
			return driver.findElement(locator).isDisplayed();
		} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
	}

	public void visit(String url) {
		driver.get(url);
	}
}
