package seleniumBasic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TextField {

	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.leafground.com/input.xhtml");
	
	WebElement txtBox	= driver.findElement(By.name("j_idt88:name"));
	
	txtBox.click();
	txtBox.sendKeys("Maniakm");
	
	txtBox.clear();
	
	
	String inputtext = txtBox.getAttribute("value");
	
	System.out.println(inputtext);
	
	WebElement disabledTextBox = driver.findElement(By.name("j_idt88:j_idt93"));
	
	System.out.println( txtBox.isEnabled() );
	}

}
