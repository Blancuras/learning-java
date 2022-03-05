package net.Nov12;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterPage extends Base {
	
	private By registerLinkLocator = By.linkText("REGISTER");
	By registerPageLocator = By.xpath("//img[@src='images/mast_register.gif']");

	By usernameLocator = By.id("email");
	By passwordLocator = By.name("password");
	By confirmPasswordLocator = By.xpath(
			"/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[15]/td[2]/input");

	By registerBtnLocator = By.xpath(
			"/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[17]/td/input");

	By registeredMessage = By.tagName("font"); 
	
	public RegisterPage(WebDriver driver) {
		super(driver);
	
	} 
	public void registerUser() throws InterruptedException {
		click(registerLinkLocator); 
		Thread.sleep(2000); 
		if(isDisplayed(registerPageLocator)) {
			sendKeys("qualityadmin", usernameLocator); 
			sendKeys("pass1", passwordLocator); 
			sendKeys("pass1", confirmPasswordLocator); 
			
			click(registerBtnLocator);
		}else {
			System.out.println("Register pages was not found");
		}
	} 
	
	public String registeredMessage() {
	List<WebElement> fonts = findElements(registeredMessage); 
	return getText(fonts.get(5)); 
	}
	
}
