package seleniumBasic;


import java.awt.Robot;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.logging.FileHandler;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.messages.internal.com.google.common.io.FileBackedOutputStream;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Links {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/waits.xhtml");
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String Title1 = driver.getTitle();
		driver.findElement(By.id("j_idt87:j_idt89")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
		
		By ele = By.id("j_idt87:j_idt90");
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(ele));
		
		
	
		

	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
			/*
			 * Set<String> allOpenWindows = driver.getWindowHandles();
			 * 
			 * System.out.println(allOpenWindows);
			 * 
			 * for (String newwindow : allOpenWindows) {
			 * driver.switchTo().window(newwindow); }
			 * 
			 * System.out.println( driver.getTitle());
			 * 
			 * if(driver.getTitle().contains("Error 404")) {
			 * System.out.print("link is broken"); }
			 * 
			 * 
			 * TakesScreenshot screenshot = (TakesScreenshot) driver; File file =
			 * screenshot.getScreenshotAs(OutputType.FILE); //FileUtils.copyFile(file, new
			 * File("C:\\projectScreenshots\\home.png"));
			 * org.openqa.selenium.io.FileHandler.copy(file, new
			 * File("C:\\projectScreenshots\\ho4me.png"));
			 * 
			 * //TakesScreenshot screenshot = (TakesScreenshot) driver; //File file =
			 * screenshot.getScreenshotAs(OutputType.FILE); //FileUtils.copyFile(screenshot,
			 * new File("C:\\projectScreenshots\\homePageScreenshot.png")); //File destFile
			 * = new File("D:\\"); //org.openqa.selenium.io.FileHandler.copy(file,
			 * destFile);
			 */			
	}

}
