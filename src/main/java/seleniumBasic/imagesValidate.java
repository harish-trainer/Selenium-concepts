package seleniumBasic;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import javax.xml.xpath.XPath;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class imagesValidate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/broken");
		
		
		WebElement img = driver.findElement(By.xpath("//*[text()='Broken image']/../img[1]"));
		
	 String width = 	img.getAttribute("naturalWidth");
	 
	if (!width.equals("0")) {
		System.out.println("image is not broken");
	} 
	}
}
