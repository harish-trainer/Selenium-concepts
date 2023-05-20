package seleniumadvance;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import com.google.common.primitives.ImmutableLongArray.Builder;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDropExample {

	
	  public static void main(String[] args) throws AWTException, InterruptedException { // TODO Auto-generated method stub
	  
	  WebDriverManager.chromedriver().setup(); 
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.leafground.com/drag.xhtml");
	  
	  Thread.sleep(3000);
	 
	 WebElement sourceElement = driver.findElement(By.id("form:drag_content"));
	 
	 WebElement targetElement = driver.findElement(By.id("form:drop_content"));
	 
	 Actions ac = new Actions(driver);
//	ac.click(sourceElement).clickAndHold().moveToElement(targetElement).release().build().perform();
	//ac.dragAndDrop(sourceElement, targetElement) ; 
	  }
	  
	 

}
