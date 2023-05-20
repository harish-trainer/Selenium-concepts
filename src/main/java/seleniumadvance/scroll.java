package seleniumadvance;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class scroll {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.toolsqa.com/selenium-webdriver/selenium-tutorial/");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		js.executeScript("window.scrollBy(0,2500)", "");
	//	WebElement element = driver.findElement(By.xpath("//*[text()='Test Result Reporting']"));
		
	//	JavascriptExecutor js = (JavascriptExecutor) driver;
		
	//	js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		
		
		
	//	JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("window.scrollBy(0,250)", "");
		
	//	js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		
		

	}

}
