package seleniumadvance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.an.Y;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://magento2-demo.magebit.com/");
		
		driver.findElement(By.xpath("//*[@id='idOttWCM0T']")).click();	
		driver.findElement(By.id("firstname")).sendKeys("harish");
		driver.findElement(By.id("lastname")).sendKeys("trainer");
		driver.findElement(By.id("email_address")).sendKeys("vdsdsd");
		
		
	}

}
