package seleniumadvance;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class frame {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/frame.xhtml");
		Thread.sleep(3000);
		
		
		driver.switchTo().frame(3);
		driver.switchTo().frame(0);
		
		
		driver.switchTo().defaultContent();
	
		driver.findElement(By.id("Click")).click();
		
		
		
		
		
		
		
		
		
	

	}

}
