package seleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Buttons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/button.xhtml");
		
		WebElement button = driver.findElement(By.tagName("button"));
		
	//	button.click();
		
		WebElement submitButton = driver.findElement(By.id("j_idt88:j_idt94"));
		
		submitButton.click();
		
	}

}
