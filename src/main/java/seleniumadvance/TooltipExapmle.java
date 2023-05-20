package seleniumadvance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TooltipExapmle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/tooltip/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//li[@aria-controls='tab_item-2']")).click();
		
		Thread.sleep(3000);
		driver.switchTo().frame(1);
		WebElement toolTipbox = driver.findElement(By.xpath("//*[@id='firstname']"));
		
	String titleString =	toolTipbox.getAttribute("title");
		System.out.print(titleString);
	}

}
