package seleniumBasic;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/radio.xhtml");	
		
		Thread.sleep(3000);
		
		
		driver.findElement(By.xpath("//*[@value='Option3']/../../div[2]")).click();
		
	System.out.println(driver.findElement(By.xpath("//*[@value='Option2']/../../div[1]/input")).getAttribute("checked"));
	}

}
