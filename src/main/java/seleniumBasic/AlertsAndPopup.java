package seleniumBasic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertsAndPopup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.leafground.com/alert.xhtml");
	
		WebElement buttonElement = driver.findElement(By.id("j_idt88:j_idt104"));
		
		buttonElement.click();
		
		Thread.sleep(3000);
		System.out.println( driver.switchTo().alert().getText() );
	
		
	
	}

}
