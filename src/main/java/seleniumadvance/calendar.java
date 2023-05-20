package seleniumadvance;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class calendar {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
		//.findElement(null)
		String desiredMonthYear = "April 1998";
		
		Thread.sleep(3000);

		driver.findElement(By.id("dateOfBirthInput")).click();
		Thread.sleep(3000);
		
		WebElement prvMonth = driver.findElement(By.xpath("//*[@aria-label='Previous Month']"));
		
		
		String monthYearName = driver.findElement(By.xpath("//*[@id='dateOfBirth']/div[2]/div[2]/div/div/div[2]/div[1]/div[1]")).getText();
		
		while (!monthYearName.equals(desiredMonthYear)){
		prvMonth.click();
		monthYearName = driver.findElement(By.xpath("//*[@id='dateOfBirth']/div[2]/div[2]/div/div/div[2]/div[1]/div[1]")).getText();
		}
		
		driver.findElement(By.xpath("//*[text()='27']")).click();
	}

}
