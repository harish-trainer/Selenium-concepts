package seleniumadvance;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class waitInSelenium {

	public static void main(String[] args) {

			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			  driver.get("https://www.leafground.com/waits.xhtml");

	        // Put an Implicit wait, this means that any search for elements on the page could take the time the implicit wait is set for before throwing exception

	        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//driver.manage().timeouts().implicitlyWait(10,);
	        // Launch the URL
	        

	        driver.findElement(By.id("j_idt87:j_idt89")).click();

	     WebElement ele  = driver.findElement(By.id("j_idt87:j_idt90"));
	        
	        
	        
	        WebDriverWait wait = new WebDriverWait(driver, 20);
	        wait.until(ExpectedConditions.elementToBeClickable(ele));
	        
	        ele.click();
	        
	        
	        
	        // Click on the Button "Timing Alert"

	  //      driver.findElement(By.id("timerAlertButton")).click(); 

	    //    System.out.println("Timer Alert is triggered but it is not yet opened");

	        // Create new WebDriver wait

	     //   WebDriverWait wait = new WebDriverWait(driver, 20);

	        // Wait for Alert to be present
//wait.until(ExpectedConditions.alertIsPresent());

//driver.switchTo().alert().accept();
	         

	         
	         
	         
	         
	         
	         
	         
	         
	         
	         
	         
	         
	         
	         
	         
	         
	         
	         
	         
	         
	//        System.out.println("Either Pop Up is displayed or it is Timed Out");

	        // Accept the Alert

	    //    driver.switchTo().alert().accept();

	      //  System.out.println("Alert Accepted");

	        // Close the main window
	        
	      //Declare and initialise a fluent wait
	  

	  //      driver.close();

		}
	
	

}
