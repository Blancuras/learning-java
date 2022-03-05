package net.Nov11;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TomaFotoPrueba {

	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/Aileen/Documents/Selenium/chromedriver_win32/chromedriver.exe");

		driver = new ChromeDriver();

		driver.get("http://atestermate.com");
		driver.manage().window().maximize(); 

		Thread.sleep(5000);

		String path_foto = "C:/Users/Aileen/Documents/prueba.png"; 
		
		System.out.println(" ubicacion "+path_foto);
		BufferedImage image = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize())); 
		ImageIO.write(image, "png", new File(path_foto));  
		Thread.sleep(3000); 
		driver.close();
	}

}
