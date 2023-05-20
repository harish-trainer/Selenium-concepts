package seleniumBasic;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Checkbox {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/checkbox.xhtml");
		
		WebElement checkBox = driver.findElement(By.xpath("//*[@id='j_idt87:j_idt89']/div[2]"));
		
		
	
		
		
		
		
	}
}