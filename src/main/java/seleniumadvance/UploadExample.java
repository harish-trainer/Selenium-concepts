package seleniumadvance;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UploadExample {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub



		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.leafground.com/file.xhtml");
		Thread.sleep(3000);
		
		driver.findElement(By.id("j_idt97:j_idt98_label")).click();
		
		String fileLocation ="C:\\Users\\91984\\Downloads\\TestLeaf Logo (1).png";
		
		StringSelection ss = new StringSelection(fileLocation);
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		
		Robot r = new Robot();
		
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	
		
		
	
	}

}