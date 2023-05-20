import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;

import io.github.bonigarcia.wdm.WebDriverManager;

public class magnetodemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//System.setProperty("webdrive.safari.driver", "Downloads\\chromedriver.exe");
	
	WebDriverManager.chromedriver().setup();
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://magento.softwaretestingboard.com/");

	
	WebElement  searchbox =	driver.findElement(By.xpath("//span[@class='action more button']"));
	
	searchbox.click();
	//searchbox.sendKeys("Harish");
	//searchbox.clear();
	
	
	
	
	}
	

}
