package seleniumadvance;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowsExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/window.xhtml");
		
		String myWindow = driver.getWindowHandle();		
		
		System.out.println(myWindow);
		driver.findElement(By.xpath("//*[@id='j_idt88:new']/span")).click();
		
	Set<String> allwindow =	driver.getWindowHandles();
	System.out.println(allwindow);
	
	for (String eachWindow : allwindow) {
		if(!eachWindow.equals(myWindow)) {
			driver.switchTo().window(eachWindow);
		}
	}
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"j_idt211\"]")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		 * String oldWindow = driver.getWindowHandle();
		 * 
		 * WebElement firstButton = driver.findElement(By.
		 * xpath("//*[@class='ui-button-text ui-c'][text()='Open']"));
		 * firstButton.click();
		 * 
		 * Set<String> handles = driver.getWindowHandles();
		 * 
		 * for (String newWindow : handles) {
		 * 
		 * driver.switchTo().window(newWindow); }
		 * 
		 * 
		 * 
		 * WebElement search=driver.findElement( By.xpath("//*[@class='search-item']"));
		 * search.click();
		 * 
		 * driver.close();
		 * 
		 * driver.switchTo().window(oldWindow);
		 * 
		 * WebElement openMultiple=driver.findElement(
		 * By.xpath("//*[@class='ui-button-text ui-c'][text()='Open Multiple']"));
		 * 
		 * 
		 * openMultiple.click(); Thread.sleep(3000); int
		 * numberOfWindows=driver.getWindowHandles().size();
		 * System.out.println("No of windows opened:"+ numberOfWindows);
		 * 
		 * Thread.sleep(3000); Set<String> newWindowHandles=driver.getWindowHandles();
		 * 
		 * for (String allWindows : newWindowHandles) {
		 * if(!allWindows.equals(oldWindow)){ driver.switchTo().window(allWindows);
		 * driver.close(); }
		 * 
		 * }
		 */
		 

	}
}