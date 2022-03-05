package net.Nov12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignInPage extends Base {

	By userLocator = By.name("userName");
	By passLocator = By.name("password");
	By signInBtnLocator = By.xpath(
			"/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[4]/td[2]/div/input");

	By homePageLocator = By.xpath("//img [@src='images/mast_flightfinder.gif']");

	public SignInPage(WebDriver driver) {
		super(driver);
	} 
	
	public void signIn() {
		if(isDisplayed(userLocator)) {
			sendKeys("qualityadmin", userLocator);  
			sendKeys("pass1", passLocator); 
			click(signInBtnLocator); 
		}else {
			System.out.println("username textbox was nor present");
		}
	} 
	
	public boolean isHomePageDisplayed() { 
		
		return isDisplayed(homePageLocator); 
	}

}
