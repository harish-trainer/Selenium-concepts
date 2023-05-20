package seleniumadvance;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsClass {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.leafground.com/drag.xhtml");
		//driver.navigate().to("https://www.leafground.com/link.xhtml");
		
		
		WebElement box = driver.findElement(By.id("form:conpnl_header"));
		
		Actions a = new Actions(driver);
		
		Thread.sleep(3000);
		
		a.clickAndHold(box).moveByOffset(250, 0).build().perform();
	
	//	WebElement element = driver.findElement(By.id("j_idt88:j_idt90"));
		
		//Actions action = new Actions(driver);

		//action.moveToElement(element).click().build().perform();

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}


