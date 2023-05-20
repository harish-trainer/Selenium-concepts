package seleniumadvance;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileDownloadExample {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/file.xhtml");
		
		driver.findElement(By.xpath("//*[text()='Download']")).click();
		
		Thread.sleep(3000);
		
		File location = new File("C:\\Users\\91984\\Downloads");
		
	 File[] listFiles =	location.listFiles();
	 
	 for (File file : listFiles) {
		if (file.getName().contains("TestLeaf Logo")) {
			System.out.println("file downloaded");
			break;
			
		}
	}
		
		
		
		/*
		 * driver.findElement(By.
		 * xpath("//*[@class='ui-button-text ui-c'][text()='Download']")).click();
		 * 
		 * Thread.sleep(3000);
		 * 
		 * File filelocationFile = new File("C:\\Users\\91984\\Downloads");
		 * 
		 * File[] totaFileslFiles = filelocationFile.listFiles();
		 * 
		 * for (File file : totaFileslFiles) {
		 * if(file.getName().contains("TestLeaf Logo")) {
		 * System.out.println("file is present"); break; } }
		 */
		//Thread.sleep(3000);
		
		//File filelocation = new File("C:\\Users\\91984\\Downloads");
		
		//File[] totalFiles = filelocation.listFiles();
		
		//for (File file : totalFiles) {
			
		//	if(file.getName().equals("TestLeaf Logo.png")) {
		//		System.out.println("file is present");
		//		break;
		//	}
			
		//}
}
}
