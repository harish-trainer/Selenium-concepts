package seleniumadvance;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TableExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		int count =0;

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.leafground.com/table.xhtml");
		
		
		List<WebElement> rows = driver.findElements(By.xpath("//tbody[@id='form:j_idt89_data']/tr"));
		
		System.out.println(rows.size());
		
		List<WebElement> clm = driver.findElements(By.xpath("//tbody[@id='form:j_idt89_data']/tr[1]/td"));
		
		System.out.println(clm.size());
		
		
		String valueString = driver.findElement(By.xpath("//tbody[@id='form:j_idt89_data']/tr[3]/td[2]")).getText();
		
		System.out.println(valueString);
		int pages =0;
		List<WebElement> names = new ArrayList<WebElement>();
		while(pages<=4) {
			names = driver.findElements(By.xpath("//tbody[@id='form:j_idt89_data']/tr/td[3]"));
			
			for (WebElement webElement : names) {
				System.out.println(webElement.getText());
			}
			Thread.sleep(3000);
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@aria-label='Next Page']"))));
			if (pages==4) {
				break;
			}
			driver.findElement(By.xpath("//*[@aria-label='Next Page']")).click();
		pages++;
		}
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
